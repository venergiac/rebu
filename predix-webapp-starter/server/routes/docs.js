const path = require('path');
const url = require('url');
const proxy = require('./proxy');

module.exports = (predixConfig) => {
	console.log('docs');
    if (predixConfig.isTimeSeriesConfigured()) {
        // console.log('rmdDocsURL', predixConfig.rmdDocsURL);
        return proxy.customProxyMiddleware('/docs', predixConfig.rmdDocsURL, url.parse(predixConfig.rmdDocsURL).path);
    } else {    
        return (req, res, next) => {
			console.log(req.url);
            req.url = path.join(req.url, '/ABOUT.md');
            // console.log('req.url', req.url);
            next();
        };
    }
};

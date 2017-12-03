const path = require('path');
const url = require('url');
const proxy = require('./proxy');

module.exports = (predixConfig) => {

/*
    if (predixConfig.isTimeSeriesConfigured()) {
        console.log('rmdDocsURL', predixConfig.rmdDocsURL);
        return proxy.customProxyMiddleware('/rebu', predixConfig.rmdDocsURL, url.parse(predixConfig.rmdDocsURL).path);
    } else {    
        return (req, res, next) => {
            req.url = path.join('/docs/xx.md');
            // console.log('req.url', req.url);
            next();
        };
    }
*/
// mock asset data contains an extra "filter" property, so we can easily match the Predix API.
  const routes = {};

  // http://localhost:5000/mock-api/predix-asset/asset?filter=group=/group/plant-richmond-refinery
  routes["locations"] = require(path.resolve(__dirname, '../sample-data/rebu/locations.json'));
  routes["trips"] = require(path.resolve(__dirname, '../sample-data/rebu/trip-212442540.json'));


  return routes;
};


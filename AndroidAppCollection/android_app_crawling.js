function main () {
    var gplay = require('google-play-scraper');
    let collections = [gplay.collection.TOP_FREE, gplay.collection.TOP_PAID];
    let categories = [gplay.category.APPLICATION, gplay.category.ANDROID_WEAR, gplay.category.VIDEO_PLAYERS, gplay.category.WEATHER, gplay.category.PRODUCTIVITY, gplay.category.SHOPPING, gplay.category.SOCIAL, gplay.category.SPORTS, gplay.category.TOOLS, gplay.category.TRAVEL_AND_LOCAL, gplay.category.LIFESTYLE, gplay.category.MAPS_AND_NAVIGATION, gplay.category.MEDICAL, gplay.category.MUSIC_AND_AUDIO, gplay.category.NEWS_AND_MAGAZINES, gplay.category.PARENTING, gplay.category.PERSONALIZATION, gplay.category.PHOTOGRAPHY, gplay.category.HEALTH_AND_FITNESS, gplay.category.HOUSE_AND_HOME, gplay.category.LIBRARIES_AND_DEMO, gplay.category.BUSINESS, gplay.category.COMICS, gplay.category.COMMUNICATION, gplay.category.DATING, gplay.category.EDUCATION, gplay.category.ENTERTAINMENT, gplay.category.FAMILY, gplay.category.FINANCE, gplay.category.FOOD_AND_DRINK, gplay.category.GAME];
    let num = 250; // need to change later on\
    writeAllGPlayAppsToCSV(gplay, collections, categories, num);
  }
  
  async function writeAllGPlayAppsToCSV (store, collections, categories, num) {
    let listOfBundleIds = [];
  
    // Retrieve the bundle ids of all apps by iterating through each category
  
    for (let i = 0; i < collections.length; i++) {
      for (let j = 0; j < categories.length; j++) {
        listOfBundleIds = listOfBundleIds.concat(await gplayAppMetaData(store, collections[i], categories[j], num));
      }
    }
    // Write to a csv file
    const fs = require('fs');
    const writeStream = fs.createWriteStream('gplay_package_name_install.csv');
    writeStream.write(listOfBundleIds.join('\n'));
  }
  
  async function gplayAppMetaData (store, collection, category, num) {
    let listOfBundleIds = [];
    const listOfApps = await store.list({
      collection: collection,
      category: category,
      fullDetail: true,
      num: num
    });
  
    try {
      for (let i = 0; i < listOfApps.length; i++) {
        listOfBundleIds.push(listOfApps[i].appId + ' ' + listOfApps[i].minInstalls);
      }
      return listOfBundleIds;
    } catch (error) {
      console.log(error);
    }
  }
  
  main();
  
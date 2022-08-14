main();

function main() {
    let store = require('app-store-scraper');
    let collection = store.collection.TOP_FREE_IOS;
    let categories = [store.category.SOCIAL_NETWORKING, store.category.GAMES, store.category.UTILITIES, store.category.BUSINESS, store.category.NEWS, store.category.EDUCATION, store.category.FINANCE, store.category.FOOD_AND_DRINK, store.category.SHOPPING];
    let num = 200;
    writeAllIOSAppsToCSV(store, collection, categories, num);
}

async function writeAllIOSAppsToCSV(store, collection, categories, num) {
    let listOfBundleIds = []
    for (category of categories) {
        listOfBundleIds = listOfBundleIds.concat(await getIOSAppBundleIds(store, collection, category, num));
    }

    const fs = require('fs');
    const writeStream = fs.createWriteStream('ios_bundle_ids.csv');
    writeStream.write(listOfBundleIds.join('\n'));
}

async function getIOSAppBundleIds(store, collection, category, num) {
    let listOfBundleIds = [];
    const listOfApps = await store.list({
        collection: collection,
        category: category,
        num: num
    })

    try {
        for (i in listOfApps) {
            listOfBundleIds.push(listOfApps[i].appId);
        }
        return listOfBundleIds;
    }
    catch (error) {
        console.log(error)
    };
}
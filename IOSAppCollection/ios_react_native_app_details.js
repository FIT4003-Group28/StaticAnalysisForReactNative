function main() {
    let store = require('app-store-scraper');
    let dir = "react_native_apps";
    csv = "collected_detailed_ios_react_native_apps.csv"
    writeAppDetailsToCsv(store, dir, csv);
}


async function writeAppDetailsToCsv(store, dir, csv) {
    let listOfApps = [];
    let fs = require('fs');
    let files = fs.readdirSync('react_native_apps');

    for (file of files) {
        if (!file.endsWith(".md") && !file.startsWith(".")) {
            let appDetails = await store.app({ appId: file.split("_")[0] });
            listOfApps.push(appDetails);
        }
    }


    const csvString = [Object.keys(listOfApps[0]), ...listOfApps.map(app => Object.values(app).map(detail => {
        if (Array.isArray(detail)) {
            detail = detail.join(",")
        }
        return JSON.stringify(detail)
    }))].map(e => e.join(",")).join("\n");

    const writeStream = fs.createWriteStream(csv);
    writeStream.write(csvString);
}


main();
package com.crashlytics.android.core;

import b.a.a.a.a.b.i;
import b.a.a.a.c;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
class MetaDataStore {
    private static final String KEYDATA_SUFFIX = "keys";
    private static final String KEY_USER_EMAIL = "userEmail";
    private static final String KEY_USER_ID = "userId";
    private static final String KEY_USER_NAME = "userName";
    private static final String METADATA_EXT = ".meta";
    private static final String USERDATA_SUFFIX = "user";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final File filesDir;

    public MetaDataStore(File file) {
        this.filesDir = file;
    }

    public void writeUserData(String str, UserMetaData userMetaData) {
        String userDataToJson;
        BufferedWriter bufferedWriter;
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                userDataToJson = userDataToJson(userMetaData);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(userDataToJson);
            bufferedWriter.flush();
            i.a((Closeable) bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            c.h().e(CrashlyticsCore.TAG, "Error serializing user metadata.", e);
            i.a((Closeable) bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            i.a((Closeable) bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public UserMetaData readUserData(String str) {
        FileInputStream fileInputStream;
        File userDataFileForSession = getUserDataFileForSession(str);
        if (!userDataFileForSession.exists()) {
            return UserMetaData.EMPTY;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(userDataFileForSession);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            UserMetaData jsonToUserData = jsonToUserData(i.a((InputStream) fileInputStream));
            i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
            return jsonToUserData;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            c.h().e(CrashlyticsCore.TAG, "Error deserializing user metadata.", e);
            i.a((Closeable) fileInputStream2, "Failed to close user metadata file.");
            return UserMetaData.EMPTY;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            i.a((Closeable) fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void writeKeyData(String str, Map<String, String> map) {
        String keysDataToJson;
        BufferedWriter bufferedWriter;
        File keysFileForSession = getKeysFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                keysDataToJson = keysDataToJson(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(keysFileForSession), UTF_8));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(keysDataToJson);
            bufferedWriter.flush();
            i.a((Closeable) bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            c.h().e(CrashlyticsCore.TAG, "Error serializing key/value metadata.", e);
            i.a((Closeable) bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            i.a((Closeable) bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public Map<String, String> readKeyData(String str) {
        FileInputStream fileInputStream;
        File keysFileForSession = getKeysFileForSession(str);
        if (!keysFileForSession.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(keysFileForSession);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            Map<String, String> jsonToKeysData = jsonToKeysData(i.a((InputStream) fileInputStream));
            i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
            return jsonToKeysData;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            c.h().e(CrashlyticsCore.TAG, "Error deserializing user metadata.", e);
            i.a((Closeable) fileInputStream2, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            i.a((Closeable) fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public File getUserDataFileForSession(String str) {
        File file = this.filesDir;
        return new File(file, str + USERDATA_SUFFIX + METADATA_EXT);
    }

    public File getKeysFileForSession(String str) {
        File file = this.filesDir;
        return new File(file, str + KEYDATA_SUFFIX + METADATA_EXT);
    }

    private static UserMetaData jsonToUserData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new UserMetaData(valueOrNull(jSONObject, KEY_USER_ID), valueOrNull(jSONObject, KEY_USER_NAME), valueOrNull(jSONObject, KEY_USER_EMAIL));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.crashlytics.android.core.MetaDataStore$1] */
    private static String userDataToJson(final UserMetaData userMetaData) {
        return new JSONObject() { // from class: com.crashlytics.android.core.MetaDataStore.1
            {
                put(MetaDataStore.KEY_USER_ID, UserMetaData.this.id);
                put(MetaDataStore.KEY_USER_NAME, UserMetaData.this.name);
                put(MetaDataStore.KEY_USER_EMAIL, UserMetaData.this.email);
            }
        }.toString();
    }

    private static Map<String, String> jsonToKeysData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, valueOrNull(jSONObject, next));
        }
        return hashMap;
    }

    private static String keysDataToJson(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, null);
        }
        return null;
    }
}

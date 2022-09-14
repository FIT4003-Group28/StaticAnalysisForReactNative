package com.google.firebase.installations.q;

import com.google.firebase.installations.q.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final File f9386a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.b.d f9387b;

    /* loaded from: classes.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(c.e.b.d dVar) {
        File filesDir = dVar.b().getFilesDir();
        this.f9386a = new File(filesDir, "PersistedInstallation." + dVar.e() + ".json");
        this.f9387b = dVar;
    }

    private JSONObject b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f9386a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, bArr.length);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public d a() {
        JSONObject b2 = b();
        String optString = b2.optString("Fid", null);
        int optInt = b2.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b2.optString("AuthToken", null);
        String optString3 = b2.optString("RefreshToken", null);
        long optLong = b2.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = b2.optLong("ExpiresInSecs", 0L);
        String optString4 = b2.optString("FisError", null);
        d.a p = d.p();
        p.b(optString);
        p.a(a.values()[optInt]);
        p.a(optString2);
        p.d(optString3);
        p.b(optLong);
        p.a(optLong2);
        p.c(optString4);
        return p.a();
    }

    public d a(d dVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.c());
            jSONObject.put("Status", dVar.f().ordinal());
            jSONObject.put("AuthToken", dVar.a());
            jSONObject.put("RefreshToken", dVar.e());
            jSONObject.put("TokenCreationEpochInSecs", dVar.g());
            jSONObject.put("ExpiresInSecs", dVar.b());
            jSONObject.put("FisError", dVar.d());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f9387b.b().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.f9386a)) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }
}

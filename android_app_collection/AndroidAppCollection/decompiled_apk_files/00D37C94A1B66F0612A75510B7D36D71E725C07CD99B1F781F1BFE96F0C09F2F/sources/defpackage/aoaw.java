package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: aoaw  reason: default package */
/* loaded from: classes.dex */
public final class aoaw {
    private final File a;
    private final anwg b;

    public aoaw(anwg anwgVar) {
        File filesDir = anwgVar.a().getFilesDir();
        String h = anwgVar.h();
        StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 27);
        sb.append("PersistedInstallation.");
        sb.append(h);
        sb.append(".json");
        this.a = new File(filesDir, sb.toString());
        this.b = anwgVar;
    }

    public final aoay a() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        aoax a = aoay.a();
        a.a = optString;
        a.c(new int[]{1, 2, 3, 4, 5}[optInt]);
        a.b = optString2;
        a.c = optString3;
        a.d(optLong);
        a.b(optLong2);
        a.d = optString4;
        return a.a();
    }

    public final void b(aoay aoayVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aoayVar.a);
            int i = aoayVar.g;
            int i2 = i - 1;
            if (i != 0) {
                jSONObject.put("Status", i2);
                jSONObject.put("AuthToken", aoayVar.b);
                jSONObject.put("RefreshToken", aoayVar.c);
                jSONObject.put("TokenCreationEpochInSecs", aoayVar.e);
                jSONObject.put("ExpiresInSecs", aoayVar.d);
                jSONObject.put("FisError", aoayVar.f);
                File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.a().getFilesDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
                fileOutputStream.close();
                if (!createTempFile.renameTo(this.a)) {
                    throw new IOException("unable to rename the tmpfile to PersistedInstallation");
                }
                return;
            }
            throw null;
        } catch (IOException | JSONException unused) {
        }
    }
}

package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: detm  reason: default package */
/* loaded from: classes6.dex */
public final class detm {
    private final File a;
    private final dela b;

    public detm(dela delaVar) {
        File filesDir = delaVar.a().getFilesDir();
        String g = delaVar.g();
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 27);
        sb.append("PersistedInstallation.");
        sb.append(g);
        sb.append(".json");
        this.a = new File(filesDir, sb.toString());
        this.b = delaVar;
    }

    public final deto a() {
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
        detn builder = deto.builder();
        detj detjVar = (detj) builder;
        detjVar.a = optString;
        builder.g(new int[]{1, 2, 3, 4, 5}[optInt]);
        detjVar.b = optString2;
        detjVar.c = optString3;
        builder.h(optLong);
        builder.c(optLong2);
        detjVar.d = optString4;
        return builder.a();
    }

    public final void b(deto detoVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", detoVar.a());
            int h = detoVar.h();
            int i = h - 1;
            if (h == 0) {
                throw null;
            }
            jSONObject.put("Status", i);
            jSONObject.put("AuthToken", detoVar.b());
            jSONObject.put("RefreshToken", detoVar.c());
            jSONObject.put("TokenCreationEpochInSecs", detoVar.e());
            jSONObject.put("ExpiresInSecs", detoVar.d());
            jSONObject.put("FisError", detoVar.f());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.a().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(this.a)) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }
}

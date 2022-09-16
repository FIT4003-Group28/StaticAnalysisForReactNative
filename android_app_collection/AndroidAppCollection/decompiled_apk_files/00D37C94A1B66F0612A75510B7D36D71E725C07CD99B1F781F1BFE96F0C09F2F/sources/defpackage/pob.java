package defpackage;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: pob  reason: default package */
/* loaded from: classes4.dex */
public final class pob implements pnw {
    public final UUID a;
    public final MediaDrm b;
    private int c;

    private pob(UUID uuid) {
        ptx.a(uuid);
        ptx.d(!phk.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm(g(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (!phk.d.equals(uuid) || !"ASUS_Z00AD".equals(pxi.d)) {
            return;
        }
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static pob f(UUID uuid) {
        try {
            return new pob(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new poe(1, e);
        } catch (Exception e2) {
            throw new poe(2, e2);
        }
    }

    public static UUID g(UUID uuid) {
        return (pxi.a >= 27 || !phk.c.equals(uuid)) ? uuid : phk.b;
    }

    @Override // defpackage.pnw
    public final void a(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // defpackage.pnw
    public final void b(String str, String str2) {
        this.b.setPropertyString(str, str2);
    }

    @Override // defpackage.pnw
    public final boolean c(byte[] bArr, String str) {
        if (pxi.a >= 31) {
            return poa.a(this.b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // defpackage.pnw
    public final byte[] d(byte[] bArr, byte[] bArr2) {
        if (phk.c.equals(this.a) && pxi.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(pxi.A(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(pku.b(jSONObject2.getString("k")));
                    sb.append("\",\"kid\":\"");
                    sb.append(pku.b(jSONObject2.getString("kid")));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = pxi.U(sb.toString());
            } catch (JSONException e) {
                String A = pxi.A(bArr2);
                pns.e("ClearKeyUtil", A.length() != 0 ? "Failed to adjust response data: ".concat(A) : new String("Failed to adjust response data: "), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.pnw
    public final String e() {
        return this.b.getPropertyString("securityLevel");
    }

    public final synchronized void h() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }
}

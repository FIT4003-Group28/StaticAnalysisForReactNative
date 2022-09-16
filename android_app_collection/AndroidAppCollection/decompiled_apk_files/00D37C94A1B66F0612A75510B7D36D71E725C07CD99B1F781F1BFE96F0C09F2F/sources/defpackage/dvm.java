package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dvm  reason: default package */
/* loaded from: classes3.dex */
public final class dvm implements dvl {
    private String a;
    private String b;

    public dvm() {
    }

    @Override // defpackage.dvl
    public final void a(String str, Map map) {
        HttpURLConnection httpURLConnection;
        String d = ehi.d(str, map);
        String property = System.getProperty("http.agent");
        if (!ehi.e(this.a) && !ehi.e(this.b)) {
            property = String.format("%s %s/%s", property, this.a, this.b);
        }
        String valueOf = String.valueOf(property);
        if (valueOf.length() != 0) {
            "User Agent: ".concat(valueOf);
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(d).openConnection();
            } catch (Throwable th) {
                th = th;
            }
        } catch (MalformedURLException e) {
            e = e;
        } catch (IOException e2) {
            e = e2;
        }
        try {
            httpURLConnection.setRequestProperty("User-Agent", property);
            String valueOf2 = String.valueOf(d);
            if (valueOf2.length() != 0) {
                "to send ".concat(valueOf2);
            }
            httpURLConnection.getResponseCode();
            if (httpURLConnection == null) {
                return;
            }
            httpURLConnection.disconnect();
        } catch (MalformedURLException e3) {
            e = e3;
            String valueOf3 = String.valueOf(d);
            ehi.f(valueOf3.length() != 0 ? "wrong url format: ".concat(valueOf3) : new String("wrong url format: "));
            throw new dvk(e.getMessage());
        } catch (IOException e4) {
            e = e4;
            ehi.f("IO error");
            throw new dvk(e.getMessage());
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    public dvm(String str, String str2) {
        String str3 = null;
        this.a = ehi.e(str) ? null : str.trim();
        this.b = !ehi.e(str2) ? str2.trim() : str3;
    }
}

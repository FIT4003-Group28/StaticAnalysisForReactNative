package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLStreamHandler;
/* compiled from: PG */
/* renamed from: afjv  reason: default package */
/* loaded from: classes2.dex */
final class afjv implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ afjy b;

    public afjv(afjy afjyVar, String str) {
        this.b = afjyVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((URL) null, this.a, (URLStreamHandler) null).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.connect();
            String headerField = httpURLConnection.getHeaderField("Location");
            if (dbsj.d(headerField)) {
                return;
            }
            if (afku.d(headerField)) {
                bvoo.h("Shortened url '%s' expands to another shortened URL '%s'", this.a, headerField);
            } else {
                this.b.b.runOnUiThread(new afju(this, headerField));
            }
        } catch (MalformedURLException unused) {
        } catch (IOException unused2) {
            afjy afjyVar = this.b;
            afjyVar.b.runOnUiThread(new afjx(afjyVar, new afjw(afjyVar, this.a)));
        }
    }
}

package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: PG */
/* renamed from: aocb  reason: default package */
/* loaded from: classes.dex */
public final class aocb implements Closeable {
    public final URL a;
    public rve b;
    public volatile InputStream c;

    private aocb(URL url) {
        this.a = url;
    }

    public static aocb a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new aocb(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            anel.a(this.c);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }
}

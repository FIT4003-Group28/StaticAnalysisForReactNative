package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: PG */
/* renamed from: deuy  reason: default package */
/* loaded from: classes6.dex */
public final class deuy implements Closeable {
    public final URL a;
    public cpcq<Bitmap> b;
    public volatile InputStream c;

    private deuy(URL url) {
        this.a = url;
    }

    public static deuy create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new deuy(new URL(str));
        } catch (MalformedURLException unused) {
            if (String.valueOf(str).length() == 0) {
                new String("Not downloading image, bad URL: ");
            }
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ddam.a(this.c);
        } catch (NullPointerException unused) {
        }
    }
}

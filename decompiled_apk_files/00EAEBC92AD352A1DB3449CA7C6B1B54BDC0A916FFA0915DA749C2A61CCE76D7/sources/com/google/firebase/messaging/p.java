package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
class p implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final URL f9473b;

    /* renamed from: c  reason: collision with root package name */
    private c.e.a.b.g.h<Bitmap> f9474c;

    /* renamed from: d  reason: collision with root package name */
    private volatile InputStream f9475d;

    private p(URL url) {
        this.f9473b = url;
    }

    public static p b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new p(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    private byte[] c() {
        URLConnection openConnection = this.f9473b.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f9475d = inputStream;
                byte[] a2 = c.e.a.b.d.f.h.a(c.e.a.b.d.f.h.a(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = a2.length;
                    String valueOf = String.valueOf(this.f9473b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Downloaded ");
                    sb.append(length);
                    sb.append(" bytes from ");
                    sb.append(valueOf);
                    Log.v("FirebaseMessaging", sb.toString());
                }
                if (a2.length > 1048576) {
                    throw new IOException("Image exceeds max size of 1048576");
                }
                return a2;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        c.e.a.b.d.f.k.a(th, th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public Bitmap a() {
        String valueOf = String.valueOf(this.f9473b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] c2 = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c2, 0, c2.length);
        if (decodeByteArray == null) {
            String valueOf2 = String.valueOf(this.f9473b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf3 = String.valueOf(this.f9473b);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(valueOf3);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        return decodeByteArray;
    }

    public void a(Executor executor) {
        this.f9474c = c.e.a.b.g.k.a(executor, new Callable(this) { // from class: com.google.firebase.messaging.o

            /* renamed from: a  reason: collision with root package name */
            private final p f9472a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9472a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9472a.a();
            }
        });
    }

    public c.e.a.b.g.h<Bitmap> b() {
        c.e.a.b.g.h<Bitmap> hVar = this.f9474c;
        com.google.android.gms.common.internal.s.a(hVar);
        return hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            c.e.a.b.d.f.i.a(this.f9475d);
        } catch (NullPointerException e2) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e2);
        }
    }
}

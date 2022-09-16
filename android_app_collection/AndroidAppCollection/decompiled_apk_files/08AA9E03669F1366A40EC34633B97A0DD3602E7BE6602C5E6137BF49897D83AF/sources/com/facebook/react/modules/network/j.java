package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import c.t;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
/* compiled from: RequestBodyUtil.java */
/* loaded from: classes.dex */
class j {
    public static boolean a(String str) {
        return "gzip".equalsIgnoreCase(str);
    }

    public static InputStream a(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().startsWith("http")) {
                return a(context, parse);
            }
            return context.getContentResolver().openInputStream(parse);
        } catch (Exception e) {
            com.facebook.common.e.a.b("ReactNative", "Could not retrieve file for contentUri " + str, e);
            return null;
        }
    }

    private static InputStream a(Context context, Uri uri) {
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        InputStream openStream = new URL(uri.toString()).openStream();
        try {
            ReadableByteChannel newChannel = Channels.newChannel(openStream);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                fileOutputStream.getChannel().transferFrom(newChannel, 0L, Long.MAX_VALUE);
                FileInputStream fileInputStream = new FileInputStream(createTempFile);
                newChannel.close();
                return fileInputStream;
            } finally {
                fileOutputStream.close();
            }
        } finally {
            openStream.close();
        }
    }

    public static RequestBody a(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static RequestBody a(final MediaType mediaType, final InputStream inputStream) {
        return new RequestBody() { // from class: com.facebook.react.modules.network.j.1
            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                try {
                    return inputStream.available();
                } catch (IOException unused) {
                    return 0L;
                }
            }

            @Override // okhttp3.RequestBody
            public void writeTo(c.d dVar) {
                t a2;
                t tVar = null;
                try {
                    a2 = c.l.a(inputStream);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    dVar.a(a2);
                    Util.closeQuietly(a2);
                } catch (Throwable th2) {
                    th = th2;
                    tVar = a2;
                    Util.closeQuietly(tVar);
                    throw th;
                }
            }
        };
    }

    public static g a(RequestBody requestBody, f fVar) {
        return new g(requestBody, fVar);
    }

    public static RequestBody b(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, c.f.f1286b);
        }
        return null;
    }
}

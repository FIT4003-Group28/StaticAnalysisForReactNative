package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import h.v;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends RequestBody {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediaType f5733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputStream f5734b;

        a(MediaType mediaType, InputStream inputStream) {
            this.f5733a = mediaType;
            this.f5734b = inputStream;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            try {
                return this.f5734b.available();
            } catch (IOException unused) {
                return 0L;
            }
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.f5733a;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(h.d dVar) {
            v vVar = null;
            try {
                vVar = h.l.a(this.f5734b);
                dVar.a(vVar);
            } finally {
                Util.closeQuietly(vVar);
            }
        }
    }

    public static i a(RequestBody requestBody, h hVar) {
        return new i(requestBody, hVar);
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

    public static InputStream a(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            return parse.getScheme().startsWith("http") ? a(context, parse) : context.getContentResolver().openInputStream(parse);
        } catch (Exception e2) {
            c.d.d.e.a.b("ReactNative", "Could not retrieve file for contentUri " + str, e2);
            return null;
        }
    }

    public static RequestBody a(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, h.f.f10145f);
        }
        return null;
    }

    public static RequestBody a(MediaType mediaType, InputStream inputStream) {
        return new a(mediaType, inputStream);
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

    public static boolean b(String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}

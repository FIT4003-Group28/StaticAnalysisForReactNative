package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: csvn  reason: default package */
/* loaded from: classes5.dex */
public final class csvn implements Callable<Bitmap> {
    private final String a;
    private final cswe b;
    private final File c;

    public csvn(Context context, String str) {
        this.b = cswe.a(context);
        this.a = str;
        this.c = context.getCacheDir();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public final Bitmap call() {
        try {
            cstd.a();
            String l = Long.toString(System.currentTimeMillis(), 16);
            String l2 = Long.toString(System.nanoTime(), 16);
            StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 4 + String.valueOf(l2).length());
            sb.append(l);
            sb.append(l2);
            sb.append(".jpg");
            String sb2 = sb.toString();
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.a).openConnection();
            httpURLConnection.setConnectTimeout(this.b.Y.f().intValue());
            httpURLConnection.setReadTimeout(this.b.Z.f().intValue());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            File createTempFile = File.createTempFile(sb2, ".jpg", this.c);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(createTempFile));
            byte[] bArr = new byte[256];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read >= 0) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(fileInputStream, null, options);
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    float intValue = this.b.aa.f().intValue();
                    fileInputStream.close();
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = (int) Math.max(i / intValue, i2 / intValue);
                    options2.inJustDecodeBounds = false;
                    FileInputStream fileInputStream2 = new FileInputStream(createTempFile);
                    Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options2);
                    fileInputStream2.close();
                    createTempFile.delete();
                    return decodeStream;
                }
            }
        } catch (FileNotFoundException e) {
            if (String.valueOf(this.a).length() == 0) {
                new String("ImageUrl path is no longer valid: ");
            }
            cstl.a("DownloadUtils");
            throw new RuntimeException(e);
        } catch (MalformedURLException e2) {
            if (String.valueOf(this.a).length() == 0) {
                new String("ImageUrl path is not valid: ");
            }
            cstl.a("DownloadUtils");
            throw new RuntimeException(e2);
        } catch (Exception unused) {
            cstl.a("DownloadUtils");
            return null;
        }
    }
}

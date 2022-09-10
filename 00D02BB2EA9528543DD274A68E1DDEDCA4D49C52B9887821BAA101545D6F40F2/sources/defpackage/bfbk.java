package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfbk  reason: default package */
/* loaded from: classes3.dex */
public final class bfbk implements Runnable {
    final /* synthetic */ String a = "welcome_offer";
    final /* synthetic */ Bitmap b;
    final /* synthetic */ deig c;
    final /* synthetic */ bfbl d;

    public bfbk(bfbl bfblVar, Bitmap bitmap, deig deigVar) {
        this.d = bfblVar;
        this.b = bitmap;
        this.c = deigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileOutputStream fileOutputStream;
        Uri uri = Uri.EMPTY;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                externalStoragePublicDirectory.mkdirs();
                String str = this.a;
                long e = this.d.a.e();
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append(str);
                sb.append(e);
                sb.append(".png");
                String sb2 = sb.toString();
                String valueOf = String.valueOf(externalStoragePublicDirectory);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb2).length());
                sb3.append(valueOf);
                sb3.append("/");
                sb3.append(sb2);
                uri = Uri.parse(sb3.toString());
                String valueOf2 = String.valueOf(externalStoragePublicDirectory);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(sb2).length());
                sb4.append(valueOf2);
                sb4.append("/");
                sb4.append(sb2);
                fileOutputStream = new FileOutputStream(sb4.toString(), false);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            this.b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (IOException unused2) {
                uri.toString();
            }
            this.c.j(uri);
        } catch (IOException unused3) {
            fileOutputStream2 = fileOutputStream;
            uri.toString();
            Uri uri2 = Uri.EMPTY;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                    uri2.toString();
                }
            }
            this.c.j(uri2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused5) {
                    uri.toString();
                }
            }
            this.c.j(uri);
            throw th;
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
/* compiled from: PG */
/* renamed from: alds  reason: default package */
/* loaded from: classes.dex */
public final class alds implements aldj {
    private final File a;
    private final File b;
    private final Uri c;

    public alds(Uri uri) {
        aqxo.p(a(uri));
        this.c = uri;
        String queryParameter = uri.getQueryParameter("temp");
        boolean z = false;
        aqxo.p(queryParameter != null && !queryParameter.isEmpty());
        File file = new File(queryParameter);
        this.a = file;
        String path = uri.getPath();
        if (path != null && !path.isEmpty()) {
            z = true;
        }
        aqxo.p(z);
        File file2 = new File(path);
        this.b = file2;
        aqxo.p(!file.equals(file2));
    }

    public static boolean a(Uri uri) {
        return uri != null && "streaming".equals(uri.getScheme());
    }

    private final aldh c() {
        return new aldh(new FileInputStream(this.b), this.b.length());
    }

    @Override // defpackage.aldj
    public final Bitmap b(Point point) {
        return aldt.b(this.c, point);
    }

    @Override // defpackage.aldj
    public final aldh f(File file) {
        long currentTimeMillis = System.currentTimeMillis();
        while (!this.a.canRead()) {
            if (!this.b.canRead()) {
                if (System.currentTimeMillis() - currentTimeMillis >= 3000) {
                    throw new FileNotFoundException(String.format("File %s not found.", this.a));
                }
                try {
                    Thread.sleep(30L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException(e.getMessage() != null ? e.getMessage() : "");
                }
            } else {
                return c();
            }
        }
        try {
            return new aldr(this.a, this.b);
        } catch (FileNotFoundException e2) {
            if (!this.b.canRead()) {
                throw e2;
            }
            return c();
        }
    }

    @Override // defpackage.aldj
    public final avuy g(String str, String str2) {
        return aldt.d(str, str2);
    }

    @Override // defpackage.aldj
    public final void j() {
    }

    @Override // defpackage.aldj
    public final boolean k() {
        return false;
    }

    @Override // defpackage.aldj
    public final boolean l() {
        return false;
    }
}

package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: czin  reason: default package */
/* loaded from: classes5.dex */
public final class czin implements czjl {
    private final cziv a;

    public czin() {
        this(new cziv());
    }

    public czin(cziv czivVar) {
        this.a = czivVar;
    }

    @Override // defpackage.czjl
    public final String a() {
        return "file";
    }

    @Override // defpackage.czjl
    public final boolean b(Uri uri) {
        return czim.a(uri).exists();
    }

    @Override // defpackage.czjl
    public final InputStream c(Uri uri) {
        File a = czim.a(uri);
        return new czja(new FileInputStream(a), a);
    }

    @Override // defpackage.czjl
    public final OutputStream d(Uri uri) {
        File a = czim.a(uri);
        ddau.f(a);
        return new czjb(new FileOutputStream(a), a);
    }

    @Override // defpackage.czjl
    public final void e(Uri uri) {
        File a = czim.a(uri);
        if (a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (a.delete()) {
            return;
        }
        if (!a.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.czjl
    public final void f(Uri uri, Uri uri2) {
        File a = czim.a(uri);
        File a2 = czim.a(uri2);
        ddau.f(a2);
        if (a.renameTo(a2)) {
            return;
        }
        throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
    }

    @Override // defpackage.czjl
    public final cziv g() {
        return this.a;
    }

    @Override // defpackage.czjl
    public final File h(Uri uri) {
        return czim.a(uri);
    }
}

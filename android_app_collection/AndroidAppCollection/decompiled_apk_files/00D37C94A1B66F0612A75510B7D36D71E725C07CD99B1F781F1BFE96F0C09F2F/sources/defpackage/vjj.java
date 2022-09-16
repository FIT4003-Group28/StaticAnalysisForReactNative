package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: vjj  reason: default package */
/* loaded from: classes4.dex */
public final class vjj implements vkm {
    public final vjs a;

    public vjj() {
        this(new vjs());
    }

    public vjj(vjs vjsVar) {
        this.a = vjsVar;
    }

    @Override // defpackage.vkm
    public final long a(Uri uri) {
        File h = uxe.h(uri);
        if (h.isDirectory()) {
            return 0L;
        }
        return h.length();
    }

    @Override // defpackage.vkm
    public final vjs b() {
        return this.a;
    }

    @Override // defpackage.vkm
    public final File c(Uri uri) {
        return uxe.h(uri);
    }

    @Override // defpackage.vkm
    public final InputStream d(Uri uri) {
        File h = uxe.h(uri);
        return new vjx(new FileInputStream(h), h);
    }

    @Override // defpackage.vkm
    public final OutputStream e(Uri uri) {
        File h = uxe.h(uri);
        anhe.f(h);
        return new vjy(new FileOutputStream(h, true), h);
    }

    @Override // defpackage.vkm
    public final OutputStream f(Uri uri) {
        File h = uxe.h(uri);
        anhe.f(h);
        return new vjy(new FileOutputStream(h), h);
    }

    @Override // defpackage.vkm
    public final Iterable g(Uri uri) {
        File h = uxe.h(uri);
        if (!h.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        File[] listFiles = h.listFiles();
        if (listFiles == null) {
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() && !absolutePath.endsWith("/")) {
                absolutePath = String.valueOf(absolutePath).concat("/");
            }
            Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
            amuf f = amuk.f();
            path.path(absolutePath);
            arrayList.add(uxe.i(path, f));
        }
        return arrayList;
    }

    @Override // defpackage.vkm
    public final String h() {
        return "file";
    }

    @Override // defpackage.vkm
    public final void i(Uri uri) {
        if (uxe.h(uri).mkdirs()) {
            return;
        }
        throw new IOException(String.format("%s could not be created", uri));
    }

    @Override // defpackage.vkm
    public final void j(Uri uri) {
        File h = uxe.h(uri);
        if (!h.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        if (!h.delete()) {
            throw new IOException(String.format("%s could not be deleted", uri));
        }
    }

    @Override // defpackage.vkm
    public final void k(Uri uri) {
        File h = uxe.h(uri);
        if (h.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (h.delete()) {
            return;
        }
        if (!h.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.vkm
    public final void l(Uri uri, Uri uri2) {
        File h = uxe.h(uri);
        File h2 = uxe.h(uri2);
        anhe.f(h2);
        if (h.renameTo(h2)) {
            return;
        }
        throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
    }

    @Override // defpackage.vkm
    public final boolean m(Uri uri) {
        return uxe.h(uri).exists();
    }

    @Override // defpackage.vkm
    public final boolean n(Uri uri) {
        return uxe.h(uri).isDirectory();
    }
}

package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: czjm  reason: default package */
/* loaded from: classes5.dex */
public abstract class czjm implements czjl {
    @Override // defpackage.czjl
    public boolean b(Uri uri) {
        throw null;
    }

    @Override // defpackage.czjl
    public InputStream c(Uri uri) {
        throw null;
    }

    @Override // defpackage.czjl
    public final OutputStream d(Uri uri) {
        return j().d(k(uri));
    }

    @Override // defpackage.czjl
    public final void e(Uri uri) {
        j().e(k(uri));
    }

    @Override // defpackage.czjl
    public final void f(Uri uri, Uri uri2) {
        j().f(k(uri), k(uri2));
    }

    @Override // defpackage.czjl
    public final cziv g() {
        return j().g();
    }

    @Override // defpackage.czjl
    public File h(Uri uri) {
        throw null;
    }

    protected abstract czjl j();

    /* JADX INFO: Access modifiers changed from: protected */
    public Uri k(Uri uri) {
        throw null;
    }
}

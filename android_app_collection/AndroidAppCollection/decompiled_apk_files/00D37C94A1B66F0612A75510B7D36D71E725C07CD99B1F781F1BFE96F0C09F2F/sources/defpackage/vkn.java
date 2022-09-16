package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: vkn  reason: default package */
/* loaded from: classes4.dex */
public abstract class vkn implements vkm {
    @Override // defpackage.vkm
    public final long a(Uri uri) {
        return r().a(p(uri));
    }

    @Override // defpackage.vkm
    public final vjs b() {
        return ((vjj) r()).a;
    }

    @Override // defpackage.vkm
    public /* synthetic */ File c(Uri uri) {
        throw null;
    }

    @Override // defpackage.vkm
    public InputStream d(Uri uri) {
        throw null;
    }

    @Override // defpackage.vkm
    public final OutputStream e(Uri uri) {
        return r().e(p(uri));
    }

    @Override // defpackage.vkm
    public final OutputStream f(Uri uri) {
        return r().f(p(uri));
    }

    @Override // defpackage.vkm
    public final Iterable g(Uri uri) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : r().g(p(uri))) {
            arrayList.add(o(uri2));
        }
        return arrayList;
    }

    @Override // defpackage.vkm
    public final void i(Uri uri) {
        r().i(p(uri));
    }

    @Override // defpackage.vkm
    public final void j(Uri uri) {
        r().j(p(uri));
    }

    @Override // defpackage.vkm
    public final void k(Uri uri) {
        r().k(p(uri));
    }

    @Override // defpackage.vkm
    public final void l(Uri uri, Uri uri2) {
        r().l(p(uri), p(uri2));
    }

    @Override // defpackage.vkm
    public boolean m(Uri uri) {
        throw null;
    }

    @Override // defpackage.vkm
    public final boolean n(Uri uri) {
        return r().n(p(uri));
    }

    protected Uri o(Uri uri) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Uri p(Uri uri) {
        throw null;
    }

    protected abstract vkm r();
}

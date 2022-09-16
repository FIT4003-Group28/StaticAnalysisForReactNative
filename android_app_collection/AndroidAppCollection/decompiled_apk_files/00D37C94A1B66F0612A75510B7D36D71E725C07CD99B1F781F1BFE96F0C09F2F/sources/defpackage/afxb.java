package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: afxb  reason: default package */
/* loaded from: classes.dex */
abstract class afxb implements afyf {
    private final afyf a;

    public afxb(afyf afyfVar) {
        this.a = afyfVar;
    }

    @Override // defpackage.afyf
    public final /* bridge */ /* synthetic */ void a(Object obj, yiw yiwVar) {
        Uri uri = (Uri) obj;
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals(b())) {
            this.a.a(uri, yiwVar);
        } else {
            c(uri, yiwVar);
        }
    }

    public abstract String b();

    public abstract void c(Uri uri, yiw yiwVar);
}

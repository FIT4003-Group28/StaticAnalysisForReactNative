package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: afyi  reason: default package */
/* loaded from: classes.dex */
public final class afyi implements afyf {
    public final afyf a;
    public volatile boolean b;
    private final afyf c;

    public afyi(afyf afyfVar, afyf afyfVar2) {
        this.c = afyfVar;
        this.a = afyfVar2;
    }

    @Override // defpackage.afyf
    public final /* bridge */ /* synthetic */ void a(Object obj, yiw yiwVar) {
        Uri uri = (Uri) obj;
        if (!this.b) {
            this.c.a(uri, new afyh(this, yiwVar, true));
        } else {
            this.a.a(uri, new afyh(this, yiwVar, false));
        }
    }
}

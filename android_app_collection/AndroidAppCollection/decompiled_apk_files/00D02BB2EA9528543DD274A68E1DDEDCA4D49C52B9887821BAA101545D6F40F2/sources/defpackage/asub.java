package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: asub  reason: default package */
/* loaded from: classes2.dex */
public class asub implements asut {
    private final dzsj<ckrp> a;
    private final btvo b;
    private final Context c;
    private boolean d;

    public asub(dzsj<ckrp> dzsjVar, btvo btvoVar, Context context) {
        this.a = dzsjVar;
        this.b = btvoVar;
        this.c = context;
    }

    @Override // defpackage.izh
    public cqkl a() {
        this.a.a().b();
        return cqkl.a;
    }

    @Override // defpackage.izh
    public Boolean b() {
        return true;
    }

    @Override // defpackage.asut
    public Boolean c() {
        return Boolean.valueOf(!btpf.PHONE_LANDSCAPE.equals(btpf.c(this.c)));
    }

    @Override // defpackage.asut
    public Boolean d() {
        return Boolean.valueOf(this.c.getResources().getConfiguration().smallestScreenWidthDp <= 360);
    }

    @Override // defpackage.asut
    public Boolean e() {
        return Boolean.valueOf(this.b.getDirectionsExperimentsParameters().l);
    }

    @Override // defpackage.asut
    public Boolean f() {
        return Boolean.valueOf(this.d);
    }

    public void g(boolean z) {
        this.d = z;
    }
}

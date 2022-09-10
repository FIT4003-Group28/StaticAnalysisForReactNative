package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: nvg  reason: default package */
/* loaded from: classes7.dex */
public final class nvg extends nup {
    @dzsi
    public cqkq<cjyo> j;
    private final Activity k;
    private final cjzo l;
    private final cjqy m;
    private cjyp n;

    public nvg(Activity activity, cjzo cjzoVar, cjqy cjqyVar, btrm btrmVar, dzsj<nut> dzsjVar, dzsj<qbt> dzsjVar2, nxl nxlVar, @dzsi nxd nxdVar, @dzsi nxa nxaVar) {
        super(btrmVar, dzsjVar, dzsjVar2, nxlVar, nxdVar, nxaVar);
        this.k = activity;
        this.l = cjzoVar;
        this.m = cjqyVar;
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nup
    public final void a() {
        s();
    }

    @Override // defpackage.nup
    public final void e() {
        this.d = null;
        this.e = null;
        this.a.clear();
        this.b.clear();
        this.f.clear();
        this.g = null;
        this.n = new cjyp();
    }

    @Override // defpackage.nup
    protected final nvf q(nun nunVar, List<cjys> list) {
        nuv nuvVar = new nuv(this.k, this.l, this.m, nunVar.a(), list, this);
        this.n.c(nuvVar);
        return new nvf(nuvVar);
    }

    @Override // defpackage.nup
    protected final void r(int i) {
        this.n.d(i);
        s();
    }

    @Override // defpackage.nxi
    public final void s() {
        cqkq<cjyo> cqkqVar = this.j;
        if (cqkqVar != null) {
            cqkqVar.a(this.n);
        }
    }
}

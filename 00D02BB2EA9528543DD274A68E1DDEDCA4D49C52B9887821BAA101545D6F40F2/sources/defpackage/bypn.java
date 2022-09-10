package defpackage;

import android.content.res.Resources;
import android.view.View;
/* compiled from: PG */
/* renamed from: bypn  reason: default package */
/* loaded from: classes4.dex */
public final class bypn extends awnw {
    public cqkj a;
    public Resources b;
    public dxio<auhi> c;
    public dxio<awnv> d;
    public dxio<byqh> e;
    public dxio<cjqy> f;

    @Override // defpackage.awnw
    protected final boolean aJ() {
        return true;
    }

    @Override // defpackage.awnw, defpackage.ges, defpackage.gfo
    public final boolean e() {
        this.e.a().n();
        this.f.a().i(cjtd.a(dtyc.bG));
        return super.e();
    }

    @Override // defpackage.awnw
    protected final View i() {
        bysq bysqVar = new bysq(this.b, this.c, this.d, this.e, this.f);
        cqkf e = this.a.e(new byrd(new byqp()));
        e.e(bysqVar);
        return e.c();
    }
}

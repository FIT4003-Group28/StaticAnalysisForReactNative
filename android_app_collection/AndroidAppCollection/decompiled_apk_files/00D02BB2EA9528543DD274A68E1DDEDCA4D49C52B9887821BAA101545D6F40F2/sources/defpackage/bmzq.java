package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bmzq  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmzq implements awnl, bwrr {
    @dzsi
    protected final transient fd a;
    protected final transient bwqv b;
    public transient gga c;
    private final bwrs<ilo> d;
    private final transient cjqy e;
    private final transient begg f;
    private int g;

    public bmzq(bwrs<ilo> bwrsVar, @dzsi fd fdVar, gga ggaVar, cjqy cjqyVar, bwqv bwqvVar, begg beggVar) {
        this.d = bwrsVar;
        this.a = fdVar;
        this.c = ggaVar;
        this.e = cjqyVar;
        this.b = bwqvVar;
        this.f = beggVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(Object obj) {
        ilo iloVar = (ilo) obj;
        if (!this.c.aZ) {
            return;
        }
        fd fdVar = this.a;
        if (fdVar != null && fdVar.U() && !this.d.c().i() && this.g == -1) {
            c(this.d);
        }
        bwqv.t(this.d, this);
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        this.c = gga.L(activity);
        this.g = i;
        if (i == -1) {
            cjqy cjqyVar = this.e;
            cjsx i2 = cjsy.i();
            i2.b(d());
            cjqyVar.k(i2.a());
            this.b.f(this.d, this, false);
            this.f.q(this.d, true);
        } else if (i != 0) {
        } else {
            cjqy cjqyVar2 = this.e;
            cjsx i3 = cjsy.i();
            i3.b(e());
            cjqyVar2.k(i3.a());
        }
    }

    public abstract void c(bwrs<ilo> bwrsVar);

    public abstract ddda d();

    public abstract ddda e();
}

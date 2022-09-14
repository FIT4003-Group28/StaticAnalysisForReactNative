package defpackage;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: cprn  reason: default package */
/* loaded from: classes5.dex */
public final class cprn<D> extends cprf<D, cpsp> {
    public cprn(Context context, AttributeSet attributeSet) {
        super(context, cpsm.b());
        j(new cpsp());
        this.e = new cprp();
        this.f = new cpro();
    }

    @Override // defpackage.cprf
    protected final cpsf<D> c() {
        cpsl<D> cpslVar = ((cpsp) this.a).a;
        if (cpslVar.d() > 0) {
            return new cpsf<>(cpslVar.b(), cpslVar.c());
        }
        return null;
    }

    public void setViewport(int i, D d) {
        cpsp cpspVar = (cpsp) this.a;
        cpwl.c(i > 0, "viewportDataSize can't be less than 1.");
        cpspVar.i(1.0f, 0.0f);
        cpspVar.a();
        if (cpspVar.a.d() <= 0) {
            return;
        }
        cpspVar.i(cpspVar.k() / (((cpspVar.s(cpspVar.a.b()) - cpspVar.b.a.intValue()) + (cpspVar.b.b.intValue() - cpspVar.s(cpspVar.a.c()))) + (cpspVar.e * (i - 1))), 0.0f);
        cpspVar.a();
        if (cpspVar.a.a(d) == null) {
            return;
        }
        cpspVar.i(cpspVar.c, -(cpspVar.e * cpspVar.a.a(d).intValue()));
    }
}

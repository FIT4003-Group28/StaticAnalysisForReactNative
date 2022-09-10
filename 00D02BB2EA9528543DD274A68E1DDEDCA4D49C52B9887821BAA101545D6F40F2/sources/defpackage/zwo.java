package defpackage;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: zwo  reason: default package */
/* loaded from: classes7.dex */
public final class zwo extends cpny<zwg, zwh, cprn<zwh>> {
    public zwo(Context context) {
        super(context);
    }

    @Override // defpackage.cpoj
    public final cpvf<zwh> a() {
        return zwn.a;
    }

    @Override // defpackage.cpny
    protected final /* bridge */ /* synthetic */ cprn<zwh> b(AttributeSet attributeSet) {
        Context context = getContext();
        boolean z = ((cpny) this).a;
        cprn<zwh> cprnVar = new cprn<>(context, attributeSet);
        cprnVar.g.f = 45.0f;
        cprnVar.b = false;
        if (!(!z)) {
            cptd.c(cprnVar);
        } else {
            cptd.d(cprnVar);
        }
        return cprnVar;
    }

    @Override // defpackage.cpoj, defpackage.cppl
    public void setAnimationPercent(float f) {
        super.setAnimationPercent(irf.b.getInterpolation(f));
    }

    public void setState(zwf zwfVar) {
        for (cpot cpotVar : l()) {
            ((zwn) cpotVar.a.g(zwn.c)).d = zwfVar;
        }
    }

    public zwo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public zwo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

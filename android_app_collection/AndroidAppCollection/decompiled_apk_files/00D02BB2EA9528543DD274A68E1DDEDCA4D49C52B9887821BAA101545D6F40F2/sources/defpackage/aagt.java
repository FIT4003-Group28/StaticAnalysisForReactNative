package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aagt  reason: default package */
/* loaded from: classes2.dex */
final class aagt extends jkc {
    final /* synthetic */ aagx s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aagt(aagx aagxVar) {
        super(dcdc.h(jjn.HIDDEN, jjn.EXPANDED, jjn.FULLY_EXPANDED));
        this.s = aagxVar;
    }

    @Override // defpackage.jkc
    public final jjn a(jjn jjnVar, jjn jjnVar2) {
        return this.s.ar.a() ? jjnVar == jjn.COLLAPSED ? jjn.HIDDEN : jjnVar : this.s.w() ? jjn.EXPANDED : jjn.HIDDEN;
    }

    @Override // defpackage.jkc
    public final List<jjn> d(jjn jjnVar) {
        if (this.s.ar.a()) {
            return this.r;
        }
        return dcdc.f(this.s.w() ? jjn.EXPANDED : jjn.HIDDEN);
    }
}

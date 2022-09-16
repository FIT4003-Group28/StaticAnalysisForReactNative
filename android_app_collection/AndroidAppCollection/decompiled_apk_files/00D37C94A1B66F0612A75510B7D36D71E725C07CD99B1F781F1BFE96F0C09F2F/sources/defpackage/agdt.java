package defpackage;
/* compiled from: PG */
/* renamed from: agdt  reason: default package */
/* loaded from: classes.dex */
public final class agdt implements ageb {
    @Override // defpackage.ageb
    public final void a(apgq apgqVar, acti actiVar, aged agedVar, fi fiVar) {
        if (apgqVar == null) {
            return;
        }
        apgm apgmVar = apgqVar.e;
        if (apgmVar == null) {
            apgmVar = apgm.a;
        }
        if (!apgmVar.l && apgmVar.k.isEmpty()) {
            return;
        }
        fiVar.t = apgmVar.k;
        fiVar.u = apgmVar.m;
    }
}

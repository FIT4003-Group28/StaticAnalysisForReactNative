package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: afur  reason: default package */
/* loaded from: classes2.dex */
final class afur implements btzi<dwjr, dwjt> {
    final /* synthetic */ Iterable a;
    final /* synthetic */ afuq b;

    public afur(Iterable iterable, afuq afuqVar) {
        this.a = iterable;
        this.b = afuqVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwjr> btzrVar, btzy btzyVar) {
        dcdn<dosc, afwm> dcdnVar = afuu.a;
        bttq bttqVar = btzyVar.p;
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwjr> btzrVar, dwjt dwjtVar) {
        EnumSet noneOf = EnumSet.noneOf(afwm.class);
        for (dosd dosdVar : dwjtVar.a) {
            if ((dosdVar.a & 1) != 0) {
                dcdn<dosc, afwm> dcdnVar = afuu.a;
                dosc b = dosc.b(dosdVar.b);
                if (b == null) {
                    b = dosc.TYPE_COPYRIGHTS;
                }
                afwm afwmVar = dcdnVar.get(b);
                if (afwmVar != null) {
                    noneOf.add(afwmVar);
                }
            }
        }
        for (afwm afwmVar2 : this.a) {
            afuq afuqVar = this.b;
            if (!noneOf.contains(afwmVar2) && afuqVar.b.h.b()) {
                afuqVar.b.k(afwmVar2, false);
                String string = afuqVar.b.b.getString(afuqVar.a);
                afuu afuuVar = afuqVar.b;
                cjxu.h(afuuVar.u, afuuVar.b, string);
            }
        }
    }
}

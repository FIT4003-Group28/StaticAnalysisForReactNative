package defpackage;
/* compiled from: PG */
/* renamed from: hhk  reason: default package */
/* loaded from: classes3.dex */
class hhk implements ampg {
    @Override // defpackage.ampg
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        axca axcaVar = (axca) obj;
        aopa createBuilder = aqso.a.createBuilder();
        if ((axcaVar.b & 1) != 0) {
            String str = axcaVar.c;
            createBuilder.copyOnWrite();
            aqso aqsoVar = (aqso) createBuilder.instance;
            str.getClass();
            aqsoVar.b |= 1;
            aqsoVar.c = str;
        }
        if ((axcaVar.b & 8) != 0) {
            ampg ampgVar = hhv.c;
            aotk aotkVar = axcaVar.e;
            if (aotkVar == null) {
                aotkVar = aotk.a;
            }
            Object apply = ampgVar.apply(aotkVar);
            createBuilder.copyOnWrite();
            aqso aqsoVar2 = (aqso) createBuilder.instance;
            apply.getClass();
            aqsoVar2.d = (aqsn) apply;
            aqsoVar2.b |= 2;
        }
        if ((axcaVar.b & 16) != 0) {
            ampg ampgVar2 = hhv.c;
            aotk aotkVar2 = axcaVar.f;
            if (aotkVar2 == null) {
                aotkVar2 = aotk.a;
            }
            Object apply2 = ampgVar2.apply(aotkVar2);
            createBuilder.copyOnWrite();
            aqso aqsoVar3 = (aqso) createBuilder.instance;
            apply2.getClass();
            aqsoVar3.e = (aqsn) apply2;
            aqsoVar3.b |= 4;
        }
        if ((axcaVar.b & 256) != 0) {
            ampg ampgVar3 = hhv.a;
            awzo b = awzo.b(axcaVar.h);
            if (b == null) {
                b = awzo.ALIGN_HORIZONTAL_UNSPECIFIED;
            }
            Object apply3 = ampgVar3.apply(b);
            createBuilder.copyOnWrite();
            aqso aqsoVar4 = (aqso) createBuilder.instance;
            aqsoVar4.f = ((awbc) apply3).e;
            aqsoVar4.b |= 8;
        }
        if ((axcaVar.b & 512) != 0) {
            ampg ampgVar4 = hhv.b;
            axak b2 = axak.b(axcaVar.i);
            if (b2 == null) {
                b2 = axak.FONT_FAMILY_UNSPECIFIED;
            }
            Object apply4 = ampgVar4.apply(b2);
            createBuilder.copyOnWrite();
            aqso aqsoVar5 = (aqso) createBuilder.instance;
            aqsoVar5.g = ((awbd) apply4).h;
            aqsoVar5.b |= 16;
        }
        return (aqso) createBuilder.mo39build();
    }
}

package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cexi  reason: default package */
/* loaded from: classes4.dex */
final class cexi implements degu<List<diyq>> {
    final /* synthetic */ cexk a;

    public cexi(cexk cexkVar) {
        this.a = cexkVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<diyq> list) {
        List<diyq> list2 = list;
        axnj axnjVar = this.a.c;
        if (axnjVar != null) {
            axnjVar.b(list2);
        } else if (list2.isEmpty()) {
            return;
        } else {
            cexk cexkVar = this.a;
            axni axniVar = cexkVar.a;
            dfqc dfqcVar = dfqc.PROFILE_RECOMMENDATION_CARD;
            final cexk cexkVar2 = this.a;
            mw mwVar = new mw(cexkVar2) { // from class: cexh
                private final cexk a;

                {
                    this.a = cexkVar2;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.E((String) obj);
                }
            };
            axnk axnkVar = axniVar.a;
            axnk.a(axnkVar.a.a(), 1);
            axnt a = axnkVar.b.a();
            axnk.a(a, 2);
            axnk.a(dfqcVar, 3);
            axnk.a(mwVar, 4);
            axnj axnjVar2 = new axnj(a, dfqcVar, mwVar);
            axnjVar2.b(list2);
            cexkVar.c = axnjVar2;
        }
        cqkx.p(this.a);
    }
}

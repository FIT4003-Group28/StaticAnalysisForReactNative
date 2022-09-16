package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahfz  reason: default package */
/* loaded from: classes2.dex */
public class ahfz {
    public final dxio<bbnd> a;
    private final gga b;
    private final ahbd c;
    private final cqhn d;
    private final ahfu e;
    private final dxio<bsvm> f;

    public ahfz(gga ggaVar, ahbd ahbdVar, cqhn cqhnVar, ahfu ahfuVar, dxio<bsvm> dxioVar, dxio<bbnd> dxioVar2) {
        this.b = ggaVar;
        this.c = ahbdVar;
        this.d = cqhnVar;
        this.e = ahfuVar;
        this.f = dxioVar;
        this.a = dxioVar2;
    }

    public final ahga a(List<agyd> list) {
        final ahga ahgaVar = new ahga(this.b, this.f, this.a);
        agou agouVar = new agou();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            agyd agydVar = list.get(i);
            ahfu ahfuVar = this.e;
            dlcn dlcnVar = agydVar.b;
            if (dlcnVar == null) {
                dlcnVar = dlcn.f;
            }
            dlcn dlcnVar2 = dlcnVar;
            mw mwVar = new mw(ahgaVar) { // from class: ahfy
                private final ahga a;

                {
                    this.a = ahgaVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    ahga ahgaVar2 = this.a;
                    agzv agzvVar = (agzv) obj;
                    if (ahgaVar2.n()) {
                        cqkx.p(ahgaVar2);
                        return;
                    }
                    ahbb ahbbVar = ahgaVar2.a;
                    if (ahbbVar == null) {
                        return;
                    }
                    View o = cqkx.o(ahbbVar);
                    if (!(o instanceof jix)) {
                        return;
                    }
                    jix jixVar = (jix) o;
                    Iterator<cqix<?>> it = ahgaVar2.a.a().iterator();
                    int i2 = 0;
                    while (it.hasNext() && !it.next().b().equals(agzvVar)) {
                        i2++;
                    }
                    jixVar.smoothScrollTo(((LinearLayout) jixVar.getChildAt(0)).getChildAt(Math.min(i2 + 1, ahgaVar2.a.a().size() - 1)).getLeft(), 0);
                }
            };
            int i2 = agydVar.c;
            cqhn a = ahfuVar.a.a();
            ahfu.a(a, 1);
            ahfv a2 = ahfuVar.b.a();
            ahfu.a(a2, 2);
            ahfu.a(dlcnVar2, 3);
            ahfu.a(mwVar, 4);
            arrayList.add(cqgr.fT(agouVar, new ahft(a, a2, dlcnVar2, mwVar, i, i2)));
        }
        ahgaVar.a = this.c.a(arrayList, cjtd.b().b(dtxu.bG)).a();
        return ahgaVar;
    }
}

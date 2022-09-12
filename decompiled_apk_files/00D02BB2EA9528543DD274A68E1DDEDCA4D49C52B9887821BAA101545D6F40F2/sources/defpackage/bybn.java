package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bybn  reason: default package */
/* loaded from: classes4.dex */
public final class bybn {
    public final bybf a;
    public final bycf b;
    public final List<bybp> c = new ArrayList();
    public final Map<bybp, Set<byay>> d = new aif();
    @dzsi
    public bycg e;
    private final Resources f;
    private final aifb g;
    private final dzsj<aifu> h;

    public bybn(Activity activity, bybf bybfVar, aifb aifbVar, bycf bycfVar, dzsj<aifu> dzsjVar) {
        this.f = activity.getResources();
        this.a = bybfVar;
        this.g = aifbVar;
        this.b = bycfVar;
        this.h = dzsjVar;
    }

    public final void a(bybp bybpVar) {
        akuh g;
        aih aihVar = new aih(bybpVar.d().size());
        Set<byay> set = this.d.get(bybpVar);
        if (set == null) {
            set = new aih<>();
        }
        for (byay byayVar : bybpVar.d()) {
            if (bybpVar.a(byayVar)) {
                if (byayVar.d == null) {
                    bybf bybfVar = this.a;
                    String str = byayVar.e;
                    if (str == null) {
                        g = bybfVar.a();
                    } else {
                        dehn<amfu> g2 = bybfVar.e.g(str);
                        if (g2.isDone()) {
                            amfu amfuVar = (amfu) deha.s(g2);
                            if (!bybf.b(amfuVar)) {
                                g = bybfVar.f.g(amfuVar);
                            }
                        }
                        g = null;
                    }
                    if (g != null) {
                        aifb aifbVar = this.g;
                        akqq akqqVar = byayVar.a;
                        dbsk.s(akqqVar);
                        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
                        dmlp bZ = dmlq.e.bZ();
                        dmls a = akxh.a(akra.f(akqqVar));
                        boolean z = false;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dmlq dmlqVar = (dmlq) bZ.b;
                        a.getClass();
                        dmlqVar.b = a;
                        dmlqVar.a |= 1;
                        if (dmpkVar.c) {
                            dmpkVar.bF();
                            dmpkVar.c = false;
                        }
                        dmpn dmpnVar = (dmpn) dmpkVar.b;
                        dmlq bK = bZ.bK();
                        bK.getClass();
                        dmpnVar.d = bK;
                        dmpnVar.a |= 4;
                        dmpe dmpeVar = (dmpe) dmph.f.bZ();
                        dmpeVar.b(g.e());
                        if (dmpkVar.c) {
                            dmpkVar.bF();
                            dmpkVar.c = false;
                        }
                        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
                        dmph dmphVar = (dmph) dmpeVar.bK();
                        dmphVar.getClass();
                        dmpnVar2.b = dmphVar;
                        dmpnVar2.a |= 1;
                        if (dmpkVar.c) {
                            dmpkVar.bF();
                            dmpkVar.c = false;
                        }
                        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
                        dmpnVar3.a |= 32;
                        dmpnVar3.g = 11;
                        dsqv<dmpn, akus> dsqvVar = akvj.a;
                        akuq bZ2 = akus.o.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        akus akusVar = (akus) bZ2.b;
                        akusVar.a |= 32768;
                        akusVar.g = true;
                        dmpkVar.k(dsqvVar, bZ2.bK());
                        aifa a2 = aifbVar.a((dmpn) dmpkVar.bK(), bybg.a(byayVar, this.f.getDisplayMetrics()), dcdc.f(this.h.a()), null);
                        if (byayVar.d == null) {
                            z = true;
                        }
                        dbsk.b(z, "Can only initialize renderable once.");
                        byayVar.d = a2;
                    }
                }
                aifa aifaVar = byayVar.d;
                dbsk.s(aifaVar);
                aihVar.add(byayVar);
                set.remove(byayVar);
                aifaVar.f(bybg.a(byayVar, this.f.getDisplayMetrics()), 4, 2500, true);
            }
        }
        for (byay byayVar2 : set) {
            if (byayVar2.d != null) {
                byayVar2.a();
            }
        }
        if (aihVar.isEmpty()) {
            this.d.remove(bybpVar);
        } else {
            this.d.put(bybpVar, aihVar);
        }
    }
}

package defpackage;

import java.util.Collection;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cue  reason: default package */
/* loaded from: classes5.dex */
final class cue implements Runnable {
    final /* synthetic */ HashMap a;
    final /* synthetic */ cuf b;

    public cue(cuf cufVar, HashMap hashMap) {
        this.b = cufVar;
        this.a = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cuf cufVar = this.b;
        int i = cufVar.b;
        cui cuiVar = cufVar.c;
        if (i != cuiVar.g) {
            for (aktd aktdVar : this.a.keySet()) {
                aktdVar.j();
            }
            return;
        }
        if (!cuiVar.h) {
            for (aktd aktdVar2 : this.a.keySet()) {
                aktdVar2.h();
            }
        }
        if (!this.a.isEmpty()) {
            cuf cufVar2 = this.b;
            cug cugVar = new cug(cufVar2.c, cufVar2.a);
            for (aktd aktdVar3 : this.a.keySet()) {
                aktdVar3.Pt(cugVar);
            }
            cui cuiVar2 = this.b.c;
            Collection<djie> values = this.a.values();
            if (values.size() > 0) {
                int size = values.size();
                akra[] akraVarArr = new akra[size];
                int i2 = 0;
                for (djie djieVar : values) {
                    djja djjaVar = djieVar.d;
                    if (djjaVar == null) {
                        djjaVar = djja.e;
                    }
                    dpum dpumVar = djjaVar.a;
                    if (dpumVar == null) {
                        dpumVar = dpum.d;
                    }
                    akraVarArr[i2] = akra.f(akqq.f(dpumVar));
                    i2++;
                }
                cuiVar2.j = size > 0 ? akrp.f(akraVarArr) : null;
            }
        }
        this.b.c.f = this.a;
    }
}

package defpackage;

import java.util.Collections;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amrd  reason: default package */
/* loaded from: classes.dex */
public final class amrd implements aktt {
    final /* synthetic */ amre a;

    public amrd(amre amreVar) {
        this.a = amreVar;
    }

    @Override // defpackage.aktt
    public final void a(akzh akzhVar, alne alneVar) {
        amyn.e.a();
        synchronized (this.a.f.b) {
            this.a.d.clear();
            amre amreVar = this.a;
            amreVar.d.addAll(amreVar.f.c.entrySet());
        }
        amrh amrhVar = this.a.f.d;
        amrhVar.a.clear();
        amrhVar.c.clear();
        amrhVar.e.clear();
        Collections.sort(this.a.d, amrg.g);
        for (Map.Entry<aktc, amrf> entry : this.a.d) {
            aktc key = entry.getKey();
            amrf value = entry.getValue();
            key.d();
            amre amreVar2 = this.a;
            amrk amrkVar = amreVar2.c;
            if (amrkVar == null) {
                amreVar2.c = new amrk(value.b, value.e ? value.d : null, value.f, akzhVar, amreVar2.f.d, alneVar, value.g);
            } else {
                amrkVar.a = value.b;
                akra akraVar = value.e ? value.d : null;
                if (akraVar != null) {
                    amrkVar.b.aa(akraVar);
                    amrkVar.c = true;
                } else {
                    amrkVar.c = false;
                }
                amrk amrkVar2 = amreVar2.c;
                amrkVar2.d = value.f;
                amrkVar2.e = akzhVar;
                amrkVar2.f = amreVar2.f.d;
                amrkVar2.h = alneVar;
                amrkVar2.g = value.g;
            }
            amrl amrlVar = value.a;
            amre amreVar3 = this.a;
            if (!amrlVar.a(key, amreVar3.c, amreVar3.a)) {
                if (value.h) {
                    this.a.f.a.g(key);
                    value.h = false;
                }
            } else {
                amre amreVar4 = this.a;
                amreVar4.b.b(amreVar4.a.a);
                amre amreVar5 = this.a;
                aktb aktbVar = amreVar5.b;
                aktbVar.b = amreVar5.a.b;
                key.a(aktbVar);
                if (!value.h) {
                    if (value.i != null) {
                        throw null;
                    }
                    this.a.f.a.f(key);
                    value.h = true;
                }
                value.d.aa(this.a.a.a);
                value.e = true;
                value.f = this.a.a.b;
            }
        }
    }
}

package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ahq  reason: default package */
/* loaded from: classes.dex */
public final class ahq {
    public final ahi b;
    public final ArrayList a = new ArrayList();
    private final ahp c = new ahp();

    public ahq(ahi ahiVar) {
        this.b = ahiVar;
    }

    public final void a(ahi ahiVar) {
        this.a.clear();
        int size = ahiVar.aH.size();
        for (int i = 0; i < size; i++) {
            ahh ahhVar = (ahh) ahiVar.aH.get(i);
            if (ahhVar.N() == 3 || ahhVar.O() == 3) {
                this.a.add(ahhVar);
            }
        }
        ahiVar.c();
    }

    public final boolean b(aij aijVar, ahh ahhVar, int i) {
        this.c.i = ahhVar.N();
        this.c.j = ahhVar.O();
        this.c.a = ahhVar.j();
        this.c.b = ahhVar.h();
        ahp ahpVar = this.c;
        ahpVar.g = false;
        ahpVar.h = i;
        int i2 = ahpVar.i;
        int i3 = ahpVar.j;
        boolean z = i2 == 3 && ahhVar.W > 0.0f;
        boolean z2 = i3 == 3 && ahhVar.W > 0.0f;
        if (z && ahhVar.u[0] == 4) {
            ahpVar.i = 1;
        }
        if (z2 && ahhVar.u[1] == 4) {
            ahpVar.j = 1;
        }
        aijVar.a(ahhVar, ahpVar);
        ahhVar.D(this.c.c);
        ahhVar.y(this.c.d);
        ahp ahpVar2 = this.c;
        ahhVar.F = ahpVar2.f;
        ahhVar.v(ahpVar2.e);
        ahp ahpVar3 = this.c;
        ahpVar3.h = 0;
        return ahpVar3.g;
    }

    public final void c(ahi ahiVar, int i, int i2, int i3) {
        int i4 = ahiVar.ab;
        int i5 = ahiVar.ac;
        ahiVar.C(0);
        ahiVar.B(0);
        ahiVar.D(i2);
        ahiVar.y(i3);
        ahiVar.C(i4);
        ahiVar.B(i5);
        ahi ahiVar2 = this.b;
        ahiVar2.c = i;
        ahiVar2.T();
    }
}

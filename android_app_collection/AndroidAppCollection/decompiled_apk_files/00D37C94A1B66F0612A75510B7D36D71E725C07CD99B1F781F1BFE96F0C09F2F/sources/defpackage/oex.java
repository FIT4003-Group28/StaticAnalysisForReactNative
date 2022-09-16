package defpackage;
/* compiled from: PG */
/* renamed from: oex  reason: default package */
/* loaded from: classes3.dex */
public final class oex implements oey {
    public final oaj a;
    private final fgj b;
    private final oao c;

    public oex() {
    }

    @Override // defpackage.ezb
    public final void h(ezw ezwVar) {
        oan oanVar;
        if (ezwVar != null) {
            oao oaoVar = this.c;
            fgh c = this.b.c(ezwVar.a());
            aaqp aaqpVar = (aaqp) oaoVar.a.get();
            aaqpVar.getClass();
            oanVar = new oan(aaqpVar, c);
        } else {
            oanVar = null;
        }
        oaj oajVar = this.a;
        if (akzj.f(oanVar, oajVar.c)) {
            return;
        }
        oan oanVar2 = oajVar.c;
        if (oanVar2 != null) {
            oanVar2.h(false);
        }
        int a = oajVar.a();
        oajVar.c = oanVar;
        if (oanVar != null) {
            oanVar.h(true);
        }
        int a2 = oajVar.a();
        if (a > a2) {
            for (ajql ajqlVar : oajVar.a) {
                ajqlVar.d(0, 1);
            }
        } else if (a < a2) {
            for (ajql ajqlVar2 : oajVar.a) {
                ajqlVar2.pk(0, 1);
            }
        }
        for (ofm ofmVar : oajVar.b) {
            ofmVar.a.a();
        }
    }

    public oex(fgj fgjVar, oao oaoVar) {
        this.b = fgjVar;
        this.c = oaoVar;
        this.a = new oaj();
    }

    @Override // defpackage.oey
    public final void a(aikd aikdVar) {
        int i;
        int i2;
        oan oanVar = this.a.c;
        if (oanVar == null) {
            return;
        }
        if (aikdVar != null && !oan.k(aikdVar) && (i2 = aikdVar.i) != 1 && i2 != 4 && i2 != 2) {
            aikdVar = null;
        }
        int i3 = 0;
        if (oanVar.f == aikdVar) {
            i = 0;
        } else {
            oanVar.f = aikdVar;
            i = 32;
        }
        if (aikdVar != null) {
            i3 = oanVar.a(null, null);
        }
        oanVar.e(i | i3);
    }
}

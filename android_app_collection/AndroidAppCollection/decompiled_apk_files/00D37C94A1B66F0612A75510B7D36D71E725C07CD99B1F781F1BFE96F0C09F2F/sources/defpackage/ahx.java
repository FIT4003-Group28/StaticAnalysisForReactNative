package defpackage;
/* compiled from: PG */
/* renamed from: ahx  reason: default package */
/* loaded from: classes.dex */
public final class ahx extends aid {
    public ahx(ahh ahhVar) {
        super(ahhVar);
        ahhVar.h.d();
        ahhVar.i.d();
        this.g = ((ahk) ahhVar).aq;
    }

    private final void g(ahu ahuVar) {
        this.i.j.add(ahuVar);
        ahuVar.k.add(this.i);
    }

    @Override // defpackage.aid
    public final void b() {
        ahh ahhVar = this.d;
        ahk ahkVar = (ahk) ahhVar;
        int i = ahkVar.b;
        int i2 = ahkVar.c;
        float f = ahkVar.a;
        if (ahkVar.aq == 1) {
            if (i != -1) {
                this.i.k.add(ahhVar.T.h.i);
                this.d.T.h.i.j.add(this.i);
                this.i.e = i;
            } else if (i2 != -1) {
                this.i.k.add(ahhVar.T.h.j);
                this.d.T.h.j.j.add(this.i);
                this.i.e = -i2;
            } else {
                ahu ahuVar = this.i;
                ahuVar.b = true;
                ahuVar.k.add(ahhVar.T.h.j);
                this.d.T.h.j.j.add(this.i);
            }
            g(this.d.h.i);
            g(this.d.h.j);
            return;
        }
        if (i != -1) {
            this.i.k.add(ahhVar.T.i.i);
            this.d.T.i.i.j.add(this.i);
            this.i.e = i;
        } else if (i2 != -1) {
            this.i.k.add(ahhVar.T.i.j);
            this.d.T.i.j.j.add(this.i);
            this.i.e = -i2;
        } else {
            ahu ahuVar2 = this.i;
            ahuVar2.b = true;
            ahuVar2.k.add(ahhVar.T.i.j);
            this.d.T.i.j.j.add(this.i);
        }
        g(this.d.i.i);
        g(this.d.i.j);
    }

    @Override // defpackage.aid
    public final void c() {
        ahh ahhVar = this.d;
        if (((ahk) ahhVar).aq == 1) {
            ahhVar.Y = this.i.f;
        } else {
            ahhVar.Z = this.i.f;
        }
    }

    @Override // defpackage.aid
    public final void d() {
        this.i.b();
    }

    @Override // defpackage.aid
    public final boolean e() {
        return false;
    }

    @Override // defpackage.aid, defpackage.ahs
    public final void f() {
        ahu ahuVar = this.i;
        if (ahuVar.c && !ahuVar.i) {
            int i = ((ahu) ahuVar.k.get(0)).f;
            this.i.c((int) ((i * ((ahk) this.d).a) + 0.5f));
        }
    }
}

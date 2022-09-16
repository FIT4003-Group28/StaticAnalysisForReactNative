package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahy  reason: default package */
/* loaded from: classes.dex */
public final class ahy extends aid {
    public ahy(ahh ahhVar) {
        super(ahhVar);
    }

    private final void g(ahu ahuVar) {
        this.i.j.add(ahuVar);
        ahuVar.k.add(this.i);
    }

    @Override // defpackage.aid
    public final void b() {
        ahh ahhVar = this.d;
        if (ahhVar instanceof ahe) {
            ahu ahuVar = this.i;
            ahuVar.b = true;
            ahe aheVar = (ahe) ahhVar;
            int i = aheVar.a;
            boolean z = aheVar.b;
            int i2 = 0;
            if (i == 0) {
                ahuVar.l = 4;
                while (i2 < aheVar.ar) {
                    ahh ahhVar2 = aheVar.aq[i2];
                    if (z || ahhVar2.ag != 8) {
                        ahu ahuVar2 = ahhVar2.h.i;
                        ahuVar2.j.add(this.i);
                        this.i.k.add(ahuVar2);
                    }
                    i2++;
                }
                g(this.d.h.i);
                g(this.d.h.j);
            } else if (i == 1) {
                ahuVar.l = 5;
                while (i2 < aheVar.ar) {
                    ahh ahhVar3 = aheVar.aq[i2];
                    if (z || ahhVar3.ag != 8) {
                        ahu ahuVar3 = ahhVar3.h.j;
                        ahuVar3.j.add(this.i);
                        this.i.k.add(ahuVar3);
                    }
                    i2++;
                }
                g(this.d.h.i);
                g(this.d.h.j);
            } else if (i == 2) {
                ahuVar.l = 6;
                while (i2 < aheVar.ar) {
                    ahh ahhVar4 = aheVar.aq[i2];
                    if (z || ahhVar4.ag != 8) {
                        ahu ahuVar4 = ahhVar4.i.i;
                        ahuVar4.j.add(this.i);
                        this.i.k.add(ahuVar4);
                    }
                    i2++;
                }
                g(this.d.i.i);
                g(this.d.i.j);
            } else if (i != 3) {
            } else {
                ahuVar.l = 7;
                while (i2 < aheVar.ar) {
                    ahh ahhVar5 = aheVar.aq[i2];
                    if (z || ahhVar5.ag != 8) {
                        ahu ahuVar5 = ahhVar5.i.j;
                        ahuVar5.j.add(this.i);
                        this.i.k.add(ahuVar5);
                    }
                    i2++;
                }
                g(this.d.i.i);
                g(this.d.i.j);
            }
        }
    }

    @Override // defpackage.aid
    public final void c() {
        ahh ahhVar = this.d;
        if (ahhVar instanceof ahe) {
            int i = ((ahe) ahhVar).a;
            if (i == 0 || i == 1) {
                ahhVar.Y = this.i.f;
            } else {
                ahhVar.Z = this.i.f;
            }
        }
    }

    @Override // defpackage.aid
    public final void d() {
        this.e = null;
        this.i.b();
    }

    @Override // defpackage.aid
    public final boolean e() {
        return false;
    }

    @Override // defpackage.aid, defpackage.ahs
    public final void f() {
        ahe aheVar = (ahe) this.d;
        int i = aheVar.a;
        int i2 = 0;
        int i3 = -1;
        for (ahu ahuVar : this.i.k) {
            int i4 = ahuVar.f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.i.c(i3 + aheVar.c);
        } else {
            this.i.c(i2 + aheVar.c);
        }
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: albd  reason: default package */
/* loaded from: classes2.dex */
public final class albd {
    public final akox a;
    public final dmti b;
    public final albe c;
    public final int d;

    public albd(akox akoxVar, dmti dmtiVar, int i, albe albeVar) {
        this.a = akoxVar;
        this.b = dmtiVar;
        this.d = i;
        this.c = albeVar;
    }

    public final void a(albc albcVar) {
        albcVar.b(this.a);
    }

    public final albc b(Iterable<dmpn> iterable, akvx akvxVar) {
        aktd a;
        akty aC = this.a.aj().aC();
        dccx F = dcdc.F();
        for (dmpn dmpnVar : iterable) {
            try {
                if (this.d - 1 != 0) {
                    a = aC.b(dmpnVar, this.b);
                } else {
                    a = aC.a(dmpnVar, this.b, akvxVar);
                }
                albe albeVar = this.c;
                if (((alaw) albeVar).a) {
                    a.Pu();
                } else if (((alaw) albeVar).b.a()) {
                    a.Pt(((alaw) this.c).b.b());
                }
                F.g(new albb(a, dmpnVar.i / 8, (dmpnVar.a & 256) != 0 ? dmpnVar.j / 8 : 30));
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }
        return new albc(F.f());
    }
}

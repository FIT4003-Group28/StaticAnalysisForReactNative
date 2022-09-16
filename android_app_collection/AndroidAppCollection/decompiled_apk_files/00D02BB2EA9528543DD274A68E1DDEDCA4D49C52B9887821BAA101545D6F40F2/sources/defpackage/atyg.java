package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atyg  reason: default package */
/* loaded from: classes2.dex */
public final class atyg implements brlm {
    final /* synthetic */ atyi a;
    private final atzb b;
    private final ckcq c;
    private final ckcq d;
    private final ckcq e;
    private final ckcq f;
    private final ckcq g;

    public atyg(atyi atyiVar, atzb atzbVar, ckcq ckcqVar, ckcq ckcqVar2, ckcq ckcqVar3, ckcq ckcqVar4, ckcq ckcqVar5) {
        this.a = atyiVar;
        this.b = atzbVar;
        this.c = ckcqVar;
        this.d = ckcqVar2;
        this.e = ckcqVar3;
        this.f = ckcqVar4;
        this.g = ckcqVar5;
        ckcqVar.a();
        ckcqVar2.a();
        ckcqVar3.a();
        ckcqVar4.a();
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        atyi atyiVar = this.a;
        if (brlnVar == atyiVar.a) {
            brlu brluVar = brlnVar.e;
            iqy iqyVar = brlnVar.a;
            boolean z = iqyVar == null || iqyVar.o;
            boolean z2 = true ^ brluVar.f;
            boolean z3 = brluVar.e;
            boolean z4 = brluVar.d;
            if (!z2) {
                atyiVar.a = null;
            }
            if (z4) {
                this.e.b();
            } else {
                this.f.b();
            }
            if (z3) {
                if (brluVar.E() == 0) {
                    this.d.b();
                }
                if (z2 && z4) {
                    this.g.a();
                }
            } else {
                this.g.b();
            }
            this.b.a(brluVar, z);
            this.a.k();
        }
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        atyi atyiVar = this.a;
        if (brlnVar != atyiVar.a) {
            return;
        }
        atyiVar.a = null;
        this.c.b();
        this.b.b(bttqVar);
        this.a.k();
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        atyi atyiVar = this.a;
        if (brlnVar != atyiVar.a) {
            return;
        }
        atyiVar.a = null;
        this.a.k();
    }
}

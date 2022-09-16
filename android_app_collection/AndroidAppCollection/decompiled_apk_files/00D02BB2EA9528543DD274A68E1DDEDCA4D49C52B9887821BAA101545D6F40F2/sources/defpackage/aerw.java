package defpackage;
/* compiled from: PG */
/* renamed from: aerw  reason: default package */
/* loaded from: classes2.dex */
final class aerw implements brlm {
    final /* synthetic */ aerx a;

    public aerw(aerx aerxVar) {
        this.a = aerxVar;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        aerx aerxVar = this.a;
        if (!aerxVar.aD) {
            return;
        }
        aerxVar.A.e();
        ilo F = brlnVar.e.F();
        if (F == null) {
            return;
        }
        if (this.a.bb.b() == bxla.PLACE_PICKER_NON_CURRENT_LOCATION) {
            this.a.Nw(aeuf.i(F, dtaq.m));
            return;
        }
        this.a.b.a().D(F, 4, dtxy.fu);
        aerx aerxVar2 = this.a;
        aerxVar2.Nw(aerxVar2.b.a().B().h);
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        aerx aerxVar = this.a;
        if (aerxVar.aD) {
            aerxVar.A.e();
        }
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        aerx aerxVar = this.a;
        if (aerxVar.aD) {
            aerxVar.A.e();
        }
    }
}

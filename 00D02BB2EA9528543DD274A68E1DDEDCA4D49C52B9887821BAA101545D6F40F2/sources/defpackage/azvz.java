package defpackage;
/* compiled from: PG */
/* renamed from: azvz  reason: default package */
/* loaded from: classes3.dex */
public final class azvz extends azwh<azwa> {
    public dokb a;

    public azvz(azwa azwaVar) {
        super(azwaVar);
        this.a = azwaVar.j();
    }

    @Override // defpackage.azwh
    /* renamed from: a */
    public final azwa b() {
        String str = this.d;
        dbsk.s(str);
        dbsk.l(str.equals(this.a.b));
        String str2 = this.g;
        dbsk.s(str2);
        dbsk.l(str2.equals(this.a.b));
        return new azwa(this);
    }

    public final void c(dbsz<doka> dbszVar) {
        doka ca = dokb.i.ca(this.a);
        dbszVar.NU(ca);
        this.a = ca.bK();
    }

    public azvz(dokb dokbVar) {
        super(azwm.h, azwm.i);
        String str = dokbVar.b;
        this.d = str;
        this.g = str;
        this.a = dokbVar;
    }
}

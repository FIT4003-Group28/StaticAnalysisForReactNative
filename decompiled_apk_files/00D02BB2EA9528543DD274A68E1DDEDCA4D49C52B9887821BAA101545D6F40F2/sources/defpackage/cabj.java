package defpackage;
/* compiled from: PG */
/* renamed from: cabj  reason: default package */
/* loaded from: classes4.dex */
public class cabj implements cafg {
    private final dkcq a;
    private final dkcp b;
    private final caff c;
    @dzsi
    private final cjtd d;
    private boolean e;

    public cabj(dkcq dkcqVar, dkcp dkcpVar, caff caffVar) {
        cjtd a;
        this.a = dkcqVar;
        this.b = dkcpVar;
        this.c = caffVar;
        this.e = dkcqVar.d;
        dkcp dkcpVar2 = dkcp.UNKNOWN_TAB_TYPE;
        int ordinal = dkcpVar.ordinal();
        if (ordinal == 1) {
            a = cjtd.a(dtyd.bE);
        } else if (ordinal == 2) {
            a = cjtd.a(dtyd.ck);
        } else if (ordinal == 3) {
            a = cjtd.a(dtyd.bY);
        } else if (ordinal == 4) {
            a = cjtd.a(dtyd.bJ);
        } else if (ordinal != 6) {
            a = ordinal != 7 ? null : cjtd.a(dtyd.ci);
        } else {
            a = cjtd.a(dtyd.bL);
        }
        this.d = a;
    }

    public dkcp a() {
        return this.b;
    }

    public dkcq b() {
        return this.a;
    }

    @Override // defpackage.cafg
    public Boolean c() {
        return Boolean.valueOf(this.e);
    }

    public void d(Boolean bool) {
        this.e = bool.booleanValue();
    }

    @Override // defpackage.cafg
    public String e() {
        return this.a.c;
    }

    @Override // defpackage.cafg
    public cqkl f() {
        caff caffVar = this.c;
        ((bzzi) caffVar).a.bn(this.b);
        return cqkl.a;
    }

    @Override // defpackage.cafg
    @dzsi
    public cjtd g() {
        return this.d;
    }
}

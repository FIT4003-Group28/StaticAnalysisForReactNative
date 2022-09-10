package defpackage;
/* compiled from: PG */
/* renamed from: lvz  reason: default package */
/* loaded from: classes7.dex */
public class lvz implements lvw {
    private final atna a;
    private final dbty<noi> b;
    private final boolean c;

    public lvz(atna atnaVar, final dbty<atlq> dbtyVar, dbty<noi> dbtyVar2, jzp jzpVar) {
        this.a = atnaVar;
        this.b = dbtyVar2;
        btsp.b(new dbty(dbtyVar) { // from class: lvx
            private final dbty a;

            {
                this.a = dbtyVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                final dbty dbtyVar3 = this.a;
                return new kor(new dbty(dbtyVar3) { // from class: lvy
                    private final dbty a;

                    {
                        this.a = dbtyVar3;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        crqf crqfVar;
                        atlq atlqVar = (atlq) this.a.a();
                        amve amveVar = null;
                        if (atlqVar != null && (crqfVar = atlqVar.m) != null) {
                            amveVar = crqfVar.g().a.d;
                        }
                        return dbsg.j(amveVar);
                    }
                });
            }
        });
        this.c = jzpVar.a();
    }

    @Override // defpackage.lvw
    public Boolean a() {
        return this.a.q();
    }

    @Override // defpackage.lvw
    public Boolean b() {
        return this.a.r();
    }

    @Override // defpackage.lvw
    public Boolean c() {
        return this.a.v();
    }

    @Override // defpackage.lvw
    public Boolean d() {
        return this.a.O();
    }

    @Override // defpackage.lvw
    public Boolean e() {
        return this.a.ag();
    }

    @Override // defpackage.lvw
    @dzsi
    public String f() {
        return this.a.d();
    }

    @Override // defpackage.lvw
    @dzsi
    public String g() {
        return this.a.A();
    }

    @Override // defpackage.lvw
    @dzsi
    public CharSequence h() {
        return this.a.am();
    }

    @Override // defpackage.lvw
    public cqkl i() {
        return this.a.k();
    }

    @Override // defpackage.lvw
    public cqkl j() {
        return this.a.l();
    }

    @Override // defpackage.lvw
    public asuq k() {
        return this.a.n();
    }

    @Override // defpackage.lvw
    public Boolean l() {
        boolean z = false;
        if (!a().booleanValue() && k().h().booleanValue() && m().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.lvw
    public Boolean m() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.lvw
    public Boolean n() {
        return false;
    }

    @Override // defpackage.lvw
    public Boolean o() {
        return Boolean.valueOf(this.b.a() == noi.MEDIUM);
    }
}

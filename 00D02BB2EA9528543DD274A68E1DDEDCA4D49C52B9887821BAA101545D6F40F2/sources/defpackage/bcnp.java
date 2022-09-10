package defpackage;
/* compiled from: PG */
/* renamed from: bcnp  reason: default package */
/* loaded from: classes3.dex */
public class bcnp extends bcnv implements bcmd {
    private final bclp a;

    public bcnp(bcnu bcnuVar, dwfl dwflVar, int i, @dzsi ilo iloVar, dwen dwenVar) {
        super(bcnuVar, dwflVar, i, iloVar, dwenVar);
        cjta b = cjtd.b();
        b.d = dtxy.cg;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        final cjtd a = b.a();
        this.a = new bclp(a) { // from class: bcno
            private final cjtd a;

            {
                this.a = a;
            }

            @Override // defpackage.bclp
            public cjtd a() {
                return this.a;
            }
        };
        cknv.k(dwflVar);
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public void a(cqiv cqivVar) {
        if (this.m.c()) {
            cqivVar.a(new bchj(), this);
        } else {
            cqivVar.a(new bcgz(), this);
        }
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public CharSequence g() {
        return super.g();
    }

    @Override // defpackage.bcnv, defpackage.bcdh
    public Boolean h() {
        return Boolean.valueOf(super.h().booleanValue());
    }

    @Override // defpackage.bcmd
    public bclp m() {
        return this.a;
    }
}

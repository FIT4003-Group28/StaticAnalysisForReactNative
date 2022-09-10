package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dkg  reason: default package */
/* loaded from: classes6.dex */
public abstract class dkg implements dfeq<dfhp> {
    private final cjqy a;
    private final dbsg<cjqp> b;
    @dzsi
    private cjtd c;
    @dzsi
    private cjql d;
    private boolean e = false;

    public dkg(cjqy cjqyVar, dbsg<cjqp> dbsgVar) {
        this.a = cjqyVar;
        this.b = dbsgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjtd e(ddho ddhoVar, @dzsi akqi akqiVar) {
        if (akqi.d(akqiVar)) {
            cjta b = cjtd.b();
            b.d = ddhoVar;
            b.g = decs.a(akqiVar.c);
            return b.a();
        }
        return cjtd.a(ddhoVar);
    }

    @dzsi
    public abstract cjtd b(dfhp dfhpVar);

    public final void c() {
        this.c = null;
        this.d = null;
        this.e = false;
    }

    @Override // defpackage.dfeq
    /* renamed from: d */
    public final void n(dfhp dfhpVar) {
        if (this.b.a()) {
            int a = dfho.a(dfhpVar.c);
            boolean z = true;
            if (a == 0) {
                a = 1;
            }
            cjtd b = b(dfhpVar);
            if (a == 1 || b == null) {
                c();
                return;
            }
            cjtd cjtdVar = this.c;
            cjql cjqlVar = this.d;
            boolean z2 = this.e;
            if (cjqlVar == null || !b.equals(cjtdVar)) {
                cjqlVar = this.b.b().d(b);
                z2 = false;
            } else {
                b = cjtdVar;
            }
            if (a != 3) {
                z = false;
            } else if (!z2) {
                cjqy cjqyVar = this.a;
                cjte cjteVar = new cjte(deaf.HOVER);
                dbsk.s(b);
                cjqyVar.n(cjqlVar, cjteVar, b);
            } else {
                z = z2;
            }
            this.c = b;
            this.d = cjqlVar;
            this.e = z;
        }
    }
}

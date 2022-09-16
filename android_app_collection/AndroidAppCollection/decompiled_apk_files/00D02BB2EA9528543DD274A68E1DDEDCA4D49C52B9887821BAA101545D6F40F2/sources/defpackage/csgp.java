package defpackage;

import defpackage.csgp;
/* compiled from: PG */
/* renamed from: csgp  reason: default package */
/* loaded from: classes5.dex */
public abstract class csgp<BuilderT extends csgp<BuilderT>> {
    private final ddxw b;
    private final cshu<csgt> c;
    private final csgq e = csgt.e;
    private csgt d = null;
    private final csha a = (csha) cshb.f.bZ();

    /* JADX INFO: Access modifiers changed from: protected */
    public csgp(csgs csgsVar, cshu<csgt> cshuVar) {
        this.c = cshuVar;
        this.b = csgsVar.a;
    }

    protected abstract void a();

    public final <T> BuilderT b(csgr<T> csgrVar) {
        dbsk.l(this.d == null);
        this.a.k(csgrVar.a, csgrVar.b);
        a();
        return this;
    }

    public final csgt c() {
        dbsk.m(this.d == null, "Cannot create CVE twice.");
        csha cshaVar = this.a;
        ddxw ddxwVar = this.b;
        if (cshaVar.c) {
            cshaVar.bF();
            cshaVar.c = false;
        }
        cshb cshbVar = (cshb) cshaVar.b;
        ddxx bK = ddxwVar.bK();
        cshb cshbVar2 = cshb.f;
        bK.getClass();
        cshbVar.c = bK;
        cshbVar.a = 1 | cshbVar.a;
        csgt csgtVar = new csgt(this.a, this.e, this.c);
        this.d = csgtVar;
        cshu<csgt> cshuVar = csgtVar.b;
        if (!cshuVar.a.isEmpty()) {
            for (cshr<csgt> cshrVar : cshuVar.a) {
                cshrVar.d();
            }
        }
        return this.d;
    }
}

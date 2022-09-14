package defpackage;
/* compiled from: PG */
/* renamed from: dnyt  reason: default package */
/* loaded from: classes6.dex */
public final class dnyt extends dsqp<dnyw, dnyt> implements dssk {
    public dnyt() {
        super(dnyw.c);
    }

    public final void a(dnyv dnyvVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dnyw dnywVar = (dnyw) this.b;
        dnyw dnywVar2 = dnyw.c;
        dnyvVar.getClass();
        dsrj<dnyv> dsrjVar = dnywVar.b;
        if (!dsrjVar.a()) {
            dnywVar.b = dsqw.cl(dsrjVar);
        }
        dnywVar.b.add(dnyvVar);
    }

    public final void b(dnwv dnwvVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dnyw dnywVar = (dnyw) this.b;
        dnyw dnywVar2 = dnyw.c;
        dnwvVar.getClass();
        dnywVar.b();
        dnywVar.a.h(dnwvVar.s);
    }
}

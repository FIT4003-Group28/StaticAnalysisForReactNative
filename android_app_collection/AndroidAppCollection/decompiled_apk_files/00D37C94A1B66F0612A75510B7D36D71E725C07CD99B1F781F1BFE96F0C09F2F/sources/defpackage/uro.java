package defpackage;
/* compiled from: PG */
/* renamed from: uro  reason: default package */
/* loaded from: classes4.dex */
abstract class uro implements ampg {
    public void a(qwf qwfVar, uqa uqaVar) {
        throw null;
    }

    @Override // defpackage.ampg
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        qwf qwfVar = (qwf) obj;
        uqa a = uqc.a();
        if (qwfVar.c() != null) {
            a.b(qwfVar.c());
        }
        if (qwfVar.e() != null) {
            a.a = qwfVar.e();
        }
        if (qwfVar.g() != null) {
            b(qwfVar, a);
        }
        if (qwfVar.f() != null) {
            a(qwfVar, a);
        }
        if (qwfVar.b() != null) {
            a.d = qwfVar.b();
        }
        c(qwfVar, a);
        if (qwfVar.d() != null) {
            a.e = qwfVar.d();
        }
        return a.a();
    }

    public void b(qwf qwfVar, uqa uqaVar) {
        throw null;
    }

    public abstract void c(qwf qwfVar, uqa uqaVar);
}

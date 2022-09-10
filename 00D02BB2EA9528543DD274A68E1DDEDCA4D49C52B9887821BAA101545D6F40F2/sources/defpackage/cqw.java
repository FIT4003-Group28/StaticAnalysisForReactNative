package defpackage;
/* compiled from: PG */
/* renamed from: cqw  reason: default package */
/* loaded from: classes5.dex */
final class cqw implements cpmy {
    final /* synthetic */ cqt a;
    final /* synthetic */ cqz b;

    public cqw(cqz cqzVar, cqt cqtVar) {
        this.b = cqzVar;
        this.a = cqtVar;
    }

    @Override // defpackage.cpmy
    public final void a(cpnc cpncVar) {
        String c;
        cql cqlVar = this.a.ay;
        bope bopeVar = this.b.f;
        if (bopeVar == null || bopeVar.o() == dory.USER_PROVIDED || cqlVar == null) {
            return;
        }
        if (cpncVar.c().isEmpty()) {
            c = cpncVar.a();
        } else {
            c = cpncVar.c();
        }
        cqlVar.a(c);
    }
}

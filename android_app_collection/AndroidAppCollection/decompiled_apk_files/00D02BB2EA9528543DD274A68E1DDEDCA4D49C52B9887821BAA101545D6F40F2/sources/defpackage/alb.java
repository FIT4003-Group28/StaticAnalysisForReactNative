package defpackage;
/* compiled from: PG */
/* renamed from: alb  reason: default package */
/* loaded from: classes2.dex */
final class alb implements alm<alg> {
    final /* synthetic */ jx a;

    public alb(jx jxVar) {
        this.a = jxVar;
    }

    @Override // defpackage.alm
    public final /* bridge */ /* synthetic */ void a(alg algVar) {
        if (algVar == null) {
            this.a.c(1);
            return;
        }
        alg algVar2 = algVar;
        int i = algVar2.b;
        if (i == 0) {
            this.a.d(algVar2.a);
        } else {
            this.a.c(i);
        }
    }
}

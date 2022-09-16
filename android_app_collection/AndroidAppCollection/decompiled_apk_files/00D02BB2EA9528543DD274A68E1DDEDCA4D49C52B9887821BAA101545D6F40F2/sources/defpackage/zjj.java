package defpackage;
/* compiled from: PG */
/* renamed from: zjj  reason: default package */
/* loaded from: classes7.dex */
final class zjj implements zdd {
    final /* synthetic */ zjm a;

    public zjj(zjm zjmVar) {
        this.a = zjmVar;
    }

    @Override // defpackage.zdd
    public final void a(int i, cjqm cjqmVar) {
        if (i < 0 || i >= this.a.c.size()) {
            return;
        }
        dnqh b = yys.b(cjqmVar);
        qbr qbrVar = this.a.a;
        if (qbrVar == null) {
            return;
        }
        qbrVar.b(i, b);
    }
}

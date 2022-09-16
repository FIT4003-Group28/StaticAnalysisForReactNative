package defpackage;
/* compiled from: PG */
/* renamed from: aggr  reason: default package */
/* loaded from: classes.dex */
final class aggr implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ aggs b;
    private final /* synthetic */ int c;

    public aggr(aggs aggsVar, String str) {
        this.b = aggsVar;
        this.a = str;
    }

    public aggr(aggs aggsVar, String str, int i) {
        this.c = i;
        this.b = aggsVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            agrf agrfVar = (agrf) this.b.c.get();
            if (!this.a.equals(agrfVar.d())) {
                return;
            }
            ((aguu) this.b.d.get()).a(this.a, agrfVar.a());
            return;
        }
        agrf agrfVar2 = (agrf) this.b.c.get();
        if (!this.a.equals(agrfVar2.d())) {
            return;
        }
        ((aguu) this.b.d.get()).c(this.a, agrfVar2.a());
    }
}

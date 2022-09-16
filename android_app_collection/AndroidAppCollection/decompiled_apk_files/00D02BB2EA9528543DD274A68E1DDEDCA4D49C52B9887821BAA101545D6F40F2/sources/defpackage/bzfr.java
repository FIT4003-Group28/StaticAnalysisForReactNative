package defpackage;
/* compiled from: PG */
/* renamed from: bzfr  reason: default package */
/* loaded from: classes4.dex */
final class bzfr<K> implements bzgi {
    @dzsi
    public bzfq<K> a;
    final /* synthetic */ bzfs b;

    public bzfr(bzfs bzfsVar, bzfq bzfqVar) {
        this.b = bzfsVar;
        dbsk.s(bzfqVar);
        this.a = bzfqVar;
    }

    @Override // defpackage.bzgi
    public final void Rr() {
        synchronized (this) {
            if (this.a != null) {
                this.a = null;
                this.b.a.remove(this);
                this.b.a();
            }
        }
    }
}

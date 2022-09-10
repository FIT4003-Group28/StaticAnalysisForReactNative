package defpackage;
/* compiled from: PG */
/* renamed from: wqt  reason: default package */
/* loaded from: classes7.dex */
final class wqt implements wpp {
    final /* synthetic */ cqkn a;
    final /* synthetic */ wqv b;

    public wqt(wqv wqvVar, cqkn cqknVar) {
        this.b = wqvVar;
        this.a = cqknVar;
    }

    @Override // defpackage.wpp
    public final Boolean a() {
        boolean z = false;
        if (!this.b.a && this.a != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.wpp
    @dzsi
    public final cqkn<wpr> b() {
        return this.a;
    }
}

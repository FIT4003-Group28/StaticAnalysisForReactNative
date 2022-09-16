package defpackage;
/* compiled from: PG */
/* renamed from: bpge  reason: default package */
/* loaded from: classes3.dex */
final class bpge implements degu<Boolean> {
    final /* synthetic */ bpgf a;

    public bpge(bpgf bpgfVar) {
        this.a = bpgfVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof bpsb) {
            this.a.i(false);
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        this.a.i(bool);
    }
}

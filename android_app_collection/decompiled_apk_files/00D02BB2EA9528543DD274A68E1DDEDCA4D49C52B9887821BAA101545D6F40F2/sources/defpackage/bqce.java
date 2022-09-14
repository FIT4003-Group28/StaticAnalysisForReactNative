package defpackage;
/* compiled from: PG */
/* renamed from: bqce  reason: default package */
/* loaded from: classes4.dex */
final class bqce implements akzt {
    final /* synthetic */ bqcn a;

    public bqce(bqcn bqcnVar) {
        this.a = bqcnVar;
    }

    @Override // defpackage.akzt
    public final void a() {
    }

    @Override // defpackage.akzt
    public final void b() {
        this.a.h.getAndDecrement();
    }

    @Override // defpackage.akzt
    public final void c() {
        b();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: hqy  reason: default package */
/* loaded from: classes3.dex */
public final class hqy extends hz {
    final /* synthetic */ aoa a;
    final /* synthetic */ hra b;

    public hqy(hra hraVar, aoa aoaVar) {
        this.b = hraVar;
        this.a = aoaVar;
    }

    @Override // defpackage.hz
    public final void i() {
        this.a.b(this);
        this.b.b.execute(new Runnable() { // from class: hqx
            @Override // java.lang.Runnable
            public final void run() {
                hqy.this.b.b();
            }
        });
    }

    @Override // defpackage.hz
    public final void j() {
        this.a.b(this);
    }
}

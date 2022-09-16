package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayog  reason: default package */
/* loaded from: classes3.dex */
public final class ayog implements ango {
    final /* synthetic */ ayoi a;
    private final boolean b;

    public ayog(ayoi ayoiVar, boolean z) {
        this.a = ayoiVar;
        this.b = z;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        this.a.A(!this.b);
        this.a.g.a(new Runnable(this) { // from class: ayof
            private final ayog a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.k.f();
            }
        });
    }
}

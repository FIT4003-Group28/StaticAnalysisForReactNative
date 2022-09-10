package defpackage;
/* compiled from: PG */
/* renamed from: atvw  reason: default package */
/* loaded from: classes2.dex */
final class atvw extends azu {
    final /* synthetic */ atvz b;

    public atvw(atvz atvzVar) {
        this.b = atvzVar;
    }

    @Override // defpackage.azu
    public final void b() {
        this.b.b.postDelayed(new Runnable(this) { // from class: atvv
            private final atvw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.e.a();
            }
        }, 1500L);
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aotv  reason: default package */
/* loaded from: classes2.dex */
public final class aotv implements akzt {
    final /* synthetic */ aotw a;

    public aotv(aotw aotwVar) {
        this.a = aotwVar;
    }

    @Override // defpackage.akzt
    public final void a() {
        if (this.a.b.a()) {
            return;
        }
        this.a.d(false);
        Runnable runnable = new Runnable(this) { // from class: aott
            private final aotv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aotw aotwVar = this.a.a;
                aotwVar.a.runOnUiThread(new Runnable(aotwVar) { // from class: aotu
                    private final aotw a;

                    {
                        this.a = aotwVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                });
            }
        };
        akpq akpqVar = this.a.c.a().j;
        akpqVar.a(runnable);
        akpqVar.b(runnable);
    }

    @Override // defpackage.akzt
    public final void b() {
        if (!this.a.b.a()) {
            return;
        }
        this.a.e();
        this.a.b();
    }

    @Override // defpackage.akzt
    public final void c() {
    }
}

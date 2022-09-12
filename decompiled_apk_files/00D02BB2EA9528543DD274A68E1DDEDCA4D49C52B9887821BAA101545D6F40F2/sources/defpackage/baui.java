package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baui  reason: default package */
/* loaded from: classes3.dex */
public final class baui implements Runnable {
    final /* synthetic */ baup a;

    public baui(baup baupVar) {
        this.a = baupVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.f.i()) {
            this.a.af.b(new Runnable(this) { // from class: baug
                private final baui a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.q();
                }
            }, bvrj.BACKGROUND_THREADPOOL);
            return;
        }
        axwq axwqVar = this.a.g;
        if (axwqVar == null) {
            return;
        }
        axwqVar.s(new axxd(this) { // from class: bauh
            private final baui a;

            {
                this.a = this;
            }

            @Override // defpackage.axxd
            public final void a(boolean z) {
                this.a.a.i();
            }
        });
    }
}

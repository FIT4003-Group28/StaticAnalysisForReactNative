package defpackage;
/* compiled from: PG */
/* renamed from: aqwn  reason: default package */
/* loaded from: classes2.dex */
public abstract class aqwn implements akee {
    @Override // defpackage.akee
    public final void a(final gga ggaVar, boolean z) {
        if (z) {
            ggaVar.runOnUiThread(new Runnable(this, ggaVar) { // from class: aqwm
                private final aqwn a;
                private final gga b;

                {
                    this.a = this;
                    this.b = ggaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(this.b, 2);
                }
            });
        }
    }

    public abstract void b(gga ggaVar, int i);
}

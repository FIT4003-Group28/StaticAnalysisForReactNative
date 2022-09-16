package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aqwe  reason: default package */
/* loaded from: classes2.dex */
public final class aqwe extends aqwn {
    private final apze a;

    public aqwe(apze apzeVar) {
        this.a = apzeVar;
    }

    @Override // defpackage.aqwn
    public final void b(final gga ggaVar, int i) {
        String c = this.a.c();
        apzb e = this.a.e();
        boolean d = this.a.d();
        final aqij aqijVar = new aqij();
        Bundle bundle = new Bundle();
        int i2 = e.q;
        bundle.putString("kt", this.a.a().c(""));
        bundle.putString("ks", this.a.b().c(""));
        bundle.putString("ksli", c);
        bundle.putInt("kept", i2);
        bundle.putBoolean("koiotb", d);
        aqijVar.B(bundle);
        if (ggaVar.K() instanceof aqij) {
            ggaVar.runOnUiThread(new Runnable(ggaVar, aqijVar) { // from class: aqwc
                private final gga a;
                private final aqij b;

                {
                    this.a = ggaVar;
                    this.b = aqijVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.E(this.b);
                }
            });
        } else {
            ggaVar.runOnUiThread(new Runnable(ggaVar, aqijVar) { // from class: aqwd
                private final gga a;
                private final aqij b;

                {
                    this.a = ggaVar;
                    this.b = aqijVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.D(this.b);
                }
            });
        }
    }
}

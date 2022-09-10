package defpackage;

import android.os.Bundle;
/* compiled from: PG */
@Deprecated
/* renamed from: aqwl  reason: default package */
/* loaded from: classes2.dex */
public final class aqwl extends aqwn {
    @Override // defpackage.aqwn
    public final void b(final gga ggaVar, final int i) {
        if (ggaVar.K() instanceof aqmh) {
            if (i == 1) {
                return;
            }
            ggaVar.runOnUiThread(new Runnable(ggaVar) { // from class: aqwj
                private final gga a;

                {
                    this.a = ggaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g().f();
                }
            });
        }
        ggaVar.runOnUiThread(new Runnable(ggaVar, i) { // from class: aqwk
            private final gga a;
            private final int b;

            {
                this.a = ggaVar;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gga ggaVar2 = this.a;
                int i2 = this.b;
                aqmh aqmhVar = new aqmh();
                Bundle bundle = new Bundle();
                bundle.putString("accountSelectionFlowType", apzw.a(i2));
                aqmhVar.B(bundle);
                ggaVar2.D(aqmhVar);
            }
        });
    }
}

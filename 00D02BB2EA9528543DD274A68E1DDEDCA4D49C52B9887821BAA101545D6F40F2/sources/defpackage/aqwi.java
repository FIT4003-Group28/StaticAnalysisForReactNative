package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aqwi  reason: default package */
/* loaded from: classes2.dex */
public final class aqwi extends aqwn {
    public final apzc a;
    boolean b;

    public aqwi(apzc apzcVar, boolean z) {
        this.a = apzcVar;
        this.b = z;
    }

    @Override // defpackage.aqwn
    public final void b(final gga ggaVar, final int i) {
        if (ggaVar.K() instanceof aqev) {
            ggaVar.g().f();
        }
        if (ggaVar.K() instanceof aqmh) {
            this.b = false;
        }
        ggaVar.runOnUiThread(new Runnable(this, ggaVar, i) { // from class: aqwh
            private final aqwi a;
            private final gga b;
            private final int c;

            {
                this.a = this;
                this.b = ggaVar;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aqwi aqwiVar = this.a;
                gga ggaVar2 = this.b;
                int i2 = this.c;
                apzc apzcVar = aqwiVar.a;
                boolean z = aqwiVar.b;
                aqev aqevVar = new aqev();
                Bundle bundle = new Bundle();
                bundle.putSerializable("openConversationParams", apzcVar);
                bundle.putString("accountSelectionFlowType", apzw.a(i2));
                bundle.putBoolean("openInboxOnTapBack", z);
                aqevVar.B(bundle);
                ggaVar2.D(aqevVar);
            }
        });
    }
}

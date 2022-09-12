package defpackage;

import com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnk  reason: default package */
/* loaded from: classes5.dex */
public final class cnk extends cnv {
    final /* synthetic */ cnm a;

    public cnk(cnm cnmVar) {
        this.a = cnmVar;
    }

    @Override // defpackage.cnw
    public final void b(cnu cnuVar) {
        CarInstrumentClusterConfig g;
        synchronized (this.a) {
            this.a.d = cnuVar;
            if (cnuVar != null && (g = cnuVar.g()) != null) {
                this.a.b = g;
            }
        }
    }
}

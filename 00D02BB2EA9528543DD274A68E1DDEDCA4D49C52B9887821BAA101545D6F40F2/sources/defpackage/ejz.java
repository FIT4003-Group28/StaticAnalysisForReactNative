package defpackage;

import com.google.android.apps.gmm.shared.net.clientparam.manager.ClientParametersOnIntentUpdater;
/* compiled from: PG */
/* renamed from: ejz  reason: default package */
/* loaded from: classes6.dex */
final class ejz implements dxis {
    final /* synthetic */ fyu a;

    public ejz(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ClientParametersOnIntentUpdater clientParametersOnIntentUpdater = (ClientParametersOnIntentUpdater) obj;
        clientParametersOnIntentUpdater.a = this.a.rN();
        bvju A = this.a.a.A();
        dxjg.e(A);
        clientParametersOnIntentUpdater.b = A;
        dxjg.e(this.a.a.aL());
    }
}

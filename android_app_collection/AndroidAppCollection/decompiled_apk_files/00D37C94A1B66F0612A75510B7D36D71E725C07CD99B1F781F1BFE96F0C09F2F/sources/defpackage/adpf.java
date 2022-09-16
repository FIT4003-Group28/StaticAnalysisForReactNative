package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adpf  reason: default package */
/* loaded from: classes.dex */
public final class adpf extends BroadcastReceiver {
    final /* synthetic */ adpl a;

    public adpf(adpl adplVar) {
        this.a = adplVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        adhx b = adhx.b(intent.getAction());
        adil adilVar = adil.ADD_VIDEO;
        int ordinal = b.ordinal();
        if (ordinal == 7) {
            this.a.aC(adne.NETWORK, atcv.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE, 0);
        } else if (ordinal != 11) {
        } else {
            if (!this.a.l.p()) {
                this.a.aC(adne.NETWORK, atcv.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE, 0);
                return;
            }
            adpl adplVar = this.a;
            if (!adplVar.s.g(adplVar.am.i)) {
                this.a.aC(adne.NETWORK, atcv.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED, 0);
            } else {
                this.a.aC(adne.LOUNGE_SERVER_CONNECTION_ERROR, atcv.MDX_SESSION_DISCONNECT_REASON_NETWORK, 2);
            }
        }
    }
}

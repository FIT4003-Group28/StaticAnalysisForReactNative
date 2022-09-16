package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahvy  reason: default package */
/* loaded from: classes2.dex */
final class ahvy extends BroadcastReceiver {
    final /* synthetic */ ahwc a;

    public ahvy(ahwc ahwcVar) {
        this.a = ahwcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (ahwc.c.equals(intent.getAction())) {
            if (intent.hasExtra(ahwc.d)) {
                int intExtra = intent.getIntExtra(ahwc.d, 0);
                Map<Integer, ahwa> map = this.a.g;
                Integer valueOf = Integer.valueOf(intExtra);
                if (!map.containsKey(valueOf)) {
                    return;
                }
                ahwa remove = this.a.g.remove(valueOf);
                dbsk.s(remove);
                this.a.d();
                int resultCode = getResultCode();
                boolean hasExtra = intent.hasExtra("has_signed_tos");
                if (resultCode != 0 || !hasExtra) {
                    remove.b().a(0);
                    return;
                } else if (intent.getBooleanExtra("has_signed_tos", false)) {
                    this.a.e.T(bvjk.gu, remove.a(), true);
                    this.a.e.aa(bvjk.gv, remove.a(), this.a.f.b());
                    remove.b().a(2);
                    return;
                } else {
                    remove.b().a(1);
                    return;
                }
            }
            bvoo.h("Intent missing required extras.", new Object[0]);
        }
    }
}

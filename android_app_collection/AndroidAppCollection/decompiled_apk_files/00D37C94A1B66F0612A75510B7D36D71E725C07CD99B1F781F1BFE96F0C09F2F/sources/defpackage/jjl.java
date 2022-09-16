package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: jjl  reason: default package */
/* loaded from: classes3.dex */
final class jjl extends BroadcastReceiver {
    final /* synthetic */ azqb a;
    final /* synthetic */ jjn b;

    public jjl(jjn jjnVar, azqb azqbVar) {
        this.b = jjnVar;
        this.a = azqbVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.b.c != null) {
            String stringExtra = intent.getStringExtra("video_id");
            String stringExtra2 = intent.getStringExtra("playlist_id");
            if (stringExtra == null) {
                if (stringExtra2 == null) {
                    return;
                }
                if (intent.getBooleanExtra("is_sync", false)) {
                    this.b.c.a.i().u(stringExtra2);
                    return;
                } else {
                    this.b.c.a.i().w(stringExtra2);
                    return;
                }
            }
            try {
                aopa createBuilder = atrf.a.createBuilder();
                createBuilder.copyOnWrite();
                atrf atrfVar = (atrf) createBuilder.instance;
                atrfVar.c = 2;
                atrfVar.b |= 1;
                String h = emn.h(stringExtra);
                createBuilder.copyOnWrite();
                atrf atrfVar2 = (atrf) createBuilder.instance;
                h.getClass();
                atrfVar2.b = 2 | atrfVar2.b;
                atrfVar2.d = h;
                ((agsd) this.a.get()).d((atrf) createBuilder.mo39build());
            } catch (agse unused) {
                zep.b("Couldn't remove download via notification");
            }
        }
    }
}

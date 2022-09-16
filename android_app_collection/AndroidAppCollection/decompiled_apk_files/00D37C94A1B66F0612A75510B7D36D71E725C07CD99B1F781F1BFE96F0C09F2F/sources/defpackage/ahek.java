package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: ahek  reason: default package */
/* loaded from: classes.dex */
public final class ahek extends BroadcastReceiver {
    public boolean a;
    public final /* synthetic */ ahen b;

    public ahek(ahen ahenVar) {
        this.b = ahenVar;
    }

    public final void a() {
        if (!this.a) {
            this.b.a.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.a = true;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ahen ahenVar = this.b;
        if (ahenVar.i.a && ahenVar.h != null && !ahenVar.b.m) {
            aijb.a(aija.AUDIOMANAGER, "AudioFocus Noisy", new Object[0]);
            this.b.f.c(new ahgf());
            this.b.h.a();
            ahel ahelVar = this.b.e;
            int i = ahel.e;
            ahelVar.a = false;
            ahelVar.b = false;
        }
    }
}

package com.google.android.libraries.youtube.player.ui.mediasession;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class MediaButtonIntentReceiverProvider$DefaultMediaButtonIntentReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ip ipVar;
        KeyEvent keyEvent;
        iz izVar = ((ajaf) zew.F(context, ajaf.class)).fr().b;
        if (izVar == null || (ipVar = izVar.c) == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) {
            return;
        }
        ((in) ipVar.a).a.dispatchMediaButtonEvent(keyEvent);
    }
}

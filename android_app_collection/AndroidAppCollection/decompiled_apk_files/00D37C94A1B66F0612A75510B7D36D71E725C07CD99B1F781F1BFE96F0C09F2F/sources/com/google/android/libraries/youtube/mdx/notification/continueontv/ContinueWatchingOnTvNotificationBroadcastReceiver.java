package com.google.android.libraries.youtube.mdx.notification.continueontv;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ContinueWatchingOnTvNotificationBroadcastReceiver extends adjy {
    private static final String d = zep.a("MDX.ContinueWatchingBroadcastReceiver");
    public adjm a;
    public adjj b;
    public adji c;

    @Override // defpackage.adjy, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        c(context);
        InteractionLoggingScreen interactionLoggingScreen = (InteractionLoggingScreen) intent.getParcelableExtra("INTERACTION_SCREEN");
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1644207426) {
            if (action.equals("com.google.android.libraries.youtube.mdx.notification.action.NO_THANKS")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 531238881) {
            if (hashCode == 798292259 && action.equals("android.intent.action.BOOT_COMPLETED")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.libraries.youtube.mdx.notification.action.DISMISS")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            ylx.m(((vne) this.a.a.get()).b(adch.i, anjk.a), acsn.s);
            this.b.e();
            adji adjiVar = this.c;
            if (interactionLoggingScreen == null && ((acsx) adjiVar.b).i == null) {
                zep.m(adji.a, "Interaction logging screen is not set");
            }
            adjiVar.b.B(interactionLoggingScreen);
            adjiVar.b.H(3, new acte(acuo.b(41740)), null);
        } else if (c != 1) {
            if (c == 2) {
                ylx.m(this.a.c(), acsn.t);
                return;
            }
            String str = d;
            String valueOf = String.valueOf(action);
            zep.m(str, valueOf.length() != 0 ? "Invalid action:".concat(valueOf) : new String("Invalid action:"));
        } else {
            adji adjiVar2 = this.c;
            if (interactionLoggingScreen == null && ((acsx) adjiVar2.b).i == null) {
                zep.m(adji.a, "Interaction logging screen is not set");
            }
            adjiVar2.b.B(interactionLoggingScreen);
            adjiVar2.b.H(3, new acte(acuo.b(41739)), null);
        }
    }
}

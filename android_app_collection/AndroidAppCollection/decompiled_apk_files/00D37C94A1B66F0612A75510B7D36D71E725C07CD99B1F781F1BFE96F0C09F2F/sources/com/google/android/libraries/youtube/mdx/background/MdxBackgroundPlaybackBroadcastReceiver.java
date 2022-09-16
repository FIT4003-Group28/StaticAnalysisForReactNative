package com.google.android.libraries.youtube.mdx.background;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxBackgroundPlaybackBroadcastReceiver extends acxe {
    private static final String c = zep.a("MDX.MdxBackgroundPlaybackBroadcastReceiver");
    public acxh a;
    public acti b;

    @Override // defpackage.acxe, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context);
        String stringExtra = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.route_id");
        String stringExtra2 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.device_name");
        String stringExtra3 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.playlist_id");
        String stringExtra4 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.video_id");
        int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.session_type", -1);
        if (amps.e(stringExtra) || amps.e(stringExtra2) || ((amps.e(stringExtra3) && amps.e(stringExtra4)) || intExtra == -1)) {
            zep.m(c, "playback request not valid, ignoring");
            return;
        }
        int intExtra2 = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.timeout", -1);
        acxj a = acxk.a();
        a.c(stringExtra);
        a.e(almu.V(intExtra));
        a.b(stringExtra2);
        adnk c2 = adnl.c();
        c2.d(zgh.h(stringExtra3));
        c2.f(zgh.h(stringExtra4));
        c2.b(intent.getLongExtra("com.google.android.libraries.youtube.mdx.background.video_position_ms", 0L));
        c2.e(intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.playlist_index", 0));
        a.a = c2.a();
        if (intExtra2 >= 0) {
            a.d(intExtra2);
        }
        zep.h(c, "starting background playback");
        this.a.e(a.a());
        InteractionLoggingScreen interactionLoggingScreen = (InteractionLoggingScreen) intent.getParcelableExtra("com.google.android.libraries.youtube.mdx.background.ve_screen");
        int intExtra3 = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.ve_type", 0);
        if (interactionLoggingScreen == null || intExtra3 == 0) {
            return;
        }
        this.b.B(interactionLoggingScreen);
        this.b.H(3, new acte(acuo.b(intExtra3)), null);
    }
}

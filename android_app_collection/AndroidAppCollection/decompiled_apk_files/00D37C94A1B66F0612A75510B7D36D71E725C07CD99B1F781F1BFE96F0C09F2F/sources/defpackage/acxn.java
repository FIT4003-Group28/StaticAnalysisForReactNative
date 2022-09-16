package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acxn  reason: default package */
/* loaded from: classes.dex */
public final class acxn implements acxo {
    public static final String a = zep.a("MDX.backgroudPlaybackPresenter");
    public acxk b;
    public final acxl c;
    public acwx d;
    private final fq e;
    private final Context f;
    private final int g;
    private boolean h;
    private final BroadcastReceiver i = new acxm(this);

    public acxn(fq fqVar, Context context, int i, acxl acxlVar) {
        this.e = fqVar;
        this.f = context;
        this.g = i;
        this.c = acxlVar;
    }

    private static Intent g(String str, InteractionLoggingScreen interactionLoggingScreen) {
        Intent intent = new Intent(str);
        if (interactionLoggingScreen != null) {
            intent.putExtra("INTERACTION_SCREEN", interactionLoggingScreen);
        }
        return intent;
    }

    private final fi h(boolean z, InteractionLoggingScreen interactionLoggingScreen) {
        fi fiVar = new fi(this.f);
        fiVar.r(this.g);
        fiVar.z = zhn.j(this.f, R.attr.ytStaticBrandRed).orElse(ake.d(this.f, R.color.yt_youtube_red));
        fiVar.q(0, 0, z);
        fiVar.w = true;
        fiVar.g(true);
        fiVar.k = 0;
        fiVar.m(PendingIntent.getBroadcast(this.f, 0, g("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED", interactionLoggingScreen), zgd.M() | 134217728));
        yhr.g(fiVar);
        return fiVar;
    }

    private final void i() {
        if (this.h) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY");
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP");
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL");
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED");
        this.f.registerReceiver(this.i, intentFilter);
        this.h = true;
    }

    @Override // defpackage.acxo
    public final void a() {
        this.d = null;
        this.e.c(6);
        e();
    }

    @Override // defpackage.acxo
    public final void b(acxk acxkVar) {
        i();
        this.b = acxkVar;
        acxl acxlVar = this.c;
        acxlVar.g.d(acxl.b, null, null);
        acxlVar.g.n(new acte(acxl.e));
        acxlVar.g.n(new acte(acxl.f));
        InteractionLoggingScreen interactionLoggingScreen = ((acsx) acxlVar.g).i;
        fi h = h(false, interactionLoggingScreen);
        h.k(this.f.getResources().getString(R.string.mdx_background_playback_error_title, acxkVar.b));
        h.j(this.f.getResources().getString(R.string.mdx_background_playback_error_text));
        h.g = PendingIntent.getBroadcast(this.f, 0, g("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY", interactionLoggingScreen), zgd.M() | 134217728);
        h.f(new fe(0, this.f.getResources().getString(R.string.mdx_background_playback_error_help), PendingIntent.getBroadcast(this.f, 0, g("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP", interactionLoggingScreen), 134217728 | zgd.M())).a());
        this.e.e(6, h.b());
    }

    @Override // defpackage.acxo
    public final void c(acxk acxkVar) {
        i();
        this.b = null;
        acxl acxlVar = this.c;
        acxlVar.g.d(acxl.b, null, null);
        acxlVar.g.n(new acte(acxl.c));
        acxlVar.g.n(new acte(acxl.d));
        InteractionLoggingScreen interactionLoggingScreen = ((acsx) acxlVar.g).i;
        fi h = h(true, interactionLoggingScreen);
        h.k(this.f.getString(R.string.mdx_background_playback_connecting, acxkVar.b));
        h.k = 1;
        h.f(new fe(0, this.f.getResources().getString(R.string.mdx_background_playback_cancel), PendingIntent.getBroadcast(this.f, 0, g("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL", interactionLoggingScreen), zgd.M() | 134217728)).a());
        this.e.e(6, h.b());
    }

    @Override // defpackage.acxo
    public final void d() {
        i();
        this.b = null;
        this.e.e(6, h(false, null).b());
    }

    public final void e() {
        if (this.h) {
            this.f.unregisterReceiver(this.i);
            this.h = false;
        }
    }

    @Override // defpackage.acxo
    public final void f(acwx acwxVar) {
        acwxVar.getClass();
        this.d = acwxVar;
    }
}

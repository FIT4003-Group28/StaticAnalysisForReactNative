package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adjk  reason: default package */
/* loaded from: classes.dex */
final class adjk implements yiw {
    final /* synthetic */ Resources a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ acxk d;
    final /* synthetic */ adjl e;
    final /* synthetic */ adjt f;

    public adjk(adjl adjlVar, Resources resources, String str, String str2, acxk acxkVar, adjt adjtVar) {
        this.e = adjlVar;
        this.a = resources;
        this.b = str;
        this.c = str2;
        this.d = acxkVar;
        this.f = adjtVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String str = adjx.a;
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("Error downloading ");
        sb.append(valueOf);
        zep.f(str, sb.toString(), exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        adji adjiVar = this.e.e;
        adjiVar.b.d(acuo.a(38696), null, null);
        adjiVar.b.n(new acte(acuo.b(41738)));
        adjiVar.b.n(new acte(acuo.b(41740)));
        adjiVar.b.n(new acte(acuo.b(41739)));
        InteractionLoggingScreen interactionLoggingScreen = ((acsx) adjiVar.b).i;
        String string = this.a.getString(R.string.continue_watching_on_tv_title, this.b);
        String string2 = this.a.getString(R.string.continue_watching_on_tv_text, this.c);
        Bitmap decodeResource = BitmapFactory.decodeResource(this.a, 2131231951);
        fi fiVar = new fi(this.e.a);
        fiVar.A = 1;
        fiVar.z = zhn.j(this.e.a, R.attr.ytStaticBrandRed).orElse(ake.d(this.e.a, R.color.yt_youtube_red));
        fiVar.r(this.e.b);
        fiVar.k(string);
        fiVar.j(string2);
        fiVar.g(true);
        fiVar.n(decodeResource);
        Context context = this.e.a;
        acxk acxkVar = this.d;
        Intent className = new Intent().setClassName(context, "com.google.android.libraries.youtube.mdx.background.MdxBackgroundPlaybackBroadcastReceiver");
        className.putExtra("com.google.android.libraries.youtube.mdx.background.route_id", acxkVar.a);
        className.putExtra("com.google.android.libraries.youtube.mdx.background.device_name", acxkVar.b);
        className.putExtra("com.google.android.libraries.youtube.mdx.background.playlist_id", acxkVar.d.e);
        className.putExtra("com.google.android.libraries.youtube.mdx.background.video_id", acxkVar.d.b);
        className.putExtra("com.google.android.libraries.youtube.mdx.background.video_position_ms", acxkVar.d.c);
        className.putExtra("com.google.android.libraries.youtube.mdx.background.playlist_index", acxkVar.d.f);
        int i = acxkVar.e;
        int i2 = i - 1;
        if (i != 0) {
            className.putExtra("com.google.android.libraries.youtube.mdx.background.session_type", i2);
            className.putExtra("com.google.android.libraries.youtube.mdx.background.timeout", acxkVar.c);
            if (interactionLoggingScreen != null) {
                className.putExtra("com.google.android.libraries.youtube.mdx.background.ve_screen", interactionLoggingScreen);
                className.putExtra("com.google.android.libraries.youtube.mdx.background.ve_type", 41738);
            }
            className.putExtra("INTERACTION_SCREEN", interactionLoggingScreen);
            fiVar.g = PendingIntent.getBroadcast(context, 3, className, zgd.M() | 134217728);
            Context context2 = this.e.a;
            Intent className2 = new Intent().setClassName(context2, "com.google.android.libraries.youtube.mdx.notification.continueontv.ContinueWatchingOnTvNotificationBroadcastReceiver");
            className2.setAction("com.google.android.libraries.youtube.mdx.notification.action.DISMISS");
            className2.putExtra("INTERACTION_SCREEN", interactionLoggingScreen);
            fiVar.m(PendingIntent.getBroadcast(context2, 2, className2, zgd.M() | 134217728));
            String string3 = this.a.getString(R.string.turn_off_notification);
            Context context3 = this.e.a;
            Intent className3 = new Intent().setClassName(context3, "com.google.android.libraries.youtube.mdx.notification.continueontv.ContinueWatchingOnTvNotificationBroadcastReceiver");
            className3.setAction("com.google.android.libraries.youtube.mdx.notification.action.NO_THANKS");
            className3.putExtra("INTERACTION_SCREEN", interactionLoggingScreen);
            fiVar.f(new fe(0, string3, PendingIntent.getBroadcast(context3, 1, className3, zgd.M() | 134217728)).a());
            fg fgVar = new fg();
            fgVar.d(string);
            fgVar.e(string2);
            fgVar.c(decodeResource);
            fgVar.a = bitmap;
            fiVar.s(fgVar);
            yhr.g(fiVar);
            this.e.d.f("continue-watching", 6, fiVar.b());
            final adjt adjtVar = this.f;
            acxk acxkVar2 = this.d;
            adjx adjxVar = adjtVar.a;
            ylx.k(((vne) adjxVar.d.a.get()).b(new wdy(adjxVar.e.c(), acxkVar2.a, 2), anjk.a), anjk.a, adkd.b, new ylw() { // from class: adjs
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj3) {
                    Void r2 = (Void) obj3;
                    adjt.this.a.rl();
                }
            });
            return;
        }
        throw null;
    }
}

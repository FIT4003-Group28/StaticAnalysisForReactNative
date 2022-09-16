package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: fdl  reason: default package */
/* loaded from: classes3.dex */
public final class fdl {
    private static final amvn b = amvn.w("cross_device_offline_device_name", "cross_device_offline_device_state", "offline_has_shown_1080p_option", "offline_has_shown_1080p_tooltip", "offline_has_shown_download_expiration_disclaimer", "offline_stream_snackbar_impressions", "offline_stream_snackbar_last_shown", "offline_recs_enabled", "offline_quality_preference_updated_timestamp_millis", "last_downloads_page_usage_seconds");
    public static final amvn a = amvn.u(fcw.OFFLINE_FIRST_ADD_TOOLTIP, fcw.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, fcw.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED, fcw.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS);

    public static yve a(Context context, azqb azqbVar) {
        vjf a2 = vjg.a(context);
        a2.e("offlinestartup");
        a2.f("offlinestartup.pb");
        Uri a3 = a2.a();
        vli a4 = vlj.a();
        a4.e(fdb.a);
        a4.f(a3);
        return new yvc(vmu.b(((vlk) azqbVar.get()).a(a4.a())), fdb.a);
    }

    public static String b(String str, String str2) {
        return (String) arey.s(amqf.c(str).h(str2));
    }

    public static yvc c(Context context, ankw ankwVar, String str, vlk vlkVar, azqb azqbVar, aacz aaczVar) {
        vjf a2 = vjg.a(context);
        a2.e("offline");
        a2.f("offlinemain.pb");
        Uri a3 = a2.a();
        vli a4 = vlj.a();
        a4.e(fda.a);
        a4.f(a3);
        if (d(aaczVar)) {
            vlo d = vlr.d(context, ankwVar);
            d.c = str;
            amvn amvnVar = b;
            d.d((String[]) amvnVar.toArray(new String[amvnVar.size()]));
            d.e(fdg.a);
            a4.b(d.a());
            yvh d2 = yvi.d(azqbVar, ankwVar);
            d2.a = ejw.m;
            d2.b(fcq.i);
            d2.b = fcq.h;
            d2.c = fdj.d;
            a4.b(d2.a());
        }
        return new yvc(vmu.b(vlkVar.a(a4.a())), fda.a);
    }

    public static boolean d(aacz aaczVar) {
        athd athdVar = aaczVar.b().o;
        if (athdVar == null) {
            athdVar = athd.a;
        }
        aujq aujqVar = athdVar.g;
        if (aujqVar == null) {
            aujqVar = aujq.a;
        }
        return aujqVar.h;
    }

    public static String e(int i) {
        if (i == 1) {
            return fcw.OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS;
        }
        Object[] objArr = new Object[1];
        int i2 = i - 1;
        if (i != 0) {
            objArr[0] = Integer.valueOf(i2);
            return zhn.p(fcw.OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS_FORMAT, objArr);
        }
        throw null;
    }

    public static void f(aopa aopaVar, yuy yuyVar, yuy yuyVar2, yuy yuyVar3, ampt amptVar) {
        amum amumVar = new amum();
        amumVar.f("cross_device_offline_device_name", new fdf(amptVar, yuyVar2, 3));
        amumVar.f("cross_device_offline_device_state", new fdf(amptVar, yuyVar, 4));
        amumVar.f("offline_has_shown_1080p_option", new fdf(amptVar, yuyVar, 5));
        amumVar.f("offline_has_shown_1080p_tooltip", new fdf(amptVar, yuyVar, 6));
        amumVar.f("offline_has_shown_download_expiration_disclaimer", new fdf(amptVar, yuyVar, 7));
        amumVar.f("offline_stream_snackbar_impressions", new fdf(amptVar, yuyVar3, 8));
        amumVar.f("offline_stream_snackbar_last_shown", new fdf(amptVar, yuyVar3, 9));
        amumVar.f("offline_recs_enabled", new fdf(amptVar, yuyVar, 10));
        amumVar.f("offline_quality_preference_updated_timestamp_millis", new fdf(amptVar, yuyVar3, 11));
        amumVar.f("last_downloads_page_usage_seconds", new fdf(amptVar, yuyVar3, 12));
        ymf.g(b, aopaVar, amumVar.b());
    }

    public static void g(aopa aopaVar, yuy yuyVar, yuy yuyVar2, ampt amptVar) {
        amum amumVar = new amum();
        amumVar.f(fcw.OFFLINE_FIRST_ADD_TOOLTIP, new fde(yuyVar, 1));
        amumVar.f(fcw.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, new fde(yuyVar));
        amumVar.f(fcw.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED, new fdf(amptVar, yuyVar));
        amumVar.f(fcw.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS, new fdf(amptVar, yuyVar2, 2));
        ymf.g(a, aopaVar, amumVar.b());
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.HideEnclosingActionOuterClass$HideEnclosingAction;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: nni  reason: default package */
/* loaded from: classes3.dex */
public final class nni {
    private static long A(atse atseVar, long j, snc sncVar) {
        atqu atquVar = atseVar.l;
        if (atquVar == null) {
            atquVar = atqu.a;
        }
        long j2 = atquVar.c;
        if (j2 >= 0) {
            return Math.max((j + j2) - TimeUnit.MILLISECONDS.toSeconds(sncVar.c()), 0L);
        }
        return 0L;
    }

    private static jjh B(ajrs ajrsVar) {
        if (!(ajrsVar.c("sectionListController") instanceof jjh)) {
            return null;
        }
        return (jjh) ajrsVar.c("sectionListController");
    }

    public static aynx a(aynx aynxVar, aynx aynxVar2, aynx aynxVar3) {
        aynx n = aynx.e(aynxVar, aynxVar2, lum.d).n();
        return aynxVar3 == null ? n : aynxVar3.O(new kaf(n, 2));
    }

    public static void b(yye yyeVar, float f) {
        double d = f;
        if (d <= 0.0010000000474974513d) {
            yyeVar.a(false, false);
            return;
        }
        yyeVar.a(true, false);
        yyeVar.b.setAlpha((float) Math.min(1.0d, d));
    }

    public static nmc c(nml nmlVar, apzg apzgVar, nlz nlzVar, boolean z) {
        return nmlVar.f(apzgVar, nlzVar, z, false);
    }

    public static void d(nml nmlVar, aqvq aqvqVar, asjj asjjVar, boolean z) {
        nmlVar.s(aqvqVar, asjjVar, z, null, false);
    }

    public static CharSequence e(Activity activity, int i) {
        Annotation[] annotationArr;
        SpannableString spannableString = new SpannableString(activity.getText(i));
        for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
            if (annotation.getKey().equals("font") && annotation.getValue().equals("deeplink_emphasis")) {
                spannableString.setSpan(new TextAppearanceSpan(activity, R.style.deeplink_style), spannableString.getSpanStart(annotation), spannableString.getSpanEnd(annotation), 33);
            }
        }
        return spannableString;
    }

    public static float f(long j, long j2) {
        if (j == 0 || j2 == 0 || j2 > j || z(j, j2, y(j, j2))) {
            return 0.0f;
        }
        return (float) j2;
    }

    public static int g(long j, long j2) {
        int i = 0;
        if (j != 0 && j2 != 0) {
            if (j2 > j) {
                return 0;
            }
            i = y(j, j2);
            if (i < 10) {
                return 10;
            }
            if (z(j, j2, i)) {
                return 100;
            }
        }
        return i;
    }

    public static long h(ampq ampqVar, snc sncVar, aajl aajlVar) {
        awjr awjrVar;
        atss b;
        long j = 2147483647L;
        if (!ampqVar.h()) {
            return 2147483647L;
        }
        for (awkb awkbVar : ((awka) ampqVar.c()).getDownloads()) {
            if (awkbVar.b == 1 && (awjrVar = (awjr) aajlVar.f((String) awkbVar.c).g(awjr.class).W()) != null && (b = awjrVar.b()) != null) {
                atse l = l(b);
                long A = l != null ? A(l, b.getLastUpdatedTimestampSeconds().longValue(), sncVar) : 0L;
                atse l2 = l(b);
                if (l2 != null) {
                    atqu atquVar = l2.l;
                    if (atquVar == null) {
                        atquVar = atqu.a;
                    }
                    int as = akel.as(atquVar.d);
                    if (as != 0 && as == 2 && A != 0) {
                        j = Math.min(j, A);
                    }
                }
            }
        }
        return j;
    }

    public static long i(agqu agquVar, snc sncVar) {
        if (agquVar != null) {
            return A(agquVar.b, TimeUnit.MILLISECONDS.toSeconds(agquVar.d), sncVar);
        }
        return 0L;
    }

    public static apzg j(agqv agqvVar, boolean z, float f, int i, String str) {
        if (z) {
            return aikb.f(agqvVar.m(), null, 0, 0.0f);
        }
        return aijk.g(agqvVar.m(), str, i, f);
    }

    public static atfa k(Resources resources, arag aragVar) {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(HideEnclosingActionOuterClass$HideEnclosingAction.hideEnclosingAction, HideEnclosingActionOuterClass$HideEnclosingAction.a);
        apzg apzgVar = (apzg) aopcVar.mo39build();
        CharSequence text = resources.getText(R.string.dismiss);
        aopa createBuilder = apok.a.createBuilder();
        aopc aopcVar2 = (aopc) apoj.a.createBuilder();
        aopa createBuilder2 = avgj.a.createBuilder();
        avgg avggVar = avgg.THEME_ATTRIBUTE_TEXT1;
        createBuilder2.copyOnWrite();
        avgj avgjVar = (avgj) createBuilder2.instance;
        avgjVar.d = avggVar.ai;
        avgjVar.b |= 2;
        aopcVar2.copyOnWrite();
        apoj apojVar = (apoj) aopcVar2.instance;
        avgj avgjVar2 = (avgj) createBuilder2.mo39build();
        avgjVar2.getClass();
        apojVar.d = avgjVar2;
        apojVar.c = 20;
        aopc aopcVar3 = (aopc) arhs.a.createBuilder();
        arhr arhrVar = arhr.CLOSE;
        aopcVar3.copyOnWrite();
        arhs arhsVar = (arhs) aopcVar3.instance;
        arhsVar.c = arhrVar.pS;
        arhsVar.b |= 1;
        aopcVar2.copyOnWrite();
        apoj apojVar2 = (apoj) aopcVar2.instance;
        arhs arhsVar2 = (arhs) aopcVar3.mo39build();
        arhsVar2.getClass();
        apojVar2.g = arhsVar2;
        apojVar2.b |= 32;
        aopcVar2.copyOnWrite();
        apoj apojVar3 = (apoj) aopcVar2.instance;
        apzgVar.getClass();
        apojVar3.p = apzgVar;
        apojVar3.b |= 32768;
        aopa createBuilder3 = aovs.a.createBuilder();
        aopa createBuilder4 = aovr.a.createBuilder();
        String charSequence = text.toString();
        createBuilder4.copyOnWrite();
        aovr aovrVar = (aovr) createBuilder4.instance;
        charSequence.getClass();
        aovrVar.b |= 2;
        aovrVar.c = charSequence;
        createBuilder3.copyOnWrite();
        aovs aovsVar = (aovs) createBuilder3.instance;
        aovr aovrVar2 = (aovr) createBuilder4.mo39build();
        aovrVar2.getClass();
        aovsVar.c = aovrVar2;
        aovsVar.b |= 1;
        aopcVar2.copyOnWrite();
        apoj apojVar4 = (apoj) aopcVar2.instance;
        aovs aovsVar2 = (aovs) createBuilder3.mo39build();
        aovsVar2.getClass();
        apojVar4.s = aovsVar2;
        apojVar4.b |= 131072;
        createBuilder.copyOnWrite();
        apok apokVar = (apok) createBuilder.instance;
        apoj apojVar5 = (apoj) aopcVar2.mo39build();
        apojVar5.getClass();
        apokVar.c = apojVar5;
        apokVar.b |= 1;
        apok apokVar2 = (apok) createBuilder.mo39build();
        aopa createBuilder5 = atfa.a.createBuilder();
        createBuilder5.copyOnWrite();
        atfa atfaVar = (atfa) createBuilder5.instance;
        atfaVar.e = aragVar;
        atfaVar.b |= 1;
        aopa createBuilder6 = atfb.a.createBuilder();
        createBuilder6.copyOnWrite();
        atfb atfbVar = (atfb) createBuilder6.instance;
        atfbVar.c = 4;
        atfbVar.b |= 1;
        createBuilder5.copyOnWrite();
        atfa atfaVar2 = (atfa) createBuilder5.instance;
        atfb atfbVar2 = (atfb) createBuilder6.mo39build();
        atfbVar2.getClass();
        atfaVar2.g = atfbVar2;
        atfaVar2.b |= 16;
        createBuilder5.copyOnWrite();
        atfa atfaVar3 = (atfa) createBuilder5.instance;
        apokVar2.getClass();
        atfaVar3.h = apokVar2;
        atfaVar3.b |= 32;
        return (atfa) createBuilder5.mo39build();
    }

    public static atse l(atss atssVar) {
        try {
            return (atse) aopi.parseFrom(atse.a, atssVar.getOfflineStateBytes(), aoos.b());
        } catch (aopx e) {
            zep.d("Failed to get Offline State.", e);
            return null;
        }
    }

    public static String n(Resources resources, snc sncVar, long j) {
        long c = sncVar.c() - j;
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(c);
        if (minutes < 60) {
            return minutes <= 0 ? resources.getString(R.string.last_update_recently) : resources.getQuantityString(R.plurals.last_update_in_minutes_message, minutes, Integer.valueOf(minutes));
        }
        int hours = (int) TimeUnit.MILLISECONDS.toHours(c);
        if (hours < 24) {
            return resources.getQuantityString(R.plurals.last_update_in_hours_message, hours, Integer.valueOf(hours));
        }
        int days = (int) TimeUnit.MILLISECONDS.toDays(c);
        if (days < 7) {
            return resources.getQuantityString(R.plurals.last_update_in_days_message, days, Integer.valueOf(days));
        }
        int i = days / 7;
        return resources.getQuantityString(R.plurals.last_update_in_weeks_message, i, Integer.valueOf(i));
    }

    public static String p(Context context, long j, boolean z) {
        int t = ezv.t(j);
        if (t <= 60) {
            if (t == 0) {
                if (z) {
                    return context.getResources().getString(R.string.download_video_unplayable_requires_premium);
                }
                t = 0;
            }
            if (z) {
                return context.getResources().getQuantityString(R.plurals.download_video_unplayable_future_minutes_plural, t, Integer.valueOf(t));
            }
            return context.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_minutes_plural, t, Integer.valueOf(t));
        }
        int s = ezv.s(j);
        if (s <= 24) {
            if (z) {
                return context.getResources().getQuantityString(R.plurals.download_video_unplayable_future_hours_plural, s, Integer.valueOf(s));
            }
            return context.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_hours_plural, s, Integer.valueOf(s));
        }
        int r = ezv.r(j);
        if (z) {
            return context.getResources().getQuantityString(R.plurals.download_video_unplayable_future_days_plural, r, Integer.valueOf(r));
        }
        return context.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_days_plural, r, Integer.valueOf(r));
    }

    public static void q(TextView textView, List list, agwh agwhVar) {
        agqu agquVar;
        int i = -1;
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            while (true) {
                if (i2 < list.size()) {
                    agqv e = agwhVar.e(((agqo) list.get(i2)).f());
                    if (e != null && (agquVar = e.j) != null) {
                        i = (int) TimeUnit.SECONDS.toDays(agquVar.a());
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        if (i > 0) {
            textView.setText(textView.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, i, Integer.valueOf(i)));
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public static boolean r(ampq ampqVar, aajl aajlVar) {
        awjr awjrVar;
        atss b;
        atse l;
        int ap;
        if (!ampqVar.h()) {
            return false;
        }
        for (awkb awkbVar : ((awka) ampqVar.c()).getDownloads()) {
            if (awkbVar.b == 1 && (awjrVar = (awjr) aajlVar.f((String) awkbVar.c).g(awjr.class).W()) != null && (b = awjrVar.b()) != null && (l = l(b)) != null && (ap = akel.ap(l.j)) != 0 && ap == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(agqu agquVar) {
        if (agquVar != null) {
            atqu atquVar = agquVar.b.l;
            if (atquVar == null) {
                atquVar = atqu.a;
            }
            int as = akel.as(atquVar.d);
            return as != 0 && as == 2;
        }
        return false;
    }

    public static boolean t(fbx fbxVar, agqu agquVar) {
        return fbxVar.d() && s(agquVar);
    }

    public static void w(ajrs ajrsVar, aoqu aoquVar) {
        if (aoquVar == null) {
            return;
        }
        String k = ajrsVar.k("downloads_page_section_key");
        jjh B = B(ajrsVar);
        if (B == null || k == null) {
            return;
        }
        jji a = B.a();
        if (a.a(k, aoquVar) == null) {
            return;
        }
        awbs b = a.b(k, aoquVar);
        if (b == null) {
            zep.b(k.length() != 0 ? "Trying to show ungrafted proto for section: ".concat(k) : new String("Trying to show ungrafted proto for section: "));
        } else {
            a.b.H(3, acun.a(b), null);
        }
    }

    public static void x(ajrs ajrsVar, aoqu aoquVar) {
        jji a;
        acup a2;
        if (ajrsVar == null || aoquVar == null) {
            return;
        }
        String k = ajrsVar.k("downloads_page_section_key");
        jjh B = B(ajrsVar);
        if (B == null || k == null || (a2 = (a = B.a()).a(k, aoquVar)) == null) {
            return;
        }
        awbs b = a.b(k, aoquVar);
        if (b == null) {
            zep.b(k.length() != 0 ? "Trying to show ungrafted proto for section: ".concat(k) : new String("Trying to show ungrafted proto for section: "));
            return;
        }
        a.b.u(acun.a(b), null);
        awbs c = a.c(a2, aoquVar);
        if (c == null) {
            return;
        }
        a.b.u(acun.a(c), null);
    }

    private static int y(long j, long j2) {
        return (int) ((((float) j2) / ((float) j)) * 100.0f);
    }

    private static boolean z(long j, long j2, int i) {
        long j3 = j - j2;
        return j < 600 ? j3 < 60 && i >= 10 : j > 6000 ? j3 < 600 : i > 90;
    }

    public static String o(Context context, agqf agqfVar) {
        agqa agqaVar = agqfVar.c;
        boolean z = agqaVar != null && !agqaVar.e;
        int i = agqfVar.f;
        if (agqaVar != null && z && i > 0) {
            Resources resources = context.getResources();
            int i2 = agqfVar.f;
            return String.format("%s • %s", agqaVar.b, resources.getQuantityString(R.plurals.video_count, i2, Integer.valueOf(i2)));
        } else if (agqaVar != null && z) {
            return agqaVar.b;
        } else {
            if (i <= 0) {
                return "";
            }
            Resources resources2 = context.getResources();
            int i3 = agqfVar.f;
            return resources2.getQuantityString(R.plurals.video_count, i3, Integer.valueOf(i3));
        }
    }

    public static String m(Resources resources, int i, int i2) {
        if (i == i2 || i2 == 0) {
            return resources.getQuantityString(R.plurals.playlist_size_total, i, Integer.valueOf(i));
        }
        return resources.getString(R.string.playlist_size_total_and_downloaded, resources.getQuantityString(R.plurals.playlist_size_total, i, Integer.valueOf(i)), resources.getQuantityString(R.plurals.playlist_size_downloaded, i2, Integer.valueOf(i2)));
    }

    public static ampq u(agqv agqvVar, boolean z, snc sncVar, float f, int i, String str) {
        agqu agquVar = agqvVar.j;
        if (agquVar != null) {
            atse atseVar = agquVar.b;
            if (atseVar.c == 15) {
                return v((atqt) atseVar.d);
            }
        }
        if (agquVar != null && s(agquVar) && i(agquVar, sncVar) == 0) {
            atqu atquVar = agquVar.b.l;
            if (atquVar == null) {
                atquVar = atqu.a;
            }
            if ((atquVar.b & 4) != 0) {
                atqu atquVar2 = agquVar.b.l;
                if (atquVar2 == null) {
                    atquVar2 = atqu.a;
                }
                atqt atqtVar = atquVar2.e;
                if (atqtVar == null) {
                    atqtVar = atqt.a;
                }
                return v(atqtVar);
            }
        }
        return ampq.j(j(agqvVar, z, f, i, str));
    }

    public static ampq v(atqt atqtVar) {
        String str = "";
        if ((atqtVar.b & 4) == 0) {
            if (atqtVar.c != 2) {
                return amon.a;
            }
            aopa createBuilder = YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.a.createBuilder();
            if (atqtVar.c == 2) {
                str = (String) atqtVar.d;
            }
            createBuilder.copyOnWrite();
            YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint = (YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint) createBuilder.instance;
            str.getClass();
            ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.b = 1 | ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.b;
            ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.c = str;
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopcVar.e(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint, (YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint) createBuilder.mo39build());
            return ampq.j((apzg) aopcVar.mo39build());
        }
        aopa createBuilder2 = apnv.a.createBuilder();
        String str2 = atqtVar.e;
        createBuilder2.copyOnWrite();
        apnv apnvVar = (apnv) createBuilder2.instance;
        str2.getClass();
        apnvVar.b |= 1;
        apnvVar.c = str2;
        if (atqtVar.c == 1) {
            str = (String) atqtVar.d;
        }
        createBuilder2.copyOnWrite();
        apnv apnvVar2 = (apnv) createBuilder2.instance;
        str.getClass();
        apnvVar2.b |= 4;
        apnvVar2.d = str;
        aopc aopcVar2 = (aopc) apzg.a.createBuilder();
        aopcVar2.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) createBuilder2.mo39build());
        return ampq.j((apzg) aopcVar2.mo39build());
    }
}

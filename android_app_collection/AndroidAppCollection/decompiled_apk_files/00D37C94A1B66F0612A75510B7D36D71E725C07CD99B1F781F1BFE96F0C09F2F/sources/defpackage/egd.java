package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.provider.SearchRecentSuggestions;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.libraries.youtube.notification.NotificationInteractionBroadcastReceiver;
import com.google.android.libraries.youtube.notification.push.optoutdialog.NotificationOptOutDialogActivity;
import com.google.android.youtube.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: egd  reason: default package */
/* loaded from: classes3.dex */
public final class egd {
    public static final /* synthetic */ int a = 0;

    static {
        TimeUnit.MINUTES.toSeconds(90L);
    }

    public static boolean A(ywk ywkVar) {
        return (ywkVar.c(ywk.E) & 2097152) != 0;
    }

    public static kse B(aacz aaczVar, abbe abbeVar) {
        asxj asxjVar = aaczVar.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.F) {
            return new krv(abbeVar);
        }
        return new ksd(abbeVar);
    }

    public static kwn C(aadd aaddVar) {
        return new kwn(aaddVar);
    }

    public static ykx D(ylg ylgVar, Executor executor, aacz aaczVar) {
        apyy b = aaczVar.b();
        aveq aveqVar = b.u;
        if (aveqVar == null) {
            aveqVar = aveq.a;
        }
        if ((aveqVar.b & 1) == 0) {
            return new ykx(executor);
        }
        aveq aveqVar2 = b.u;
        if (aveqVar2 == null) {
            aveqVar2 = aveq.a;
        }
        apga apgaVar = aveqVar2.c;
        if (apgaVar == null) {
            apgaVar = apga.c;
        }
        aops aopsVar = new aops(apgaVar.g, apga.b);
        aveq aveqVar3 = b.u;
        if (aveqVar3 == null) {
            aveqVar3 = aveq.a;
        }
        apga apgaVar2 = aveqVar3.c;
        if (apgaVar2 == null) {
            apgaVar2 = apga.c;
        }
        return new ykx(ylgVar, executor, aopsVar, new aops(apgaVar2.f, apga.a));
    }

    public static ylg E(ScheduledExecutorService scheduledExecutorService, aacz aaczVar) {
        apyy b = aaczVar.b();
        apga apgaVar = null;
        if (b != null && (b.b & 67108864) != 0) {
            aveq aveqVar = b.u;
            if (aveqVar == null) {
                aveqVar = aveq.a;
            }
            apgaVar = aveqVar.c;
            if (apgaVar == null) {
                apgaVar = apga.c;
            }
        }
        return new ylg(scheduledExecutorService, apgaVar);
    }

    public static ajgr F(Context context, aacz aaczVar, ajgq ajgqVar, Executor executor) {
        return new ajgt(aaczVar.b(), context, ajgqVar, executor);
    }

    public static akgt G(Context context, aacz aaczVar, aadd aaddVar, SharedPreferences sharedPreferences) {
        if (eog.bc(aaczVar)) {
            return new lbg(context, sharedPreferences, aaczVar, aaddVar);
        }
        return new lbi(sharedPreferences, aaczVar);
    }

    public static aldn H(Context context, aacz aaczVar, alco alcoVar, akze akzeVar) {
        aldn aldnVar = new aldn();
        aldnVar.b(new aldf(context, alcoVar, akzeVar, 1));
        aldnVar.b(new aldf(context, alcoVar, akzeVar));
        aldnVar.b(new zxj(context, aaczVar, alcoVar, akzeVar));
        aldnVar.b(new aldu());
        return aldnVar;
    }

    public static Set I(aacz aaczVar, apfc apfcVar, azqb azqbVar, azqb azqbVar2, Executor executor) {
        aveq aveqVar = aaczVar.b().u;
        if (aveqVar == null) {
            aveqVar = aveq.a;
        }
        if (aveqVar.r != 0) {
            if (!apfcVar.b || apfcVar.z) {
                return amvn.r(new aaoq((aadj) azqbVar2.get(), new dzk(azqbVar, 4), executor));
            }
            return amyg.a;
        }
        return amyg.a;
    }

    public static boolean J(aacz aaczVar) {
        asxj asxjVar = aaczVar.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        return asxjVar.cd;
    }

    public static afuy K(yjs yjsVar) {
        return new afuy(yjsVar, "offline_library_browse_fetch");
    }

    public static afuy L(yjs yjsVar) {
        return new afuy(yjsVar, "offline_settings_fetch");
    }

    public static Set M(aadd aaddVar, axxn axxnVar, kug kugVar, isp ispVar, fzm fzmVar) {
        HashSet hashSet = new HashSet();
        asxp asxpVar = aaddVar.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if (asxpVar.M) {
            hashSet.add(kugVar);
        }
        asxp asxpVar2 = aaddVar.a().e;
        if (asxpVar2 == null) {
            asxpVar2 = asxp.a;
        }
        if (asxpVar2.aG) {
            hashSet.add(ispVar);
        }
        if (((Boolean) axxnVar.a.a.V(axxk.j).B().an(false).U()).booleanValue()) {
            hashSet.add(fzmVar);
        }
        return hashSet;
    }

    public static fnf N(aacz aaczVar, fnk fnkVar) {
        apgs ah = eog.ah(aaczVar);
        return (ah == null || !ah.b || !ah.c) ? new fne() : new fnc(fnkVar);
    }

    public static akib O(aadd aaddVar, SharedPreferences sharedPreferences, akhv akhvVar, Context context, afvn afvnVar, vzm vzmVar, ScheduledExecutorService scheduledExecutorService, snc sncVar, lbe lbeVar, akhf akhfVar, akhi akhiVar, akgp akgpVar, akhx akhxVar, akhn akhnVar, lbf lbfVar) {
        lbh lbhVar = new lbh(sharedPreferences, context, aaddVar);
        lbhVar.f();
        lbhVar.f = true;
        lbhVar.g = false;
        lbhVar.e = false;
        lbhVar.j = eog.L(aaddVar);
        return new akib(lbhVar, akhvVar, afvnVar, vzmVar, scheduledExecutorService, sncVar, lbeVar, akhfVar, akhiVar, akgpVar, akhxVar, akhnVar, lbfVar, null, null, null, null);
    }

    public static akib P(aadd aaddVar, SharedPreferences sharedPreferences, akhv akhvVar, Context context, afvn afvnVar, vzm vzmVar, ScheduledExecutorService scheduledExecutorService, snc sncVar, lbe lbeVar, akhf akhfVar, akhi akhiVar, akhx akhxVar, akhn akhnVar, lbf lbfVar) {
        lbh lbhVar = new lbh(sharedPreferences, context, aaddVar);
        lbhVar.f();
        lbhVar.f = false;
        lbhVar.g = true;
        lbhVar.e = true;
        lbhVar.j = eog.L(aaddVar);
        return new akib(lbhVar, akhvVar, afvnVar, vzmVar, scheduledExecutorService, sncVar, lbeVar, akhfVar, akhiVar, null, akhxVar, akhnVar, lbfVar, null, null, null, null);
    }

    public static akgv Q(azqb azqbVar) {
        return (akgv) azqbVar.get();
    }

    public static ggs R() {
        return new ggs();
    }

    public static alwb S(azqb azqbVar) {
        return (alwb) azqbVar.get();
    }

    public static PendingIntent a(Context context, Intent intent) {
        PendingIntent a2 = vfn.a(context, intent, vfn.a | 134217728);
        a2.getClass();
        return a2;
    }

    public static Intent b(Context context) {
        return etk.d(context);
    }

    public static PackageManager c(Context context) {
        return context.getPackageManager();
    }

    public static SearchRecentSuggestions d(Context context) {
        return new SearchRecentSuggestions(context, "com.google.android.youtube.SuggestionProvider", 1);
    }

    public static aaay e(isi isiVar) {
        aaax aaaxVar = new aaax();
        aaaxVar.a = abga.e();
        aaaxVar.b = abga.e();
        aaaxVar.c = arov.ANDROID;
        aaaxVar.d = isiVar;
        aaaxVar.e = true;
        return aaaxVar.a();
    }

    public static aaoq f(azqb azqbVar, Executor executor) {
        return new aaoq(new aadk(1), new dzk(azqbVar, 3), executor);
    }

    public static aawv g(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar, Context context) {
        return new aawv(aaqjVar, aaqfVar, afvnVar, yqwVar, aaoq.a, eog.b(context));
    }

    public static adwq h(azqb azqbVar) {
        return (adwq) azqbVar.get();
    }

    public static afsz i(abfh abfhVar) {
        afsn afsnVar;
        aade aadeVar = (aade) ylx.g(abfhVar.c(), 1L, TimeUnit.SECONDS, aade.a());
        afsy afsyVar = new afsy();
        if (aadeVar == aade.TEST || aadeVar == aade.UBERDEMO) {
            afsnVar = eso.b;
        } else {
            afsnVar = eso.a;
        }
        afsyVar.a = afsnVar;
        afsyVar.b = afss.ANDROID;
        return afsyVar.a();
    }

    public static agba j(Context context) {
        agaz agazVar = new agaz();
        agazVar.c(0);
        agazVar.b(0);
        agazVar.a(0);
        agazVar.a = new Intent(context, NotificationInteractionBroadcastReceiver.class);
        agazVar.b = etk.d(context);
        agazVar.c = new Intent(context, NotificationOptOutDialogActivity.class).addFlags(411041792);
        agazVar.c(2131232804);
        agazVar.b(R.mipmap.ic_launcher);
        agazVar.a(R.string.application_name);
        agazVar.g = "414843287017";
        Integer num = agazVar.d;
        if (num == null || agazVar.e == null || agazVar.f == null) {
            StringBuilder sb = new StringBuilder();
            if (agazVar.d == null) {
                sb.append(" smallIcon");
            }
            if (agazVar.e == null) {
                sb.append(" largeIcon");
            }
            if (agazVar.f == null) {
                sb.append(" appLabel");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new agba(agazVar.a, agazVar.b, agazVar.c, num.intValue(), agazVar.e.intValue(), agazVar.f.intValue(), agazVar.g);
    }

    public static aget k(ager agerVar, agbd agbdVar) {
        agcp agcpVar = (agcp) agerVar.a.get();
        agcpVar.getClass();
        abaj abajVar = (abaj) agerVar.b.get();
        abajVar.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) agerVar.c.get();
        scheduledExecutorService.getClass();
        zdz zdzVar = (zdz) agerVar.d.get();
        zdzVar.getClass();
        agbdVar.getClass();
        Context context = (Context) agerVar.e.get();
        context.getClass();
        aadd aaddVar = (aadd) agerVar.f.get();
        aaddVar.getClass();
        snc sncVar = (snc) agerVar.g.get();
        sncVar.getClass();
        yrj yrjVar = (yrj) agerVar.h.get();
        yrjVar.getClass();
        agex agexVar = (agex) agerVar.i.get();
        agexVar.getClass();
        return new ageq(agcpVar, abajVar, scheduledExecutorService, zdzVar, agbdVar, context, aaddVar, sncVar, yrjVar, agexVar, agerVar.j);
    }

    public static agkn l() {
        agkm agkmVar = new agkm();
        agkmVar.a = false;
        agkmVar.b(false);
        agkmVar.a(false);
        agkmVar.d = false;
        agkmVar.b(true);
        agkmVar.a(true);
        Boolean bool = agkmVar.a;
        if (bool == null || agkmVar.b == null || agkmVar.c == null || agkmVar.d == null) {
            StringBuilder sb = new StringBuilder();
            if (agkmVar.a == null) {
                sb.append(" channelAutoOfflineEnabled");
            }
            if (agkmVar.b == null) {
                sb.append(" videoListAutoOfflineEnabled");
            }
            if (agkmVar.c == null) {
                sb.append(" offlineCandidatesEnabled");
            }
            if (agkmVar.d == null) {
                sb.append(" offlineSubscriptionsSyncEnabled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new agkn(bool.booleanValue(), agkmVar.b.booleanValue(), agkmVar.c.booleanValue(), agkmVar.d.booleanValue());
    }

    public static ahfm n() {
        ahfl a2 = ahfm.a();
        a2.c(true);
        return a2.a();
    }

    public static ajmu o() {
        return ajmu.a;
    }

    public static ajmy p(apfc apfcVar, azqb azqbVar, azqb azqbVar2) {
        if (apfcVar.b) {
            return (ajmy) azqbVar.get();
        }
        return (ajmy) azqbVar2.get();
    }

    public static ajno q(Context context, apfc apfcVar) {
        return new ajno(context, apfcVar);
    }

    public static akhn r() {
        return new akhn();
    }

    public static akho s(snc sncVar) {
        return new akho(sncVar);
    }

    public static akhv t(yqw yqwVar, akid akidVar, snc sncVar) {
        return new akhv(yqwVar, akidVar, sncVar);
    }

    public static akhx u(azqb azqbVar) {
        return (akhx) azqbVar.get();
    }

    public static amup v() {
        return acqy.a;
    }

    public static FirebaseAnalytics w(Context context) {
        return FirebaseAnalytics.getInstance(context);
    }

    public static arot x() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    z = true;
                } else if (cameraInfo.facing == 1) {
                    z2 = true;
                }
            }
            return z ? z2 ? arot.CAMERA_FRONT_AND_BACK : arot.CAMERA_BACK : z2 ? arot.CAMERA_FRONT : arot.CAMERA_NONE;
        } catch (Exception e) {
            zep.d("Can't get camera type", e);
            return arot.CAMERA_UNKNOWN;
        }
    }

    public static azpx y() {
        return azpq.e().aO();
    }

    public static String z(Context context, SharedPreferences sharedPreferences, String str) {
        Set set = aadi.c;
        String string = sharedPreferences.getString(etk.COUNTRY, "");
        if (!TextUtils.isEmpty(string)) {
            string = zgh.l(string);
            if (set.contains(string)) {
                return string;
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            string = telephonyManager.getSimCountryIso();
            if (!TextUtils.isEmpty(string)) {
                string = zgh.l(string);
                if (set.contains(string)) {
                    return string;
                }
            }
        }
        if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(str)) {
            String l = zgh.l(str);
            if (set.contains(l)) {
                return l;
            }
        }
        String l2 = zgh.l(Locale.getDefault().getCountry());
        if (set.contains(l2)) {
            return l2;
        }
        return null;
    }

    public static agkr m() {
        agkq agkqVar = new agkq();
        agkqVar.a(false);
        agkqVar.b = false;
        agkqVar.c = 1;
        agkqVar.d = 35;
        agkqVar.e = 2000L;
        agkqVar.f = Long.valueOf(agxg.a);
        agkqVar.i = false;
        agkqVar.g = false;
        agkqVar.h = 0;
        agkqVar.a(true);
        Boolean bool = agkqVar.a;
        if (bool == null || agkqVar.b == null || agkqVar.c == null || agkqVar.d == null || agkqVar.e == null || agkqVar.f == null || agkqVar.g == null || agkqVar.h == null || agkqVar.i == null) {
            StringBuilder sb = new StringBuilder();
            if (agkqVar.a == null) {
                sb.append(" enablePlaylistAutoSync");
            }
            if (agkqVar.b == null) {
                sb.append(" enableYouTubeBundles");
            }
            if (agkqVar.c == null) {
                sb.append(" transferRetryStrategy");
            }
            if (agkqVar.d == null) {
                sb.append(" transferMaxRetries");
            }
            if (agkqVar.e == null) {
                sb.append(" transferBaseRetryMilliSecs");
            }
            if (agkqVar.f == null) {
                sb.append(" transferMaxRetryMilliSecs");
            }
            if (agkqVar.g == null) {
                sb.append(" disableOfflineWhenDatabaseOpenException");
            }
            if (agkqVar.h == null) {
                sb.append(" databaseOpenRetries");
            }
            if (agkqVar.i == null) {
                sb.append(" enableFallbackToAudioOnlyDownload");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new agkr(bool.booleanValue(), agkqVar.b.booleanValue(), agkqVar.c.intValue(), agkqVar.d.intValue(), agkqVar.e.longValue(), agkqVar.f.longValue(), agkqVar.g.booleanValue(), agkqVar.h.intValue(), agkqVar.i.booleanValue());
    }
}

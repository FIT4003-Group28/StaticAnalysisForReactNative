package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: PG */
/* renamed from: agel  reason: default package */
/* loaded from: classes.dex */
public final class agel {
    agel() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static atps a(aadd aaddVar) {
        if (aaddVar.a() != null) {
            atps atpsVar = aaddVar.a().p;
            return atpsVar == null ? atps.a : atpsVar;
        }
        return null;
    }

    public static void b(agcp agcpVar) {
        ylx.m(agcpVar.m(0L), afsc.h);
    }

    public static boolean e(Context context) {
        return fq.a(context).g();
    }

    public static int f(Context context, agbd agbdVar) {
        if (!agbdVar.d(context)) {
            return 3;
        }
        if (!agbdVar.e(context)) {
            return 5;
        }
        return !((Boolean) ylx.f(agbdVar.c(), true)).booleanValue() ? 4 : 2;
    }

    public static AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer g(apgq apgqVar) {
        if ((apgqVar.b & 4096) != 0) {
            aunb aunbVar = apgqVar.s;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.notificationSurveyCustomStyleRenderer)) {
                return null;
            }
            aunb aunbVar2 = apgqVar.s;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return (AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer) aunbVar2.qm(AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.notificationSurveyCustomStyleRenderer);
        }
        return null;
    }

    public static boolean h(apgq apgqVar) {
        arag aragVar;
        if (apgqVar == null) {
            return false;
        }
        int i = apgqVar.b;
        if ((i & 2) == 0 && (i & 4) == 0) {
            return false;
        }
        apgm apgmVar = apgqVar.e;
        if (apgmVar == null) {
            apgmVar = apgm.a;
        }
        if ((apgmVar.b & 16) != 0) {
            aragVar = apgmVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return !TextUtils.isEmpty(ajgl.b(aragVar));
    }

    public static boolean i(apgq apgqVar, ajxz ajxzVar) {
        arag aragVar;
        AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer g;
        if (apgqVar != null && (apgqVar.b & 1) != 0) {
            apgm apgmVar = apgqVar.e;
            if (apgmVar == null) {
                apgmVar = apgm.a;
            }
            arag aragVar2 = null;
            if ((apgmVar.b & 8) != 0) {
                aragVar = apgmVar.f;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            if (!TextUtils.isEmpty(ajgl.b(aragVar))) {
                if ((apgmVar.b & 16) != 0 && (aragVar2 = apgmVar.g) == null) {
                    aragVar2 = arag.a;
                }
                if (!TextUtils.isEmpty(ajgl.b(aragVar2)) && (g = g(apgqVar)) != null && g.b.size() != 0) {
                    for (aunb aunbVar : g.b) {
                        AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer = (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer) aunbVar.qm(AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.iconSurveyOptionRenderer);
                        if (androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer == null || (androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b & 1) == 0) {
                            return false;
                        }
                        arhs arhsVar = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.c;
                        if (arhsVar == null) {
                            arhsVar = arhs.a;
                        }
                        arhr b = arhr.b(arhsVar.c);
                        if (b == null) {
                            b = arhr.UNKNOWN;
                        }
                        if (ajxzVar.a(b) == 0) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static PendingIntent j(Context context, Intent intent) {
        return PendingIntent.getActivity(context, (int) (Math.random() * 2.147483647E9d), intent, zgd.M() | 1073741824);
    }

    public static PendingIntent k(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, (int) (Math.random() * 2.147483647E9d), intent, zgd.M() | 1073741824);
    }

    public static void l(Intent intent, String str, atps atpsVar) {
        if (atpsVar == null || !atpsVar.l || TextUtils.isEmpty(str)) {
            return;
        }
        intent.putExtra("push_notification_clientstreamz_logging", str);
    }

    public static float m(float f) {
        return Math.min(1.0f, (float) Math.pow(10.0d, (-f) / 20.0f));
    }

    public static float n(PlayerConfigModel playerConfigModel, float f) {
        return (playerConfigModel != null && playerConfigModel.ag()) ? o(f, playerConfigModel.c()) : f;
    }

    public static float o(float f, float f2) {
        return zgd.N(f * f2, 0.0f, 1.0f);
    }

    public static zgp p(Uri uri, String str, String str2, String str3, afst afstVar, awef awefVar) {
        zgp b = zgp.b(uri);
        b.h("event", "streamingstats");
        b.h("cpn", str);
        b.h("ns", "yt");
        if (!TextUtils.isEmpty(str2)) {
            b.h("cotn", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            b.h("docid", str3);
        }
        if (awefVar != null && (awefVar.b & 1) != 0) {
            b.e(awefVar.c);
        }
        afstVar.c(b);
        return b;
    }

    public static final aze q(String str, Set set, aeyu aeyuVar) {
        if (akzj.i("audio/mp4", str) || akzj.i("video/mp4", str) || akzj.i("text/mp4", str)) {
            return new bbw(new ArrayList(), new aeyv(set, aeyuVar));
        }
        if (akzj.i("video/x-vnd.on2.vp9", str) || akzj.i("audio/webm", str) || akzj.i("video/webm", str)) {
            return new aeym(new aeyw(set, aeyuVar));
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "ManifestlessExtractorFactory does not support MimeType ".concat(valueOf) : new String("ManifestlessExtractorFactory does not support MimeType "));
    }
}

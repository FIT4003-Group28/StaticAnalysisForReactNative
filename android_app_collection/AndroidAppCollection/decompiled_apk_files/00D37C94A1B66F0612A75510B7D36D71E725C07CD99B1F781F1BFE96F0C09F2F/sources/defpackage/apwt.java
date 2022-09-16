package defpackage;

import android.app.Activity;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: apwt  reason: default package */
/* loaded from: classes2.dex */
public class apwt {
    public static boolean a;

    public static int b(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int i(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static void j(String str, String str2, int i, int i2) {
        n(str, String.format("%s cannot be null.", str2));
        int length = str.length();
        l(length <= i2 && length >= i, String.format("Length of %s should be in the range [%s-%s]", str2, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static /* synthetic */ String k(int i) {
        switch (i) {
            case 1:
                return "NOT_STARTED";
            case 2:
                return "BIND_FAILED";
            case 3:
                return "BINDING";
            case 4:
                return "CONNECTED";
            case 5:
                return "DISCONNECTED";
            case 6:
                return "SERVICE_NOT_USABLE";
            default:
                return "REBIND_REQUIRED";
        }
    }

    public static void l(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void m(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException(str.concat(" must be called from the UI thread."));
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static String o(Activity activity) {
        return activity.getComponentName().toString();
    }

    public static autf p(autf autfVar, ResolveInfo resolveInfo) {
        apzg apzgVar = autfVar.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (!apzgVar.qn(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)) {
            return autfVar;
        }
        aopa mo52toBuilder = autfVar.mo52toBuilder();
        apzg apzgVar2 = ((autf) mo52toBuilder.instance).f;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aopa mo52toBuilder2 = ((SendShareEndpoint$SendShareExternallyEndpoint) apzgVar2.qm(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).mo52toBuilder();
        String str = resolveInfo.activityInfo.applicationInfo.packageName;
        String str2 = resolveInfo.activityInfo.name;
        arnd arndVar = ((SendShareEndpoint$SendShareExternallyEndpoint) mo52toBuilder2.instance).d;
        if (arndVar == null) {
            arndVar = arnd.a;
        }
        aopa mo52toBuilder3 = arndVar.mo52toBuilder();
        if (mo52toBuilder3 != null) {
            arnd arndVar2 = (arnd) mo52toBuilder3.instance;
            if ((arndVar2.b & 1) != 0) {
                ausy ausyVar = arndVar2.c;
                if (ausyVar == null) {
                    ausyVar = ausy.a;
                }
                aopa mo52toBuilder4 = ausyVar.mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                ausy ausyVar2 = (ausy) mo52toBuilder4.instance;
                str.getClass();
                ausyVar2.b |= 2;
                ausyVar2.d = str;
                mo52toBuilder4.copyOnWrite();
                ausy ausyVar3 = (ausy) mo52toBuilder4.instance;
                str2.getClass();
                ausyVar3.b |= 4;
                ausyVar3.e = str2;
                mo52toBuilder3.copyOnWrite();
                arnd arndVar3 = (arnd) mo52toBuilder3.instance;
                ausy ausyVar4 = (ausy) mo52toBuilder4.mo39build();
                ausyVar4.getClass();
                arndVar3.c = ausyVar4;
                arndVar3.b |= 1;
            }
        }
        mo52toBuilder2.copyOnWrite();
        SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint) mo52toBuilder2.instance;
        arnd arndVar4 = (arnd) mo52toBuilder3.mo39build();
        arndVar4.getClass();
        sendShareEndpoint$SendShareExternallyEndpoint.d = arndVar4;
        sendShareEndpoint$SendShareExternallyEndpoint.b |= 2;
        SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = (SendShareEndpoint$SendShareExternallyEndpoint) mo52toBuilder2.instance;
        if ((sendShareEndpoint$SendShareExternallyEndpoint2.b & 4) != 0) {
            arnc arncVar = sendShareEndpoint$SendShareExternallyEndpoint2.e;
            if (arncVar == null) {
                arncVar = arnc.a;
            }
            if ((arncVar.b & 2) != 0) {
                apzg apzgVar3 = arncVar.d;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                if (apzgVar3.qn(AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
                    apzg apzgVar4 = arncVar.d;
                    if (apzgVar4 == null) {
                        apzgVar4 = apzg.a;
                    }
                    aopc aopcVar = (aopc) apzgVar4.mo52toBuilder();
                    aopa mo52toBuilder5 = ((apem) aopcVar.qm(AndroidApplicationEndpointOuterClass.androidAppEndpoint)).mo52toBuilder();
                    mo52toBuilder5.copyOnWrite();
                    apem apemVar = (apem) mo52toBuilder5.instance;
                    str.getClass();
                    apemVar.b |= 1;
                    apemVar.c = str;
                    mo52toBuilder5.copyOnWrite();
                    apem apemVar2 = (apem) mo52toBuilder5.instance;
                    str2.getClass();
                    apemVar2.b |= 2;
                    apemVar2.d = str2;
                    aopa mo52toBuilder6 = arncVar.mo52toBuilder();
                    aopcVar.e(AndroidApplicationEndpointOuterClass.androidAppEndpoint, (apem) mo52toBuilder5.mo39build());
                    mo52toBuilder6.copyOnWrite();
                    arnc arncVar2 = (arnc) mo52toBuilder6.instance;
                    apzg apzgVar5 = (apzg) aopcVar.mo39build();
                    apzgVar5.getClass();
                    arncVar2.d = apzgVar5;
                    arncVar2.b |= 2;
                    arnc arncVar3 = (arnc) mo52toBuilder6.mo39build();
                    mo52toBuilder2.copyOnWrite();
                    SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint3 = (SendShareEndpoint$SendShareExternallyEndpoint) mo52toBuilder2.instance;
                    arncVar3.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint3.e = arncVar3;
                    sendShareEndpoint$SendShareExternallyEndpoint3.b |= 4;
                }
            }
        }
        apzg apzgVar6 = ((autf) mo52toBuilder.instance).f;
        if (apzgVar6 == null) {
            apzgVar6 = apzg.a;
        }
        aopc aopcVar2 = (aopc) apzgVar6.mo52toBuilder();
        aopcVar2.e(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint, (SendShareEndpoint$SendShareExternallyEndpoint) mo52toBuilder2.mo39build());
        mo52toBuilder.copyOnWrite();
        autf autfVar2 = (autf) mo52toBuilder.instance;
        apzg apzgVar7 = (apzg) aopcVar2.mo39build();
        apzgVar7.getClass();
        autfVar2.f = apzgVar7;
        autfVar2.b |= 16;
        return (autf) mo52toBuilder.mo39build();
    }

    public static Integer q(String str, apgv apgvVar) {
        if (apgvVar != null && !TextUtils.isEmpty(str)) {
            for (apgw apgwVar : apgvVar.b) {
                if (TextUtils.equals(str, apgwVar.c)) {
                    return Integer.valueOf(apgwVar.b);
                }
            }
        }
        return null;
    }

    public static List r(Collection collection, apgv apgvVar) {
        if (collection == null || apgvVar == null || apgvVar.b.size() == 0) {
            return Collections.emptyList();
        }
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.applicationInfo.packageName;
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(str);
            }
        }
        ArrayList arrayList = new ArrayList(hashSet.size());
        for (apgw apgwVar : apgvVar.b) {
            if (hashSet.contains(apgwVar.c)) {
                arrayList.add(Integer.valueOf(apgwVar.b));
            }
        }
        return arrayList;
    }

    public static acvg s(akgs akgsVar) {
        if (akgsVar == null || akgsVar.c() == null || !a || Math.random() % 10.0d != 0.0d) {
            return null;
        }
        return akgsVar.c().b(asny.LATENCY_ACTION_SUGGEST);
    }

    public static void t(String str) {
        u(str, null);
    }

    public static void u(String str, Throwable th) {
        if (a) {
            afus.c(2, 33, str, th);
        }
    }

    public static void v(akvm akvmVar, String str, String str2) {
        if (akvmVar == null || !a) {
            return;
        }
        akvmVar.c(str, str2);
    }

    public static void w(akgr akgrVar) {
        if (akgrVar == null || akgrVar.oj() == null || !a) {
            return;
        }
        akgrVar.oj().c("ss_rp");
    }

    public static final String x() {
        String language = Locale.getDefault().getLanguage();
        return (language == null || language.length() != 2) ? "en" : language;
    }

    public String a() {
        String country = Locale.getDefault().getCountry();
        if (country == null || country.length() != 2) {
            country = "us";
        }
        return country.toLowerCase(Locale.ENGLISH);
    }
}

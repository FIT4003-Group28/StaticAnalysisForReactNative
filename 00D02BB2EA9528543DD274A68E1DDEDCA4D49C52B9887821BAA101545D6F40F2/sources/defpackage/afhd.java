package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: afhd  reason: default package */
/* loaded from: classes2.dex */
public final class afhd {
    public static String a(akqq akqqVar) {
        return String.format(Locale.US, "%d,%d", Integer.valueOf(akqg.c(akqqVar.a)), Integer.valueOf(akqg.c(akqqVar.b)));
    }

    public static Uri b(amvh amvhVar, dqvj dqvjVar, @dzsi ddjr ddjrVar, @dzsi Integer num, @dzsi dpjs dpjsVar) {
        afhc afhcVar = new afhc();
        afhcVar.a = new amvh[]{amvhVar};
        afhcVar.b = dqvjVar;
        afhcVar.c = ddjrVar;
        afhcVar.d = num;
        afhcVar.e = dpjsVar;
        Uri.Builder fragment = new Uri.Builder().scheme("google.navigation").path("/").authority("").fragment("");
        amvh[] amvhVarArr = afhcVar.a;
        int length = amvhVarArr.length;
        String str = null;
        e(amvhVarArr[0], fragment, null);
        dqvj dqvjVar2 = afhcVar.b;
        if (dqvjVar2 != null && dqvjVar2 != dqvj.DRIVE) {
            fragment.appendQueryParameter("mode", afhi.i(afhcVar.b));
        }
        ddjr ddjrVar2 = afhcVar.c;
        if (ddjrVar2 != null) {
            fragment.appendQueryParameter("entry", afhw.b(ddjrVar2));
        }
        Integer num2 = afhcVar.d;
        if (num2 != null && num2.intValue() >= 0) {
            fragment.appendQueryParameter("index", Integer.toString(afhcVar.d.intValue()));
        }
        dpjs dpjsVar2 = afhcVar.e;
        if (dpjsVar2 != null && (dpjsVar2 == dpjs.ENTITY_TYPE_HOME || afhcVar.e == dpjs.ENTITY_TYPE_WORK)) {
            if (afhcVar.e == dpjs.ENTITY_TYPE_HOME) {
                str = "eth";
            }
            if (afhcVar.e == dpjs.ENTITY_TYPE_WORK) {
                str = "etw";
            }
            fragment.appendQueryParameter("et", str);
        }
        return fragment.build();
    }

    public static Uri c(dqvj dqvjVar, @dzsi ddjr ddjrVar) {
        Uri.Builder path = new Uri.Builder().scheme("google.navigation").path("/");
        path.appendQueryParameter("free", "1");
        path.appendQueryParameter("mode", afhi.i(dqvjVar));
        String b = afhw.b(ddjrVar);
        if (b != null) {
            path.appendQueryParameter("entry", b);
        }
        return path.build();
    }

    public static Uri d(@dzsi dqvj dqvjVar, @dzsi amvh amvhVar, amvh[] amvhVarArr, @dzsi afhv afhvVar, @dzsi ddjr ddjrVar, @dzsi Set<afhq> set, @dzsi Resources resources, boolean z) {
        dbsk.s(amvhVarArr);
        int length = amvhVarArr.length;
        dbsk.a(length > 0);
        int i = 0;
        while (true) {
            String str = null;
            if (i < length) {
                amvh amvhVar2 = amvhVarArr[i];
                if (amvhVar2.c == null && !amvhVar2.n()) {
                    return null;
                }
                i++;
            } else {
                Uri.Builder path = new Uri.Builder().scheme("google.navigation").path("/");
                if (afhvVar == afhv.MAP_VIEW) {
                    path.appendQueryParameter("target", "d");
                } else if (afhvVar == afhv.NAVIGATION) {
                    path.appendQueryParameter("target", "n");
                } else if (afhvVar == afhv.DEFAULT) {
                    path.appendQueryParameter("target", "c");
                }
                String i2 = afhi.i(dqvjVar);
                if (i2 == null) {
                    i2 = afhi.i(dqvj.DRIVE);
                }
                path.appendQueryParameter("mode", i2);
                if (amvhVar != null) {
                    if (amvhVar.n()) {
                        akqq akqqVar = amvhVar.e;
                        double d = akqqVar.a;
                        double d2 = akqqVar.b;
                        StringBuilder sb = new StringBuilder(49);
                        sb.append(d);
                        sb.append(",");
                        sb.append(d2);
                        path.appendQueryParameter("sll", sb.toString());
                    }
                    if (amvhVar.l()) {
                        path.appendQueryParameter("s", amvhVar.c);
                    }
                    String str2 = amvhVar.k;
                    if (str2 != null) {
                        path.appendQueryParameter("stitle", str2);
                    }
                    if (amvhVar.m()) {
                        path.appendQueryParameter("sftid", amvhVar.d.o());
                    }
                }
                if (amvhVarArr.length > 1) {
                    str = "";
                }
                for (amvh amvhVar3 : amvhVarArr) {
                    if (!z || resources == null) {
                        e(amvhVar3, path, str);
                    } else {
                        dpjs dpjsVar = amvhVar3.b;
                        if (dpjsVar == dpjs.ENTITY_TYPE_HOME || dpjsVar == dpjs.ENTITY_TYPE_WORK) {
                            amvg P = amvh.P();
                            P.a = dpjsVar;
                            P.b = resources.getString(dpjsVar == dpjs.ENTITY_TYPE_HOME ? R.string.ADDRESS_TYPE_HOME : R.string.ADDRESS_TYPE_WORK);
                            amvhVar3 = P.a();
                        }
                        e(amvhVar3, path, str);
                    }
                }
                String b = afhw.b(ddjrVar);
                if (b != null) {
                    path.appendQueryParameter("entry", b);
                }
                if (set != null && !set.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    for (afhq afhqVar : set) {
                        sb2.append(afhqVar.d);
                    }
                    path.appendQueryParameter("avoid", sb2.toString());
                }
                return path.build();
            }
        }
    }

    public static void e(amvh amvhVar, Uri.Builder builder, @dzsi String str) {
        akqq akqqVar = amvhVar.e;
        String format = akqqVar != null ? String.format(Locale.US, "%.6f,%.6f", Double.valueOf(akqqVar.a), Double.valueOf(akqqVar.b)) : str;
        if (format != null) {
            builder.appendQueryParameter("ll", format);
        }
        String str2 = amvhVar.c;
        if (str2 == null) {
            str2 = str;
        }
        if (str2 != null) {
            builder.appendQueryParameter("q", str2);
        }
        String str3 = amvhVar.k;
        if (str3 == null) {
            str3 = str;
        }
        if (str3 != null) {
            builder.appendQueryParameter("title", str3);
        }
        akqi akqiVar = amvhVar.d;
        if (akqiVar != null) {
            str = afhi.l(akqiVar);
        }
        if (str != null) {
            builder.appendQueryParameter("token", str);
        }
    }
}

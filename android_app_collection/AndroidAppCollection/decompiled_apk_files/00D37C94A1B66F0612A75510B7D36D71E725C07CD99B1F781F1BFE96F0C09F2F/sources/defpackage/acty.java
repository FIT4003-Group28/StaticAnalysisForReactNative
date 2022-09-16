package defpackage;

import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acty  reason: default package */
/* loaded from: classes.dex */
public final class acty {
    public static asjj a(apzg apzgVar, aopg aopgVar) {
        if (apzgVar != null) {
            apzh apzhVar = apzgVar.e;
            if (apzhVar == null) {
                apzhVar = apzh.a;
            }
            if (!apzhVar.qn(aopgVar)) {
                return null;
            }
            apzh apzhVar2 = apzgVar.e;
            if (apzhVar2 == null) {
                apzhVar2 = apzh.a;
            }
            return (asjj) apzhVar2.qm(aopgVar);
        }
        return null;
    }

    public static void b(acrs acrsVar, acrf acrfVar, arrk arrkVar, afvm afvmVar) {
        aopu<arrl> aopuVar = arrkVar.c;
        if (aopuVar != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (arrl arrlVar : aopuVar) {
                if (arrlVar != null) {
                    aqwn aqwnVar = arrlVar.b;
                    if (aqwnVar == null) {
                        aqwnVar = aqwn.a;
                    }
                    if (!aqwnVar.c) {
                        long c = arrlVar.c <= 0 ? Long.MAX_VALUE : acrsVar.b.c() + TimeUnit.MINUTES.toMillis(arrlVar.c);
                        aqwn aqwnVar2 = arrlVar.b;
                        if (aqwnVar2 == null) {
                            aqwnVar2 = aqwn.a;
                        }
                        arrg a = arrg.a(aqwnVar2.b);
                        if (a != null) {
                            concurrentHashMap.put(a, Long.valueOf(c));
                        }
                    }
                }
            }
            acrsVar.g = concurrentHashMap;
        }
        if (acrsVar.a()) {
            String str = arrkVar.d;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            acrfVar.c(afvmVar);
            acrfVar.a.edit().putString(acrf.e(afvmVar), str).apply();
        }
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            acnt acntVar = null;
            if (str != null) {
                UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
                urlQuerySanitizer.setAllowUnregisteredParamaters(true);
                urlQuerySanitizer.parseQuery(str);
                String value = urlQuerySanitizer.getValue("prefix");
                String value2 = urlQuerySanitizer.getValue("type");
                String value3 = urlQuerySanitizer.getValue("codec");
                if (value == null || value2 == null || value3 == null) {
                    zep.m("EncoderSupportUtil", "Unexpected null value in supported encoder string.");
                } else {
                    axgq a = acnt.a(value3);
                    if (a == null) {
                        zep.m("EncoderSupportUtil", value3.length() != 0 ? "Unexpected codec type: ".concat(value3) : new String("Unexpected codec type: "));
                    } else {
                        try {
                            int parseInt = Integer.parseInt(value2);
                            if (parseInt >= -1 && parseInt <= 2) {
                                acntVar = new acnt(value, parseInt, a);
                            }
                            StringBuilder sb = new StringBuilder(36);
                            sb.append("Unexpected encoder type: ");
                            sb.append(parseInt);
                            zep.m("EncoderSupportUtil", sb.toString());
                        } catch (NumberFormatException unused) {
                            zep.m("EncoderSupportUtil", value2.length() != 0 ? "Failed to parse encoder support type integer: ".concat(value2) : new String("Failed to parse encoder support type integer: "));
                        }
                    }
                }
            }
            if (acntVar != null) {
                arrayList.add(acntVar);
            }
        }
        return arrayList;
    }
}

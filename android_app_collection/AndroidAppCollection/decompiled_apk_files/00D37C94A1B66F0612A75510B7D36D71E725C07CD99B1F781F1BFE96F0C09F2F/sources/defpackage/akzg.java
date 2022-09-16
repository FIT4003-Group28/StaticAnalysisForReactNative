package defpackage;

import android.text.TextUtils;
import android.util.ArrayMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: akzg  reason: default package */
/* loaded from: classes.dex */
public final class akzg {
    public static final amqf a = amqf.c(":").a();
    private static final amqf e = amqf.c(",").a();
    private static final amqf f = amqf.c("=").a();
    private static final Map g;
    public final String b;
    public final aacz c;
    public final aqxo d;
    private final aadd h;

    static {
        ArrayMap arrayMap = new ArrayMap();
        g = arrayMap;
        arrayMap.put("um", akyz.UNKNOWN);
        arrayMap.put("ut", akza.UNKNOWN);
        arrayMap.put("v", akzb.a);
        arrayMap.put("api", akyx.a);
        arrayMap.put("cf", akyy.UNKNOWN);
    }

    public akzg(aadd aaddVar, aacz aaczVar, aqxo aqxoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = aadf.a(aaczVar).c;
        this.h = aaddVar;
        this.c = aaczVar;
        this.d = aqxoVar;
    }

    public static Set e(String str) {
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            List h = a.h(str);
            if (h.size() >= 4 && ((String) h.get(1)).length() == 36 && ((String) h.get(2)).matches("[0-9]+")) {
                str2 = (String) h.get(3);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return amyg.a;
        }
        HashSet hashSet = new HashSet();
        for (String str3 : e.h(str2)) {
            amqf amqfVar = f;
            List h2 = amqfVar.h(str3);
            if (h2.size() == 2) {
                akyw akywVar = (akyw) g.get(h2.get(0));
                if (akywVar != null) {
                    akyw akywVar2 = null;
                    if (!TextUtils.isEmpty(str3)) {
                        List h3 = amqfVar.h(str3);
                        if (h3.size() == 2 && akywVar.b().equals(h3.get(0))) {
                            try {
                                akywVar2 = akywVar.a(Integer.parseInt((String) h3.get(1)));
                            } catch (NumberFormatException e2) {
                                zep.d("Cannot parse Frontend ID key-value", e2);
                            }
                        }
                    }
                    if (akywVar2 != null) {
                        hashSet.add(akywVar2);
                    } else {
                        return amyg.a;
                    }
                } else {
                    return amyg.a;
                }
            } else {
                return amyg.a;
            }
        }
        return hashSet;
    }

    public static boolean f(String str) {
        return e(str).contains(akyx.a);
    }

    public static boolean g(String str) {
        return !e(str).isEmpty();
    }

    private final String h(String str, String str2, int i, boolean z, ampq ampqVar) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(i);
        sb.append(":");
        int i2 = akzb.a.c;
        StringBuilder sb2 = new StringBuilder(13);
        sb2.append("v=");
        sb2.append(i2);
        sb.append(sb2.toString());
        if (z) {
            sb.append(",");
            int i3 = akyx.a.c;
            StringBuilder sb3 = new StringBuilder(15);
            sb3.append("api=");
            sb3.append(i3);
            sb.append(sb3.toString());
        }
        if (ampqVar.h()) {
            avvf avvfVar = this.h.a().h;
            if (avvfVar == null) {
                avvfVar = avvf.a;
            }
            if (avvfVar.A) {
                sb.append(",");
                sb.append(akyy.c((avui) ampqVar.c()));
            }
        }
        return sb.toString();
    }

    private final String i(String str, String str2, int i) {
        return h(str, str2, i, false, amon.a);
    }

    public final String a(String str, avui avuiVar, int i) {
        return h(this.b, str, i, true, ampq.j(avuiVar));
    }

    public final String b() {
        return c(zhn.o(), 0);
    }

    public final String c(String str, int i) {
        return i(this.b, str, i);
    }

    public final String d() {
        return i("android_live", zhn.o(), 0);
    }
}

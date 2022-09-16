package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tnk  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tnk {
    public tnk() {
        new qmx();
    }

    public static ankt a() {
        return anlz.q(null);
    }

    public static ankt b() {
        return anlz.q(aoop.a);
    }

    public static ankt c() {
        return anlz.q(null);
    }

    public static tmh d(tng tngVar) {
        List b = tngVar.b();
        return (tmh) b.get(b.size() - 1);
    }

    public static tmh e(tng tngVar) {
        return (tmh) tngVar.b().get(0);
    }

    public static void f(tmb tmbVar, List list) {
        while (tmbVar != null) {
            tmh a = tmbVar.a();
            boolean z = false;
            if (a != null) {
                angf angfVar = a.d;
                if (angfVar == null) {
                    angfVar = angf.a;
                }
                aqxo.z((angfVar.b & 8) != 0, "Instrumented view has no VE ID.");
                list.add(a);
            }
            tmb b = ((tml) tmbVar.b).b();
            if (b == null) {
                if (tmbVar.b.d() || a.qn(too.a)) {
                    z = true;
                }
                aqxo.B(z, "Activity's content root (android.R.id.content) must be annotated with a VE. CVE root was: %s", tmbVar);
                return;
            }
            tmbVar = b;
        }
    }

    public static int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static rve h(qta qtaVar, qxu qxuVar) {
        rvh rvhVar = new rvh();
        qtaVar.e(new qxt(qtaVar, rvhVar, qxuVar));
        return rvhVar.a;
    }

    public static void i(qta qtaVar) {
        h(qtaVar, new rwu(1));
    }

    public static boolean j(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @Deprecated
    public static final WebImage k(MediaMetadata mediaMetadata) {
        if (mediaMetadata == null || !mediaMetadata.c()) {
            return null;
        }
        return (WebImage) mediaMetadata.a.get(0);
    }

    public static Map l(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return amyc.b;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

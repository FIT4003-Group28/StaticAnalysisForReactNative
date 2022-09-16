package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abga  reason: default package */
/* loaded from: classes.dex */
public class abga {
    public static int e() {
        return ((int) Runtime.getRuntime().totalMemory()) / 16;
    }

    public static cer f(byte[] bArr, Map map, arpa arpaVar) {
        if (bArr == null || arpaVar == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(arpaVar.e);
        cer cerVar = new cer();
        cerVar.a = bArr;
        cerVar.f = currentTimeMillis;
        cerVar.e = currentTimeMillis;
        cerVar.c = 0L;
        if (map == null) {
            map = Collections.emptyMap();
        }
        cerVar.g = map;
        return cerVar;
    }

    public static Uri g(Context context) {
        return yhr.a(context, "innertube", "innertube_backedup.pb");
    }

    public static aajk h(aopa aopaVar) {
        return new aajk((aqwb) aopaVar.mo39build());
    }

    public static void i(String str, String str2, aopa aopaVar) {
        str2.getClass();
        aoob z = aoob.z(str2);
        aopaVar.copyOnWrite();
        aqwb aqwbVar = (aqwb) aopaVar.instance;
        aqwb aqwbVar2 = aqwb.a;
        aoqp aoqpVar = aqwbVar.b;
        if (!aoqpVar.b) {
            aqwbVar.b = aoqpVar.a();
        }
        aqwbVar.b.put(str, z);
    }

    public /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        throw null;
    }
}

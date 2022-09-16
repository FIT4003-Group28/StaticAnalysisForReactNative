package defpackage;

import android.util.Pair;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: syw  reason: default package */
/* loaded from: classes4.dex */
public final class syw implements tek {
    private static final String a = "syw";
    private static final AtomicInteger b = new AtomicInteger();
    private final teb c;
    private final Map d;
    private final Map e;

    public syw(Map map, Map map2, teb tebVar) {
        this.c = tebVar;
        amum amumVar = new amum();
        for (Map.Entry entry : ((amup) map).entrySet()) {
            amumVar.f(Integer.valueOf(((sxr) entry.getValue()).a()), (sxr) entry.getValue());
        }
        amum amumVar2 = new amum();
        if (!map2.isEmpty()) {
            for (Map.Entry entry2 : ((amup) map2).entrySet()) {
                amumVar2.f(Integer.valueOf(((sxs) ((Pair) entry2.getValue()).first).a().a()), (Pair) entry2.getValue());
            }
        }
        this.d = amumVar.b();
        this.e = amumVar2.b();
    }

    @Override // defpackage.tek
    public final int a() {
        return 322066057;
    }

    @Override // defpackage.tek
    public final /* bridge */ /* synthetic */ aodt b(ByteBuffer byteBuffer) {
        axnd axndVar = new axnd();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axndVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axndVar;
    }

    @Override // defpackage.tel
    public final /* bridge */ /* synthetic */ void c(cyv cyvVar, tda tdaVar, String str, Object obj, tdq tdqVar, tcr tcrVar) {
        Pair pair;
        axnd axndVar = (axnd) obj;
        AtomicReference atomicReference = tdaVar.w;
        if (atomicReference == null) {
            this.c.b(28, "scrollStrategyListenerHolder is unavailable");
            return;
        }
        aodt aodtVar = new aodt();
        String str2 = a;
        int incrementAndGet = b.incrementAndGet();
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 11);
        sb.append(str2);
        sb.append(incrementAndGet);
        String sb2 = sb.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int b2 = axndVar.b(4);
            if (i < (b2 != 0 ? axndVar.d(b2) : 0)) {
                int b3 = axndVar.b(4);
                if (b3 != 0) {
                    aodtVar.f(axndVar.a(axndVar.c(b3) + (i * 4)), axndVar.b);
                }
                IntersectionObserver intersectionObserver = null;
                if (aodtVar.U() == 1) {
                    sxr sxrVar = (sxr) this.d.get(Integer.valueOf(aodtVar.T()));
                    if (sxrVar != null) {
                        aodt c = sxrVar.c(aodtVar);
                        tcq a2 = tcs.a();
                        a2.f = tdqVar;
                        a2.b(tdaVar);
                        a2.h = tdaVar.u;
                        intersectionObserver = sxrVar.b(c, a2.a());
                    } else {
                        int T = aodtVar.T();
                        StringBuilder sb3 = new StringBuilder(41);
                        sb3.append("Unknown Flatbuffer extension: ");
                        sb3.append(T);
                        throw new ted(sb3.toString());
                    }
                } else if (aodtVar.U() == 2 && (pair = (Pair) this.e.get(Integer.valueOf(aodtVar.T()))) != null) {
                    try {
                        tgo.i(aodtVar.V(), (aorb) pair.second);
                        tcq a3 = tcs.a();
                        a3.f = tdqVar;
                        a3.b(tdaVar);
                        a3.h = tdaVar.u;
                        a3.a();
                        intersectionObserver = ((sxs) pair.first).b();
                    } catch (aopx e) {
                        teb tebVar = this.c;
                        int T2 = aodtVar.T();
                        StringBuilder sb4 = new StringBuilder(111);
                        sb4.append("Failed to resolve Intersection Property Extension in IntersectionPropertiesConverter. Extension id: ");
                        sb4.append(T2);
                        tebVar.a(26, sb4.toString(), tdaVar, e);
                    }
                }
                if (intersectionObserver != null) {
                    arrayList.add(intersectionObserver);
                }
                i++;
            } else if (arrayList.isEmpty()) {
                return;
            } else {
                syv syvVar = new syv(atomicReference, arrayList, sb2, this.c);
                tdqVar.p(syvVar);
                tdqVar.j(syvVar);
                tdqVar.g(syvVar);
                return;
            }
        }
    }

    @Override // defpackage.tel
    public final /* synthetic */ void e(tdq tdqVar) {
    }
}

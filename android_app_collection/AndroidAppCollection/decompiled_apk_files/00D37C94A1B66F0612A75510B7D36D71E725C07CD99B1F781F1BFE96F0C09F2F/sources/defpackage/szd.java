package defpackage;

import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.net.CellularSignalStrengthError;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: szd  reason: default package */
/* loaded from: classes4.dex */
public final class szd implements tek {
    private static final Map a;
    private final teb b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, new HashSet(Arrays.asList(dfd.a, dfd.b)));
        hashMap.put(2, new HashSet(Arrays.asList(dfd.c, dfd.d)));
        hashMap.put(4, new HashSet(Arrays.asList(dfd.e)));
        hashMap.put(3, new HashSet(Arrays.asList(dfd.f)));
        hashMap.put(5, new HashSet(Arrays.asList(dfd.g)));
        a = hashMap;
    }

    public szd(teb tebVar) {
        this.b = tebVar;
    }

    @Override // defpackage.tek
    public final int a() {
        return 225874218;
    }

    @Override // defpackage.tek
    public final /* bridge */ /* synthetic */ aodt b(ByteBuffer byteBuffer) {
        axnl axnlVar = new axnl();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axnlVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axnlVar;
    }

    @Override // defpackage.tel
    public final /* bridge */ /* synthetic */ void c(cyv cyvVar, tda tdaVar, String str, Object obj, tdq tdqVar, tcr tcrVar) {
        int i;
        dec d;
        szd szdVar = this;
        axnl axnlVar = (axnl) obj;
        cyp a2 = tdqVar.a();
        if (axnlVar.aG() == 0) {
            return;
        }
        if (str == null) {
            szdVar.b.c(23, "Key is required with valid transition, but the key is null", tdaVar);
            return;
        }
        String concat = str.length() != 0 ? "com.youtube.transition_key.".concat(str) : new String("com.youtube.transition_key.");
        cyo C = a2.c.C();
        String str2 = a2.c.l;
        cyn c = C.c();
        c.a |= 512;
        c.h = concat;
        c.g = str2;
        int i2 = 2;
        if (a2.c.C().c().k == 0) {
            dec decVar = dee.g;
            a2.B(2);
        }
        int i3 = 1;
        a2.B(1);
        ddw e = dee.e(concat);
        int i4 = 0;
        int i5 = 0;
        while (i5 < axnlVar.aG()) {
            aodt aodtVar = new aodt();
            int b = axnlVar.b(4);
            if (b != 0) {
                aodtVar.f(axnlVar.a(axnlVar.c(b) + (i5 * 4)), axnlVar.b);
            } else {
                aodtVar = null;
            }
            Map map = a;
            int b2 = aodtVar.b(4);
            Set<dfe> set = (Set) map.get(Integer.valueOf(b2 != 0 ? aodtVar.b.getInt(b2 + aodtVar.a) : 0));
            if (set == null) {
                szdVar.b.c(22, "Unknown TransitionValue specified", tdaVar);
            } else {
                for (dfe dfeVar : set) {
                    e.b();
                    e.c = new ddy(dfeVar);
                    aodt aodtVar2 = new aodt();
                    int b3 = aodtVar.b(6);
                    if (b3 != 0) {
                        aodtVar2.f(aodtVar.a(b3 + aodtVar.a), aodtVar.b);
                    } else {
                        aodtVar2 = null;
                    }
                    int i6 = 1000;
                    if (aodtVar2 != null && aodtVar2.ao() != 0.0f) {
                        i6 = (int) (aodtVar2.ao() * 1000.0f);
                    }
                    if (aodtVar2 != null) {
                        int b4 = aodtVar2.b(6);
                        i = b4 != 0 ? aodtVar2.b.getInt(b4 + aodtVar2.a) : 0;
                    } else {
                        i = 2;
                    }
                    float ap = (aodtVar2 == null || aodtVar2.aq() <= 0) ? 0.0f : aodtVar2.ap(i4);
                    float ap2 = (aodtVar2 == null || aodtVar2.aq() <= i3) ? 0.0f : aodtVar2.ap(i3);
                    float ap3 = (aodtVar2 == null || aodtVar2.aq() <= i2) ? 0.0f : aodtVar2.ap(i2);
                    float ap4 = (aodtVar2 == null || aodtVar2.aq() <= 3) ? 0.0f : aodtVar2.ap(3);
                    if (i == 1) {
                        d = dee.d(i6, new LinearInterpolator());
                    } else if (i == 3) {
                        d = dee.d(i6, kt.o(0.4f, 0.0f, 1.0f, 1.0f));
                    } else if (i == 4) {
                        d = dee.d(i6, kt.o(0.0f, 0.0f, 0.2f, 1.0f));
                    } else if (i == 5) {
                        d = dee.d(i6, new PathInterpolator(ap, ap2));
                    } else if (i == 6) {
                        d = dee.d(i6, kt.o(ap, ap2, ap3, ap4));
                    } else {
                        d = dee.d(i6, kt.o(0.4f, 0.0f, 0.2f, 1.0f));
                    }
                    e.d = d;
                    int b5 = aodtVar.b(8);
                    if (b5 != 0 && aodtVar.b.get(b5 + aodtVar.a) != 0) {
                        int b6 = aodtVar.b(10);
                        dfj dfjVar = new dfj(b6 != 0 ? aodtVar.b.getFloat(b6 + aodtVar.a) : 0.0f);
                        if (e.c == null) {
                            throw new RuntimeException("Must specify a single property using #animate() before specifying an appearFrom value!");
                        }
                        e.e = dfjVar;
                    }
                    int b7 = aodtVar.b(12);
                    if (b7 != 0 && aodtVar.b.get(b7 + aodtVar.a) != 0) {
                        int b8 = aodtVar.b(14);
                        dfj dfjVar2 = new dfj(b8 != 0 ? aodtVar.b.getFloat(b8 + aodtVar.a) : 0.0f);
                        if (e.c == null) {
                            throw new RuntimeException("Must specify a single property using #animate() before specifying an disappearTo value!");
                        }
                        e.f = dfjVar2;
                    }
                    i3 = 1;
                    i2 = 2;
                    i4 = 0;
                }
                continue;
            }
            i5++;
            szdVar = this;
            i3 = 1;
            i2 = 2;
            i4 = 0;
        }
        e.b();
        cyn c2 = a2.c.C().c();
        c2.a |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        c2.i = e;
    }

    @Override // defpackage.tel
    public final /* synthetic */ void e(tdq tdqVar) {
    }
}

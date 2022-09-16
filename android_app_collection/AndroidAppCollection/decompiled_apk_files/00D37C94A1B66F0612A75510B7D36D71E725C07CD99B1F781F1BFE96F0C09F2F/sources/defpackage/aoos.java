package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aoos  reason: default package */
/* loaded from: classes.dex */
public class aoos {
    static final aoos a = new aoos(null);
    private static volatile boolean b = false;
    private static volatile aoos c;
    private static volatile aoos d;
    private final Map e;

    public aoos() {
        this.e = new HashMap();
    }

    public static aoos a() {
        aoos aoosVar = c;
        if (aoosVar == null) {
            synchronized (aoos.class) {
                aoosVar = c;
                if (aoosVar == null) {
                    aoosVar = a;
                    c = aoosVar;
                }
            }
        }
        return aoosVar;
    }

    public static aoos c() {
        return new aoos();
    }

    public aopg d(aoqu aoquVar, int i) {
        return (aopg) this.e.get(new aoor(aoquVar, i));
    }

    public final void e(aopg aopgVar) {
        this.e.put(new aoor(aopgVar.a, aopgVar.a()), aopgVar);
    }

    public aoos(byte[] bArr) {
        this.e = Collections.emptyMap();
    }

    public static aoos b() {
        aoos aoosVar = d;
        if (aoosVar != null) {
            return aoosVar;
        }
        synchronized (aoos.class) {
            aoos aoosVar2 = d;
            if (aoosVar2 != null) {
                return aoosVar2;
            }
            aoos b2 = aooz.b(aoos.class);
            d = b2;
            return b2;
        }
    }
}

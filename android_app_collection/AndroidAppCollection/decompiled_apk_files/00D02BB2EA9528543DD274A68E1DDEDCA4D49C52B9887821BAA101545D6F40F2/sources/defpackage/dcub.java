package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcub  reason: default package */
/* loaded from: classes.dex */
public final class dcub extends dctz {
    private static final Map<dcrf, dcub[]> c;
    private final dcrf d;

    static {
        dcrf[] values;
        EnumMap enumMap = new EnumMap(dcrf.class);
        for (dcrf dcrfVar : dcrf.values()) {
            dcub[] dcubVarArr = new dcub[10];
            for (int i = 0; i < 10; i++) {
                dcubVarArr[i] = new dcub(i, dcrfVar, dcrg.a);
            }
            enumMap.put((EnumMap) dcrfVar, (dcrf) dcubVarArr);
        }
        c = Collections.unmodifiableMap(enumMap);
    }

    private dcub(int i, dcrf dcrfVar, dcrg dcrgVar) {
        super(dcrgVar, i);
        dcuj.a(dcrfVar, "format char");
        this.d = dcrfVar;
        if (dcrgVar.c()) {
            String str = dcrfVar.o;
            return;
        }
        int i2 = dcrfVar.l;
        i2 = dcrgVar.e() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        dcrgVar.f(sb);
        sb.append((char) i2);
        sb.toString();
    }

    public static dcub b(int i, dcrf dcrfVar, dcrg dcrgVar) {
        if (i >= 10 || !dcrgVar.c()) {
            return new dcub(i, dcrfVar, dcrgVar);
        }
        return c.get(dcrfVar)[i];
    }

    @Override // defpackage.dctz
    public final void a(dcua dcuaVar, Object obj) {
        dcuaVar.a(obj, this.d, this.b);
    }
}

package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: andi  reason: default package */
/* loaded from: classes.dex */
public final class andi extends andg {
    private static final Map c;
    private final anba d;

    static {
        anba[] values;
        EnumMap enumMap = new EnumMap(anba.class);
        for (anba anbaVar : anba.values()) {
            andi[] andiVarArr = new andi[10];
            for (int i = 0; i < 10; i++) {
                andiVarArr[i] = new andi(i, anbaVar, anbb.a);
            }
            enumMap.put((EnumMap) anbaVar, (anba) andiVarArr);
        }
        c = Collections.unmodifiableMap(enumMap);
    }

    private andi(int i, anba anbaVar, anbb anbbVar) {
        super(anbbVar, i);
        anha.c(anbaVar, "format char");
        this.d = anbaVar;
        if (anbbVar.c()) {
            String str = anbaVar.o;
            return;
        }
        int i2 = anbaVar.l;
        i2 = anbbVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        anbbVar.f(sb);
        sb.append((char) i2);
    }

    public static andi b(int i, anba anbaVar, anbb anbbVar) {
        if (i >= 10 || !anbbVar.c()) {
            return new andi(i, anbaVar, anbbVar);
        }
        return ((andi[]) c.get(anbaVar))[i];
    }

    @Override // defpackage.andg
    public final void a(andh andhVar, Object obj) {
        andhVar.a(obj, this.d, this.b);
    }
}

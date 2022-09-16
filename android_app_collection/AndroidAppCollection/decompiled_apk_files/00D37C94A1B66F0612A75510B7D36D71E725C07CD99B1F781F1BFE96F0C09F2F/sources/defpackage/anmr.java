package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: anmr  reason: default package */
/* loaded from: classes.dex */
public abstract class anmr {
    public final Class a;
    public final Class b;
    private final Map c;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public anmr(Class cls, anmq... anmqVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            anmq anmqVar = anmqVarArr[i];
            if (!hashMap.containsKey(anmqVar.a)) {
                hashMap.put(anmqVar.a, anmqVar);
            } else {
                String valueOf = String.valueOf(anmqVar.a.getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
        }
        this.b = anmqVarArr[0].a;
        this.c = Collections.unmodifiableMap(hashMap);
    }

    public anmp a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract aoqu b(aoob aoobVar);

    public final Object c(aoqu aoquVar, Class cls) {
        anmq anmqVar = (anmq) this.c.get(cls);
        if (anmqVar == null) {
            String canonicalName = cls.getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
            sb.append("Requested primitive class ");
            sb.append(canonicalName);
            sb.append(" not supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        return anmqVar.a(aoquVar);
    }

    public abstract String d();

    public final Set e() {
        return this.c.keySet();
    }

    public abstract void f(aoqu aoquVar);

    public int g() {
        return 1;
    }

    public abstract int h();
}

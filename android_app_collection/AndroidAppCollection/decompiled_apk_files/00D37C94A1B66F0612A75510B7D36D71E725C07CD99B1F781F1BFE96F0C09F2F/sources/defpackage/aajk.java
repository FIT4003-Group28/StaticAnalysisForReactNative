package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: aajk  reason: default package */
/* loaded from: classes.dex */
public final class aajk {
    public static final aajk a = abga.h(aqwb.a.createBuilder());
    public final aqwb b;

    public aajk(aqwb aqwbVar) {
        aqwbVar.getClass();
        this.b = aqwbVar;
    }

    public static aajk a(byte[] bArr) {
        return new aajk((aqwb) aopi.parseFrom(aqwb.a, bArr, aoos.b()));
    }

    public static aajk b(aqwb aqwbVar) {
        return new aajk(aqwbVar);
    }

    public final String c(String str) {
        if (!this.b.b.containsKey(str)) {
            return null;
        }
        aqwb aqwbVar = this.b;
        aoob aoobVar = aoob.b;
        aoqp aoqpVar = aqwbVar.b;
        if (aoqpVar.containsKey(str)) {
            aoobVar = (aoob) aoqpVar.get(str);
        }
        return aoobVar.E();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aajk) {
            return akzj.f(this.b, ((aajk) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(Collections.unmodifiableMap(this.b.b));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("EntityMetadata{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

import java.lang.annotation.Annotation;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anyq  reason: default package */
/* loaded from: classes.dex */
public final class anyq {
    private final String a;
    private final Map b;

    public anyq(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static anyp a(String str) {
        return new anyp(str);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anyq)) {
            return false;
        }
        anyq anyqVar = (anyq) obj;
        return this.a.equals(anyqVar.a) && this.b.equals(anyqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b.values());
        StringBuilder sb = new StringBuilder(str.length() + 35 + String.valueOf(valueOf).length());
        sb.append("FieldDescriptor{name=");
        sb.append(str);
        sb.append(", properties=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: dygo  reason: default package */
/* loaded from: classes6.dex */
public final class dygo {
    private static final AtomicLong b = new AtomicLong();
    public final long a;
    private final String c;
    @dzsi
    private final String d;

    public dygo(String str, String str2, long j) {
        dbsk.t(str, "typeName");
        dbsk.b(!str.isEmpty(), "empty type");
        this.c = str;
        this.d = str2;
        this.a = j;
    }

    public static dygo a(Class<?> cls, @dzsi String str) {
        dbsk.t(cls, "type");
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return b(simpleName, str);
    }

    public static dygo b(String str, @dzsi String str2) {
        return new dygo(str, str2, b.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.c;
        long j = this.a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
        sb2.append(str);
        sb2.append("<");
        sb2.append(j);
        sb2.append(">");
        sb.append(sb2.toString());
        if (this.d != null) {
            sb.append(": (");
            sb.append(this.d);
            sb.append(')');
        }
        return sb.toString();
    }
}
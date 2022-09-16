package defpackage;
/* compiled from: PG */
/* renamed from: dfew  reason: default package */
/* loaded from: classes6.dex */
public final class dfew {
    private final String a;
    private long b;

    public dfew(Class<?> cls, long j) {
        this(cls.getSimpleName(), j);
    }

    public dfew(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final void a() {
        d();
        this.b = 0L;
    }

    public final long b() {
        d();
        return this.b;
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final void d() {
        boolean c = c();
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("Native object ");
        sb.append(str);
        sb.append(" is null.");
        dbsk.m(!c, sb.toString());
    }

    public final void finalize() {
    }
}

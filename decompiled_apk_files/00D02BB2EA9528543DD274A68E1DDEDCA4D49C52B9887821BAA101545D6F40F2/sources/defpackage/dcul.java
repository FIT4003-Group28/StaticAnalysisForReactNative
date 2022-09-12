package defpackage;
/* compiled from: PG */
/* renamed from: dcul  reason: default package */
/* loaded from: classes.dex */
public final class dcul extends dcqp {
    private final StackTraceElement b;

    public dcul(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.dcqp
    public final String a() {
        return this.b.getClassName();
    }

    @Override // defpackage.dcqp
    public final String b() {
        return this.b.getMethodName();
    }

    @Override // defpackage.dcqp
    public final int c() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.dcqp
    public final String d() {
        return this.b.getFileName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dcul) && this.b.equals(((dcul) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

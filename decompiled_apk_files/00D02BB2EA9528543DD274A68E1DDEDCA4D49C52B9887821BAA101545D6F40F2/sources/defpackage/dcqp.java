package defpackage;
/* compiled from: PG */
/* renamed from: dcqp  reason: default package */
/* loaded from: classes.dex */
public abstract class dcqp implements dcqq {
    public static final dcqp a = new dcqn();

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogSite{ class=");
        sb.append(a());
        sb.append(", method=");
        sb.append(b());
        sb.append(", line=");
        sb.append(c());
        if (d() != null) {
            sb.append(", file=");
            sb.append(d());
        }
        sb.append(" }");
        return sb.toString();
    }
}

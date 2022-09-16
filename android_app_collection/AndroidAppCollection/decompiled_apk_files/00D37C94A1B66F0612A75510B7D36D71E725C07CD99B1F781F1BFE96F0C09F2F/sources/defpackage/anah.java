package defpackage;
/* compiled from: PG */
/* renamed from: anah  reason: default package */
/* loaded from: classes.dex */
public abstract class anah implements anai {
    public static final anah a = new anaf();

    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogSite{ class=");
        sb.append(b());
        sb.append(", method=");
        sb.append(d());
        sb.append(", line=");
        sb.append(a());
        if (c() != null) {
            sb.append(", file=");
            sb.append(c());
        }
        sb.append(" }");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: actn  reason: default package */
/* loaded from: classes.dex */
final class actn {
    private final int a;
    private final int b;

    public actn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private final String a() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof actn)) {
            return false;
        }
        return a().equals(((actn) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}

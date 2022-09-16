package defpackage;
/* compiled from: PG */
/* renamed from: akwo  reason: default package */
/* loaded from: classes.dex */
public final class akwo {
    public final String a;
    public final aveo b;

    public akwo(String str, aveo aveoVar) {
        this.a = str;
        this.b = aveoVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a != null) {
            sb.append("pcen:");
            sb.append(this.a);
        }
        if (this.b != null) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("tag:");
            sb.append(this.b.c);
        }
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: ajkj  reason: default package */
/* loaded from: classes.dex */
public final class ajkj {
    public static final ajkj a = a().a();
    public final boolean b;

    public ajkj() {
    }

    public ajkj(boolean z) {
        this.b = z;
    }

    public static ajki a() {
        ajki ajkiVar = new ajki();
        ajkiVar.b(false);
        return ajkiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ajkj) && this.b == ((ajkj) obj).b;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(47);
        sb.append("LocalElementsConfig{swipeToCameraEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: aqqs  reason: default package */
/* loaded from: classes2.dex */
public final class aqqs {
    private final aqqx a;

    public aqqs(aqqx aqqxVar) {
        this.a = aqqxVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqqs) && this.a.equals(((aqqs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("DrmErrorInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

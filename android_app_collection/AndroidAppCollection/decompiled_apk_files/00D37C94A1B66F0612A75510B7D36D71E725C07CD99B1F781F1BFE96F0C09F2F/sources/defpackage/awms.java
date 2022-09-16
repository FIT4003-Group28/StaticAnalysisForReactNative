package defpackage;
/* compiled from: PG */
/* renamed from: awms  reason: default package */
/* loaded from: classes2.dex */
public final class awms {
    private final awmw a;

    public awms(awmw awmwVar) {
        this.a = awmwVar;
    }

    public static awmr b(awmw awmwVar) {
        return new awmr(awmwVar.mo52toBuilder());
    }

    public final amvn a() {
        amvl amvlVar = new amvl();
        awmv awmvVar = this.a.b;
        if (awmvVar == null) {
            awmvVar = awmv.a;
        }
        new awmq((awmv) awmvVar.mo52toBuilder().mo39build());
        amvlVar.j(new amvl().g());
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awms) && this.a.equals(((awms) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("GestureOptionsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

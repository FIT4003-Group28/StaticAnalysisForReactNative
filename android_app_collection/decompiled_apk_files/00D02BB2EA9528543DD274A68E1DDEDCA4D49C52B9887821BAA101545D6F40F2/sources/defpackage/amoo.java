package defpackage;
/* compiled from: PG */
/* renamed from: amoo  reason: default package */
/* loaded from: classes.dex */
public final class amoo {
    public final alyh a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public amoo(alyh alyhVar, long j, boolean z, boolean z2) {
        this.a = alyhVar;
        this.b = z;
        this.d = j;
        this.c = z2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        long j = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 80);
        sb.append(valueOf);
        sb.append(", isLocalRequest=");
        sb.append(z);
        sb.append(", isAncestorRequest=");
        sb.append(z2);
        sb.append(", fetchToken=");
        sb.append(j);
        return sb.toString();
    }
}

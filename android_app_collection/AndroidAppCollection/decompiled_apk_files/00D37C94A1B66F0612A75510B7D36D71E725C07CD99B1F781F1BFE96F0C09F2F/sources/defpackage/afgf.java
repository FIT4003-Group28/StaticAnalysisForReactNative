package defpackage;
/* compiled from: PG */
/* renamed from: afgf  reason: default package */
/* loaded from: classes.dex */
public final class afgf {
    public final long a;
    public final aetw b;

    public afgf(aetw aetwVar, long j) {
        this.b = aetwVar;
        this.a = j;
    }

    public final afgf a(aetv aetvVar) {
        aetw aetwVar = new aetw(this.b);
        aetwVar.g = aetvVar;
        aetwVar.a = this.b.a.a(aetvVar);
        return new afgf(aetwVar, this.a);
    }

    public final String toString() {
        aetw aetwVar = this.b;
        String str = aetwVar.d;
        String valueOf = String.valueOf(aetwVar.c);
        String valueOf2 = String.valueOf(this.b.b);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 28 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("QueuedVideo(cpn=");
        sb.append(str);
        sb.append(" position=");
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}

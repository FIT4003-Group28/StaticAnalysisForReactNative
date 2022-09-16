package defpackage;
/* compiled from: PG */
/* renamed from: acyh  reason: default package */
/* loaded from: classes.dex */
final class acyh {
    final adil a;
    final adip b;
    public final long c = System.currentTimeMillis();

    public acyh(adil adilVar, adip adipVar) {
        this.a = adilVar;
        this.b = adipVar;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}

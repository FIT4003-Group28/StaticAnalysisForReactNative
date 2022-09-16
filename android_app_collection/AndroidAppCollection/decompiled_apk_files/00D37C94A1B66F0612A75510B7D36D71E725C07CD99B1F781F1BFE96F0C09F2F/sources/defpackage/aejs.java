package defpackage;
/* compiled from: PG */
/* renamed from: aejs  reason: default package */
/* loaded from: classes.dex */
final class aejs extends aest {
    final long a;

    public aejs(String str, long j) {
        super(str);
        this.a = j;
    }

    @Override // defpackage.aest, defpackage.afip
    public final String a(long j) {
        long j2 = this.a;
        String str = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("t.");
        sb.append(j2 - j);
        sb.append(";");
        sb.append(str);
        return sb.toString();
    }
}

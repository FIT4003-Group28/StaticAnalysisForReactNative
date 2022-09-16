package defpackage;
/* compiled from: PG */
/* renamed from: afem  reason: default package */
/* loaded from: classes.dex */
final class afem implements afip {
    private final long a;

    public afem(long j) {
        this.a = j;
    }

    @Override // defpackage.afip
    public final String a(long j) {
        StringBuilder sb = new StringBuilder();
        double d = this.a - j;
        Double.isNaN(d);
        sb.append(d / 1000.0d);
        return sb.toString();
    }
}

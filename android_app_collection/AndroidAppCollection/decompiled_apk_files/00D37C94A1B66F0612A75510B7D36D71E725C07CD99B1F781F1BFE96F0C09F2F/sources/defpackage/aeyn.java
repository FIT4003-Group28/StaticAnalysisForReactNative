package defpackage;
/* compiled from: PG */
/* renamed from: aeyn  reason: default package */
/* loaded from: classes.dex */
public final class aeyn extends ate implements afma {
    public final String d;

    public aeyn(int i, long j, asy asyVar) {
        super(asyVar, 2);
        StringBuilder sb = new StringBuilder(40);
        sb.append("http.");
        sb.append(i);
        sb.append(";sq.");
        sb.append(j);
        this.d = sb.toString();
    }

    @Override // defpackage.afma
    public final String a(boolean z) {
        return "net.nocontent";
    }

    @Override // defpackage.afma
    public final String b() {
        return this.d;
    }
}

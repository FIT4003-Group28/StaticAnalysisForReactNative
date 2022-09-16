package defpackage;
/* compiled from: PG */
/* renamed from: aeyo  reason: default package */
/* loaded from: classes.dex */
public final class aeyo extends afkc implements afma {
    public final String d;

    public aeyo(asy asyVar, long j) {
        super(asyVar, "x-segment-lmt");
        StringBuilder sb = new StringBuilder(23);
        sb.append("sq.");
        sb.append(j);
        this.d = sb.toString();
    }

    @Override // defpackage.afma
    public final String a(boolean z) {
        return "manifestless.lmt";
    }

    @Override // defpackage.afma
    public final String b() {
        return this.d;
    }
}

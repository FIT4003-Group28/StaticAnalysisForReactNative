package defpackage;
/* compiled from: PG */
/* renamed from: ball  reason: default package */
/* loaded from: classes2.dex */
public final class ball implements balr, balq {
    public static final ball a = new ball("");
    private final String b;

    public ball(String str) {
        this.b = str;
    }

    @Override // defpackage.balr
    public final int a(baih baihVar) {
        return this.b.length();
    }

    @Override // defpackage.balr
    public final int b(baih baihVar, int i) {
        return 0;
    }

    @Override // defpackage.balr
    public final void c(StringBuffer stringBuffer, baih baihVar) {
        stringBuffer.append(this.b);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: axvs  reason: default package */
/* loaded from: classes3.dex */
public final class axvs extends axwm {
    public ddho a;
    public ddho b;
    public Runnable c;
    public Runnable d;
    private int e;

    @Override // defpackage.axwm
    public final void b(int i) {
        this.e = i;
    }

    @Override // defpackage.axwm
    public final axwn a() {
        String str = this.e == 0 ? " source" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new axvt(this.a, this.b, this.e, this.c, this.d);
    }
}

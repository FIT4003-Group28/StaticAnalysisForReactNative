package defpackage;
/* compiled from: PG */
/* renamed from: csmc  reason: default package */
/* loaded from: classes5.dex */
public final class csmc extends csmd {
    protected final csme a;
    protected final Runnable b = new csmb(this);

    public csmc(csme csmeVar) {
        this.a = csmeVar;
    }

    @Override // defpackage.csmd
    public final void a() {
        this.a.d(this.b);
    }

    @Override // defpackage.csmd
    public final void b() {
        this.a.c(this.b);
    }
}

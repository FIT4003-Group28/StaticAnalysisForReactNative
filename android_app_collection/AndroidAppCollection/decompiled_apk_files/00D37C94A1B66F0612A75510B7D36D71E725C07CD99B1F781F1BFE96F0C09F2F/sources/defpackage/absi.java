package defpackage;
/* compiled from: PG */
/* renamed from: absi  reason: default package */
/* loaded from: classes.dex */
public final class absi implements absu {
    public boolean a;
    public absw b;
    private final absu c;
    private final absw d = new absh(this);

    public absi(absu absuVar) {
        this.c = absuVar;
    }

    @Override // defpackage.absu
    public final void c(abry abryVar) {
        this.c.c(abryVar);
    }

    @Override // defpackage.absu
    public final boolean e(boolean z, absw abswVar, abry abryVar) {
        this.b = abswVar;
        return this.c.e(z, this.d, abryVar);
    }
}

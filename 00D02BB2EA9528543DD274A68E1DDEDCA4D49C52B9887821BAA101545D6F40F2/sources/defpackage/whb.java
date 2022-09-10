package defpackage;
/* compiled from: PG */
/* renamed from: whb  reason: default package */
/* loaded from: classes7.dex */
public final class whb implements wgh {
    private final wgd a;
    private final btvo b;
    private final qef c;

    public whb(wgd wgdVar, btvo btvoVar, qef qefVar) {
        this.a = wgdVar;
        this.b = btvoVar;
        this.c = qefVar;
    }

    @Override // defpackage.wgh
    public final boolean a() {
        if (this.a.a()) {
            return (this.b.getPassiveAssistParameters().m() || this.b.getSavedTripsParameters().c) && !this.c.a();
        }
        return false;
    }

    @Override // defpackage.wgh
    public final boolean b() {
        return this.a.a() && this.b.getSavedTripsParameters().b && !this.c.a();
    }

    @Override // defpackage.wgh
    public final boolean c() {
        return false;
    }
}

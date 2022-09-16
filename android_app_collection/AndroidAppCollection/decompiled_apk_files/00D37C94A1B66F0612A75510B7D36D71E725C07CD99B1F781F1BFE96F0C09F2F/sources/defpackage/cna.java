package defpackage;
/* compiled from: PG */
/* renamed from: cna  reason: default package */
/* loaded from: classes2.dex */
public final class cna implements cnr {
    private final cnc a;

    public cna() {
        this(new cnd(1));
    }

    public cna(cnc cncVar) {
        this.a = cncVar;
    }

    @Override // defpackage.cnr
    public final cnq c(cny cnyVar) {
        return new cne(this.a);
    }

    @Override // defpackage.cnr
    public final void d() {
    }
}

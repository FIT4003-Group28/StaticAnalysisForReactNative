package defpackage;
/* compiled from: PG */
/* renamed from: aaab  reason: default package */
/* loaded from: classes2.dex */
public final class aaab extends itb {
    public final cjqy a;
    public final dxio<begg> b;
    public boolean c = true;
    private final btrm d;

    public aaab(btrm btrmVar, cjqy cjqyVar, dxio<begg> dxioVar) {
        this.d = btrmVar;
        this.a = cjqyVar;
        this.b = dxioVar;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        btrm btrmVar = this.d;
        dceq a = dcet.a();
        a.b(alhk.class, new aaac(0, alhk.class, this, bvrj.UI_THREAD));
        a.b(alhj.class, new aaac(1, alhj.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.itb
    public final void Po() {
        this.d.a(this);
        super.Po();
    }
}

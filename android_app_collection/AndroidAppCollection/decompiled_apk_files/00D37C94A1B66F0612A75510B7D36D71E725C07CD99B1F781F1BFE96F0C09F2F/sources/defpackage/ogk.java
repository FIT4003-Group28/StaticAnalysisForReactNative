package defpackage;
/* compiled from: PG */
/* renamed from: ogk  reason: default package */
/* loaded from: classes3.dex */
public abstract class ogk extends okb implements axoo {
    private volatile axnv WB;
    private final Object x = new Object();

    public ogk() {
        addOnContextAvailableListener(new ogj(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        throw null;
    }

    @Override // defpackage.abp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.r(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axoo
    /* renamed from: l */
    public final axnv lH() {
        if (this.WB == null) {
            synchronized (this.x) {
                if (this.WB == null) {
                    this.WB = m();
                }
            }
        }
        return this.WB;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    protected axnv m() {
        throw null;
    }
}

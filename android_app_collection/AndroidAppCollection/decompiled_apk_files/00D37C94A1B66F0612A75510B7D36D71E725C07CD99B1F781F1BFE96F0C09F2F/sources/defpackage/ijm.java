package defpackage;
/* compiled from: PG */
/* renamed from: ijm  reason: default package */
/* loaded from: classes3.dex */
public abstract class ijm extends ike implements axoo {
    private volatile axnv g;
    private final Object h = new Object();
    public boolean x = false;

    public ijm() {
        addOnContextAvailableListener(new ijl(this));
    }

    @Override // defpackage.abp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.r(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.axoo
    /* renamed from: v */
    public final axnv lH() {
        if (this.g == null) {
            synchronized (this.h) {
                if (this.g == null) {
                    this.g = new axnv(this);
                }
            }
        }
        return this.g;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: ijo  reason: default package */
/* loaded from: classes3.dex */
public abstract class ijo extends ike implements axoo {
    private volatile axnv h;
    private final Object i = new Object();
    public boolean g = false;

    public ijo() {
        addOnContextAvailableListener(new ijn(this));
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
    /* renamed from: q */
    public final axnv lH() {
        if (this.h == null) {
            synchronized (this.i) {
                if (this.h == null) {
                    this.h = new axnv(this);
                }
            }
        }
        return this.h;
    }
}

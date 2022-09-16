package defpackage;
/* compiled from: PG */
/* renamed from: adum  reason: default package */
/* loaded from: classes.dex */
public abstract class adum extends aczn implements axoo {
    private volatile axnv b;
    private final Object c = new Object();
    public boolean a = false;

    public adum() {
        addOnContextAvailableListener(new adul(this));
    }

    @Override // defpackage.abp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.r(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axoo
    /* renamed from: i */
    public final axnv lH() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axnv(this);
                }
            }
        }
        return this.b;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }
}

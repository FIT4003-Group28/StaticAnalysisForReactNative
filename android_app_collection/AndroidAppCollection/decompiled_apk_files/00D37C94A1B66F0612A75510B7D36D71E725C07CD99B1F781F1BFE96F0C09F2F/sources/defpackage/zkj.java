package defpackage;
/* compiled from: PG */
/* renamed from: zkj  reason: default package */
/* loaded from: classes4.dex */
public class zkj extends oa implements axoo {
    private volatile axnv a;
    private final Object b = new Object();
    public boolean m = false;

    public zkj() {
        addOnContextAvailableListener(new zki(this));
    }

    @Override // defpackage.abp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.r(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axoo
    /* renamed from: k */
    public final axnv lH() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axnv(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }
}

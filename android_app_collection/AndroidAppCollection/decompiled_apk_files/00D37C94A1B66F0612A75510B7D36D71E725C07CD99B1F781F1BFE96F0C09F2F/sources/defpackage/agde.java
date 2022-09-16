package defpackage;
/* compiled from: PG */
/* renamed from: agde  reason: default package */
/* loaded from: classes.dex */
public class agde extends oa implements axoo {
    private volatile axnv b;
    private final Object c = new Object();
    public boolean a = false;

    public agde() {
        addOnContextAvailableListener(new agdd(this));
    }

    @Override // defpackage.axoo
    /* renamed from: a */
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

    @Override // defpackage.abp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.r(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }
}

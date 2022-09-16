package defpackage;
/* compiled from: PG */
/* renamed from: lci  reason: default package */
/* loaded from: classes3.dex */
public class lci extends oa implements axoo {
    private volatile axnv b;
    private final Object c = new Object();
    public boolean a = false;

    public lci() {
        addOnContextAvailableListener(new lch(this));
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
    /* renamed from: ou */
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
}

package defpackage;
/* compiled from: PG */
/* renamed from: goy  reason: default package */
/* loaded from: classes3.dex */
public class goy extends oa implements axoo {
    private volatile axnv a;
    private final Object b = new Object();
    public boolean c = false;

    public goy() {
        addOnContextAvailableListener(new gox(this));
    }

    @Override // defpackage.axoo
    /* renamed from: b */
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

    @Override // defpackage.abp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.r(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }
}

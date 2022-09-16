package defpackage;
/* compiled from: PG */
/* renamed from: gpa  reason: default package */
/* loaded from: classes3.dex */
public class gpa extends vih implements axoo {
    private volatile axnv b;
    private final Object c = new Object();
    public boolean a = false;

    public gpa() {
        addOnContextAvailableListener(new goz(this));
    }

    @Override // defpackage.axoo
    /* renamed from: a */
    public final axnv lH() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = b();
                }
            }
        }
        return this.b;
    }

    protected axnv b() {
        throw null;
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

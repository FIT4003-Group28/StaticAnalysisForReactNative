package defpackage;
/* compiled from: PG */
/* renamed from: gvc  reason: default package */
/* loaded from: classes3.dex */
public class gvc extends oa implements axoo {
    private volatile axnv b;
    private final Object c = new Object();
    public boolean a = false;

    public gvc() {
        addOnContextAvailableListener(new gvb(this));
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

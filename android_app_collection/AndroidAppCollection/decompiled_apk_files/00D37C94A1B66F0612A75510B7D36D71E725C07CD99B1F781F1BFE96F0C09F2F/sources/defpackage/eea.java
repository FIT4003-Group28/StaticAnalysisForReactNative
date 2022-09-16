package defpackage;
/* compiled from: PG */
/* renamed from: eea  reason: default package */
/* loaded from: classes3.dex */
public class eea extends vih implements axoo {
    private volatile axnv a;
    private final Object b = new Object();

    public eea() {
        addOnContextAvailableListener(new edz(this));
    }

    @Override // defpackage.axoo
    /* renamed from: a */
    public final axnv lH() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = b();
                }
            }
        }
        return this.a;
    }

    protected axnv b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
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

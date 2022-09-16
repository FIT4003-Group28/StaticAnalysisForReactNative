package defpackage;
/* compiled from: PG */
/* renamed from: lfo  reason: default package */
/* loaded from: classes3.dex */
public abstract class lfo extends lgs implements axoo {
    private volatile axnv b;
    private final Object c = new Object();
    public boolean a = false;

    public lfo() {
        addOnContextAvailableListener(new lfn(this));
    }

    @Override // defpackage.axoo
    /* renamed from: c */
    public final axnv lH() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = f();
                }
            }
        }
        return this.b;
    }

    protected axnv f() {
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

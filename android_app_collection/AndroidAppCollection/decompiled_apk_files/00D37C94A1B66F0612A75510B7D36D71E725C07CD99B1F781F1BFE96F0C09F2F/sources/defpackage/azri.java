package defpackage;
/* compiled from: PG */
/* renamed from: azri  reason: default package */
/* loaded from: classes2.dex */
public abstract class azri extends azrg {
    private final azrd _context;
    private transient azqy intercepted;

    public azri(azqy azqyVar) {
        this(azqyVar, azqyVar != null ? azqyVar.getContext() : null);
    }

    @Override // defpackage.azqy
    public azrd getContext() {
        azrd azrdVar = this._context;
        azrdVar.getClass();
        return azrdVar;
    }

    public final azqy intercepted() {
        azqy azqyVar = this.intercepted;
        if (azqyVar == null) {
            azqz azqzVar = (azqz) getContext().get(azqz.a);
            azqyVar = azqzVar != null ? azqzVar.a(this) : this;
            this.intercepted = azqyVar;
        }
        return azqyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azrg
    public void releaseIntercepted() {
        azqy azqyVar = this.intercepted;
        if (azqyVar != null && azqyVar != this) {
            azra azraVar = getContext().get(azqz.a);
            azraVar.getClass();
            ((azqz) azraVar).b(azqyVar);
        }
        this.intercepted = azrh.a;
    }

    public azri(azqy azqyVar, azrd azrdVar) {
        super(azqyVar);
        this._context = azrdVar;
    }
}

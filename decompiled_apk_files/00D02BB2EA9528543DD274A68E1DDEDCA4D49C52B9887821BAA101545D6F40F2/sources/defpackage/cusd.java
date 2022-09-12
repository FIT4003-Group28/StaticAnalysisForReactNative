package defpackage;
/* compiled from: PG */
/* renamed from: cusd  reason: default package */
/* loaded from: classes5.dex */
public final class cusd<T, U> extends cuss<T> {
    public final dbrn<U, cuss<T>> a;
    public final cusr<T> b = new cusr(this) { // from class: cusb
        private final cusd a;

        {
            this.a = this;
        }

        @Override // defpackage.cusr
        public final void a(Object obj) {
            this.a.a(obj);
        }
    };
    public boolean c;
    public cuss<T> d;
    private final dehn<U> e;
    private final dehp h;

    public cusd(dehn<U> dehnVar, dbrn<U, cuss<T>> dbrnVar, dehp dehpVar) {
        this.e = dehnVar;
        this.a = dbrnVar;
        this.h = dehpVar;
    }

    @Override // defpackage.cuss
    protected final synchronized void b() {
        this.c = false;
        deha.q(this.e, new cusc(this), this.h);
    }

    @Override // defpackage.cuss
    protected final synchronized void c() {
        this.c = true;
        cuss<T> cussVar = this.d;
        if (cussVar != null) {
            cussVar.g(this.b);
        }
    }
}

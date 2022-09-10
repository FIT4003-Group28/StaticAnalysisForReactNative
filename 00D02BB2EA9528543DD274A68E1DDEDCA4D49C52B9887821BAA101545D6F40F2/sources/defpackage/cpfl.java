package defpackage;
/* compiled from: PG */
/* renamed from: cpfl  reason: default package */
/* loaded from: classes5.dex */
public final class cpfl extends cpfd<cpfj> {
    public final cpfo b;
    public final cpfh a = new cpfh();
    public final Object c = new Object();
    public boolean d = true;

    private cpfl() {
        throw new IllegalStateException("Default constructor called");
    }

    @Override // defpackage.cpfd
    public final void a() {
        super.a();
        synchronized (this.c) {
            if (!this.d) {
                return;
            }
            this.b.d();
            this.d = false;
        }
    }

    protected final void finalize() {
        try {
            synchronized (this.c) {
                if (this.d) {
                    a();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public cpfl(cpfo cpfoVar) {
        this.b = cpfoVar;
    }
}

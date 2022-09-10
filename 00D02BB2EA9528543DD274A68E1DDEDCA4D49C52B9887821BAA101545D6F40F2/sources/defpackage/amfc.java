package defpackage;
/* compiled from: PG */
/* renamed from: amfc  reason: default package */
/* loaded from: classes2.dex */
final class amfc implements btzi<dxai, dxam> {
    final amfu a;
    volatile dxal b;
    final /* synthetic */ amfd c;

    public amfc(amfd amfdVar, amfu amfuVar) {
        this.c = amfdVar;
        this.a = amfuVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dxai> btzrVar, btzy btzyVar) {
        if (dbsd.a(btzyVar, btzy.b)) {
            this.a.c(2);
        } else {
            this.a.c(1);
        }
        this.a.e(false);
        this.a.q();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dxai> btzrVar, dxam dxamVar) {
        dxam dxamVar2 = dxamVar;
        if (dxamVar2.a.size() == 0) {
            this.a.c(1);
            this.a.e(false);
            this.a.q();
            return;
        }
        this.b = dxamVar2.a.get(0);
        synchronized (this.a) {
            if (this.b != null) {
                boolean p = this.a.p(this.b);
                if (this.c.n != null && p && this.a.c) {
                    this.c.f.execute(new Runnable(this) { // from class: amfb
                        private final amfc a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            amfc amfcVar = this.a;
                            if (amfcVar.c.n != null) {
                                amfcVar.c.n.b(amfcVar.b);
                            }
                        }
                    });
                }
            }
            this.a.e(false);
            this.a.q();
        }
    }
}

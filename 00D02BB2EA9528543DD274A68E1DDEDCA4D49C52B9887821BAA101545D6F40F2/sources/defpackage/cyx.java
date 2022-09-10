package defpackage;
/* compiled from: PG */
/* renamed from: cyx  reason: default package */
/* loaded from: classes.dex */
public final class cyx implements cyy, cjqw, cjqx {
    private final dxio<gdy> a;
    private final dehp b;
    @dzsi
    private dehn<Void> c;

    public cyx(dxio<gdy> dxioVar, dehp dehpVar) {
        this.a = dxioVar;
        this.b = dehpVar;
    }

    public final void b(cyz cyzVar) {
        this.a.a().a.a.d(null, cyzVar.aw, null, false);
    }

    @Override // defpackage.cjqw
    public final void c(cjte cjteVar, cjtd cjtdVar) {
        ddxx c;
        String str = cjtdVar.d;
        int i = -1;
        int i2 = (str == null || (c = cjrx.c(str)) == null) ? -1 : c.d;
        ddho ddhoVar = cjtdVar.g;
        if (i2 != -1) {
            i = i2;
        } else if (ddhoVar != null) {
            i = ddhoVar.b();
        }
        a(cyz.a(i));
    }

    @Override // defpackage.cjqx
    public final void d(ddhn ddhnVar) {
        a(cyz.a(ddhnVar.b()));
    }

    public final void a(@dzsi final cyz cyzVar) {
        if (cyzVar == null) {
            return;
        }
        synchronized (this) {
            dehn<Void> dehnVar = this.c;
            if (dehnVar != null) {
                if (dehnVar.isDone()) {
                    this.c = deha.a(null);
                    b(cyzVar);
                } else {
                    this.c = deew.h(this.c, new dbrn(this, cyzVar) { // from class: cyw
                        private final cyx a;
                        private final cyz b;

                        {
                            this.a = this;
                            this.b = cyzVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            Void r3 = (Void) obj;
                            this.a.b(this.b);
                            return null;
                        }
                    }, dege.a);
                }
            } else {
                this.c = this.b.b(new Runnable(this, cyzVar) { // from class: cyv
                    private final cyx a;
                    private final cyz b;

                    {
                        this.a = this;
                        this.b = cyzVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(this.b);
                    }
                }, null);
            }
        }
    }
}

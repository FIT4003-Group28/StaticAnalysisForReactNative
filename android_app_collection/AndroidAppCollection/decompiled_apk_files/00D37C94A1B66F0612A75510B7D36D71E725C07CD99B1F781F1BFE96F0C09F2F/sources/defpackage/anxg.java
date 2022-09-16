package defpackage;

import com.google.firebase.appindexing.internal.MutateRequest;
/* compiled from: PG */
/* renamed from: anxg  reason: default package */
/* loaded from: classes.dex */
public final class anxg {
    public final MutateRequest a;
    public final rvh b = new rvh();
    final /* synthetic */ anxh c;

    public anxg(anxh anxhVar, MutateRequest mutateRequest) {
        this.c = anxhVar;
        this.a = mutateRequest;
    }

    public final void a() {
        synchronized (this.c.b) {
            qnm.j(this.c.c == 0);
            this.c.c = 1;
        }
        this.c.a.v(new anxf(this)).o(this.c, new ruw() { // from class: anxd
            @Override // defpackage.ruw
            public final void c(Exception exc) {
                anxg anxgVar;
                anxg anxgVar2 = anxg.this;
                synchronized (anxgVar2.c.b) {
                    if (anxgVar2.c.b.peek() == anxgVar2) {
                        anxgVar2.c.b.remove();
                        anxh anxhVar = anxgVar2.c;
                        anxhVar.c = 0;
                        anxgVar = (anxg) anxhVar.b.peek();
                    } else {
                        anxgVar = null;
                    }
                }
                anxgVar2.b.c(exc);
                if (anxgVar != null) {
                    anxgVar.a();
                }
            }
        });
    }
}

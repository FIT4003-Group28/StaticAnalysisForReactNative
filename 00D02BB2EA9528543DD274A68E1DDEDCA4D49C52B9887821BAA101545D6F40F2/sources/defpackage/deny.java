package defpackage;

import com.google.firebase.appindexing.internal.MutateRequest;
/* compiled from: PG */
/* renamed from: deny  reason: default package */
/* loaded from: classes6.dex */
final class deny {
    public final MutateRequest a;
    public final cpct<Void> b = new cpct<>();
    final /* synthetic */ denz c;

    public deny(denz denzVar, MutateRequest mutateRequest) {
        this.c = denzVar;
        this.a = mutateRequest;
    }

    public final void a() {
        synchronized (this.c.b) {
            cnwc.b(this.c.c == 0);
            this.c.c = 1;
        }
        this.c.a.d(new denx(this)).o(this.c, new cpci(this) { // from class: denv
            private final deny a;

            {
                this.a = this;
            }

            @Override // defpackage.cpci
            public final void d(Exception exc) {
                deny denyVar;
                deny denyVar2 = this.a;
                synchronized (denyVar2.c.b) {
                    if (denyVar2.c.b.peek() == denyVar2) {
                        denyVar2.c.b.remove();
                        denz denzVar = denyVar2.c;
                        denzVar.c = 0;
                        denyVar = denzVar.b.peek();
                    } else {
                        denyVar = null;
                    }
                }
                denyVar2.b.d(exc);
                if (denyVar != null) {
                    denyVar.a();
                }
            }
        });
    }
}

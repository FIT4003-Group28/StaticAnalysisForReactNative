package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agbr  reason: default package */
/* loaded from: classes.dex */
public final class agbr implements agbt {
    public final Context a;
    private final Executor b;
    private final azpw c = azpw.Y();
    private boolean d = false;
    private final aacz e;

    public agbr(Context context, aacz aaczVar, Executor executor) {
        this.a = context;
        this.e = aaczVar;
        this.b = executor;
    }

    @Override // defpackage.agbt
    public final void a(final anwk anwkVar) {
        if (this.d) {
            return;
        }
        this.d = true;
        ayos v = ayos.A(new Callable() { // from class: agbq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                agbr agbrVar = agbr.this;
                anwg.c(agbrVar.a, anwkVar);
                zep.g("FirebaseApp initialization complete");
                return true;
            }
        }).K(azpj.b(this.b)).v(aaga.g);
        asxj asxjVar = this.e.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        int i = asxjVar.aq;
        StringBuilder sb = new StringBuilder(68);
        sb.append("Initializing Async FirebaseApp client... (");
        sb.append(i);
        sb.append(" seconds delay)");
        zep.g(sb.toString());
        if (i > 0) {
            v = v.t(i, TimeUnit.SECONDS);
        }
        v.W(this.c);
    }

    @Override // defpackage.agbt
    public final boolean b() {
        if (this.c.ac()) {
            return ((Boolean) this.c.Z()).booleanValue();
        }
        return false;
    }
}

package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: arkl  reason: default package */
/* loaded from: classes2.dex */
public final class arkl implements arka {
    private final czz a;
    private final arlk b;
    @dzsi
    private dzak c;

    public arkl(czz czzVar, arlk arlkVar) {
        this.a = czzVar;
        this.b = arlkVar;
    }

    @Override // defpackage.arka
    public final void a(Bundle bundle) {
    }

    @Override // defpackage.arka
    public final void b() {
        dzgj<dam> dzgjVar;
        final dan a = this.a.m().a();
        a.d();
        arlk arlkVar = this.b;
        synchronized (arlkVar.f) {
            dzgjVar = arlkVar.e.a;
        }
        a.getClass();
        this.c = dzgjVar.SW(new dzaz(a) { // from class: arkk
            private final dan a;

            {
                this.a = a;
            }

            @Override // defpackage.dzaz
            public final void SR(Object obj) {
                this.a.c((dam) obj);
            }
        });
    }

    @Override // defpackage.arka
    public final void c() {
        this.a.m().a().e();
        dzak dzakVar = this.c;
        if (dzakVar != null) {
            dzbd.e((AtomicReference) dzakVar);
            this.c = null;
        }
    }

    @Override // defpackage.arka
    public final void d(Bundle bundle) {
    }

    @Override // defpackage.arka
    public final void e(Configuration configuration) {
    }

    @Override // defpackage.arka
    public final void f() {
    }

    @Override // defpackage.arka
    public final void g(atlq atlqVar, atlq atlqVar2) {
    }
}

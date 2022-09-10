package defpackage;

import android.app.Dialog;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: afcz  reason: default package */
/* loaded from: classes.dex */
final class afcz implements afdm {
    final /* synthetic */ Intent a;
    final /* synthetic */ Dialog b;
    final /* synthetic */ afdd c;

    public afcz(afdd afddVar, Intent intent, Dialog dialog) {
        this.c = afddVar;
        this.a = intent;
        this.b = dialog;
    }

    @Override // defpackage.afdm
    public final void a() {
        dcqe dcqeVar = afdd.k;
        ((ckcn) this.c.q.a().a(ckfn.e)).a();
        this.b.dismiss();
    }

    @Override // defpackage.afdm
    public final void b() {
        dcqe dcqeVar = afdd.k;
        gga ggaVar = this.c.o;
        final Intent intent = this.a;
        ggaVar.B(new Runnable(this, intent) { // from class: afcy
            private final afcz a;
            private final Intent b;

            {
                this.a = this;
                this.b = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afcz afczVar = this.a;
                afczVar.c.f(false, this.b);
            }
        });
        ((ckcn) this.c.q.a().a(ckfn.f)).a();
        this.b.dismiss();
    }
}

package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afar  reason: default package */
/* loaded from: classes2.dex */
final class afar implements degu<Object> {
    final /* synthetic */ boolean a;
    final /* synthetic */ Intent b;
    final /* synthetic */ afas c;

    public afar(afas afasVar, boolean z, Intent intent) {
        this.c = afasVar;
        this.a = z;
        this.b = intent;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i = afas.j;
        bvoo.j(th);
    }

    @Override // defpackage.degu
    public final void b(@dzsi Object obj) {
        btlu j;
        if ((!this.c.i.z(bvjk.q, "").equals("") && this.c.g.d()) || !this.a) {
            if (this.a && (j = this.c.c.a().j()) != null) {
                this.c.i.ac(bvjk.j, j.d);
                this.c.i.aq();
            }
            afas afasVar = this.c;
            final boolean z = this.a;
            final Intent intent = this.b;
            Runnable runnable = new Runnable(this, intent, z) { // from class: afap
                private final afar a;
                private final Intent b;
                private final boolean c;

                {
                    this.a = this;
                    this.b = intent;
                    this.c = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    afar afarVar = this.a;
                    Intent intent2 = this.b;
                    boolean z2 = this.c;
                    afas afasVar2 = afarVar.c;
                    new afei(afasVar2.a, afasVar2.e).b();
                    ((ckcn) afarVar.c.d.a().a(ckfn.a)).a();
                    afarVar.c.d.a().h();
                    afas afasVar3 = afarVar.c;
                    afasVar3.a.getApplicationContext().startActivity(afasVar3.o(intent2, z2));
                    afasVar3.a.finish();
                }
            };
            final boolean z2 = this.a;
            afasVar.l(z, runnable, new Runnable(this, z2) { // from class: afaq
                private final afar a;
                private final boolean b;

                {
                    this.a = this;
                    this.b = z2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    afar afarVar = this.a;
                    boolean z3 = this.b;
                    int i = afas.j;
                    afarVar.c.m(z3);
                    if (!z3) {
                        afarVar.c.h.a().c();
                    }
                }
            });
            return;
        }
        this.c.g.d();
        this.c.i.z(bvjk.q, "");
        this.c.i.z(bvjk.q, "");
        this.c.p();
        this.c.m(this.a);
        String str = "false";
        String str2 = true != this.a ? str : "true";
        String str3 = true != this.c.g.d() ? str : "true";
        if (true == this.c.i.z(bvjk.q, "").isEmpty()) {
            str = "true";
        }
        StringBuilder sb = new StringBuilder(str2.length() + 150 + str3.length() + str.length());
        sb.append("Incognito Zwieback or ClientParameters precache failure!  isInIncognitoAfterToggle: ");
        sb.append(str2);
        sb.append("  hasIncognitoClientParameters(): ");
        sb.append(str3);
        sb.append("   empty INCOGNITO_ZWIEBACK_ID: ");
        sb.append(str);
        bvoo.j(new bvon("%s", sb.toString()));
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: ajey  reason: default package */
/* loaded from: classes.dex */
public final class ajey {
    public volatile boolean a = false;
    public final /* synthetic */ ajfa b;
    public wnn c;

    public ajey(ajfa ajfaVar) {
        this.b = ajfaVar;
        ajfaVar.c.d();
    }

    public final void a() {
        b();
        if (this.c != null && this.a) {
            this.a = false;
            this.b.a.c();
        }
        final ajfa ajfaVar = this.b;
        ajfaVar.b.execute(new Runnable() { // from class: ajes
            @Override // java.lang.Runnable
            public final void run() {
                ajfa ajfaVar2 = ajfa.this;
                if (this == ajfaVar2.e) {
                    ajfaVar2.e = null;
                    ajfaVar2.f = null;
                    ajfaVar2.b();
                }
            }
        });
        this.b.e = null;
        this.b.b();
    }

    public final void b() {
        if (this.b.e == this) {
            return;
        }
        throw new ajez();
    }
}

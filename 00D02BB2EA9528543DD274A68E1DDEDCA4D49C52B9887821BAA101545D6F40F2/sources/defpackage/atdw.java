package defpackage;
/* compiled from: PG */
/* renamed from: atdw  reason: default package */
/* loaded from: classes2.dex */
public final class atdw extends atcy {
    private final acwo a;
    @dzsi
    private final String c;
    private atdt d;
    private boolean e;
    private boolean f;

    public atdw(atcu atcuVar, atcw atcwVar, acwo acwoVar, @dzsi String str) {
        super(atcuVar, atcwVar);
        this.d = null;
        this.e = false;
        this.f = false;
        this.a = acwoVar;
        this.c = str;
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        if (!this.e) {
            if (!atlqVar.b()) {
                return;
            }
            this.e = true;
            if (this.d == null) {
                if (atlqVar.e() == dqvj.WALK) {
                    this.d = new atdv();
                } else {
                    this.d = new atdu();
                }
            }
            this.d.a(atlqVar);
        }
        atdt atdtVar = this.d;
        if (atdtVar != null) {
            if (this.e && !atdtVar.d()) {
                return;
            }
            this.d.b(atlqVar);
            crqf crqfVar = atlqVar.m;
            if ((crqfVar != null && !crqfVar.j && atlqVar.q == null) || this.f || !this.d.e()) {
                return;
            }
            this.a.i(this.d.c(), this.c);
            this.f = true;
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: sgz  reason: default package */
/* loaded from: classes7.dex */
final class sgz implements degu<amte> {
    final /* synthetic */ shb a;

    public sgz(shb shbVar) {
        this.a = shbVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        shb shbVar = this.a;
        shbVar.g = false;
        if (th instanceof qsk) {
            shbVar.i = true;
            shbVar.h = false;
        } else if (th instanceof qsl) {
            shbVar.i = false;
            shbVar.h = true;
        }
        cqkx.p(shbVar);
        this.a.w();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi amte amteVar) {
        amte amteVar2 = amteVar;
        if (amteVar2 != null) {
            this.a.u(amteVar2);
        } else {
            a(new NullPointerException());
        }
    }
}

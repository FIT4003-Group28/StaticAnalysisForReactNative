package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;
/* compiled from: PG */
/* renamed from: aswn  reason: default package */
/* loaded from: classes2.dex */
public final class aswn implements asmo {
    public final ff a;
    public final asmn b;
    public final asme c;
    @dzsi
    public Toast d;
    private final axrx g;
    private final axru h;
    private final asxw i;
    private boolean j = false;
    public int f = 1;
    final asxv e = new aswm(this);

    public aswn(ff ffVar, axrx axrxVar, axru axruVar, asmn asmnVar, asme asmeVar, asxw asxwVar) {
        dbsk.s(ffVar);
        this.a = ffVar;
        this.g = axrxVar;
        this.h = axruVar;
        this.b = asmnVar;
        this.c = asmeVar;
        this.i = asxwVar;
    }

    @Override // defpackage.asmo
    public final void NZ(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void b() {
        this.i.F(this.e);
        boolean a = this.h.a("android.permission.ACCESS_FINE_LOCATION");
        if (!this.j) {
            this.j = true;
            this.g.f(new aswl(this));
        } else if (!a) {
            this.b.Qa();
        } else {
            this.c.a();
        }
    }

    @Override // defpackage.asmo
    public final void c() {
        this.i.G(this.e);
    }
}

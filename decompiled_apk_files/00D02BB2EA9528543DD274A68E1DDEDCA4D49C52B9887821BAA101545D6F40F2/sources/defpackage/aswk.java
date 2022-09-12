package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: aswk  reason: default package */
/* loaded from: classes2.dex */
public final class aswk implements asmo {
    public final aszs a;
    private final List<asmo> b;
    private final asxm c;

    public aswk(List<asmo> list, asxm asxmVar, aszs aszsVar) {
        this.b = dcdc.r(list);
        this.c = asxmVar;
        this.a = aszsVar;
    }

    @Override // defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        for (asmo asmoVar : this.b) {
            asmoVar.NZ(bundle);
        }
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
        for (asmo asmoVar : this.b) {
            asmoVar.Qo(configuration);
        }
    }

    @Override // defpackage.asmo
    public final void Qp() {
        for (asmo asmoVar : this.b) {
            asmoVar.Qp();
        }
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
        for (asmo asmoVar : this.b) {
            asmoVar.Qr(bundle);
        }
    }

    @Override // defpackage.asmo
    public final void b() {
        for (asmo asmoVar : this.b) {
            asmoVar.b();
        }
        asxm asxmVar = this.c;
        dbsk.l(asxmVar.d);
        asxmVar.u();
        dbsk.t((aszm) asxmVar.c, "currentState");
        asxmVar.e.j((aszm) asxmVar.c);
        asle<?> b = ((aszl) asxmVar.a).c.b();
        b.c = false;
        b.c();
        aslf a = b.a();
        asxmVar.g(a);
        ((aszl) asxmVar.a).c = a;
    }

    @Override // defpackage.asmo
    public final void c() {
        for (asmo asmoVar : this.b) {
            asmoVar.c();
        }
    }
}

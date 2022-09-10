package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: auea  reason: default package */
/* loaded from: classes2.dex */
public final class auea implements asmo, atcv {
    public final akox a;
    public final Context b;
    public final akty c;
    public final amrg d;
    public final amrl e;
    public final btrm f;
    public final cjqy g;
    public final bvjj h;
    public final btvo i;
    public final cqat j;
    public final List<aktc> k = new ArrayList();
    @dzsi
    public alfe l;
    public boolean m;

    public auea(akox akoxVar, Context context, btrm btrmVar, cjqy cjqyVar, bvjj bvjjVar, btvo btvoVar, cqat cqatVar) {
        this.a = akoxVar;
        this.b = context;
        this.c = akoxVar.aj().aC();
        this.d = akoxVar.aj().ak();
        amsd amsdVar = new amsd();
        amsdVar.c(new amrq());
        amsdVar.d(10, new amrm());
        amsdVar.e(1, new amrp());
        this.e = new btti(amsdVar.a());
        this.m = akoxVar.z();
        this.f = btrmVar;
        this.g = cjqyVar;
        this.h = bvjjVar;
        this.i = btvoVar;
        this.j = cqatVar;
    }

    @Override // defpackage.asmo
    public final void NZ(Bundle bundle) {
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
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
        btrm btrmVar = this.f;
        dceq a = dcet.a();
        a.b(crij.class, new aueb(crij.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.asmo
    public final void c() {
        this.f.a(this);
        for (aktc aktcVar : this.k) {
            this.c.g(aktcVar);
            this.c.e(aktcVar);
        }
        this.k.clear();
        alfe alfeVar = this.l;
        if (alfeVar != null) {
            alfeVar.h();
            this.l = null;
        }
    }
}

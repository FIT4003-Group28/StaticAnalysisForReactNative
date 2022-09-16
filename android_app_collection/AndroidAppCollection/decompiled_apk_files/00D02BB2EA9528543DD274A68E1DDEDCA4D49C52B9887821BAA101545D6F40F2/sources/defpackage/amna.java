package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: amna  reason: default package */
/* loaded from: classes.dex */
public final class amna implements akpc {
    public final View a;
    public final aljd b;
    public final aliz c;
    @dzsi
    public alja d;
    public final akto e;
    private final aliy f;
    private final akzh g;
    private boolean h = false;

    public amna(View view, Context context, akzh akzhVar, akto aktoVar, aliy aliyVar, aliz alizVar) {
        this.a = view;
        this.g = akzhVar;
        this.e = aktoVar;
        this.f = aliyVar;
        this.c = alizVar;
        aljd aljdVar = new aljd(context, aliyVar);
        this.b = aljdVar;
        view.setClickable(true);
        view.setOnTouchListener(new ammy(view, aljdVar));
        view.setOnHoverListener(new ammz(view, aljdVar));
    }

    @Override // defpackage.akpc
    public final void a() {
        this.h = true;
        aliy aliyVar = this.f;
        ((amnb) aliyVar).a.a(aliyVar);
    }

    @Override // defpackage.akpc
    public final void b() {
        this.h = false;
        aliy aliyVar = this.f;
        btrm btrmVar = ((amnb) aliyVar).a;
        dceq a = dcet.a();
        a.b(afoq.class, new amnc(afoq.class, aliyVar));
        btrmVar.g(aliyVar, a.a());
    }

    @Override // defpackage.akpc
    public final aliw c() {
        return ((amnb) this.f).d;
    }

    @Override // defpackage.akpc
    public final void d(amwd amwdVar) {
        if (!this.h) {
            aliy aliyVar = this.f;
            boolean z = amwdVar != amwd.OFF;
            amnb amnbVar = (amnb) aliyVar;
            amnbVar.c = z;
            alix alixVar = amnbVar.b;
            if (alixVar == null) {
                return;
            }
            aljd aljdVar = ((amna) alixVar).b;
            boolean z2 = !z;
            aljdVar.e = z2;
            alip alipVar = aljdVar.a;
            if (!(alipVar instanceof aljh)) {
                return;
            }
            ((aljh) alipVar).e = z2;
        }
    }

    @Override // defpackage.akpc
    public final void e() {
    }

    @Override // defpackage.alix
    public final int f() {
        return this.a.getWidth();
    }

    @Override // defpackage.alix
    public final int g() {
        return this.a.getHeight();
    }

    @Override // defpackage.alix
    public final void h(float f, boolean z) {
        alja aljaVar = this.d;
        if (aljaVar != null) {
            aljaVar.f(f, z, this.c);
        }
    }

    public final akra i(float f, float f2) {
        akra s = akyx.s(this.g.b(), f, f2, new float[8]);
        dbsk.s(s);
        return s;
    }
}

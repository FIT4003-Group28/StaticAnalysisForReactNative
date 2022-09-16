package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atvt  reason: default package */
/* loaded from: classes2.dex */
public class atvt extends atss<crre> {
    private final atxu a;
    private final dpfh b;
    private final crem c;

    public atvt(crre crreVar, atxu atxuVar, long j, btrm btrmVar, btvo btvoVar, cref crefVar, Context context, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, vtn vtnVar, dehq dehqVar, Executor executor, atsr atsrVar, crem cremVar, boolean z) {
        super(crreVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, j);
        dozg dozgVar;
        this.a = atxuVar;
        dpfh dpfhVar = crreVar.a;
        this.b = dpfhVar;
        this.c = cremVar;
        atsm S = S(true);
        cjta b = cjtd.b();
        b.b = dpfhVar.c;
        b.g(dpfhVar.b);
        b.d = dtxw.cX;
        S.h = b.a();
        M(S.a());
        alcb a = alcc.a();
        a.a = context;
        int a2 = atxuVar.a();
        if (a2 != -1) {
            a.n = this.j.getString(R.string.TRAFFIC_UPDATE_ETA_PROMPT_SUBTITLE, bvtb.i(context, a2 + (cqatVar.b() / 1000)));
        }
        alcc a3 = a.a();
        a.c();
        alcc a4 = a.a();
        dozz dozzVar = dpfhVar.h;
        dozzVar = dozzVar == null ? dozz.y : dozzVar;
        this.p = a3.b(dozzVar.m);
        CharSequence b2 = a3.b(dozzVar.o);
        if (dozzVar.b == 23) {
            dozgVar = (dozg) dozzVar.c;
        } else {
            dozgVar = dozg.b;
        }
        if (!dozgVar.a) {
            CharSequence b3 = a4.b(dozzVar.o);
            B(b2);
            C(b3);
            CharSequence b4 = a3.b(dozzVar.p);
            if (TextUtils.isEmpty(b4.toString())) {
                this.s = b2;
            } else {
                this.s = b4;
            }
        }
        this.t = b2;
        atvs.a(dpfhVar, vtnVar, this);
        cjta b5 = cjtd.b();
        b5.b = dpfhVar.c;
        b5.g(dpfhVar.b);
        b5.g(dpfhVar.b);
        b5.f = dvnp.DIRECTIONS;
        b5.d = dtxw.cU;
        this.v = b5.a();
    }

    @Override // defpackage.atss, defpackage.atxz
    public boolean af() {
        int a = dpex.a(this.b.k);
        return a != 0 && a == 3;
    }

    @Override // defpackage.atss
    protected final crfj u() {
        if (!af() || this.c.e() != cren.MINIMAL) {
            return atvs.b(this.b, this.a.a(), this.i.q());
        }
        return atvs.d(this.b, this.a.a(), this.i.q());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atss
    public final void v() {
        cjqp g = this.l.g();
        cjta b = cjtd.b();
        dpfh dpfhVar = this.b;
        b.b = dpfhVar.c;
        b.g(dpfhVar.b);
        b.f = dvnp.DIRECTIONS;
        b.d = dtxw.dd;
        g.d(b.a());
    }
}

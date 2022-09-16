package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: attf  reason: default package */
/* loaded from: classes2.dex */
public class attf extends atsu<asbp> implements atxp {
    public static final /* synthetic */ int F = 0;
    private static final long G = TimeUnit.SECONDS.toMillis(30);
    public final bvjj A;
    public final arbx B;
    public final Executor C;
    public final pot D;
    public final String E;
    public dcdc<atxo> c;
    public final pnq d;

    public attf(asbp asbpVar, btrm btrmVar, cref crefVar, Context context, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z, btvo btvoVar, pnq pnqVar, bvjj bvjjVar, araj arajVar, pot potVar) {
        super(asbpVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, G, false);
        this.c = dcdc.e();
        this.d = pnqVar;
        this.A = bvjjVar;
        this.B = arajVar.m().f();
        this.D = potVar;
        this.C = dehqVar;
        this.E = btvoVar.getNavigationParameters().M().b;
    }

    private final void l(dcdc<pns> dcdcVar) {
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2 = this.f.getResources().getDisplayMetrics();
        dccx F2 = dcdc.F();
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            pns pnsVar = dcdcVar.get(i);
            dbsg<String> b = pnsVar.b(this.E, displayMetrics2);
            dbsg<String> a = pnsVar.a();
            if (!b.a() || !a.a()) {
                displayMetrics = displayMetrics2;
            } else {
                String b2 = b.b();
                String b3 = a.b();
                pot potVar = this.D;
                displayMetrics = displayMetrics2;
                F2.g(new atte(b2, b3, potVar.a.z(bvjk.jn, "").equals(a.b()) && potVar.a.s(bvjk.jm, 0) == pnsVar.c(), pnsVar.d(), new atta(this, a, pnsVar), this.f));
            }
            i++;
            displayMetrics2 = displayMetrics;
        }
        this.c = F2.f();
        cqkx.p(this);
    }

    @Override // defpackage.atsu, defpackage.atss, defpackage.atxz
    public synchronized void Oa() {
        super.Oa();
        M(S(true).a());
        cqkx.p(this);
    }

    @Override // defpackage.atss, defpackage.atxz
    public atxx U() {
        return atxx.CHEVRON_PICKER;
    }

    @Override // defpackage.atss, defpackage.atxz
    public boolean W() {
        return true;
    }

    @Override // defpackage.atss, defpackage.atxz
    public boolean X() {
        return true;
    }

    @Override // defpackage.atsu
    protected final void e() {
        l(((asbp) this.e).a);
    }

    @Override // defpackage.atsu
    protected final void f() {
        l(((asbp) this.e).a);
    }

    @Override // defpackage.atxp
    public String g() {
        return this.f.getString(R.string.CHEVRON_PICKER_PROMPT_TITLE);
    }

    @Override // defpackage.atxp
    public List<atxo> h() {
        return this.c;
    }

    @Override // defpackage.atxp
    public cqkl i() {
        this.A.P(bvjk.jm);
        this.A.P(bvjk.jn);
        this.d.u();
        p();
        return cqkl.a;
    }

    @Override // defpackage.atxp
    public Boolean j() {
        return this.D.b();
    }

    @Override // defpackage.atxp
    public String k() {
        if (j().booleanValue()) {
            Context context = this.f;
            return context.getString(R.string.ACCESSIBILITY_SELECTED_TOGGLE, context.getString(R.string.DEFAULT_VEHICLE_ICON));
        }
        return this.f.getString(R.string.DEFAULT_VEHICLE_ICON);
    }
}

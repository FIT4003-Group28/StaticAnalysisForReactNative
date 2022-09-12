package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bvip  reason: default package */
/* loaded from: classes4.dex */
public class bvip implements View.OnTouchListener, bvhu {
    public final gga a;
    public final btpc b;
    public final dcdc<bvhv> c;
    public final dcdc<bvig> d;
    public final bvij e;
    public int f;
    public final bvic i;
    private final bvil j;
    private final cqat k;
    private final cjqy l;
    private final cjqq m;
    private long n;
    private float o;
    private final bvin q;
    public boolean g = false;
    public boolean h = false;
    private final View.OnAttachStateChangeListener p = new bvia(this);

    public bvip(cqhn cqhnVar, gga ggaVar, dehq dehqVar, btpc btpcVar, cqat cqatVar, cqhu cqhuVar, cjqy cjqyVar, cjqq cjqqVar, List<? extends bvhv> list, int i, bvio bvioVar, bvil bvilVar, bvin bvinVar) {
        int i2 = 0;
        this.a = ggaVar;
        this.j = bvilVar;
        this.b = btpcVar;
        this.k = cqatVar;
        this.l = cjqyVar;
        this.m = cjqqVar;
        dccx F = dcdc.F();
        bvij bvijVar = new bvij(this, bvioVar);
        for (bvhv bvhvVar : list) {
            if (bvhvVar instanceof bvir) {
                bvig bvigVar = new bvig(bvijVar, dehqVar);
                F.g(bvigVar);
                ((bvir) bvhvVar).d(bvigVar);
            }
        }
        dcdc<bvhv> r = dcdc.r(list);
        this.c = r;
        this.d = F.f();
        this.e = bvijVar;
        this.f = i < r.size() ? i : i2;
        bvic bvicVar = new bvic(r.size());
        this.i = bvicVar;
        bvicVar.b(i, Float.valueOf(0.0f));
        this.q = bvinVar;
    }

    public static boolean r(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f || Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 1.0f) == 0.0f;
    }

    private final void s(cjql cjqlVar, dead deadVar) {
        if (cjqlVar != null) {
            this.l.P(cjqlVar, this.q.c(), deadVar);
        }
    }

    private final void t(cjql cjqlVar, cjte cjteVar) {
        if (cjqlVar != null) {
            this.l.n(cjqlVar, cjteVar, this.q.c());
        }
    }

    private final cqkl u(boolean z) {
        CharSequence b;
        if (this.e.a.isRunning() || this.b.m() || r(this.a) || cpv.a.e(this.a)) {
            this.e.c();
            if (!z) {
                this.f = ((this.f - 1) + this.c.size()) % this.c.size();
                this.j.a();
            } else {
                q();
            }
            this.i.b(this.f, Float.valueOf(0.0f));
            cqkx.p(this);
            this.e.a();
            if (cpv.a.e(this.a)) {
                bvhv bvhvVar = this.c.get(this.f);
                if (bvhvVar instanceof bvir) {
                    b = ((bvir) bvhvVar).c();
                } else {
                    b = ((bvis) bvhvVar).b();
                }
                View currentFocus = this.a.getCurrentFocus();
                if (!TextUtils.isEmpty(b) && currentFocus != null) {
                    cpv.a.f(currentFocus, b);
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bvhu
    public Boolean a() {
        boolean z = true;
        if (this.c.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bvhu
    public cqkl b() {
        return u(false);
    }

    @Override // defpackage.bvhu
    public cqkl c() {
        return u(true);
    }

    @Override // defpackage.bvhu
    public CharSequence d() {
        return this.q.a();
    }

    @Override // defpackage.bvhu
    public CharSequence e() {
        return this.q.b();
    }

    @Override // defpackage.bvhu
    public CharSequence f() {
        return !this.q.f() ? "" : this.a.getResources().getString(R.string.IMAGE_SLIDESHOW_INDEX_CONTENT_DESCRIPTION, Integer.valueOf(k().intValue() + 1), Integer.valueOf(this.c.size()));
    }

    @Override // defpackage.bvhu
    public Boolean g() {
        return Boolean.valueOf(this.q.f());
    }

    @Override // defpackage.bvhu
    public cjtd h() {
        return this.q.c();
    }

    @Override // defpackage.bvhu
    public View.OnAttachStateChangeListener i() {
        return this.p;
    }

    @Override // defpackage.bvhu
    public List<bvhv> j() {
        return this.c;
    }

    @Override // defpackage.bvhu
    public Integer k() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.bvhu
    public View.OnTouchListener m() {
        return this;
    }

    public void n() {
        this.h = true;
        this.e.a();
    }

    public void o() {
        this.e.b();
        this.h = false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (this.q.d() || this.q.e()) {
            cjql d = this.m.f(view).d(this.q.c());
            int action = motionEvent.getAction();
            if (action == 0) {
                this.e.b();
                this.n = this.k.b();
                this.o = motionEvent.getX();
            } else if (action != 1) {
                if (action == 3 || action == 4) {
                    this.e.a();
                }
            } else if (!this.q.d() || this.k.b() - this.n <= 300) {
                float x = motionEvent.getX();
                float width = view.getWidth() / 2;
                boolean z2 = x < width;
                if (!this.q.e()) {
                    if (bvox.b(this.a) == z2) {
                        z = true;
                    }
                    u(z);
                    t(d, new cjte(deaf.TAP));
                } else {
                    float x2 = motionEvent.getX() - this.o;
                    if ((bvox.b(this.a) || x >= width || x2 > 20.0f || x2 < 0.0f) && ((!bvox.b(this.a) || x < width || x2 > 0.0f || x2 < -20.0f) && ((bvox.b(this.a) || x2 <= 20.0f) && (!bvox.b(this.a) || x2 >= -20.0f)))) {
                        s(d, dead.LEFT);
                        u(true);
                    } else {
                        s(d, dead.RIGHT);
                        u(false);
                    }
                }
            } else {
                this.e.a();
                t(d, new cjte(deaf.LONG_PRESS));
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.bvhu
    @dzsi
    /* renamed from: p */
    public bvic l() {
        if (this.c.size() > 1) {
            return this.i;
        }
        return null;
    }

    public final void q() {
        this.f = (this.f + 1) % this.c.size();
        this.j.a();
    }
}

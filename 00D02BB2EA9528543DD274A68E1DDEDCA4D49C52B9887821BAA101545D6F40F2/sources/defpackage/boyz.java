package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: boyz  reason: default package */
/* loaded from: classes3.dex */
public class boyz implements bpwd {
    public final bpwc a;
    private final bnjv b;
    private final cjtd c;
    private final bvob d;
    private final igq e;
    private dcdc<jba> f = dcdc.e();
    private Boolean g = false;
    private Boolean h = false;
    private final cqqw i;
    private final Resources j;

    public boyz(bvpe bvpeVar, huc hucVar, bpwc bpwcVar, cqqw cqqwVar, bnjv bnjvVar, cqhn cqhnVar, Resources resources) {
        this.j = resources;
        this.i = cqqwVar;
        this.a = bpwcVar;
        this.b = bnjvVar;
        cjta b = cjtd.b();
        b.d = dtya.bf;
        this.c = b.a();
        this.d = new bvob(bvpeVar.b, hucVar.a(new htz(this) { // from class: boyx
            private final boyz a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.k();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
        igr h = igs.h();
        ((ife) h).a = resources.getString(R.string.EXTENT_PICKER_WHOLE_ROAD_HINT);
        igq b2 = h.b();
        dbsk.s(b2);
        this.e = b2;
    }

    @Override // defpackage.bpwd, defpackage.iqf
    public Boolean a() {
        return this.g;
    }

    @Override // defpackage.iqf
    public Boolean b() {
        return this.h;
    }

    @Override // defpackage.bpwd, defpackage.iqf
    public List<jba> c() {
        return this.f;
    }

    @Override // defpackage.iqf
    public cqqw d() {
        return this.i;
    }

    @Override // defpackage.iqf
    public void e() {
    }

    @Override // defpackage.iqf
    public String f() {
        return this.j.getString(R.string.EXTENT_PICKER_CAROUSEL_ACCESSIBILITY_TEXT);
    }

    @Override // defpackage.iqf
    public cjtd g() {
        return this.c;
    }

    @Override // defpackage.iqf
    @dzsi
    public View.OnAttachStateChangeListener h() {
        return this.d;
    }

    public void i(boolean z) {
        this.h = Boolean.valueOf(z);
        this.g = true;
        cqkx.p(this);
    }

    public void j(dcdc<ilo> dcdcVar) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            final ilo iloVar = dcdcVar.get(i);
            bnjs a = this.b.a(iloVar);
            a.a = new bnjt(this, iloVar) { // from class: boyy
                private final boyz a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = iloVar;
                }

                @Override // defpackage.bnjt
                public final void a(cjqm cjqmVar) {
                    boyz boyzVar = this.a;
                    ((boyg) boyzVar.a).a.i(this.b);
                }
            };
            a.n = cjtd.a(dtya.bg);
            F.g(a.a());
        }
        dcdc<jba> f = F.f();
        this.f = f;
        this.g = Boolean.valueOf(!f.isEmpty());
        cqkx.p(this);
    }

    public cjtd k() {
        return this.c;
    }

    @Override // defpackage.bpwd
    @dzsi
    public igq l() {
        return this.e;
    }
}

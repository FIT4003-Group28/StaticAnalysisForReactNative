package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aeez  reason: default package */
/* loaded from: classes.dex */
public class aeez implements aeeq {
    private final Activity a;
    private final acyr b;
    private final aebb c;
    private final dbty<dcdc<aegg>> d;
    private boolean e = false;
    private boolean f = false;
    @dzsi
    private awwb g;
    @dzsi
    private aeey h;

    public aeez(final Activity activity, final abfa abfaVar, acyr acyrVar, final aebb aebbVar) {
        this.a = activity;
        this.b = acyrVar;
        this.c = aebbVar;
        this.d = dbud.a(new dbty(aebbVar, activity, abfaVar) { // from class: aeeu
            private final aebb a;
            private final Activity b;
            private final abfa c;

            {
                this.a = aebbVar;
                this.b = activity;
                this.c = abfaVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                aebb aebbVar2 = this.a;
                Activity activity2 = this.b;
                abfa abfaVar2 = this.c;
                dccx F = dcdc.F();
                F.g(aegg.b);
                F.g(aegg.c);
                F.g(new aegf(aebbVar2.k().floatValue()));
                if (aebbVar2.a() == dktk.EXPLORE || aebbVar2.a() == dktk.INFORMAL_TRANSIT) {
                    final int e = aece.a.e(activity2);
                    final int a = jmj.a(activity2, true != abfaVar2.v() ? 59 : 67);
                    F.g(new aegg(e, a) { // from class: aeew
                        private final int a;
                        private final int d;

                        {
                            this.a = e;
                            this.d = a;
                        }

                        @Override // defpackage.aegg
                        public final int a(acyu acyuVar) {
                            return this.a + this.d;
                        }
                    });
                }
                return F.f();
            }
        });
    }

    @Override // defpackage.aeeq
    public Boolean a() {
        boolean z = false;
        if (this.g != null || (!this.b.a().ae && this.e)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aeeq
    public List<cqix<?>> b() {
        final awwb awwbVar = this.g;
        return (awwbVar == null || !dcft.j(this.c.g(), new dbsl(awwbVar) { // from class: awwd
            private final awwb a;

            {
                this.a = awwbVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.c((awvv) obj) == awwa.NOT_REQUESTED;
            }
        })) ? this.c.f() : dcdc.e();
    }

    @Override // defpackage.aeeq
    public Boolean c() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.aeeq
    public cqtv d() {
        return aece.a;
    }

    @Override // defpackage.aeeq
    public cqqw e() {
        return new aeex(this);
    }

    @Override // defpackage.aeeq
    public View.OnLayoutChangeListener f() {
        return new View.OnLayoutChangeListener(this) { // from class: aeev
            private final aeez a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.a.o(view);
            }
        };
    }

    @Override // defpackage.aeeq
    public cqkl g() {
        jjf jjfVar = (jjf) this.a.findViewById(R.id.side_panel);
        if (jjfVar != null) {
            jjfVar.g();
        }
        return cqkl.a;
    }

    @Override // defpackage.aeeq
    public Boolean i() {
        return Boolean.valueOf(this.c.a() == dktk.INFORMAL_TRANSIT);
    }

    public void j(@dzsi aeey aeeyVar) {
        this.h = aeeyVar;
    }

    public Float k() {
        return this.c.k();
    }

    @Override // defpackage.aeeq
    /* renamed from: l */
    public dcdc<aegg> h() {
        return this.d.a();
    }

    public void m() {
        this.e = true;
    }

    public void n(awwb awwbVar, awwp awwpVar) {
        this.g = awwbVar;
        this.c.i(awwbVar, awwpVar);
        cqkx.p(this);
    }

    public final void o(View view) {
        aeey aeeyVar = this.h;
        if (aeeyVar != null) {
            aeeyVar.a(view);
        }
        if (!view.canScrollVertically(-1)) {
            if (!c().booleanValue()) {
                return;
            }
            this.f = false;
            cqkx.p(this);
        } else if (c().booleanValue()) {
        } else {
            this.f = true;
            cqkx.p(this);
        }
    }
}

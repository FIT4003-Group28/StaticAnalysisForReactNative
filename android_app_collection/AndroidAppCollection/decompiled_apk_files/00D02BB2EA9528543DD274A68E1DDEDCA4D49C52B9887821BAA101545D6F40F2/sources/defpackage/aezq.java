package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.gmm.inappsurvey.api.SurveyData;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aezq  reason: default package */
/* loaded from: classes2.dex */
public final class aezq extends hxf {
    public cqkj b;
    public efg c;
    public aezk d;
    @dzsi
    private jam e;
    @dzsi
    private cqkf<jam> f;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<jam> cqkfVar = this.f;
        cjn.b(cqkfVar);
        cqkfVar.e(null);
        super.Qe();
    }

    public final void aR() {
        gn gnVar = this.A;
        if (gnVar != null) {
            gnVar.f();
        }
    }

    public final void aS() {
        if (this.aD) {
            aR();
        }
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz e = jib.g(J(), "").e();
        e.i = cqrt.g(2131231591, ibm.p());
        e.j = cqrt.l(R.string.CLOSE_BUTTON);
        e.k = new jia(this) { // from class: aezp
            private final aezq a;

            {
                this.a = this;
            }

            @Override // defpackage.jia
            public final void a(View view) {
                this.a.aS();
            }
        };
        return e.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<jam> c = this.b.c(new ico(), null);
        this.f = c;
        c.c().setBackgroundColor(ibm.b().b(J()));
        c.e(this.e);
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.e = new aezm(J().getResources(), aezl.values()[this.o.getInt("ERROR_TYPE")], new Runnable(this) { // from class: aezn
            private final aezq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aS();
            }
        }, new Runnable(this) { // from class: aezo
            private final aezq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aezq aezqVar = this.a;
                if (aezqVar.aD) {
                    SurveyData surveyData = (SurveyData) aezqVar.o.getParcelable("SURVEY_DATA");
                    aezqVar.aR();
                    if (surveyData == null) {
                        return;
                    }
                    aezqVar.d.e(surveyData);
                }
            }
        });
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        this.c.a(egjVar.a());
    }
}

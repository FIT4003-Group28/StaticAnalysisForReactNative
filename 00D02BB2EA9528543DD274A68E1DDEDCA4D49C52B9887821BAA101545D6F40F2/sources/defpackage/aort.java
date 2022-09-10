package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aort  reason: default package */
/* loaded from: classes2.dex */
public class aort extends aorg implements anpr {
    public dcdc<dvas> b;
    private final anry c;
    private final dcdc<jbf> d;
    private final jib e;
    private final aoqy f;
    private final anqv g;

    public aort(final anry anryVar, Application application, anqv anqvVar, final aorn aornVar, dzsj<jkf> dzsjVar, apjv apjvVar, anru anruVar) {
        super(application, anryVar, dzsjVar);
        this.c = anryVar;
        jhz a = apjvVar.a();
        a.c(apjvVar.d(new aors(anryVar)));
        this.e = a.b();
        ixw ixwVar = new ixw();
        aornVar.getClass();
        ixwVar.e = new Runnable(aornVar) { // from class: aoro
            private final aorn a;

            {
                this.a = aornVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g();
            }
        };
        ixwVar.a = application.getString(R.string.MAPS_ACTIVITY_SEARCH_FOR_DIFFERENT_PLACE);
        ixwVar.f = cjtd.a(dtyi.bH);
        ixwVar.d = cqkp.T;
        jbf a2 = ixwVar.a();
        jbf c = anruVar.c(application.getResources(), new Runnable(aornVar, anryVar) { // from class: aorp
            private final aorn a;
            private final anry b;

            {
                this.a = aornVar;
                this.b = anryVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(this.b.ad());
            }
        });
        ixw ixwVar2 = new ixw();
        anryVar.getClass();
        ixwVar2.e = new Runnable(anryVar) { // from class: aorq
            private final anry a;

            {
                this.a = anryVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.Y();
            }
        };
        ixwVar2.a = application.getString(R.string.MAPS_ACTIVITY_REMOVE_STOP_FROM_DAY_MENU);
        ixwVar2.f = cjtd.a(dtyi.bK);
        ixwVar2.d = cqkp.T;
        this.d = dcdc.h(a2, c, ixwVar2.a());
        this.f = new aoqy(this.a, anryVar);
        this.g = anqvVar;
        this.b = dcdc.e();
    }

    @Override // defpackage.anpr
    public void a(ilo iloVar, int i) {
        dvyw h = iloVar.h();
        dnql bZ = dnqm.c.bZ();
        dnqn bZ2 = dnqo.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqo dnqoVar = (dnqo) bZ2.b;
        dnqoVar.a |= 1;
        dnqoVar.b = i;
        dnqo bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqm dnqmVar = (dnqm) bZ.b;
        bK.getClass();
        dnqmVar.b = bK;
        dnqmVar.a = 1;
        n(h, bZ.bK());
    }

    @Override // defpackage.anrm
    public cqsn c() {
        return cqrt.l(true != this.c.e() ? R.string.SEGMENT_EDITING_CHOOSE_A_PLACE : R.string.SEGMENT_ADDING_CHOOSE_A_PLACE);
    }

    @Override // defpackage.aorf
    public List<dcdc<jbf>> d() {
        dvat dvatVar;
        dccx F = dcdc.F();
        dvay l = l();
        if (l.b == 7) {
            dvatVar = (dvat) l.c;
        } else {
            dvatVar = dvat.g;
        }
        F.i(dcft.u(dvatVar.b, 1));
        F.i(this.b);
        dcdc<dvas> f = F.f();
        dccx F2 = dcdc.F();
        int i = 0;
        for (dvas dvasVar : f) {
            F2.g(anps.i(dvasVar, this, i));
            i++;
        }
        return dcdc.f(F2.f());
    }

    @Override // defpackage.aorf
    public List<jbf> e() {
        return this.d;
    }

    @Override // defpackage.aorf
    public jib f() {
        return this.e;
    }

    @Override // defpackage.aorf
    public Boolean g() {
        return Boolean.valueOf(this.g.a);
    }

    @Override // defpackage.aorf
    public aoqx h() {
        return this.f;
    }

    public void m() {
        this.g.a(this.c.ad(), new aorr(this));
        cqkx.p(this);
    }

    public void n(dvyw dvywVar, dnqm dnqmVar) {
        this.c.X(dvywVar, dnqmVar);
    }

    public aort(dvay dvayVar, aoge aogeVar, boolean z, Application application, anqv anqvVar, aorn aornVar, dzsj<jkf> dzsjVar, anrz anrzVar, apjv apjvVar, anru anruVar) {
        this(anrzVar.a(dvayVar, aogeVar, z, true), application, anqvVar, aornVar, dzsjVar, apjvVar, anruVar);
    }
}

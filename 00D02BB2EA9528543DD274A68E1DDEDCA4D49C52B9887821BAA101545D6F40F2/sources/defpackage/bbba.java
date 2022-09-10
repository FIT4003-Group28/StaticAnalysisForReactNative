package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbba  reason: default package */
/* loaded from: classes3.dex */
public class bbba extends bbal {
    public final axwq a;
    public final dxio<afha> c;
    public final gdc d;
    public final drjs e;
    private final bvsx f;

    public bbba(gga ggaVar, axwq axwqVar, bwqv bwqvVar, ania aniaVar, dxio<afha> dxioVar, gdc gdcVar, batz batzVar, drjs drjsVar) {
        super(ggaVar, bwqvVar, aniaVar, batzVar);
        this.a = axwqVar;
        this.c = dxioVar;
        this.d = gdcVar;
        this.f = new bvsx(ggaVar.getResources());
        this.e = drjsVar;
    }

    @Override // defpackage.bayj
    public String a() {
        return batk.a(this.t, this.e);
    }

    @Override // defpackage.bayj
    public CharSequence b() {
        String i;
        drjl drjlVar;
        drjl drjlVar2;
        dqfu c = batk.c(this.e);
        drjr drjrVar = drjr.FLIGHT_RESERVATION;
        switch (drjr.a(this.e.a).ordinal()) {
            case 0:
            case 2:
            case 4:
            case 5:
            case 6:
                i = batk.i(this.t, c);
                break;
            case 1:
                gga ggaVar = this.t;
                drjs drjsVar = this.e;
                if (drjsVar.a == 4) {
                    drjlVar = (drjl) drjsVar.b;
                } else {
                    drjlVar = drjl.f;
                }
                dqfu dqfuVar = drjlVar.c;
                if (dqfuVar == null) {
                    dqfuVar = dqfu.d;
                }
                drjs drjsVar2 = this.e;
                if (drjsVar2.a == 4) {
                    drjlVar2 = (drjl) drjsVar2.b;
                } else {
                    drjlVar2 = drjl.f;
                }
                dqfu dqfuVar2 = drjlVar2.d;
                if (dqfuVar2 == null) {
                    dqfuVar2 = dqfu.d;
                }
                i = batk.l(ggaVar, dqfuVar, batk.m(dqfuVar2));
                break;
            case 3:
                i = batk.j(this.t, c);
                break;
            default:
                i = null;
                break;
        }
        return dbsj.d(i) ? "" : new SpannableStringBuilder().append((CharSequence) this.f.e(cqrt.h(2131231596, ibm.n()).a(this.t), 0.9f)).append((CharSequence) " ").append((CharSequence) i);
    }

    @Override // defpackage.bayj
    public jic c() {
        return new jic((String) null, ckqc.FULLY_QUALIFIED, iup.g(cqrt.h(batk.f(this.e), ibl.ax()), 0.55f, cqrt.c(batk.g(this.e))), 0);
    }

    @Override // defpackage.bayj
    public String d() {
        return this.t.getString(R.string.YOUR_PLACES_UPCOMING_TRIPS_RESERVATIONS);
    }

    @Override // defpackage.bayj
    @dzsi
    public ilo f() {
        ily ilyVar = new ily();
        ilyVar.w(batk.e(this.e));
        return ilyVar.d();
    }

    @Override // defpackage.bayj
    public cjtd g() {
        return cjtd.a(dtyd.cV);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r1.a.isEmpty() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r5.e.g.get(0).a.isEmpty() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (i() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        r1 = new defpackage.jhm();
        r1.l = com.google.android.apps.maps.R.string.PERSONAL_CALENDAR_EVENT_EMAIL;
        r1.a = r5.t.getString(com.google.android.apps.maps.R.string.PERSONAL_CALENDAR_EVENT_EMAIL);
        r1.f = defpackage.cjtd.a(defpackage.dtyg.J);
        r1.d(new defpackage.bbav(r5));
        r0.d(r1.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
        r1 = new defpackage.jhm();
        r1.l = com.google.android.apps.maps.R.string.PERSONAL_RESERVATION_EMAIL;
        r1.a = r5.t.getString(com.google.android.apps.maps.R.string.PERSONAL_RESERVATION_EMAIL);
        r1.f = defpackage.cjtd.a(defpackage.dtyg.I);
        r1.d(new defpackage.bbaw(r5));
        r0.d(r1.c());
     */
    @Override // defpackage.bayj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.jht h() {
        /*
            r5 = this;
            jhu r0 = defpackage.jhv.h()
            gga r1 = r5.t
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r5.a()
            r4 = 0
            r2[r4] = r3
            r3 = 2131959099(0x7f131d3b, float:1.9554829E38)
            java.lang.String r1 = r1.getString(r3, r2)
            r2 = r0
            jhi r2 = (defpackage.jhi) r2
            r2.e = r1
            boolean r1 = r5.i()
            if (r1 == 0) goto L40
            drjs r1 = r5.e
            int r3 = r1.a
            r4 = 8
            if (r3 != r4) goto L2f
            java.lang.Object r1 = r1.b
            drit r1 = (defpackage.drit) r1
            goto L31
        L2f:
            drit r1 = defpackage.drit.f
        L31:
            drjn r1 = r1.e
            if (r1 != 0) goto L37
            drjn r1 = defpackage.drjn.b
        L37:
            java.lang.String r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lb5
            goto L5c
        L40:
            drjs r1 = r5.e
            dsrj<drjd> r1 = r1.g
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lb5
            drjs r1 = r5.e
            dsrj<drjd> r1 = r1.g
            java.lang.Object r1 = r1.get(r4)
            drjd r1 = (defpackage.drjd) r1
            java.lang.String r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lb5
        L5c:
            boolean r1 = r5.i()
            if (r1 == 0) goto L8c
            jhm r1 = new jhm
            r1.<init>()
            r3 = 2131956160(0x7f1311c0, float:1.9548868E38)
            r1.l = r3
            gga r4 = r5.t
            java.lang.String r3 = r4.getString(r3)
            r1.a = r3
            ddho r3 = defpackage.dtyg.J
            cjtd r3 = defpackage.cjtd.a(r3)
            r1.f = r3
            bbav r3 = new bbav
            r3.<init>(r5)
            r1.d(r3)
            jho r1 = r1.c()
            r0.d(r1)
            goto Lb5
        L8c:
            jhm r1 = new jhm
            r1.<init>()
            r3 = 2131956202(0x7f1311ea, float:1.9548953E38)
            r1.l = r3
            gga r4 = r5.t
            java.lang.String r3 = r4.getString(r3)
            r1.a = r3
            ddho r3 = defpackage.dtyg.I
            cjtd r3 = defpackage.cjtd.a(r3)
            r1.f = r3
            bbaw r3 = new bbaw
            r3.<init>(r5)
            r1.d(r3)
            jho r1 = r1.c()
            r0.d(r1)
        Lb5:
            drjs r1 = r5.e
            java.lang.String r1 = r1.c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Le8
            jhm r1 = new jhm
            r1.<init>()
            r3 = 2131956199(0x7f1311e7, float:1.9548947E38)
            r1.l = r3
            gga r4 = r5.t
            java.lang.String r3 = r4.getString(r3)
            r1.a = r3
            ddho r3 = defpackage.dtyg.H
            cjtd r3 = defpackage.cjtd.a(r3)
            r1.f = r3
            bbax r3 = new bbax
            r3.<init>(r5)
            r1.d(r3)
            jho r1 = r1.c()
            r0.d(r1)
        Le8:
            jhv r0 = r2.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbba.h():jht");
    }

    public final boolean i() {
        return this.e.a == 8;
    }

    @Override // defpackage.bbal, defpackage.bayj
    public String j() {
        return batk.b(this.t, this.e);
    }
}

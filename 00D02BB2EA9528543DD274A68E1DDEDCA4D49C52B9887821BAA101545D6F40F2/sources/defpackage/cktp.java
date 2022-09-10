package defpackage;

import android.net.Uri;
import com.google.android.filament.R;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cktp  reason: default package */
/* loaded from: classes4.dex */
public final class cktp {
    public final cjqy a;
    @dzsi
    public volatile Set<Uri> b = new dzru();
    private final ckuu c;
    private final bvrb d;

    public cktp(ckuu ckuuVar, cjqy cjqyVar, bvrb bvrbVar) {
        dbsk.s(ckuuVar);
        this.c = ckuuVar;
        dbsk.s(cjqyVar);
        this.a = cjqyVar;
        dbsk.s(bvrbVar);
        this.d = bvrbVar;
        GoogleApiClient googleApiClient = ckuuVar.a;
        if (googleApiClient == null) {
            return;
        }
        Api<cpgq> api = cpgr.a;
        Uri build = new Uri.Builder().scheme("wear").path("/log/").build();
        cnty.b(build);
        cnwc.e(true, "invalid filter type");
        googleApiClient.enqueue(new cphw(googleApiClient, build)).i(new ckto(this, bvrbVar));
    }

    public final void a(cpgl cpglVar) {
        cpglVar.a();
        List<String> pathSegments = cpglVar.a().getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty() || pathSegments.get(0) == null || !pathSegments.get(0).equals("log")) {
            throw new IllegalArgumentException();
        }
        if (this.c.a == null) {
            return;
        }
        Set<Uri> set = this.b;
        if (set != null && !set.add(cpglVar.a())) {
            return;
        }
        byte[] b = cpglVar.b();
        if (b != null) {
            try {
                ckwn ckwnVar = (ckwn) dsqw.cq(ckwn.c, b);
                if ((ckwnVar.a & 1) != 0) {
                    final int a = ckwm.a(ckwnVar.b);
                    if (a == 0) {
                        a = 1;
                    }
                    this.d.b(new Runnable(this, a) { // from class: cktm
                        private final cktp a;
                        private final int b;

                        {
                            this.a = this;
                            this.b = a;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cktp cktpVar = this.a;
                            int i = this.b - 1;
                            if (i == 49) {
                                cjqy cjqyVar = cktpVar.a;
                                cjsx i2 = cjsy.i();
                                i2.b(ddda.gh);
                                cjqyVar.k(i2.a());
                                return;
                            }
                            switch (i) {
                                case 0:
                                    cjqy cjqyVar2 = cktpVar.a;
                                    cjsx i3 = cjsy.i();
                                    i3.b(ddda.fT);
                                    cjqyVar2.k(i3.a());
                                    return;
                                case 1:
                                    cjqy cjqyVar3 = cktpVar.a;
                                    cjsx i4 = cjsy.i();
                                    i4.b(ddda.fU);
                                    cjqyVar3.k(i4.a());
                                    return;
                                case 2:
                                    cktpVar.a.i(cjtd.a(dtyf.k));
                                    return;
                                case 3:
                                    cktpVar.a.i(cjtd.a(dtyf.l));
                                    return;
                                case 4:
                                    cktpVar.a.i(cjtd.a(dtyf.h));
                                    return;
                                case 5:
                                    cktpVar.a.i(cjtd.a(dtyf.f));
                                    return;
                                case 6:
                                    cktpVar.a.i(cjtd.a(dtyf.g));
                                    return;
                                default:
                                    switch (i) {
                                        case 8:
                                            cktpVar.a.i(cjtd.a(dtyf.i));
                                            return;
                                        case 9:
                                            cktpVar.a.i(cjtd.a(dtyf.p));
                                            return;
                                        case 10:
                                            cktpVar.a.m(new cjte(deaf.SWIPE, dead.RIGHT), cjtd.a(dtyf.t));
                                            return;
                                        case 11:
                                            cktpVar.a.i(cjtd.a(dtyf.u));
                                            return;
                                        case 12:
                                            cktpVar.a.m(new cjte(deaf.LONG_PRESS), cjtd.a(dtyf.e));
                                            return;
                                        case 13:
                                            cktpVar.a.m(new cjte(deaf.PINCH_OPEN), cjtd.a(dtyf.e));
                                            return;
                                        case 14:
                                            cktpVar.a.m(new cjte(deaf.PINCH_CLOSED), cjtd.a(dtyf.e));
                                            return;
                                        case 15:
                                            cktpVar.a.m(new cjte(deaf.DRAG), cjtd.a(dtyf.e));
                                            return;
                                        case 16:
                                            cktpVar.a.i(cjtd.a(dtyf.j));
                                            return;
                                        case 17:
                                            cjqy cjqyVar4 = cktpVar.a;
                                            cjsx i5 = cjsy.i();
                                            i5.b(ddda.fR);
                                            cjqyVar4.k(i5.a());
                                            return;
                                        case 18:
                                            cjqy cjqyVar5 = cktpVar.a;
                                            cjsx i6 = cjsy.i();
                                            i6.b(ddda.fS);
                                            cjqyVar5.k(i6.a());
                                            return;
                                        case 19:
                                            cjqy cjqyVar6 = cktpVar.a;
                                            cjsx i7 = cjsy.i();
                                            i7.b(ddda.gg);
                                            cjqyVar6.k(i7.a());
                                            return;
                                        case 20:
                                            cjqy cjqyVar7 = cktpVar.a;
                                            cjsx i8 = cjsy.i();
                                            i8.b(ddda.gf);
                                            cjqyVar7.k(i8.a());
                                            return;
                                        case 21:
                                            cjqy cjqyVar8 = cktpVar.a;
                                            cjsx i9 = cjsy.i();
                                            i9.b(ddda.fY);
                                            cjqyVar8.k(i9.a());
                                            return;
                                        case 22:
                                            cjqy cjqyVar9 = cktpVar.a;
                                            cjsx i10 = cjsy.i();
                                            i10.b(ddda.fZ);
                                            cjqyVar9.k(i10.a());
                                            return;
                                        case 23:
                                            cjqy cjqyVar10 = cktpVar.a;
                                            cjsx i11 = cjsy.i();
                                            i11.b(ddda.fX);
                                            cjqyVar10.k(i11.a());
                                            return;
                                        case 24:
                                            cjqy cjqyVar11 = cktpVar.a;
                                            cjsx i12 = cjsy.i();
                                            i12.b(ddda.fW);
                                            cjqyVar11.k(i12.a());
                                            return;
                                        case 25:
                                            cjqy cjqyVar12 = cktpVar.a;
                                            cjsx i13 = cjsy.i();
                                            i13.b(ddda.ge);
                                            cjqyVar12.k(i13.a());
                                            return;
                                        case 26:
                                            cjqy cjqyVar13 = cktpVar.a;
                                            cjsx i14 = cjsy.i();
                                            i14.b(ddda.gb);
                                            cjqyVar13.k(i14.a());
                                            return;
                                        case 27:
                                            cktpVar.a.i(cjtd.a(dtyf.n));
                                            return;
                                        case 28:
                                            cktpVar.a.i(cjtd.a(dtyf.o));
                                            return;
                                        case 29:
                                            cktpVar.a.i(cjtd.a(dtyf.m));
                                            return;
                                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                            cktpVar.a.i(cjtd.a(dtyf.r));
                                            return;
                                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                            cktpVar.a.i(cjtd.a(dtyf.s));
                                            return;
                                        case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                            cktpVar.a.i(cjtd.a(dtyf.q));
                                            return;
                                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                            cjqy cjqyVar14 = cktpVar.a;
                                            cjsx i15 = cjsy.i();
                                            i15.b(ddda.gc);
                                            cjqyVar14.k(i15.a());
                                            return;
                                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                            cjqy cjqyVar15 = cktpVar.a;
                                            cjsx i16 = cjsy.i();
                                            i16.b(ddda.gd);
                                            cjqyVar15.k(i16.a());
                                            return;
                                        case 35:
                                            cjqy cjqyVar16 = cktpVar.a;
                                            cjsx i17 = cjsy.i();
                                            i17.b(ddda.ga);
                                            cjqyVar16.k(i17.a());
                                            return;
                                        case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                            cjqy cjqyVar17 = cktpVar.a;
                                            cjsx i18 = cjsy.i();
                                            i18.b(ddda.fV);
                                            cjqyVar17.k(i18.a());
                                            return;
                                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                            cjqy cjqyVar18 = cktpVar.a;
                                            cjsx i19 = cjsy.i();
                                            i19.b(ddda.gi);
                                            cjqyVar18.k(i19.a());
                                            return;
                                        default:
                                            return;
                                    }
                            }
                        }
                    }, bvrj.UI_THREAD);
                }
            } catch (dsrm unused) {
            }
        }
        Api<cpgq> api = cpgr.a;
        GoogleApiClient googleApiClient = this.c.a;
        Uri a2 = cpglVar.a();
        cnty.b(a2);
        cnwc.e(true, "invalid filter type");
        googleApiClient.enqueue(new cphx(googleApiClient, a2));
    }
}

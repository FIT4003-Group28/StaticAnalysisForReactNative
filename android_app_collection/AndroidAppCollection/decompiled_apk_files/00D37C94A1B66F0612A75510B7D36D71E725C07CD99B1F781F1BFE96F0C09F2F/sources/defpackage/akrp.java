package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: akrp  reason: default package */
/* loaded from: classes.dex */
public final class akrp extends cyr {
    @dfs(a = 13)
    awrr a;

    public akrp() {
        super("AnalyticsChart");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new FrameLayout(context);
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        awrr awrrVar = this.a;
        double d = cyvVar.b.getResources().getDisplayMetrics().density;
        double d2 = awrrVar.c;
        Double.isNaN(d2);
        Double.isNaN(d);
        ddjVar.a = (int) Math.floor(d2 * d);
        double d3 = awrrVar.d;
        Double.isNaN(d3);
        Double.isNaN(d);
        ddjVar.b = (int) Math.floor(d3 * d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        FrameLayout frameLayout;
        sbh sbhVar;
        sbh sbhVar2;
        int i;
        List list;
        int i2;
        String str;
        awrr awrrVar;
        List list2;
        List list3;
        aopl aoplVar;
        aopl aoplVar2;
        int i3;
        FrameLayout frameLayout2 = (FrameLayout) obj;
        awrr awrrVar2 = this.a;
        awsg awsgVar = awrrVar2.e;
        if (awsgVar == null) {
            awsgVar = awsg.a;
        }
        if (awsgVar.c == 1) {
            Context context = cyvVar.b;
            float f = context.getResources().getDisplayMetrics().density;
            float f2 = context.getResources().getDisplayMetrics().scaledDensity;
            awsg awsgVar2 = awrrVar2.e;
            if (awsgVar2 == null) {
                awsgVar2 = awsg.a;
            }
            if (awsgVar2.c == 1) {
                awsg awsgVar3 = awrrVar2.e;
                if (awsgVar3 == null) {
                    awsgVar3 = awsg.a;
                }
                if ((awsgVar3.c == 1 ? (awsa) awsgVar3.d : awsa.a).b.isEmpty()) {
                    frameLayout = frameLayout2;
                    sbhVar2 = null;
                } else {
                    awsg awsgVar4 = awrrVar2.e;
                    if (awsgVar4 == null) {
                        awsgVar4 = awsg.a;
                    }
                    awsa awsaVar = awsgVar4.c == 1 ? (awsa) awsgVar4.d : awsa.a;
                    aopl aoplVar3 = ((awsb) awsaVar.b.get(0)).c;
                    awsg awsgVar5 = awrrVar2.e;
                    if (awsgVar5 == null) {
                        awsgVar5 = awsg.a;
                    }
                    List list4 = (List) Collection.EL.stream((awsgVar5.c == 1 ? (awsa) awsgVar5.d : awsa.a).b).map(akrs.a).collect(Collectors.toList());
                    awsg awsgVar6 = awrrVar2.e;
                    if (awsgVar6 == null) {
                        awsgVar6 = awsg.a;
                    }
                    List list5 = (List) Collection.EL.stream((awsgVar6.c == 1 ? (awsa) awsgVar6.d : awsa.a).b).map(akrs.c).collect(Collectors.toList());
                    awsg awsgVar7 = awrrVar2.e;
                    if (awsgVar7 == null) {
                        awsgVar7 = awsg.a;
                    }
                    List list6 = (List) Collection.EL.stream((awsgVar7.c == 1 ? (awsa) awsgVar7.d : awsa.a).b).map(adgi.u).collect(Collectors.toList());
                    awsg awsgVar8 = awrrVar2.e;
                    if (awsgVar8 == null) {
                        awsgVar8 = awsg.a;
                    }
                    List list7 = (List) Collection.EL.stream((awsgVar8.c == 1 ? (awsa) awsgVar8.d : awsa.a).b).filter(agat.j).map(akrs.b).collect(Collectors.toList());
                    awrs awrsVar = awsaVar.c;
                    if (awrsVar == null) {
                        awrsVar = awrs.a;
                    }
                    aopl aoplVar4 = awrsVar.c;
                    awrs awrsVar2 = awsaVar.c;
                    if (awrsVar2 == null) {
                        awrsVar2 = awrs.a;
                    }
                    aopl aoplVar5 = awrsVar2.d;
                    sar sarVar = new sar(context);
                    aqgn.p(sarVar);
                    frameLayout = frameLayout2;
                    awsc awscVar = ((awsb) awsaVar.b.get(0)).e;
                    if (awscVar == null) {
                        awscVar = awsc.a;
                    }
                    if ((awscVar.b & 1) != 0) {
                        awsc awscVar2 = ((awsb) awsaVar.b.get(0)).e;
                        if (awscVar2 == null) {
                            awscVar2 = awsc.a;
                        }
                        i2 = awscVar2.c;
                    } else {
                        i2 = 2;
                    }
                    ((sai) sarVar).e = 0;
                    sarVar.d.b = (int) (i2 * f);
                    ((sdc) sarVar.a()).i(0);
                    awrz awrzVar = awsaVar.d;
                    if (awrzVar == null) {
                        awrzVar = awrz.a;
                    }
                    if (awrzVar.d.size() == 0) {
                        ((sdc) sarVar.a()).setVisibility(8);
                        awrrVar = awrrVar2;
                        str = "empty";
                        list2 = list7;
                        list3 = list6;
                        aoplVar = aoplVar3;
                        aoplVar2 = aoplVar4;
                    } else {
                        final awrz awrzVar2 = awsaVar.d;
                        if (awrzVar2 == null) {
                            awrzVar2 = awrz.a;
                        }
                        sdc sdcVar = new sdc(context);
                        str = "empty";
                        awrrVar = awrrVar2;
                        list2 = list7;
                        list3 = list6;
                        sdw sdwVar = new sdw(new sed[]{new sed(new seh()), new sed(new sec()), new sed(new seg()), new sed(new sdy()), new sed(new sea()), new sed(new seb())});
                        sdcVar.m();
                        sdcVar.b = sdwVar;
                        TreeMap k = shp.k();
                        aoplVar = aoplVar3;
                        sbv.c(60000L, new sef("mm", "h mm", 10), k);
                        sbv.c(3600000L, new sdz(), k);
                        sbv.c(82800000L, new sef("d", "MMM d", 2), k);
                        aoplVar2 = aoplVar4;
                        sbv.c(2419200000L, new sef("MMM", "MMM yyyy", 1), k);
                        sbv.c(31536000000L, new sef("yyyy", "yyyy", 1), k);
                        sho.c(!k.isEmpty(), "At least one timeFormatter is needed to build a DateTimeTickFormatter");
                        sdcVar.c = new sdx(k);
                        sdcVar.j();
                        float b = scf.b(context, 10.0f);
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, rzz.a, 0, 0);
                        sdcVar.i(obtainStyledAttributes.getDimensionPixelSize(5, (int) b));
                        obtainStyledAttributes.recycle();
                        sfc.b(sdcVar);
                        if ("DEFAULT".equals(((sab) sarVar).b)) {
                            String str2 = ((sab) sarVar).b;
                            if (str2 != null) {
                                sarVar.removeView(sarVar.b(str2));
                            }
                            ((sab) sarVar).b = null;
                        }
                        ((sab) sarVar).a.put("DEFAULT", sdcVar);
                        sdh sdhVar = new sdh(awrzVar2.d);
                        sdc sdcVar2 = (sdc) sarVar.a();
                        sdcVar2.k(new sdr());
                        sdcVar2.b = sdhVar;
                        sdcVar2.c = new sdj() { // from class: akrr
                            @Override // defpackage.sdj
                            public final List a(List list8) {
                                awry awryVar;
                                awrz awrzVar3 = awrz.this;
                                if (awrzVar3.b == 2) {
                                    awryVar = (awry) awrzVar3.c;
                                } else {
                                    awryVar = awry.a;
                                }
                                return awryVar.b;
                            }
                        };
                        sdc sdcVar3 = (sdc) sarVar.a();
                        sdcVar3.i(0);
                        sdg sdgVar = sdcVar3.d;
                        sdgVar.a();
                        sdgVar.d = (int) (f * 12.0f);
                        sdgVar.c(f2 * 12.0f);
                        sdgVar.b(aqgn.m(sarVar.getContext()));
                        sdgVar.f();
                        sdgVar.e = 0.0f;
                    }
                    awsd awsdVar = awsaVar.e;
                    if (awsdVar == null) {
                        awsdVar = awsd.a;
                    }
                    if (awsdVar.d.size() == 0) {
                        sarVar.c().setVisibility(8);
                    } else {
                        awsd awsdVar2 = awsaVar.e;
                        if (awsdVar2 == null) {
                            awsdVar2 = awsd.a;
                        }
                        sdj t = aqmv.t(awsdVar2);
                        sdc c = sarVar.c();
                        c.k(new akrv());
                        c.b = new sdh(awsdVar2.d);
                        c.c = t;
                        c.i((int) f);
                        sdg sdgVar2 = c.d;
                        sdgVar2.f();
                        sdgVar2.d = (int) (f * 12.0f);
                        sdgVar2.c(f2 * 12.0f);
                        sdgVar2.e(aqgn.n(sarVar.getContext()));
                        sdgVar2.b(aqgn.m(sarVar.getContext()));
                    }
                    if (!list4.isEmpty()) {
                        if (list4.size() == 1 && aoplVar2.size() == ((List) list4.get(0)).size() && aoplVar5.size() == ((List) list4.get(0)).size()) {
                            sfy sfyVar = sarVar.d;
                            sfyVar.e = true;
                            sfyVar.g = true;
                            List list8 = (List) list4.get(0);
                            Integer num = (Integer) list5.get(0);
                            awrs awrsVar3 = awsaVar.c;
                            if (awrsVar3 == null) {
                                awrsVar3 = awrs.a;
                            }
                            if ((awrsVar3.b & 1) != 0) {
                                awrs awrsVar4 = awsaVar.c;
                                if (awrsVar4 == null) {
                                    awrsVar4 = awrs.a;
                                }
                                i3 = awrsVar4.e;
                            } else {
                                i3 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                            }
                            aopl aoplVar6 = aoplVar;
                            sgt h = snr.h("lower", aoplVar6, aoplVar2);
                            h.g(sfx.f, Integer.valueOf(shp.l(i3, 0)));
                            h.g(sfx.a, 0);
                            sgt h2 = snr.h("upper", aoplVar6, aqgn.q(aoplVar5, aoplVar2));
                            h2.g(sfx.f, Integer.valueOf(i3));
                            h2.g(sfx.a, 0);
                            sgt h3 = snr.h("target", aoplVar6, aqgn.q(list8, aoplVar5));
                            h3.h(num);
                            h3.g(sfx.f, Integer.valueOf(shp.l(num.intValue(), 0)));
                            if (araa.B(h3, list8, (awsf) list3.get(0))) {
                                sarVar.t(new sbb(sarVar.getContext()));
                            } else {
                                araa.C(sarVar);
                            }
                            ArrayList f3 = sbv.f(4);
                            f3.add(h);
                            f3.add(h2);
                            f3.add(h3);
                            sarVar.w(f3);
                        } else {
                            List list9 = list3;
                            aopl aoplVar7 = aoplVar;
                            awsc awscVar3 = ((awsb) awsaVar.b.get(0)).e;
                            if (awscVar3 == null) {
                                awscVar3 = awsc.a;
                            }
                            sarVar.d.e = (awscVar3.b & 4) != 0;
                            ArrayList o = amxp.o();
                            for (int i4 = 0; i4 < list4.size(); i4++) {
                                int intValue = ((Integer) list5.get(i4)).intValue();
                                StringBuilder sb = new StringBuilder(18);
                                sb.append("target_");
                                sb.append(i4);
                                sgt h4 = snr.h(sb.toString(), aoplVar7, (List) list4.get(i4));
                                h4.h(Integer.valueOf(intValue));
                                sgq sgqVar = sfx.f;
                                awsc awscVar4 = ((awsb) awsaVar.b.get(i4)).e;
                                if (awscVar4 == null) {
                                    awscVar4 = awsc.a;
                                }
                                h4.g(sgqVar, Integer.valueOf(awscVar4.e));
                                o.add(h4);
                                if (o.size() == list9.size()) {
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= list9.size()) {
                                            sarVar.t(new sbb(sarVar.getContext()));
                                            break;
                                        } else if (!araa.B((sgt) o.get(i5), (List) Collection.EL.stream(((sgt) o.get(i5)).a).map(adgi.t).collect(Collectors.toList()), (awsf) list9.get(i5))) {
                                            araa.C(sarVar);
                                            break;
                                        } else {
                                            i5++;
                                        }
                                    }
                                } else {
                                    araa.C(sarVar);
                                }
                            }
                            sarVar.w(o);
                        }
                        if (!list2.isEmpty()) {
                            Context context2 = sarVar.getContext();
                            if (!zdg.f(context2)) {
                                sfw sfwVar = new sfw(context2);
                                sfwVar.a.setColor(zhn.d(context2, R.attr.yt10PercentLayer));
                                sfwVar.c = 2;
                                if (sarVar.d.e) {
                                    sfwVar.b = 0.0f;
                                }
                                sarVar.u(sfwVar, "dot_follow");
                                aqgn.o(sarVar, new akrt(context2, (List) Collection.EL.stream(list2).map(akrs.d).collect(Collectors.toList())));
                            }
                        }
                    } else {
                        aopl aoplVar8 = aoplVar;
                        sarVar.d.a = false;
                        awrr awrrVar3 = awrrVar;
                        awsg awsgVar9 = awrrVar3.e;
                        if (awsgVar9 == null) {
                            awsgVar9 = awsg.a;
                        }
                        if ((awsgVar9.b & 4) != 0) {
                            awsg awsgVar10 = awrrVar3.e;
                            if (awsgVar10 == null) {
                                awsgVar10 = awsg.a;
                            }
                            String str3 = awsgVar10.e;
                            sarVar.t(new sff(sarVar.getContext(), str3, aqgn.m(context)));
                            sarVar.setContentDescription(str3);
                        }
                        sarVar.n(snr.h(str, aoplVar8, Arrays.asList(new Double[aoplVar8.size()])));
                    }
                    sbhVar2 = sarVar;
                }
            } else {
                frameLayout = frameLayout2;
                sbhVar = null;
                sbhVar2 = sbhVar;
            }
        } else {
            frameLayout = frameLayout2;
            sbhVar = null;
            Context context3 = cyvVar.b;
            float f4 = context3.getResources().getDisplayMetrics().density;
            float f5 = context3.getResources().getDisplayMetrics().scaledDensity;
            awsg awsgVar11 = awrrVar2.e;
            if (awsgVar11 == null) {
                awsgVar11 = awsg.a;
            }
            awrt awrtVar = awsgVar11.c == 2 ? (awrt) awsgVar11.d : awrt.a;
            awsg awsgVar12 = awrrVar2.e;
            if (awsgVar12 == null) {
                awsgVar12 = awsg.a;
            }
            if (awsgVar12.c == 2 && awrtVar.c.size() != 0) {
                aopu aopuVar = awrtVar.c;
                sbhVar2 = new sbh(context3);
                aqgn.p(sbhVar2);
                List list10 = (List) Collection.EL.stream(aopuVar).map(adgi.q).collect(Collectors.toList());
                awrv awrvVar = awrtVar.e;
                if (awrvVar == null) {
                    awrvVar = awrv.a;
                }
                if (!awrvVar.b) {
                    i = 1;
                    sbhVar2.C.a = true;
                } else {
                    i = 1;
                }
                if ((awrtVar.b & i) != 0) {
                    awsd awsdVar3 = awrtVar.d;
                    if (awsdVar3 == null) {
                        awsdVar3 = awsd.a;
                    }
                    sdj t2 = aqmv.t(awsdVar3);
                    sdc c2 = sbhVar2.c();
                    c2.k(new akrv());
                    c2.i((int) f4);
                    c2.b = new sdh(awsdVar3.d);
                    c2.c = t2;
                    sdg sdgVar3 = c2.d;
                    sdgVar3.f();
                    sdgVar3.d = (int) (f4 * 12.0f);
                    sdgVar3.c(f5 * 12.0f);
                    sdgVar3.e(aqgn.n(context3));
                    sdgVar3.b(aqgn.m(context3));
                } else {
                    sbhVar2.c().setVisibility(8);
                }
                final aopu aopuVar2 = awrtVar.c;
                awrv awrvVar2 = awrtVar.e;
                if (awrvVar2 == null) {
                    awrvVar2 = awrv.a;
                }
                if (Collection.EL.stream(aopuVar2).noneMatch(agat.e)) {
                    ((sde) sbhVar2.a()).setVisibility(8);
                } else {
                    sde sdeVar = (sde) sbhVar2.a();
                    int x = awwc.x(awrvVar2.c);
                    sdeVar.k((x != 0 && x == 3) ? new sdr() : new sds());
                    sdeVar.b = new sdh((List) Collection.EL.stream(aopuVar2).filter(agat.f).map(adgi.q).collect(Collectors.toList()));
                    sdeVar.c = new sdj() { // from class: akrn
                        @Override // defpackage.sdj
                        public final List a(List list11) {
                            return (List) Collection.EL.stream(aopuVar2).map(adgi.r).filter(agat.i).collect(Collectors.toList());
                        }
                    };
                    sde sdeVar2 = (sde) sbhVar2.a();
                    sdeVar2.i(0);
                    sdg sdgVar4 = sdeVar2.d;
                    sdgVar4.d = (int) (f4 * 12.0f);
                    sdgVar4.c(f5 * 12.0f);
                    sdgVar4.b(aqgn.m(context3));
                    sdgVar4.e = 0.0f;
                    sdgVar4.f();
                    sdgVar4.a();
                }
                if (Collection.EL.stream(aopuVar).anyMatch(agat.g)) {
                    sbhVar2.setImportantForAccessibility(2);
                    ArrayList o2 = amxp.o();
                    HashMap j = amxp.j();
                    for (int i6 = 0; i6 < aopuVar.size(); i6++) {
                        for (awrw awrwVar : ((awru) awrtVar.c.get(i6)).e) {
                            Integer valueOf = Integer.valueOf((awrwVar.b & 2) != 0 ? awrwVar.d : -16777216);
                            if (j.containsKey(valueOf)) {
                                list = (List) j.get(valueOf);
                            } else {
                                Double[] dArr = new Double[list10.size()];
                                Arrays.fill(dArr, Double.valueOf(0.0d));
                                List asList = Arrays.asList(dArr);
                                j.put(valueOf, asList);
                                list = asList;
                            }
                            list.set(i6, Double.valueOf(awrwVar.c));
                        }
                    }
                    int i7 = 0;
                    for (Integer num2 : j.keySet()) {
                        int i8 = i7 + 1;
                        StringBuilder sb2 = new StringBuilder(16);
                        sb2.append("data_");
                        sb2.append(i7);
                        sgt i9 = snr.i(sb2.toString(), list10, (List) j.get(num2));
                        i9.h(num2);
                        o2.add(i9);
                        i7 = i8;
                    }
                    Optional max = Collection.EL.stream(aopuVar).map(adgi.s).max(Comparator$CC.naturalOrder());
                    if (max.isPresent() && ((Integer) max.get()).intValue() > 0) {
                        ArrayList arrayList = new ArrayList();
                        int i10 = 0;
                        boolean z = false;
                        while (i10 < ((Integer) max.get()).intValue()) {
                            arrayList.add(new ArrayList());
                            boolean z2 = z;
                            for (int i11 = 0; i11 < aopuVar.size(); i11++) {
                                if ((((awrw) ((awru) aopuVar.get(i11)).e.get(i10)).b & 4) != 0) {
                                    ((List) arrayList.get(i10)).add(((awrw) ((awru) aopuVar.get(i11)).e.get(i10)).e);
                                    z2 = true;
                                }
                            }
                            i10++;
                            z = z2;
                        }
                        if (z) {
                            Context context4 = sbhVar2.getContext();
                            if (!zdg.f(context4)) {
                                aqgn.o(sbhVar2, new akrt(context4, arrayList));
                            }
                        }
                    }
                    sbhVar2.w(o2);
                } else {
                    awsg awsgVar13 = awrrVar2.e;
                    if (awsgVar13 == null) {
                        awsgVar13 = awsg.a;
                    }
                    if ((awsgVar13.b & 4) != 0) {
                        awsg awsgVar14 = awrrVar2.e;
                        if (awsgVar14 == null) {
                            awsgVar14 = awsg.a;
                        }
                        String str4 = awsgVar14.e;
                        sbhVar2.t(new sff(context3, str4, aqgn.m(context3)));
                        sbhVar2.setContentDescription(str4);
                    }
                    sbhVar2.n(smx.d("empty"));
                    sbhVar2.n(snr.i("empty", list10, Arrays.asList(new Double[list10.size()])));
                }
            }
            sbhVar2 = sbhVar;
        }
        if (sbhVar2 != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(sbhVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        akrp akrpVar = (akrp) cyrVar;
        if (this.k == akrpVar.k) {
            return true;
        }
        awrr awrrVar = this.a;
        return awrrVar == null ? akrpVar.a == null : awrrVar.equals(akrpVar.a);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }
}

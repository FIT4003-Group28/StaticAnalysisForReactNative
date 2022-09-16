package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: sab  reason: default package */
/* loaded from: classes4.dex */
public abstract class sab extends sai {
    private final Map C;
    private String E;
    private String F;
    public final Map a;
    public String b;
    public final boolean c;
    public final sfy d;

    public sab(Context context) {
        super(context);
        HashMap h = shp.h();
        this.C = h;
        HashMap h2 = shp.h();
        this.a = h2;
        this.c = true;
        sfy sfyVar = new sfy(context);
        this.d = sfyVar;
        Context context2 = getContext();
        boolean z = !true;
        sdc sdcVar = new sdc(context2);
        sdd sddVar = new sdd();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, rzz.a, 0, 0);
        sddVar.a(Integer.valueOf(obtainStyledAttributes.getInt(7, 4)));
        sddVar.a = obtainStyledAttributes.getBoolean(8, true);
        obtainStyledAttributes.recycle();
        sdcVar.b = sddVar;
        sdcVar.j();
        sdcVar.k(new sdo());
        if (!z) {
            sfc.c(sdcVar);
        } else {
            sfc.b(sdcVar);
        }
        h.put("DEFAULT", sdcVar);
        h2.put("DEFAULT", f());
        p("__DEFAULT__", new sfx(getContext(), sfyVar));
    }

    private final sdc F(String str) {
        sdc sdcVar = (sdc) this.C.get(str);
        sho.d(sdcVar != null, "No measure axis was set with name \"%s\"", str);
        return sdcVar;
    }

    private final void G(scz sczVar, boolean z) {
        int i = sczVar.e;
        sby sbyVar = (sby) sczVar.getLayoutParams();
        byte b = sbyVar.a;
        int i2 = 3;
        if (z) {
            if (i == 2) {
                b = 1;
            }
            if (i == 2) {
                i = 4;
            }
            if (i == 1) {
                b = 16;
            }
            i2 = i;
        } else {
            if (i == 4) {
                b = 4;
            }
            if (i == 4) {
                i = 2;
            }
            if (i == 3) {
                b = 8;
                i2 = 1;
            }
            i2 = i;
        }
        int i3 = sczVar.e;
        sczVar.e = i2;
        sbyVar.a = b;
        if (i3 != i2) {
            forceLayout();
        }
    }

    public final scz a() {
        return b("DEFAULT");
    }

    public final scz b(String str) {
        return (scz) this.a.get(str);
    }

    public final sdc c() {
        return F("DEFAULT");
    }

    @Override // defpackage.sbr
    protected final void d() {
        List emptyList;
        String str = this.E;
        if (str != null) {
            F(str).f();
        }
        String str2 = this.F;
        if (str2 != null) {
            F(str2).f();
        }
        String str3 = this.b;
        if (str3 != null) {
            b(str3).f();
        }
        String str4 = this.E;
        if (str4 == null) {
            str4 = this.F;
        }
        if (str4 != null) {
            sek f = F(str4).a.f();
            for (String str5 : this.C.keySet()) {
                if (!str5.equals(this.E) && !str5.equals(this.F)) {
                    sdc sdcVar = (sdc) this.C.get(str5);
                    sdcVar.a.l(f);
                    sdcVar.f();
                }
            }
        }
        if (this.b == null || this.E == null || !this.w) {
            return;
        }
        boolean z = false;
        this.w = false;
        Map x = sai.x(this.v);
        for (String str6 : this.h) {
            if (x.containsKey(str6)) {
                emptyList = (List) x.get(str6);
            } else {
                emptyList = Collections.emptyList();
            }
            ((scd) ((sai) this).g.get(str6)).c(emptyList, this.x);
        }
        for (sbs sbsVar : this.t) {
            sbsVar.b(x, this.x);
        }
        sbo sboVar = this.A;
        if (sboVar != null) {
            sboVar.b.cancel();
        }
        this.A.b.setDuration(((sai) this).f ? ((sai) this).e : 0L);
        sbo sboVar2 = this.A;
        if (sboVar2.b.getDuration() > 0) {
            sboVar2.b.start();
        } else {
            sboVar2.a.setAnimationPercent(1.0f);
        }
        if (((sai) this).e > 0) {
            z = true;
        }
        ((sai) this).f = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sai
    public final void e() {
        Map map;
        Iterator it;
        Double d;
        List emptyList;
        sab sabVar = this;
        Map map2 = sabVar.v;
        for (String str : map2.keySet()) {
            if (sabVar.i(str).g()) {
                for (sat satVar : (List) map2.get(str)) {
                    sgt sgtVar = satVar.a;
                    sdc F = sabVar.F((String) sgtVar.e(sgu.a, "DEFAULT"));
                    satVar.c = F.a;
                    sdg sdgVar = F.d;
                    scz b = sabVar.b((String) sgtVar.e(sgu.b, "DEFAULT"));
                    satVar.d = b.a;
                    satVar.e = b.d;
                }
            }
        }
        Map x = sai.x(sabVar.v);
        for (String str2 : sabVar.h) {
            if (x.containsKey(str2)) {
                emptyList = (List) x.get(str2);
            } else {
                emptyList = Collections.emptyList();
            }
            ((scd) ((sai) sabVar).g.get(str2)).d(sabVar, emptyList, sabVar.x);
        }
        for (sbs sbsVar : sabVar.t) {
        }
        for (sdc sdcVar : sabVar.C.values()) {
            sdcVar.e();
        }
        for (scz sczVar : sabVar.a.values()) {
            sczVar.e();
        }
        Iterator it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            if (sabVar.i(str3).g()) {
                for (sat satVar2 : (List) map2.get(str3)) {
                    sgt sgtVar2 = satVar2.a;
                    String str4 = (String) sgtVar2.e(sgu.a, "DEFAULT");
                    sgp c = sgtVar2.c(sgq.a);
                    sgp d2 = sgtVar2.d(sgq.b, Double.valueOf(0.0d));
                    sgp c2 = satVar2.c();
                    scz b2 = sabVar.b((String) sgtVar2.e(sgu.b, "DEFAULT"));
                    int i = -1;
                    for (Object obj : sgtVar2.a) {
                        int i2 = i + 1;
                        b2.c(c2.a(obj, i2, sgtVar2));
                        i = i2;
                    }
                    for (Object obj2 : satVar2.g) {
                        b2.a.j(obj2);
                    }
                    sdc F2 = sabVar.F(str4);
                    Iterator it3 = sgtVar2.a.iterator();
                    boolean z = false;
                    Double d3 = null;
                    int i3 = -1;
                    while (true) {
                        if (!it3.hasNext()) {
                            map = map2;
                            it = it2;
                            d = null;
                            break;
                        }
                        Object next = it3.next();
                        i3++;
                        map = map2;
                        Object a = c2.a(next, i3, sgtVar2);
                        Double d4 = (Double) c.a(next, i3, sgtVar2);
                        Double d5 = (Double) d2.a(next, i3, sgtVar2);
                        if (d4 != null) {
                            int i4 = (d5.doubleValue() > 0.0d ? 1 : (d5.doubleValue() == 0.0d ? 0 : -1));
                            double doubleValue = d4.doubleValue();
                            if (i4 != 0) {
                                doubleValue += d5.doubleValue();
                            }
                            d = Double.valueOf(doubleValue);
                            it = it2;
                            int d6 = b2.a.d(a);
                            if (d6 < 0) {
                                d3 = d;
                            } else if (d6 > 0) {
                                break;
                            } else {
                                F2.c(d);
                                z = true;
                            }
                        } else {
                            it = it2;
                        }
                        map2 = map;
                        it2 = it;
                    }
                    for (Double d7 : satVar2.f) {
                        F2.a.j(d7);
                    }
                    if (!z) {
                        if (d3 != null) {
                            F2.c(d3);
                        }
                        if (d != null) {
                            F2.c(d);
                        }
                    }
                    sabVar = this;
                    map2 = map;
                    it2 = it;
                }
            }
            sabVar = this;
        }
    }

    protected abstract scz f();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
        if (r1 == null) goto L57;
     */
    @Override // defpackage.sai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.util.List r11) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sab.g(java.util.List):void");
    }
}

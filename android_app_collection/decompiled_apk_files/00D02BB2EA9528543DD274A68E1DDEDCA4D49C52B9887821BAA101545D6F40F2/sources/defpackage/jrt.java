package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jrt  reason: default package */
/* loaded from: classes7.dex */
public class jrt implements jrc {
    public final gga b;
    public final jsh e;
    private final jsc i;
    private final jrm j;
    private final jsl k;
    private final jso l;
    private static final dcep<dkdt> g = dcep.D(dkdt.NEWLY_BOOKABLE, dkdt.PAST_BOOKINGS, dkdt.DEAL);
    public static final dcdc<jry> a = dcdc.g(jry.b, jry.c);
    private static final dcdn<jry, cjtd> h = dcdn.l(jry.b, cjtd.a(dtxv.c), jry.c, cjtd.a(dtxv.a));
    private boolean m = true;
    public int f = 0;
    private int p = 0;
    @dzsi
    jrj d = null;
    public dcdc<jrb> c = dcdc.e();
    private String n = "";
    private String o = "";

    public jrt(gga ggaVar, jsc jscVar, jrm jrmVar, jsl jslVar, jso jsoVar, jsh jshVar) {
        this.b = ggaVar;
        this.i = jscVar;
        this.j = jrmVar;
        this.k = jslVar;
        this.l = jsoVar;
        this.e = jshVar;
    }

    @Override // defpackage.jrc
    public jib a() {
        jhz jhzVar = new jhz();
        jhzVar.a = this.b.getString(R.string.MADDEN_LANDING_PAGE_TITLE);
        jhzVar.f(new jrp(this));
        jhzVar.x = false;
        if (this.e.a()) {
            jhm jhmVar = new jhm();
            jhmVar.a = this.b.getString(R.string.HOMESCREEN_SHORTCUT_MENU_ITEM_TITLE);
            jhmVar.d(new jrq(this));
            jhmVar.f = cjtd.a(dtxv.e);
            jhzVar.c(jhmVar.c());
        }
        return jhzVar.b();
    }

    @Override // defpackage.jrc
    public jic b() {
        return new jic("https://www.gstatic.com/maps/reserve/home/hero.jpg", ckqc.FULLY_QUALIFIED, 2131231874);
    }

    @Override // defpackage.jrc
    public String c() {
        return this.n;
    }

    @Override // defpackage.jrc
    public String d() {
        return this.o;
    }

    @Override // defpackage.jrc
    public List<jrb> e() {
        return this.c;
    }

    @Override // defpackage.jrc
    @dzsi
    public jrj f() {
        return this.d;
    }

    @Override // defpackage.jrc
    public Integer g() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.jrc
    public Boolean h() {
        return Boolean.valueOf(this.m);
    }

    public void i(dkdo dkdoVar, String str, String str2, jry jryVar) {
        int i;
        jsk jskVar;
        dccx dccxVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        dcdc r;
        jsn jsnVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i3;
        dkdo dkdoVar2 = dkdoVar;
        this.m = false;
        this.n = str;
        this.o = str2;
        dcdn o = dcjz.o(dkdoVar2.b, jrn.a);
        HashMap hashMap = new HashMap();
        dcde e = dckz.e(dkdoVar2.c, jro.a);
        for (K k : o.keySet()) {
            hashMap.put(k, new jrr((dhmz) o.get(k), e.f(k)));
        }
        dccx F = dcdc.F();
        this.f = 0;
        ArrayList arrayList5 = new ArrayList();
        dcdc<jry> dcdcVar = a;
        int size = dcdcVar.size();
        int i4 = 0;
        while (i4 < size) {
            jry jryVar2 = dcdcVar.get(i4);
            dsrj<dkdu> dsrjVar = dkdoVar2.a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            dceq a2 = dcet.a();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            for (dkdu dkduVar : dsrjVar) {
                String str3 = dkduVar.a;
                jrr jrrVar = (jrr) hashMap.get(str3);
                if (jrrVar != null) {
                    HashMap hashMap4 = hashMap;
                    if (jryVar2.equals(jrrVar.b)) {
                        linkedHashSet.add(jrrVar.a);
                        Iterator<dkdr> it = dkduVar.c.iterator();
                        boolean z = false;
                        boolean z2 = false;
                        while (it.hasNext()) {
                            Iterator<dkdr> it2 = it;
                            dkdr next = it.next();
                            dcdc<jry> dcdcVar2 = dcdcVar;
                            if ((next.a & 1) != 0) {
                                dkdt b = dkdt.b(next.b);
                                if (b == null) {
                                    b = dkdt.UNKNOWN_REASON;
                                }
                                a2.b(str3, b);
                                dkdt dkdtVar = dkdt.RECOMMENDED;
                                i3 = size;
                                dkdt b2 = dkdt.b(next.b);
                                if (b2 == null) {
                                    b2 = dkdt.UNKNOWN_REASON;
                                }
                                if (dkdtVar.equals(b2)) {
                                    z2 = true;
                                } else {
                                    dcep<dkdt> dcepVar = g;
                                    dkdt b3 = dkdt.b(next.b);
                                    if (b3 == null) {
                                        b3 = dkdt.UNKNOWN_REASON;
                                    }
                                    if (dcepVar.contains(b3)) {
                                        z = true;
                                    }
                                }
                            } else {
                                i3 = size;
                            }
                            it = it2;
                            dcdcVar = dcdcVar2;
                            size = i3;
                        }
                        dcdc<jry> dcdcVar3 = dcdcVar;
                        int i5 = size;
                        if (jrrVar.c.containsKey(dkduVar.b)) {
                            dhnd dhndVar = jrrVar.c.get(dkduVar.b);
                            dbsk.s(dhndVar);
                            if (dhndVar.e.length() >= 30 && !z) {
                                if (z2 && !hashMap2.containsKey(str3)) {
                                    hashMap2.put(str3, dhndVar);
                                }
                                if (!hashMap3.containsKey(str3)) {
                                    hashMap3.put(str3, dhndVar);
                                }
                            }
                        }
                        hashMap = hashMap4;
                        dcdcVar = dcdcVar3;
                        size = i5;
                    } else {
                        hashMap = hashMap4;
                    }
                }
            }
            HashMap hashMap5 = hashMap;
            dcdc<jry> dcdcVar4 = dcdcVar;
            int i6 = size;
            dcet a3 = a2.a();
            ArrayList arrayList6 = new ArrayList();
            String c = jryVar2.c(this.b);
            linkedHashSet.size();
            hashMap3.size();
            hashMap2.size();
            if (c == null || hashMap3.size() < 2) {
                dccxVar = F;
                arrayList = arrayList6;
                arrayList2 = arrayList5;
                i2 = i4;
                r = dcdc.r(linkedHashSet);
            } else {
                Iterator it3 = linkedHashSet.iterator();
                int i7 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        dccxVar = F;
                        arrayList4 = arrayList6;
                        arrayList2 = arrayList5;
                        i2 = i4;
                        break;
                    }
                    dhmz dhmzVar = (dhmz) it3.next();
                    Iterator it4 = it3;
                    i2 = i4;
                    double size2 = hashMap2.size();
                    dccxVar = F;
                    arrayList4 = arrayList6;
                    double size3 = linkedHashSet.size();
                    Double.isNaN(size3);
                    if (size2 >= size3 * 0.4d) {
                        arrayList2 = arrayList5;
                        break;
                    }
                    String str4 = dhmzVar.b;
                    ArrayList arrayList7 = arrayList5;
                    double size4 = hashMap2.size();
                    Double.isNaN(size4);
                    if (i7 < size4 / 0.6666666666666666d) {
                        if (hashMap2.containsKey(str4)) {
                            arrayList5 = arrayList7;
                            it3 = it4;
                            i4 = i2;
                            F = dccxVar;
                            arrayList6 = arrayList4;
                        }
                        i7++;
                        arrayList5 = arrayList7;
                        it3 = it4;
                        i4 = i2;
                        F = dccxVar;
                        arrayList6 = arrayList4;
                    } else {
                        if (!hashMap3.containsKey(str4) || hashMap2.containsKey(str4)) {
                            if (hashMap2.containsKey(str4)) {
                            }
                            i7++;
                        } else {
                            hashMap2.put(str4, (dhnd) hashMap3.get(str4));
                        }
                        arrayList5 = arrayList7;
                        it3 = it4;
                        i4 = i2;
                        F = dccxVar;
                        arrayList6 = arrayList4;
                    }
                }
                dccx F2 = dcdc.F();
                dccx F3 = dcdc.F();
                Iterator it5 = linkedHashSet.iterator();
                while (it5.hasNext()) {
                    dhmz dhmzVar2 = (dhmz) it5.next();
                    if (hashMap2.containsKey(dhmzVar2.b)) {
                        F2.g(dhmzVar2);
                    } else {
                        F3.g(dhmzVar2);
                    }
                }
                dcdc f = F2.f();
                if (!f.isEmpty()) {
                    arrayList = arrayList4;
                    arrayList.add(this.i.a(c, f, hashMap2, a3, jryVar2));
                } else {
                    arrayList = arrayList4;
                }
                r = F3.f();
            }
            dcdc dcdcVar5 = r;
            if (!dcdcVar5.isEmpty()) {
                arrayList.add(this.i.a(jryVar2.d(this.b), dcdcVar5, dcmn.a, a3, jryVar2));
            }
            if (arrayList.isEmpty()) {
                jsnVar = null;
            } else {
                jso jsoVar = this.l;
                jqz b4 = jryVar2.b(this.b, this.j);
                cjtd cjtdVar = h.get(jryVar2);
                dbsk.s(cjtdVar);
                jso.a(jsoVar.a.a(), 1);
                jsh a4 = jsoVar.b.a();
                jso.a(a4, 2);
                jso.a(arrayList, 4);
                jso.a(cjtdVar, 5);
                jsnVar = new jsn(a4, b4, arrayList, cjtdVar);
            }
            if (jsnVar != null) {
                if (jryVar2.equals(jryVar)) {
                    this.f = arrayList2.size();
                }
                arrayList3 = arrayList2;
                arrayList3.add(jryVar2);
                F = dccxVar;
                F.g(jsnVar);
            } else {
                arrayList3 = arrayList2;
                F = dccxVar;
            }
            i4 = i2 + 1;
            dkdoVar2 = dkdoVar;
            arrayList5 = arrayList3;
            hashMap = hashMap5;
            dcdcVar = dcdcVar4;
            size = i6;
        }
        ArrayList arrayList8 = arrayList5;
        this.p = this.f;
        dcdc<jrb> f2 = F.f();
        this.c = f2;
        if (f2.isEmpty() || !j()) {
            i = 1;
        } else {
            i = 1;
            this.c.get(this.p).b(true);
        }
        if (this.c.size() <= i) {
            jskVar = null;
        } else {
            jsl jslVar = this.k;
            jrs jrsVar = new jrs(this);
            dcdc r2 = dcdc.r(arrayList8);
            int i8 = this.f;
            Activity activity = (Activity) ((dxjd) jslVar.a).a;
            jsl.a(activity, 1);
            jsl.a(jrsVar, 2);
            jsl.a(r2, 3);
            jskVar = new jsk(activity, jrsVar, r2, i8);
        }
        this.d = jskVar;
    }

    public final boolean j() {
        boolean b;
        if (this.p == this.f && this.e.a()) {
            jsh jshVar = this.e;
            if (!ako.a()) {
                b = jshVar.b.m(bvjk.fT, false);
            } else {
                b = jshVar.b();
            }
            if (!b) {
                jsh jshVar2 = this.e;
                if (jshVar2.b.w(bvjk.fU, 0L) <= jshVar2.c.b() - TimeUnit.DAYS.toMillis(15L) && !this.c.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}

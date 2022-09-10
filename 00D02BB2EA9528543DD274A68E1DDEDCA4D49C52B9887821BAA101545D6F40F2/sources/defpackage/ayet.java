package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayet  reason: default package */
/* loaded from: classes3.dex */
public final class ayet implements jkh {
    @dzsi
    public baad a;
    @dzsi
    jjn c;
    private final Activity e;
    private final akpm f;
    private final gll g;
    private final dxio<akzh> h;
    private boolean i;
    @dzsi
    public akqs d = null;
    public final List<azxk> b = new ArrayList();

    public ayet(Activity activity, akpm akpmVar, gll gllVar, dxio<akzh> dxioVar) {
        this.e = activity;
        this.f = akpmVar;
        this.g = gllVar;
        this.h = dxioVar;
    }

    private static akqr d(Iterable<akqq> iterable) {
        akqr a = akqs.a();
        for (akqq akqqVar : iterable) {
            a.d(akqqVar);
        }
        return a;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        b(jjnVar2);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
    }

    public final void a(baad baadVar) {
        this.a = baadVar;
        this.b.clear();
        this.d = null;
        c();
    }

    public final void b(jjn jjnVar) {
        if (this.c != jjnVar) {
            this.c = jjnVar;
            this.i = false;
        }
        c();
    }

    public final void c() {
        dbsg dbsgVar;
        if (this.i) {
            return;
        }
        jjn jjnVar = this.c;
        if (jjnVar == null || jjnVar.b()) {
            this.i = true;
            return;
        }
        dccx F = dcdc.F();
        baad baadVar = this.a;
        if (baadVar != null) {
            dcdc<baal> i = baadVar.i();
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                baak z = i.get(i2).z();
                if (z != null) {
                    F.g(z.b());
                }
            }
        } else {
            for (azxk azxkVar : this.b) {
                F.g(azxkVar.d());
            }
        }
        dcdc f = F.f();
        if (f.isEmpty()) {
            return;
        }
        if (this.d == null) {
            dbsk.a(!f.isEmpty());
            akqs b = d(f).b();
            if (akqo.b(b) > 72.0d || akqo.a(b) > 60.0d) {
                dcdc<akqq> z2 = dcbg.b(f).x(500).z();
                ArrayList arrayList = new ArrayList();
                HashMap f2 = dcjz.f(z2.size());
                for (akqq akqqVar : z2) {
                    if (!f2.containsKey(akqqVar)) {
                        List<akqq> a = ayes.a(akqqVar, z2);
                        if (!a.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(akqqVar);
                            f2.put(akqqVar, ayer.CLUSTERED);
                            ArrayList arrayList3 = new ArrayList(a);
                            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                akqq akqqVar2 = (akqq) arrayList3.get(i3);
                                if (!f2.containsKey(akqqVar2)) {
                                    List<akqq> a2 = ayes.a(akqqVar2, z2);
                                    if (!a2.isEmpty()) {
                                        HashSet hashSet = new HashSet(arrayList3);
                                        for (akqq akqqVar3 : a2) {
                                            if (!hashSet.contains(akqqVar3)) {
                                                arrayList3.add(akqqVar3);
                                            }
                                        }
                                    }
                                }
                                if (f2.get(akqqVar2) != ayer.CLUSTERED) {
                                    f2.put(akqqVar2, ayer.CLUSTERED);
                                    arrayList2.add(akqqVar2);
                                }
                            }
                            arrayList.add(arrayList2);
                        } else {
                            f2.put(akqqVar, ayer.NOISE);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    dbsk.a(!arrayList.isEmpty());
                    List list = (List) arrayList.get(0);
                    for (int i4 = 1; i4 < arrayList.size(); i4++) {
                        List list2 = (List) arrayList.get(i4);
                        if (list2.size() > list.size()) {
                            list = list2;
                        }
                    }
                    b = d(list).b();
                } else {
                    b = d(dcdc.f((akqq) f.get(0))).b();
                }
            }
            this.d = b;
        }
        Rect b2 = this.g.b();
        b2.top += ird.b().e(this.e);
        bnuw A = this.h.a().A();
        akqs akqsVar = this.d;
        dbsk.s(akqsVar);
        int i5 = b2.left;
        int i6 = b2.right;
        int i7 = b2.top;
        int i8 = b2.bottom;
        if (i6 > i5 && i8 > i7) {
            dbsgVar = dbsg.i(akyt.n(akqsVar, i5, A.a() - i6, i7, A.b() - i8));
        } else {
            dbsgVar = dbpy.a;
        }
        if (!dbsgVar.a()) {
            return;
        }
        akpm akpmVar = this.f;
        akyc akycVar = (akyc) dbsgVar.b();
        akycVar.b = 2000;
        akpmVar.p(akycVar);
        this.i = true;
    }
}

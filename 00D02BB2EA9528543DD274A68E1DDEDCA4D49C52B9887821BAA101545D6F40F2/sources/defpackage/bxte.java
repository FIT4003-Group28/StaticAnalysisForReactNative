package defpackage;

import android.app.Activity;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxte  reason: default package */
/* loaded from: classes4.dex */
public class bxte implements bxsy {
    public static final cqtd a = cqrt.g(2131232726, ibl.q());
    private static final Html.ImageGetter d = bxta.a;
    public final dxio<axwy> b;
    public final dxio<anhg> c;
    private final dxio<btpc> e;
    private final dxio<bxtr> f;
    private final dxio<bxtt> g;
    private final List<bxsz> h = new ArrayList();
    private final gga i;
    private final cjqy j;
    private final cjqq k;
    private final wdy l;
    private final wfw m;
    private final boolean n;
    private final boolean o;
    private final wfz p;
    private acpa q;
    private boolean r;

    public bxte(cqhn cqhnVar, dxio<btpc> dxioVar, dxio<bxtr> dxioVar2, dxio<bxtt> dxioVar3, wfx wfxVar, dxio<axwy> dxioVar4, dxio<anhg> dxioVar5, dxio<batn> dxioVar6, gga ggaVar, wdw wdwVar, wdy wdyVar, cjqy cjqyVar, cjqq cjqqVar, boolean z, boolean z2, wfz wfzVar) {
        wfw wfwVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
        this.b = dxioVar4;
        this.c = dxioVar5;
        this.i = ggaVar;
        this.j = cjqyVar;
        this.k = cjqqVar;
        this.l = wdyVar;
        boolean z3 = true;
        if (z) {
            gga a2 = wfxVar.a.a();
            wfx.a(a2, 1);
            wfx.a(wfxVar.b.a(), 2);
            dxio a3 = ((dxjh) wfxVar.c).a();
            wfx.a(a3, 3);
            dxio a4 = ((dxjh) wfxVar.d).a();
            wfx.a(a4, 4);
            cjqq a5 = wfxVar.e.a();
            wfx.a(a5, 5);
            cjqy a6 = wfxVar.f.a();
            wfx.a(a6, 6);
            wfx.a(wfxVar.g.a(), 7);
            wfx.a(wfxVar.h.a(), 8);
            wfx.a(wfzVar, 10);
            wfwVar = new wfw(a2, a3, a4, a5, a6, false, wfzVar);
        } else {
            wfwVar = null;
        }
        this.m = wfwVar;
        this.n = (!z || !wdwVar.b()) ? false : z3;
        this.o = false;
        this.p = wfzVar;
    }

    @Override // defpackage.bxsy
    public List<bxsz> a() {
        return this.h;
    }

    @Override // defpackage.bxsy
    public Boolean b() {
        return Boolean.valueOf(this.r);
    }

    @Override // defpackage.bxsy
    public String c() {
        return this.i.getString(R.string.RESERVATIONS_SUGGESTIONS_HEADER);
    }

    @Override // defpackage.bxsy
    public acpa d() {
        if (this.q == null) {
            String string = this.i.getString(R.string.RESERVATIONS_SUGGESTIONS_TOOLTIP);
            bxtb bxtbVar = new bxtb(this);
            bxtc bxtcVar = new bxtc(this);
            String valueOf = String.valueOf(string);
            Spanned fromHtml = Html.fromHtml(valueOf.length() != 0 ? "&#8203;".concat(valueOf) : new String("&#8203;"), d, new bxtd(bxtbVar, bxtcVar, this.i.getResources().getColor(R.color.google_blue700)));
            this.q = new acpc(fromHtml, fromHtml, a);
        }
        return this.q;
    }

    @Override // defpackage.bxsy
    public wfn e() {
        if (!this.r) {
            return this.m;
        }
        return null;
    }

    public void f(EnumMap<dndr, azva> enumMap, List<drjs> list, List<azva> list2, axuc axucVar, bxsj bxsjVar) {
        ArrayList arrayList;
        azva azvaVar;
        int i;
        int i2;
        dcdc dcdcVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean b;
        EnumMap<dndr, azva> enumMap2 = enumMap;
        axuc axucVar2 = axucVar;
        this.h.clear();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        dcdc g = dcdc.g(dndr.HOME, dndr.WORK);
        int size = g.size();
        int i3 = 0;
        while (i3 < size) {
            dndr dndrVar = (dndr) g.get(i3);
            if (enumMap2.containsKey(dndrVar) && ((azvaVar = enumMap2.get(dndrVar)) != null || this.e.a().i())) {
                bxtr a2 = this.f.a();
                int size2 = arrayList4.size();
                ArrayList arrayList6 = arrayList5;
                wfz wfzVar = this.p;
                gga a3 = a2.a.a();
                bxtr.a(a3, 1);
                gft gftVar = (gft) ((dxjd) a2.b).a;
                bxtr.a(gftVar, 2);
                dxio a4 = ((dxjh) a2.c).a();
                bxtr.a(a4, 3);
                btvo a5 = a2.d.a();
                bxtr.a(a5, 4);
                bxtr.a(bxsjVar, 5);
                bxtr.a(dndrVar, 7);
                bxtr.a(axucVar2, 8);
                bxtr.a(wfzVar, 11);
                i = i3;
                i2 = size;
                dcdcVar = g;
                arrayList2 = arrayList6;
                arrayList3 = arrayList4;
                bxtq bxtqVar = new bxtq(a3, gftVar, a4, a5, bxsjVar, azvaVar, dndrVar, axucVar, size2, false, wfzVar);
                arrayList3.add(bxtqVar);
                if (this.n) {
                    int ordinal = dndrVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            if (azvaVar != null) {
                                b = this.l.b(wdv.d());
                            } else {
                                b = this.l.b(wdv.f());
                            }
                        }
                    } else if (azvaVar != null) {
                        b = this.l.b(wdv.c());
                    } else {
                        b = this.l.b(wdv.e());
                    }
                    if (!b) {
                    }
                }
                arrayList2.add(bxtqVar);
            } else {
                i = i3;
                i2 = size;
                dcdcVar = g;
                arrayList2 = arrayList5;
                arrayList3 = arrayList4;
            }
            i3 = i + 1;
            arrayList5 = arrayList2;
            arrayList4 = arrayList3;
            size = i2;
            g = dcdcVar;
            enumMap2 = enumMap;
            axucVar2 = axucVar;
        }
        ArrayList arrayList7 = arrayList5;
        ArrayList arrayList8 = arrayList4;
        wfw wfwVar = this.m;
        if (wfwVar != null) {
            arrayList = arrayList8;
            wfwVar.h(arrayList7, list2, bxsjVar, axucVar);
        } else {
            arrayList = arrayList8;
        }
        this.h.addAll(arrayList);
        this.r = false;
        for (drjs drjsVar : list) {
            if (this.h.size() >= 2) {
                break;
            }
            List<bxsz> list3 = this.h;
            bxtt a6 = this.g.a();
            int size3 = this.h.size();
            gft gftVar2 = (gft) ((dxjd) a6.a).a;
            bxtt.a(gftVar2, 1);
            dxio a7 = ((dxjh) a6.b).a();
            bxtt.a(a7, 2);
            Activity activity = (Activity) ((dxjd) a6.c).a;
            bxtt.a(activity, 3);
            bxtt.a(drjsVar, 4);
            list3.add(new bxts(gftVar2, a7, activity, drjsVar, size3));
            this.r = true;
        }
        cqkx.p(this);
    }

    public Boolean g() {
        return Boolean.valueOf(!this.h.isEmpty());
    }

    public final void h(View view, ddho ddhoVar) {
        cjtd a2 = cjtd.a(ddhoVar);
        this.j.j(this.k.f(view).d(a2), a2);
    }
}

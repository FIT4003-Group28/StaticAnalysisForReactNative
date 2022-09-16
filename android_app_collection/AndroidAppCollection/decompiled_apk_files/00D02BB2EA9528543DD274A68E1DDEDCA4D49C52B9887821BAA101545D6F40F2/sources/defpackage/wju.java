package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: wju  reason: default package */
/* loaded from: classes7.dex */
public class wju implements wjm {
    private final dooj a;
    private final zsf b;
    @dzsi
    private final String c;
    private final List<wpv> d;
    private final List<wjl> e;
    private final boolean f;

    public wju(vtn vtnVar, wsm wsmVar, @dzsi akqi akqiVar, String str, dooj doojVar, @dzsi jhk jhkVar, dooo doooVar, dool doolVar) {
        boolean z;
        doog doogVar;
        ArrayList arrayList;
        this.b = new zsf(vtnVar, doooVar.c, jhkVar);
        this.a = doojVar;
        Iterator<doog> it = doooVar.e.iterator();
        loop0: while (true) {
            z = true;
            if (!it.hasNext()) {
                z = false;
                break;
            }
            for (dood doodVar : xkg.s(it.next())) {
                if (doodVar.b == 1) {
                    for (dpce dpceVar : ((dooa) doodVar.c).l) {
                        int a = dpcd.a(dpceVar.b);
                        if (a != 0 && a == 16) {
                            break loop0;
                        }
                    }
                    continue;
                }
            }
        }
        this.f = z;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<doog> it2 = doooVar.e.iterator();
        while (it2.hasNext()) {
            doog next = it2.next();
            zsf zsfVar = this.b;
            boolean z2 = this.f;
            ArrayList arrayList4 = new ArrayList();
            Iterator<dood> it3 = xkg.s(next).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    doogVar = next;
                    arrayList = arrayList3;
                    break;
                }
                boolean z3 = z2;
                zsf zsfVar2 = zsfVar;
                doogVar = next;
                arrayList = arrayList3;
                arrayList4 = arrayList4;
                arrayList4.add(wsmVar.a(akqiVar, str, null, null, doojVar, zsfVar2, doolVar, next.b, null, wsk.ALWAYS_RELEVANT, Collections.singletonList(it3.next()), dtyc.eO, dtyc.eQ, null, arrayList4.size(), null, true, true, false));
                if (!z3) {
                    break;
                }
                arrayList3 = arrayList;
                z2 = z3;
                zsfVar = zsfVar2;
                next = doogVar;
            }
            if (this.f) {
                arrayList.add(new wjt(doogVar, arrayList4));
            } else {
                arrayList2.addAll(arrayList4);
            }
            arrayList3 = arrayList;
        }
        wso.a(arrayList2);
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = Collections.unmodifiableList(arrayList3);
        this.c = xkg.j(doooVar.e);
    }

    @Override // defpackage.wjm
    public List<wpv> a() {
        return this.d;
    }

    @Override // defpackage.wjm
    public List<wjl> b() {
        return this.e;
    }

    @Override // defpackage.wjm
    public dooj c() {
        return this.a;
    }

    @Override // defpackage.wjm
    public boolean d() {
        return this.f;
    }

    @Override // defpackage.zef
    public zvb e() {
        return this.b.e();
    }

    @Override // defpackage.zef
    @dzsi
    public String f() {
        return this.b.f();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk g() {
        return this.b.g();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk h() {
        return this.b.h();
    }

    @Override // defpackage.zef
    @dzsi
    public akqi i() {
        return this.b.i();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk j() {
        return this.b.j();
    }

    @Override // defpackage.zef
    @dzsi
    public String k() {
        return this.c;
    }

    @Override // defpackage.zef
    @dzsi
    public zvb l() {
        return this.b.l();
    }

    @Override // defpackage.zef
    @dzsi
    public View.OnClickListener m() {
        return null;
    }

    @Override // defpackage.zef
    @dzsi
    public cjtd n() {
        return cjtd.b;
    }

    @Override // defpackage.zef
    @dzsi
    public jhk o() {
        return this.b.o();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk p() {
        return this.b.p();
    }

    @Override // defpackage.zef
    @dzsi
    public Integer q() {
        return this.b.q();
    }
}

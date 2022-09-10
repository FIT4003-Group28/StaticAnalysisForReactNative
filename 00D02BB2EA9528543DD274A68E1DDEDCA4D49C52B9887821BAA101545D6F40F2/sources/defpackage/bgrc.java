package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bgrc  reason: default package */
/* loaded from: classes3.dex */
public final class bgrc implements brlm {
    public final Activity a;
    public final btvo b;
    public final Set<String> c;
    private final bgrb d;
    private final akpm e;
    private final String f;
    private final brpd g;
    private final btxz h;
    private final Set<String> i;
    private boolean j;

    public bgrc(Activity activity, akpm akpmVar, brpd brpdVar, ckcw ckcwVar, btvo btvoVar, bgrb bgrbVar, List<String> list, String str, List<String> list2) {
        this.a = activity;
        this.d = bgrbVar;
        this.e = akpmVar;
        this.f = str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.c = linkedHashSet;
        linkedHashSet.addAll(list);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.i = linkedHashSet2;
        linkedHashSet2.addAll(list2);
        this.g = brpdVar;
        this.b = btvoVar;
        this.h = new btxz(ckcwVar, dunt.TACTILE_SEARCH_REQUEST);
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        this.j = false;
        brlu brluVar = brlnVar.e;
        for (dwil dwilVar : brlnVar.b().J) {
            this.c.remove(dwilVar.b);
            this.i.remove(dwilVar.b);
        }
        if (this.c.isEmpty()) {
            this.c.addAll(this.i);
        }
        this.d.a(brluVar);
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        this.j = false;
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        this.j = false;
    }

    public final void d() {
        if (this.c.isEmpty() || this.j) {
            return;
        }
        this.j = true;
        dwim bZ = dwir.R.bZ();
        String str = this.f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        str.getClass();
        dwirVar.a |= 1;
        dwirVar.c = str;
        dhjx aa = this.e.aa();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar2 = (dwir) bZ.b;
        aa.getClass();
        dwirVar2.d = aa;
        dwirVar2.a |= 2;
        Iterator<String> it = this.c.iterator();
        for (int i = 0; i < 10 && it.hasNext(); i++) {
            String next = it.next();
            dwik bZ2 = dwil.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwil dwilVar = (dwil) bZ2.b;
            next.getClass();
            dwilVar.a |= 1;
            dwilVar.b = next;
            bZ.b(bZ2.bK());
        }
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.placecollection_coverphoto_size);
        dhkc bZ3 = dhkd.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ3.b;
        int i2 = 1 | dhkdVar.a;
        dhkdVar.a = i2;
        dhkdVar.b = dimensionPixelSize;
        dhkdVar.a = i2 | 2;
        dhkdVar.c = dimensionPixelSize;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar3 = (dwir) bZ.b;
        dhkd bK = bZ3.bK();
        bK.getClass();
        dwirVar3.q = bK;
        dwirVar3.a |= 4194304;
        dnzj dnzjVar = ((dwir) bZ.b).t;
        if (dnzjVar == null) {
            dnzjVar = dnzj.Z;
        }
        dsqp dsqpVar = (dsqp) dnzjVar.cu(5);
        dsqpVar.bC(dnzjVar);
        dnyc dnycVar = (dnyc) dsqpVar;
        if (dnycVar.c) {
            dnycVar.bF();
            dnycVar.c = false;
        }
        dnzj.c((dnzj) dnycVar.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar4 = (dwir) bZ.b;
        dnzj bK2 = dnycVar.bK();
        bK2.getClass();
        dwirVar4.t = bK2;
        dwirVar4.a |= 67108864;
        final brln brlnVar = new brln(bZ.bK(), new iqy());
        brlnVar.f = this;
        this.g.a(brlnVar.b(), null, brpb.ONLINE_ONLY, this.h, new brpa(this, brlnVar) { // from class: bgra
            private final bgrc a;
            private final brln b;

            {
                this.a = this;
                this.b = brlnVar;
            }

            @Override // defpackage.brpa
            public final void a(dwiv dwivVar, bttq bttqVar, boolean z) {
                bgrc bgrcVar = this.a;
                brln brlnVar2 = this.b;
                if (dwivVar != null) {
                    brlnVar2.h(dwivVar, bgrcVar.a.getApplication(), bgrcVar.b);
                }
                brlnVar2.o(bttqVar);
            }
        }, bvrj.UI_THREAD, this.b.getSearchParameters().i().a).a();
    }

    public final void e(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        this.c.clear();
        for (String str : this.i) {
            if (list.contains(str)) {
                this.c.add(str);
            }
        }
    }
}

package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bovq  reason: default package */
/* loaded from: classes3.dex */
public class bovq implements bvwz {
    public final gga a;
    @dzsi
    public final bwrs<ilo> b;
    protected final bovf c;
    public final acwo d;
    @dzsi
    private final bokf e;
    private final bbul f;
    private final akfa g;
    private final bbtk h;
    private final bvrb i;

    /* JADX INFO: Access modifiers changed from: protected */
    public bovq(bovn bovnVar) {
        this.a = bovnVar.c;
        this.f = bovnVar.d;
        this.g = bovnVar.e;
        this.h = bovnVar.f;
        this.c = bovnVar.g;
        this.b = bovnVar.h;
        this.e = bovnVar.i;
        this.d = bovnVar.a;
        this.i = bovnVar.b;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new bovm(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public String c() {
        return "rap.sc";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(bovp bovpVar) {
        List<dafb<B>> list;
        botz botzVar = (botz) bovpVar;
        f(botzVar.a, botzVar.c);
        e(botzVar.b);
        final bovf bovfVar = this.c;
        bwrs<ilo> bwrsVar = this.b;
        if (bovfVar.a.d()) {
            bovfVar.b.S(bvjk.jq, true);
        }
        if (bwrsVar != null) {
            ilo c = bwrsVar.c();
            if (bovfVar.i.a(c)) {
                bovfVar.f.M(null);
                dafk b = ckos.b(bovfVar.e.findViewById(16908290), R.string.MERCHANT_EDIT_SAVED_MESSAGE, 0);
                bove boveVar = new bove();
                dafb<dafk> dafbVar = b.a;
                if (dafbVar != null && (list = b.l) != 0) {
                    list.remove(dafbVar);
                }
                b.l(boveVar);
                b.a = boveVar;
                b.c();
                cjqp g = bovfVar.j.g();
                dbsk.s(c);
                cjta c2 = cjtd.c(c.bZ());
                c2.d = dtxv.cp;
                g.d(c2.a());
                this.i.a(new Runnable(this) { // from class: bovk
                    private final bovq a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d.i(dvum.FACTUAL_UGC_REPORTED, null);
                    }
                }, bvrj.UI_THREAD, 3000L);
            }
        }
        if (!bovfVar.h.getUgcParameters().A()) {
            bovfVar.f.M(bovfVar.g.c());
        } else {
            djgl djglVar = bovfVar.c;
            if (djglVar == null) {
                bovfVar.d = new Runnable(bovfVar) { // from class: bovd
                    private final bovf a;

                    {
                        this.a = bovfVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bovf bovfVar2 = this.a;
                        bovfVar2.f.M(bovfVar2.c);
                    }
                };
            } else {
                bovfVar.f.M(djglVar);
            }
        }
        this.i.a(new Runnable(this) { // from class: bovk
            private final bovq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d.i(dvum.FACTUAL_UGC_REPORTED, null);
            }
        }, bvrj.UI_THREAD, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(@dzsi dnvs dnvsVar) {
        bwrs<ilo> bwrsVar = this.b;
        if (bwrsVar == null) {
            return;
        }
        ilo c = bwrsVar.c();
        dbsk.s(c);
        doas bZ = doav.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doav doavVar = (doav) bZ.b;
        doavVar.b = 1;
        int i = 1 | doavVar.a;
        doavVar.a = i;
        int i2 = i | 4;
        doavVar.a = i2;
        doavVar.d = false;
        if (dnvsVar != null) {
            dnvsVar.getClass();
            doavVar.e = dnvsVar;
            doavVar.a = i2 | 16;
        }
        ily g = c.g();
        g.y(bZ.bK());
        this.b.d(g.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(@dzsi String str, @dzsi bbvh bbvhVar) {
        btlu j;
        if (this.e == null || bbvhVar == null || (j = this.g.j()) == null) {
            return;
        }
        String str2 = j.s().name;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList<bbtm> b = this.e.b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            bbtj b2 = this.h.b(b.get(i));
            if (!hashSet.contains(b2.a())) {
                hashSet.add(b2.a());
                if (str != null) {
                    b2.h(str);
                }
                arrayList.add(b2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f.h(str2, this.b != null ? dwyd.REPORT_A_PROBLEM : dwyd.ADD_A_PLACE, bbvhVar, arrayList, cjqm.a);
    }
}

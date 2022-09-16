package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aqps  reason: default package */
/* loaded from: classes2.dex */
public class aqps implements aqqm {
    private static final dcqe f = dcqe.c("aqps");
    public final cqhn b;
    public final aqql c;
    private final dxio<aqpp> g;
    @dzsi
    private ctyy h;
    public final Object a = new Object();
    public boolean e = false;
    private dcdc<aqql> i = dcdc.e();
    private dcep<String> j = dcmr.a;
    public final HashSet<aqqe> d = new HashSet<>();

    public aqps(Context context, cqhn cqhnVar, dxio<aqpp> dxioVar) {
        this.b = cqhnVar;
        this.g = dxioVar;
        String string = context.getString(R.string.STATUS_MESSAGING_OFF);
        string.getClass();
        this.c = new aqpf(string);
    }

    @Override // defpackage.aqqm
    public dcdc<aqql> a() {
        dcdc<aqql> dcdcVar = this.i;
        int size = dcdcVar.size();
        final boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            aqql aqqlVar = dcdcVar.get(i);
            if (aqqlVar.b() == 2) {
                aqqe c = aqqlVar.c();
                if (c instanceof aqpo) {
                    aqpo aqpoVar = (aqpo) c;
                    if (aqpoVar.a() && !aqpoVar.i().booleanValue()) {
                        z = true;
                        break;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        return dcdc.q(dcft.i(dcdcVar, new dbsl(this, z) { // from class: aqpq
            private final aqps a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                aqps aqpsVar = this.a;
                boolean z2 = this.b;
                aqql aqqlVar2 = (aqql) obj;
                if (aqqlVar2.b() == 1) {
                    return aqqlVar2 == aqpsVar.c && z2;
                }
                aqqe c2 = aqqlVar2.c();
                if (!(c2 instanceof aqpo)) {
                    return false;
                }
                return ((aqpo) c2).a();
            }
        }));
    }

    public void b(ctyy ctyyVar, dcep<String> dcepVar) {
        final aqps aqpsVar = this;
        synchronized (aqpsVar.a) {
            if (aqpsVar.j.equals(dcepVar) && ctyyVar.equals(aqpsVar.h)) {
                return;
            }
            c();
            aqpsVar.h = ctyyVar;
            aqpsVar.j = dcepVar;
            synchronized (aqpsVar.a) {
                int i = 1;
                try {
                    aqpsVar.e = true;
                    dccx F = dcdc.F();
                    dcep<String> dcepVar2 = aqpsVar.j;
                    dbsk.s(dcepVar2);
                    dcpd<String> it = dcepVar2.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        aqpp a = aqpsVar.g.a();
                        ctyy ctyyVar2 = aqpsVar.h;
                        dbsk.s(ctyyVar2);
                        gga a2 = a.a.a();
                        aqpp.a(a2, i);
                        cqhn a3 = a.b.a();
                        aqpp.a(a3, 2);
                        czsy a4 = a.c.a();
                        aqpp.a(a4, 3);
                        aqgo a5 = a.d.a();
                        aqpp.a(a5, 4);
                        dxio a6 = ((dxjh) a.e).a();
                        aqpp.a(a6, 5);
                        aprv a7 = a.f.a();
                        aqpp.a(a7, 6);
                        dxio a8 = ((dxjh) a.g).a();
                        dcpd<String> dcpdVar = it;
                        aqpp.a(a8, 7);
                        dxio a9 = ((dxjh) a.h).a();
                        dccx dccxVar = F;
                        aqpp.a(a9, 8);
                        dxio a10 = ((dxjh) a.i).a();
                        try {
                            aqpp.a(a10, 9);
                            dxio a11 = ((dxjh) a.j).a();
                            aqpp.a(a11, 10);
                            aqpp.a(ctyyVar2, 11);
                            aqpp.a(next, 12);
                            aqpo aqpoVar = new aqpo(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, ctyyVar2, next);
                            aqpsVar = this;
                            aqpoVar.b(new aqpn(aqpsVar) { // from class: aqpr
                                private final aqps a;

                                {
                                    this.a = aqpsVar;
                                }

                                @Override // defpackage.aqpn
                                public final void a(aqpo aqpoVar2) {
                                    aqps aqpsVar2 = this.a;
                                    synchronized (aqpsVar2.a) {
                                        if (aqpsVar2.e) {
                                            return;
                                        }
                                        boolean z = false;
                                        if (aqpoVar2.a() && aqpsVar2.d.contains(aqpoVar2)) {
                                            aqpsVar2.d.remove(aqpoVar2);
                                            z = true;
                                        }
                                        boolean d = aqpsVar2.d() | z;
                                        if (!d) {
                                            return;
                                        }
                                        new Handler(Looper.getMainLooper()).post(new apzx(aqpsVar2));
                                    }
                                }
                            });
                            dccxVar.g(new aqpg(aqpoVar));
                            aqpsVar.d.add(aqpoVar);
                            F = dccxVar;
                            i = 1;
                            it = dcpdVar;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    aqpsVar.i = F.f();
                    aqpsVar.e = false;
                    d();
                    new Handler(Looper.getMainLooper()).post(new apzx(aqpsVar));
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    public void c() {
        dcdc r;
        synchronized (this.a) {
            r = dcdc.r(this.i);
            this.i = dcdc.e();
            this.j = dcmr.a;
            this.d.clear();
            this.h = null;
        }
        int size = r.size();
        for (int i = 0; i < size; i++) {
            aqql aqqlVar = (aqql) r.get(i);
            int b = aqqlVar.b();
            if (b == 0) {
                throw null;
            }
            if (b == 2) {
                if (!(aqqlVar.c() instanceof aqpo)) {
                    bvoo.h("Expected MerchantProfileListItemViewModelImpl", new Object[0]);
                } else {
                    ((aqpo) aqqlVar.c()).l();
                }
            }
        }
    }

    public final boolean d() {
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            dcpe<aqql> listIterator = this.i.listIterator();
            while (listIterator.hasNext()) {
                aqql next = listIterator.next();
                int b = next.b();
                if (b == 0) {
                    throw null;
                }
                if (b == 2) {
                    if (next.c().i().booleanValue()) {
                        arrayList.add(next);
                    } else {
                        arrayList2.add(next);
                    }
                }
            }
            Collections.sort(arrayList);
            Collections.sort(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList);
            if (!arrayList2.isEmpty()) {
                arrayList3.add(this.c);
                arrayList3.addAll(arrayList2);
            }
            if (arrayList3.equals(this.i)) {
                return false;
            }
            this.i = dcdc.r(arrayList3);
            return true;
        }
    }
}

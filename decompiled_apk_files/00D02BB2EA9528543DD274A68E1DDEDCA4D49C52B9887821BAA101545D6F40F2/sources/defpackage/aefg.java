package defpackage;

import android.app.Activity;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import com.google.android.apps.maps.R;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aefg  reason: default package */
/* loaded from: classes.dex */
public final class aefg {
    public final Activity c;
    public final abfa d;
    public final aeet e;
    public final cqkj f;
    public final cqhn g;
    public final acyr h;
    public final dbty<Map<dktk, aeez>> i;
    @dzsi
    public cqkf<aeeq> j;
    public final ckcw k;
    public final btvo l;
    public final amfi m;
    public final cjqy n;
    private final aedv r;
    @dzsi
    public Parcelable a = null;
    public final aeff b = new aeff(this);
    public final Map<dktk, cqkf<aeeq>> o = new EnumMap(dktk.class);
    public boolean p = false;
    public boolean q = false;

    public aefg(Activity activity, abfa abfaVar, aedv aedvVar, final aeet aeetVar, cqkj cqkjVar, cqhn cqhnVar, acyr acyrVar, final aefa aefaVar, ckcw ckcwVar, btvo btvoVar, amfi amfiVar, cjqy cjqyVar) {
        this.c = activity;
        this.d = abfaVar;
        this.r = aedvVar;
        this.e = aeetVar;
        this.f = cqkjVar;
        this.g = cqhnVar;
        this.h = acyrVar;
        this.k = ckcwVar;
        this.l = btvoVar;
        this.m = amfiVar;
        this.n = cjqyVar;
        this.i = dbud.a(new dbty(aeetVar, aefaVar) { // from class: aefb
            private final aeet a;
            private final aefa b;

            {
                this.a = aeetVar;
                this.b = aefaVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                aeet aeetVar2 = this.a;
                aefa aefaVar2 = this.b;
                dcdg p = dcdn.p();
                for (aebb aebbVar : aeetVar2.a) {
                    dktk a = aebbVar.a();
                    Activity activity2 = (Activity) ((dxjd) aefaVar2.a).a;
                    aefa.a(activity2, 1);
                    abfa a2 = aefaVar2.b.a();
                    aefa.a(a2, 2);
                    acyr a3 = aefaVar2.c.a();
                    aefa.a(a3, 3);
                    aefa.a(aebbVar, 4);
                    p.f(a, new aeez(activity2, a2, a3, aebbVar));
                }
                return p.b();
            }
        });
    }

    public final Float a(@dzsi aeez aeezVar) {
        float f;
        if (aeezVar != null) {
            f = aeezVar.k().floatValue();
        } else {
            f = this.h.a().h;
        }
        return Float.valueOf(f);
    }

    public final void b(aefe aefeVar) {
        for (cqkf<aeeq> cqkfVar : i()) {
            aegc aegcVar = (aegc) cqkfVar.c();
            aegcVar.l(new aefd(aefeVar, aegcVar));
        }
    }

    public final void c(SparseArray<Parcelable> sparseArray) {
        for (cqkf<aeeq> cqkfVar : i()) {
            ((aegc) cqkfVar.c()).o().saveHierarchyState(sparseArray);
        }
        jjf f = f();
        if (f != null) {
            f.saveHierarchyState(sparseArray);
        }
    }

    @dzsi
    public final Parcelable d() {
        cqkf<aeeq> l;
        RecyclerView recyclerView;
        abs absVar;
        if (this.r.f() != dktk.EXPLORE || (l = l()) == null || (recyclerView = (RecyclerView) l.c().findViewById(R.id.scrollable_card_stream_container)) == null || (absVar = recyclerView.l) == null) {
            return null;
        }
        return absVar.B();
    }

    @dzsi
    public final aegc e() {
        cqkf<aeeq> cqkfVar = this.o.get(((aecy) this.r).t);
        if (cqkfVar == null) {
            return null;
        }
        return (aegc) cqkfVar.c();
    }

    @dzsi
    public final jjf f() {
        cqkf<aeeq> cqkfVar = this.j;
        if (cqkfVar == null) {
            return null;
        }
        return (jjf) cqkfVar.c();
    }

    public final void g(boolean z) {
        aeez aeezVar;
        if (k() && (aeezVar = this.i.a().get(this.r.f())) != null) {
            cqkf<aeeq> cqkfVar = this.j;
            if (cqkfVar != null) {
                if (true != z) {
                    aeezVar = null;
                }
                cqkfVar.e(aeezVar);
            }
            for (dktk dktkVar : this.i.a().keySet()) {
                cqkf<aeeq> cqkfVar2 = this.o.get(dktkVar);
                aeez aeezVar2 = this.i.a().get(dktkVar);
                if (cqkfVar2 != null) {
                    if (true == z) {
                        aeezVar2 = null;
                    }
                    cqkfVar2.e(aeezVar2);
                }
            }
        }
    }

    public final void h() {
        this.q = true;
    }

    public final Collection<cqkf<aeeq>> i() {
        return this.o.values();
    }

    @dzsi
    public final aeez j() {
        return this.i.a().get(this.r.f());
    }

    public final boolean k() {
        return btpf.b(this.c);
    }

    @dzsi
    public final cqkf<aeeq> l() {
        if (this.o.containsKey(dktk.EXPLORE)) {
            return this.o.get(dktk.EXPLORE);
        }
        return null;
    }
}

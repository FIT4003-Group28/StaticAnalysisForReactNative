package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import c.e.a.b.d.g.i1;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class la {

    /* renamed from: a  reason: collision with root package name */
    private c.e.a.b.d.g.i1 f7470a;

    /* renamed from: b  reason: collision with root package name */
    private Long f7471b;

    /* renamed from: c  reason: collision with root package name */
    private long f7472c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ ga f7473d;

    private la(ga gaVar) {
        this.f7473d = gaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ la(ga gaVar, ja jaVar) {
        this(gaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c.e.a.b.d.g.i1 a(String str, c.e.a.b.d.g.i1 i1Var) {
        b4 t;
        String str2;
        Object obj;
        String p = i1Var.p();
        List<c.e.a.b.d.g.k1> n = i1Var.n();
        Long l = (Long) this.f7473d.m().a(i1Var, "_eid");
        boolean z = l != null;
        if (z && p.equals("_ep")) {
            p = (String) this.f7473d.m().a(i1Var, "_en");
            if (TextUtils.isEmpty(p)) {
                this.f7473d.c().t().a("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.f7470a == null || this.f7471b == null || l.longValue() != this.f7471b.longValue()) {
                Pair<c.e.a.b.d.g.i1, Long> a2 = this.f7473d.n().a(str, l);
                if (a2 == null || (obj = a2.first) == null) {
                    this.f7473d.c().t().a("Extra parameter without existing main event. eventName, eventId", p, l);
                    return null;
                }
                this.f7470a = (c.e.a.b.d.g.i1) obj;
                this.f7472c = ((Long) a2.second).longValue();
                this.f7471b = (Long) this.f7473d.m().a(this.f7470a, "_eid");
            }
            this.f7472c--;
            if (this.f7472c <= 0) {
                e n2 = this.f7473d.n();
                n2.g();
                n2.c().B().a("Clearing complex main event info. appId", str);
                try {
                    n2.u().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e2) {
                    n2.c().s().a("Error clearing complex main event", e2);
                }
            } else {
                this.f7473d.n().a(str, l, this.f7472c, this.f7470a);
            }
            ArrayList arrayList = new ArrayList();
            for (c.e.a.b.d.g.k1 k1Var : this.f7470a.n()) {
                this.f7473d.m();
                if (v9.b(i1Var, k1Var.o()) == null) {
                    arrayList.add(k1Var);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(n);
                n = arrayList;
            } else {
                t = this.f7473d.c().t();
                str2 = "No unique parameters in main event. eventName";
                t.a(str2, p);
            }
        } else if (z) {
            this.f7471b = l;
            this.f7470a = i1Var;
            Object a3 = this.f7473d.m().a(i1Var, "_epc");
            if (a3 == null) {
                a3 = 0L;
            }
            this.f7472c = ((Long) a3).longValue();
            if (this.f7472c <= 0) {
                t = this.f7473d.c().t();
                str2 = "Complex event with zero extra param count. eventName";
                t.a(str2, p);
            } else {
                this.f7473d.n().a(str, l, this.f7472c, i1Var);
            }
        }
        i1.a j = i1Var.j();
        j.a(p);
        j.l();
        j.a(n);
        return (c.e.a.b.d.g.i1) j.i();
    }
}

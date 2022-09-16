package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arcd  reason: default package */
/* loaded from: classes.dex */
public final class arcd {
    public final btrm a;
    public final arcr b;
    public final arcc c;
    public final arcq d;
    public int e;
    public arcq f;
    public volatile boolean g = true;

    public arcd(btrm btrmVar, arcr arcrVar, bvjj bvjjVar, arcc arccVar) {
        this.a = btrmVar;
        this.b = arcrVar;
        this.c = arccVar;
        int a = arccVar.a();
        this.e = a;
        this.d = arccVar.a.a("Direction cone around the blue dot", a);
        if (bvjjVar == null || !bvjjVar.m(bvjk.at, false)) {
            return;
        }
        this.f = arccVar.a.a("Direction arrow around the blue dot", R.drawable.new_direction_pointer);
    }

    public final void a() {
        this.d.a(false);
        arcq arcqVar = this.f;
        if (arcqVar != null) {
            arcqVar.a(false);
        }
    }

    public final void b(arcq arcqVar, @dzsi akra akraVar, float f, float f2) {
        arcqVar.a(this.g);
        arcqVar.e(akraVar, Float.valueOf(f), Float.valueOf(f2), null);
    }
}

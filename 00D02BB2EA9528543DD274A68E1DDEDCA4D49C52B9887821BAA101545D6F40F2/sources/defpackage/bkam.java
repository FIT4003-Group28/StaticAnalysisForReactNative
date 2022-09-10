package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkam  reason: default package */
/* loaded from: classes3.dex */
public class bkam implements bjxa {
    private final dqcq a;
    private int b = 0;
    private final bkal c;

    static {
        dcdg p = dcdn.p();
        p.f("gcid:entertainment_and_recreation", Integer.valueOf((int) R.raw.ic_mod_local_activity));
        p.f("gcid:food_and_drink", Integer.valueOf((int) R.raw.ic_mod_restaurant));
        p.f("gcid:lodging", Integer.valueOf((int) R.raw.ic_mod_hotel));
        p.f("gcid:shopping", Integer.valueOf((int) R.raw.ic_mod_local_mall));
        p.f("gcid:transportation", Integer.valueOf((int) R.raw.ic_mod_directions_bus));
        p.b();
    }

    public bkam(cqhn cqhnVar, dqcq dqcqVar, int i, bkal bkalVar) {
        this.a = dqcqVar;
        this.c = bkalVar;
    }

    @Override // defpackage.bjxa
    public CharSequence a() {
        return this.a.a;
    }

    @Override // defpackage.bjxa
    public CharSequence b() {
        return this.c.b(this.a, this.b);
    }

    @Override // defpackage.bjxa
    public Integer c() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.bjxa
    public cqkl d() {
        this.c.a(this.a, this.b);
        return cqkl.a;
    }

    @Override // defpackage.bjxa
    public cjtd e() {
        return this.c.c(this.b);
    }

    public dqcq f() {
        return this.a;
    }

    public boolean g(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        cqkx.p(this);
        return true;
    }
}

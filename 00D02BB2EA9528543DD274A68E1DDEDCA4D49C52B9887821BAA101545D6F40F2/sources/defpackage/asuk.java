package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: asuk  reason: default package */
/* loaded from: classes2.dex */
public class asuk implements asux, crek {
    private final crem a;
    private asvr b;
    private final asvp c;
    private final boolean d;
    private boolean e = false;

    public asuk(Context context, cqhn cqhnVar, crem cremVar, btvo btvoVar) {
        boolean z = false;
        this.a = cremVar;
        asuj asujVar = new asuj(cremVar);
        this.c = asujVar;
        this.d = context.getResources().getConfiguration().smallestScreenWidthDp <= 360 ? true : z;
        this.b = new asvr(cremVar.e(), cremVar.d(), asujVar);
    }

    private final void h() {
        this.b = new asvr(this.a.e(), this.a.d(), this.c);
    }

    @Override // defpackage.crek
    public void a() {
        h();
        cqkx.p(this);
    }

    public void b() {
        this.a.a(this);
        h();
        cqkx.p(this);
    }

    public void c() {
        this.a.b(this);
    }

    @Override // defpackage.asux
    public asvr d() {
        return this.b;
    }

    @Override // defpackage.asux
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.asux
    public Boolean f() {
        return Boolean.valueOf(this.e);
    }

    public void g(boolean z) {
        if (this.e != z) {
            this.e = z;
            cqkx.p(this);
        }
    }
}

package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import defpackage.cqkp;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: mqi  reason: default package */
/* loaded from: classes7.dex */
public final class mqi<T extends cqkp> implements noq {
    public final cqiw<T> a;
    public final ntc b;
    public final mrc c;
    private final not d;
    private final mqh<T> e;
    private final cov f;
    private final cqkf<mra> g;
    private final mqg h = new mqg(this);

    public mqi(mqh<T> mqhVar, cqiw<T> cqiwVar, noo nooVar, not notVar, cqkj cqkjVar) {
        this.e = mqhVar;
        this.a = cqiwVar;
        dbsk.s(notVar);
        this.d = notVar;
        this.c = new mrc(nooVar, cqkjVar.d.getResources(), cqkjVar.d.getString(R.string.DESTINATION_CATEGORY_RECENT));
        cqkf<mra> d = cqkjVar.d(new mqt(), notVar.a(), false);
        this.g = d;
        this.b = new ntc(cqkjVar, dbsg.i(9));
        this.f = (cov) d.c().findViewById(mqt.a);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.non
    public final void a() {
        this.g.e(this.c);
        this.f.setAdapter(this.b);
        this.f.setMaxPages(3);
        this.f.a.setItemAnimator(null);
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        this.c.g(true);
        mqh<T> mqhVar = this.e;
        mql mqlVar = (mql) mqhVar;
        mqlVar.f.d(new mqk(mqlVar, this.h));
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        throw null;
    }

    @Override // defpackage.non
    public final void e() {
    }

    @Override // defpackage.non
    public final void f() {
        ((mql) this.e).f.e();
    }

    @Override // defpackage.non
    public final String g() {
        return "PlaceListWithMapOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return false;
    }

    @Override // defpackage.non
    public final int i() {
        return nom.a(this);
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.d.b(noeVar, this.g.c());
    }
}

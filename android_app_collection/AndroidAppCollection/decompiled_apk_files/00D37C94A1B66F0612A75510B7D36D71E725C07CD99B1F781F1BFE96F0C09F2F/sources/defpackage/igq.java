package defpackage;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: igq  reason: default package */
/* loaded from: classes3.dex */
public final class igq extends zxr {
    public final NestedScrollView a;
    public final hqj b;
    public Optional c;
    public aypg d;
    public final RecyclerView e;
    public Optional f;
    public final Context g;
    public final acth h;
    public final ajyi i;
    public final akar j;
    public final gew k;
    public final aath l;
    public final ajpa m;
    public final tdu n;
    public arag o;
    private final aafo p;
    private final aapv q;
    private final afvn r;

    public igq(eo eoVar, Context context, aafo aafoVar, hqj hqjVar, acth acthVar, ajyi ajyiVar, akar akarVar, gew gewVar, aath aathVar, ajpa ajpaVar, tdu tduVar, aapv aapvVar, afvn afvnVar) {
        super(context, eoVar, null, Optional.empty(), true, false, true);
        this.p = aafoVar;
        this.b = hqjVar;
        this.g = context;
        this.h = acthVar;
        this.i = ajyiVar;
        this.j = akarVar;
        this.k = gewVar;
        this.l = aathVar;
        this.m = ajpaVar;
        this.n = tduVar;
        this.q = aapvVar;
        this.r = afvnVar;
        this.a = new NestedScrollView(context);
        this.f = Optional.empty();
        this.c = Optional.empty();
        this.d = banl.m();
        this.e = new RecyclerView(LayoutInflater.from(context).getContext());
    }

    @Override // defpackage.zxr
    protected final View a() {
        return this.a;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        arag aragVar = this.o;
        return aragVar == null ? "" : ajgl.b(aragVar);
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void f() {
        super.f();
        this.o = null;
        this.a.removeAllViews();
        if (this.c.isPresent()) {
            ((ajzq) this.c.get()).h();
            this.c = Optional.empty();
        }
        if (this.f.isPresent()) {
            this.p.a((apzg) this.f.get());
            this.f = Optional.empty();
        }
    }

    public final synchronized void j(hqh hqhVar) {
        if (hqhVar.a.f() != null) {
            if ((hqhVar.a.a.b & 33554432) != 0) {
                aapv aapvVar = this.q;
                afvm c = this.r.c();
                arbf arbfVar = hqhVar.a.a.w;
                if (arbfVar == null) {
                    arbfVar = arbf.a;
                }
                arpa arpaVar = hqhVar.a.a.c;
                if (arpaVar == null) {
                    arpaVar = arpa.a;
                }
                aapvVar.a(c, arbfVar, arpaVar);
            }
            if (!this.c.isPresent()) {
                return;
            }
            ((ajzq) this.c.get()).h();
            ((ajzq) this.c.get()).K(hqhVar.a.f());
            return;
        }
        afus.b(2, 24, "browseResponseModel without section list");
        z();
    }
}

package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cfvz  reason: default package */
/* loaded from: classes4.dex */
public final class cfvz {
    public z<Boolean> a = new z<>();
    public z<cgcg> b = new z<>();
    private final bvjj c;
    private final akfa d;
    private final cfwr e;

    public cfvz(bvjj bvjjVar, akfa akfaVar, cfwr cfwrVar) {
        this.c = bvjjVar;
        this.d = akfaVar;
        this.e = cfwrVar;
        b();
    }

    public final void a() {
        this.c.T(bvjk.kj, this.d.j(), false);
        this.a.g(false);
        this.e.a(cfwq.b(cqrt.l(R.string.CT_INFO_CARD_DISMISS_SUCCESS)));
    }

    public final void b() {
        this.a.g(Boolean.valueOf(this.c.o(bvjk.kj, this.d.j(), true)));
    }
}

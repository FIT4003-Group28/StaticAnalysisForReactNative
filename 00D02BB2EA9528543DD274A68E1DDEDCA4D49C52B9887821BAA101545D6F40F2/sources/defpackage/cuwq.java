package defpackage;

import com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview.PagedRecyclerView;
/* compiled from: PG */
/* renamed from: cuwq  reason: default package */
/* loaded from: classes5.dex */
public final class cuwq<ModelT> implements cuvu<PagedRecyclerView> {
    public static int a;
    public final PagedRecyclerView b;
    public final cuwp c;
    private final cuwl<ModelT, ?> g;
    private final int h;
    private final abx i;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    private boolean j = false;
    private final abi k = new cuwo(this);

    public cuwq(PagedRecyclerView pagedRecyclerView, cuwp cuwpVar, cuwl<ModelT, ?> cuwlVar, int i) {
        this.b = pagedRecyclerView;
        this.c = cuwpVar;
        this.g = cuwlVar;
        this.h = i;
        pagedRecyclerView.setAdapter(cuwlVar);
        cuwlVar.f = pagedRecyclerView.T;
        this.i = new cuwn(this);
    }

    public static final void c() {
        a = 15;
    }

    @Override // defpackage.cuvu
    public final void A() {
        if (this.j) {
            this.b.j(this.i);
            this.g.p(this.k);
            this.j = false;
        }
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    public final void a(final boolean z, dcdc<ModelT> dcdcVar) {
        if (!z) {
            this.g.B();
        }
        this.g.a(dcdcVar);
        this.b.post(new Runnable(this, z) { // from class: cuwm
            private final cuwq a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cuwq cuwqVar = this.a;
                boolean z2 = this.b;
                cuwqVar.e = false;
                cuwqVar.d = true;
                cuwqVar.f = z2;
            }
        });
        StringBuilder sb = new StringBuilder(24);
        sb.append("load done, hasMore:");
        sb.append(z);
        sb.toString();
        cstl.a("PagedRcyPresenter");
    }

    public final void b(int i) {
        if (i > this.h || this.b.S.ac() > this.h) {
            return;
        }
        this.b.S.P(0, 0);
    }

    @Override // defpackage.cuvu
    public final void z() {
        if (!this.d) {
            this.e = true;
            this.c.b();
        }
        if (!this.j) {
            this.b.i(this.i);
            this.g.o(this.k);
            this.j = true;
        }
    }
}

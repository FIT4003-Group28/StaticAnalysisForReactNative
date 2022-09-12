package defpackage;

import android.view.View;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kzc  reason: default package */
/* loaded from: classes7.dex */
public final class kzc implements btph {
    public final cqkj a;
    public final dxio<akox> b;
    public final btrm c;
    public final bvjj d;
    public final aufc e;
    public final Executor f;
    public cqkf<lcu> g;
    public final ldb h;
    public final boolean i;
    public boolean j;
    @dzsi
    public kzb k;
    @dzsi
    public lda l;
    @dzsi
    public asvw m;
    public final asvx n;
    public final aswa o;
    private final lda p;

    public kzc(cqkj cqkjVar, dxio<akox> dxioVar, btrm btrmVar, cqhn cqhnVar, bvjj bvjjVar, aufc aufcVar, Executor executor, boolean z, asvx asvxVar) {
        kza kzaVar = new kza(this);
        this.p = kzaVar;
        this.i = z;
        this.h = new ldb(cqhnVar, kzaVar, z);
        this.a = cqkjVar;
        this.b = dxioVar;
        this.c = btrmVar;
        this.d = bvjjVar;
        this.e = aufcVar;
        this.f = executor;
        this.n = asvxVar;
        this.o = new aswa(this) { // from class: kyz
            private final kzc a;

            {
                this.a = this;
            }

            @Override // defpackage.aswa
            public final void a(asvx asvxVar2) {
                this.a.h.h(asvxVar2.a());
            }
        };
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void a(boolean z) {
        this.h.f(z);
    }

    public final void b(@dzsi View.OnFocusChangeListener onFocusChangeListener) {
        this.h.g(onFocusChangeListener);
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dyka  reason: default package */
/* loaded from: classes6.dex */
final class dyka extends dypa {
    public static final /* synthetic */ int i = 0;
    public final Object a;
    public final Collection<dyjy> b;
    public boolean c;
    public boolean d;
    public dyjb e;
    public boolean f;
    public boolean g;
    final /* synthetic */ dykb h;
    private int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyka(dykb dykbVar, dyvi dyviVar, Object obj, dyvr dyvrVar) {
        super(4194304, dyviVar, dyvrVar);
        this.h = dykbVar;
        this.b = new ArrayList();
        this.d = false;
        this.a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f(dyka dykaVar, ByteBuffer byteBuffer) {
        dykaVar.u += byteBuffer.remaining();
        super.o(dytn.a(byteBuffer), false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dyko
    public final void a() {
        super.a();
    }

    @Override // defpackage.dypa
    protected final void b(dyjb dyjbVar, boolean z, dyhw dyhwVar) {
        dbsk.t(this.h.l, "stream must not be null");
        this.h.l.cancel();
        h(dyjbVar, z, dyhwVar);
    }

    @Override // defpackage.dysn
    public final void c(Throwable th) {
        b(dyjb.c(th), true, new dyhw());
    }

    @Override // defpackage.dykr
    public final void d(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    @Override // defpackage.dysn
    public final void e(int i2) {
        dbsk.t(this.h.l, "stream must not be null");
        int i3 = this.u - i2;
        this.u = i3;
        if (i3 != 0 || this.f) {
            return;
        }
        this.h.l.read(ByteBuffer.allocateDirect(4096));
    }
}

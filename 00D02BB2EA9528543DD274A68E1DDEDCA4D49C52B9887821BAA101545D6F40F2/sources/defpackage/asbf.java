package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: asbf  reason: default package */
/* loaded from: classes2.dex */
public final class asbf extends crjq<asbp> {
    public final asbp a;
    private final pnq b;
    private final Executor c;
    private final pot d;
    private final List<dqtx> e;
    private final String f;
    private final String g;

    public asbf(btrm btrmVar, pnq pnqVar, btvo btvoVar, crlb crlbVar, Executor executor, pot potVar, List<dqtx> list) {
        super(crlbVar, btrmVar);
        this.b = pnqVar;
        this.c = executor;
        this.d = potVar;
        this.e = list;
        this.a = new asbp();
        dvdz M = btvoVar.getNavigationParameters().M();
        this.f = M.b;
        this.g = M.c;
    }

    @Override // defpackage.crjq
    protected final void a() {
        if (this.f.isEmpty() || this.g.isEmpty()) {
            f();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.b.a(this.f, this.g, 4));
        dbsg<dvdy> d = this.d.d(this.e);
        if (d.a()) {
            dvdy b = d.b();
            arrayList.add(this.b.a(this.f, b.i, b.b));
        }
        deha.q(degp.q(deha.j(arrayList)), new asbe(this), this.c);
    }

    @Override // defpackage.crjq
    protected final /* bridge */ /* synthetic */ asbp b() {
        return this.a;
    }
}

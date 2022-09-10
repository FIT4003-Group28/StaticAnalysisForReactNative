package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: mwj  reason: default package */
/* loaded from: classes7.dex */
public final class mwj implements kts {
    public final Context a;
    public final Executor b;
    public final ktu c;
    public final cqkj d;
    public final kto e;
    public final ViewGroup f;
    public final ktq g;
    public final cjqy h;
    public final cjqq i;
    @dzsi
    public crzp<dcep<ktr>> k;
    @dzsi
    public cqkf<kto> l;
    public final kcx o;
    public final cjsz j = new cjsz(dtxm.bz);
    public mwi m = mwi.NO_LOCKOUT;
    public boolean n = true;

    public mwj(Context context, ktu ktuVar, ktq ktqVar, cjqy cjqyVar, cjqq cjqqVar, kcx kcxVar, cqkj cqkjVar, ViewGroup viewGroup, kto ktoVar, Executor executor) {
        this.a = context;
        this.g = ktqVar;
        dbsk.s(cjqyVar);
        this.h = cjqyVar;
        dbsk.s(cjqqVar);
        this.i = cjqqVar;
        dbsk.s(kcxVar);
        this.o = kcxVar;
        dbsk.s(executor);
        this.b = executor;
        dbsk.s(ktuVar);
        this.c = ktuVar;
        dbsk.s(cqkjVar);
        this.d = cqkjVar;
        this.f = viewGroup;
        this.e = ktoVar;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.kts
    public final void a() {
        this.n = false;
        this.c.e();
    }
}

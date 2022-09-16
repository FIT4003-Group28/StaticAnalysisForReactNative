package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: fno  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fno implements anir {
    public final /* synthetic */ fnp a;
    private final /* synthetic */ int b;

    public /* synthetic */ fno(fnp fnpVar) {
        this.a = fnpVar;
    }

    public /* synthetic */ fno(fnp fnpVar, int i) {
        this.b = i;
        this.a = fnpVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return this.a.a((abcn) obj);
            }
            Void r7 = (Void) obj;
            return this.a.d.a.b(new fcp(System.currentTimeMillis(), 4), anjk.a);
        }
        fnp fnpVar = this.a;
        if (TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - ((Long) obj).longValue()) >= 24) {
            abcu abcuVar = fnpVar.c;
            return anii.i(anko.q(anii.i(abcuVar.d(abcuVar.a(null)), new fno(fnpVar, 1), anjk.a)), new fno(fnpVar, 2), anjk.a);
        }
        return anlz.o();
    }
}

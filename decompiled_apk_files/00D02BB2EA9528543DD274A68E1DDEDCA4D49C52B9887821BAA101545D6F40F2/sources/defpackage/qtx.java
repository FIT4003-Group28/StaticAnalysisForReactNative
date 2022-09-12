package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qtx  reason: default package */
/* loaded from: classes7.dex */
public final class qtx {
    public final Executor a;
    public final qjk b;
    public final quf c;
    private final sic d;

    public qtx(Executor executor, qjk qjkVar, sic sicVar, quf qufVar) {
        this.a = executor;
        this.b = qjkVar;
        this.d = sicVar;
        this.c = qufVar;
    }

    public static boolean b(@dzsi azva azvaVar) {
        return azvaVar != null && (azvaVar.a == dndr.INFERRED_WORK || azvaVar.a == dndr.INFERRED_HOME);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<quy> a() {
        dehn<?> w = this.b.w();
        final dehn<qjn> a = this.d.a();
        return deha.k(w, a).b(new Callable(this, a) { // from class: qtu
            private final qtx a;
            private final dehn b;

            {
                this.a = this;
                this.b = a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
                if (r0.a(r4, r3) == false) goto L20;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r6 = this;
                    qtx r0 = r6.a
                    dehn r1 = r6.b
                    qjk r2 = r0.b
                    boolean r2 = r2.a()
                    if (r2 == 0) goto L96
                    qjk r2 = r0.b
                    boolean r2 = r2.b()
                    if (r2 != 0) goto L96
                    qjk r2 = r0.b
                    boolean r2 = r2.c()
                    if (r2 != 0) goto L96
                    java.lang.Object r1 = defpackage.deha.r(r1)
                    qjn r1 = (defpackage.qjn) r1
                    qjk r2 = r0.b
                    boolean r2 = r2.a()
                    defpackage.dbsk.l(r2)
                    qjk r2 = r0.b
                    domy r2 = r2.f()
                    quy r1 = defpackage.quy.c(r1, r2)
                    azva r2 = r1.d()
                    boolean r2 = defpackage.qtx.b(r2)
                    if (r2 != 0) goto L49
                    azva r2 = r1.e()
                    boolean r2 = defpackage.qtx.b(r2)
                    if (r2 == 0) goto L70
                L49:
                    quf r0 = r0.c
                    azva r2 = r1.d()
                    azva r3 = r1.e()
                    if (r2 == 0) goto L71
                    if (r3 != 0) goto L58
                    goto L71
                L58:
                    dxio<ahjq> r4 = r0.a
                    java.lang.Object r4 = r4.a()
                    ahjq r4 = (defpackage.ahjq) r4
                    com.google.android.apps.gmm.map.model.location.GmmLocation r4 = r4.a()
                    boolean r2 = r0.a(r4, r2)
                    if (r2 != 0) goto L70
                    boolean r0 = r0.a(r4, r3)
                    if (r0 == 0) goto L71
                L70:
                    return r1
                L71:
                    azva r0 = r1.d()
                    azva r2 = r1.e()
                    boolean r3 = defpackage.qtx.b(r0)
                    r4 = 0
                    r5 = 1
                    if (r5 != r3) goto L82
                    r0 = r4
                L82:
                    boolean r3 = defpackage.qtx.b(r2)
                    if (r5 != r3) goto L89
                    r2 = r4
                L89:
                    qjn r0 = defpackage.qjn.i(r0, r2)
                    qum r1 = (defpackage.qum) r1
                    domy r1 = r1.a
                    quy r0 = defpackage.quy.c(r0, r1)
                    return r0
                L96:
                    qtw r0 = new qtw
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qtu.call():java.lang.Object");
            }
        }, this.a);
    }
}

package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aarl  reason: default package */
/* loaded from: classes.dex */
public class aarl {
    private final aaqj a;
    private final yqw b;
    private final yjc c;
    private final yjb d;
    private final aoqu e;

    public aarl(aaqj aaqjVar, yqw yqwVar, aoqu aoquVar, yjc yjcVar, yjb yjbVar) {
        aaqjVar.getClass();
        this.a = aaqjVar;
        yqwVar.getClass();
        this.b = yqwVar;
        aoquVar.getClass();
        this.e = aoquVar;
        yjcVar.getClass();
        this.c = yjcVar;
        yjbVar.getClass();
        this.d = yjbVar;
    }

    @Deprecated
    public final ankt a(aaqs aaqsVar) {
        return c(aaqsVar, anjk.a, null);
    }

    public final ankt b(aaqs aaqsVar, Executor executor) {
        return c(aaqsVar, executor, null);
    }

    public final ankt c(aaqs aaqsVar, Executor executor, aaqr aaqrVar) {
        final aaqk b;
        if (aaqrVar == null) {
            b = this.a.a(aaqsVar, this.e, afzd.a, this.c, this.d);
        } else {
            b = this.a.b(aaqsVar, this.e, afzd.a, this.c, this.d, aaqrVar);
        }
        ankt b2 = this.b.b(b);
        final Runnable runnable = new Runnable() { // from class: aark
            @Override // java.lang.Runnable
            public final void run() {
                aaqk.this.y();
            }
        };
        return anii.i(b2, new anir() { // from class: yrp
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                Runnable runnable2 = runnable;
                cfb cfbVar = (cfb) obj;
                if (cfbVar != null) {
                    cff cffVar = cfbVar.c;
                    if (cffVar != null) {
                        return anlz.p(cffVar);
                    }
                    if (cfbVar.a != null) {
                        runnable2.run();
                        return anlz.q(cfbVar.a);
                    }
                }
                return anlz.p(new IllegalStateException("Response was null. This should not have happened."));
            }
        }, executor);
    }

    public final aoqu d(aaqs aaqsVar) {
        ylr.b();
        afze d = afze.d();
        e(aaqsVar, d);
        return (aoqu) ylx.d(d, aapz.g);
    }

    @Deprecated
    public final void e(aaqs aaqsVar, afzf afzfVar) {
        this.b.a(this.a.a(aaqsVar, this.e, afzfVar, this.c, this.d));
    }

    @Deprecated
    public final void f(aaqs aaqsVar, afzf afzfVar, aaqr aaqrVar) {
        if (aaqrVar == null) {
            this.b.a(this.a.a(aaqsVar, this.e, afzfVar, this.c, this.d));
        } else {
            this.b.a(this.a.b(aaqsVar, this.e, afzfVar, this.c, this.d, aaqrVar));
        }
    }
}

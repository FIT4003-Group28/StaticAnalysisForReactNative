package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aarq  reason: default package */
/* loaded from: classes.dex */
public abstract class aarq extends aarl {
    public aarq(aaqj aaqjVar, yqw yqwVar, aoqu aoquVar, yjc yjcVar, yjb yjbVar) {
        super(aaqjVar, yqwVar, aoquVar, yjcVar, yjbVar);
    }

    public final ankt g(aaqs aaqsVar, Executor executor) {
        return o(aaqsVar, executor, null);
    }

    public abstract Object h(aoqu aoquVar);

    public final void i(aaqs aaqsVar, afzf afzfVar) {
        j(aaqsVar, aars.d, afzfVar);
    }

    public final void j(aaqs aaqsVar, aarm aarmVar, afzf afzfVar) {
        k(aaqsVar, aarmVar, afzfVar, null);
    }

    public final void k(aaqs aaqsVar, aarm aarmVar, afzf afzfVar, aaqr aaqrVar) {
        afzfVar.getClass();
        f(aaqsVar, new aarp(this, aarmVar, aaqsVar, afzfVar), aaqrVar);
    }

    public void l(aoqu aoquVar) {
    }

    public void m(aaqs aaqsVar, Object obj) {
    }

    public void n(aaqs aaqsVar) {
    }

    public final ankt o(final aaqs aaqsVar, Executor executor, aaqr aaqrVar) {
        return anhq.i(anii.h(anko.q(c(aaqsVar, executor, aaqrVar)), new ampg() { // from class: aarn
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aarq aarqVar = aarq.this;
                aaqs aaqsVar2 = aaqsVar;
                aoqu aoquVar = (aoqu) obj;
                aarqVar.l(aoquVar);
                Object h = aarqVar.h(aoquVar);
                aarqVar.m(aaqsVar2, h);
                return h;
            }
        }, anjk.a), cff.class, new anir() { // from class: aaro
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                aarq.this.n(aaqsVar);
                return anlz.p((cff) obj);
            }
        }, anjk.a);
    }
}

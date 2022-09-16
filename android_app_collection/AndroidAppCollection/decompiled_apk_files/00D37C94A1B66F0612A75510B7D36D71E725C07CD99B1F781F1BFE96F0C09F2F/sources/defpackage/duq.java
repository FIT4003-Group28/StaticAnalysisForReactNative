package defpackage;
/* compiled from: PG */
/* renamed from: duq  reason: default package */
/* loaded from: classes3.dex */
public final class duq extends dux {
    public duq(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "IgipmhaVUkY4fEO+K2mg3TapMmRR1GDlmcZK2gQZ9+w383vc1oudxrcjS5unTEC8", "7kMMpNRrmsQi7WHF1Que5U/NIKVctUpm62ERsCHIgmI=", aopaVar, i, 51);
    }

    @Override // defpackage.dux
    protected final void a() {
        synchronized (this.g) {
            dtm dtmVar = new dtm((String) this.d.invoke(null, new Object[0]));
            aopa aopaVar = this.g;
            long longValue = dtmVar.a.longValue();
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.c |= 4096;
            dnwVar.L = longValue;
            aopa aopaVar2 = this.g;
            long longValue2 = dtmVar.b.longValue();
            aopaVar2.copyOnWrite();
            dnw dnwVar3 = (dnw) aopaVar2.instance;
            dnwVar3.c |= 8192;
            dnwVar3.M = longValue2;
        }
    }
}

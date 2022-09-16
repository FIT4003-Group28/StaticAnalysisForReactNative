package defpackage;
/* compiled from: PG */
/* renamed from: dup  reason: default package */
/* loaded from: classes3.dex */
public final class dup extends dux {
    private final StackTraceElement[] h;

    public dup(dtq dtqVar, aopa aopaVar, int i, StackTraceElement[] stackTraceElementArr) {
        super(dtqVar, "V6T1TedZrtcDygIztSohrDr237SOB3B9gkWE2vd5weda6qECSMP3EMcUGqTEe/ql", "TFlUbo+9rNR5d2DBp1l30g/UAqBAxoyCSHApmzmib5A=", aopaVar, i, 45);
        this.h = stackTraceElementArr;
    }

    @Override // defpackage.dux
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.h;
        if (stackTraceElementArr != null) {
            int i = 1;
            dtj dtjVar = new dtj((String) this.d.invoke(null, stackTraceElementArr));
            synchronized (this.g) {
                aopa aopaVar = this.g;
                long longValue = dtjVar.a.longValue();
                aopaVar.copyOnWrite();
                dnw dnwVar = (dnw) aopaVar.instance;
                dnw dnwVar2 = dnw.a;
                dnwVar.c |= 64;
                dnwVar.G = longValue;
                if (dtjVar.b.booleanValue()) {
                    aopa aopaVar2 = this.g;
                    if (true != dtjVar.c.booleanValue()) {
                        i = 2;
                    }
                    aopaVar2.copyOnWrite();
                    dnw dnwVar3 = (dnw) aopaVar2.instance;
                    dnwVar3.O = i - 1;
                    dnwVar3.c |= 131072;
                } else {
                    aopa aopaVar3 = this.g;
                    aopaVar3.copyOnWrite();
                    dnw dnwVar4 = (dnw) aopaVar3.instance;
                    dnwVar4.O = 2;
                    dnwVar4.c |= 131072;
                }
            }
        }
    }
}

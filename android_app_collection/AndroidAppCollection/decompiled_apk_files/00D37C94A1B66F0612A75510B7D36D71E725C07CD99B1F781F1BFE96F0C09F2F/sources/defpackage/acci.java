package defpackage;
/* compiled from: PG */
/* renamed from: acci  reason: default package */
/* loaded from: classes.dex */
final class acci implements abwy {
    final /* synthetic */ accj a;

    public acci(accj accjVar) {
        this.a = accjVar;
    }

    @Override // defpackage.abwy
    public final void a(Object obj) {
        if (obj instanceof astj) {
            astj astjVar = (astj) obj;
            int i = this.a.m;
            astjVar.copyOnWrite();
            astk astkVar = (astk) astjVar.instance;
            astk astkVar2 = astk.a;
            astkVar.b |= 128;
            astkVar.j = i;
            int i2 = this.a.n;
            astjVar.copyOnWrite();
            astk astkVar3 = (astk) astjVar.instance;
            astkVar3.b |= 256;
            astkVar3.k = i2;
            long j = this.a.l;
            astjVar.copyOnWrite();
            astk astkVar4 = (astk) astjVar.instance;
            astkVar4.b |= 2;
            astkVar4.d = j / 1000;
            asti astiVar = astkVar4.c;
            if (astiVar == null) {
                astiVar = asti.a;
            }
            if (astiVar.e > 0) {
                asti astiVar2 = ((astk) astjVar.instance).c;
                if (astiVar2 == null) {
                    astiVar2 = asti.a;
                }
                if (astiVar2.d > 0) {
                    asti astiVar3 = ((astk) astjVar.instance).c;
                    if (astiVar3 == null) {
                        astiVar3 = asti.a;
                    }
                    long j2 = astiVar3.e;
                    asti astiVar4 = ((astk) astjVar.instance).c;
                    if (astiVar4 == null) {
                        astiVar4 = asti.a;
                    }
                    long j3 = j2 - astiVar4.d;
                    if (j3 > 0) {
                        long j4 = (this.a.t * 1000) / j3;
                        astjVar.copyOnWrite();
                        astk astkVar5 = (astk) astjVar.instance;
                        astkVar5.b |= 8;
                        astkVar5.f = (float) j4;
                    }
                }
            }
            this.a.t = 0L;
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: abvw  reason: default package */
/* loaded from: classes.dex */
final class abvw implements abwy {
    final /* synthetic */ abvx a;

    public abvw(abvx abvxVar) {
        this.a = abvxVar;
    }

    @Override // defpackage.abwy
    public final void a(Object obj) {
        if (obj instanceof astj) {
            astj astjVar = (astj) obj;
            int i = this.a.o;
            astjVar.copyOnWrite();
            astk astkVar = (astk) astjVar.instance;
            astk astkVar2 = astk.a;
            astkVar.b |= 8192;
            astkVar.p = i / 1000;
            int i2 = this.a.e;
            astjVar.copyOnWrite();
            astk astkVar3 = (astk) astjVar.instance;
            astkVar3.b |= 64;
            astkVar3.i = i2 / 1000;
            int i3 = this.a.l;
            astjVar.copyOnWrite();
            astk astkVar4 = (astk) astjVar.instance;
            astkVar4.b |= 16;
            astkVar4.g = i3 / 1000;
            double a = this.a.g.a();
            astjVar.copyOnWrite();
            astk astkVar5 = (astk) astjVar.instance;
            astkVar5.b |= 32;
            astkVar5.h = (int) (a / 1000.0d);
            asti astiVar = astkVar5.c;
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
                    long j = astiVar3.e;
                    asti astiVar4 = ((astk) astjVar.instance).c;
                    if (astiVar4 == null) {
                        astiVar4 = asti.a;
                    }
                    long j2 = j - astiVar4.d;
                    if (j2 > 0) {
                        long j3 = (this.a.x * 1000) / j2;
                        astjVar.copyOnWrite();
                        astk astkVar6 = (astk) astjVar.instance;
                        astkVar6.b |= 32;
                        astkVar6.h = (int) j3;
                    }
                }
            }
            this.a.x = 0L;
        }
    }
}

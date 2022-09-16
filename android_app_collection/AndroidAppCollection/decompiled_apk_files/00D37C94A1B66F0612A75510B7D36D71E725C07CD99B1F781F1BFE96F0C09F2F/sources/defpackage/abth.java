package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abth  reason: default package */
/* loaded from: classes.dex */
public final class abth implements abwy {
    final /* synthetic */ abtj a;

    public abth(abtj abtjVar) {
        this.a = abtjVar;
    }

    @Override // defpackage.abwy
    public final void a(Object obj) {
        if (obj instanceof astj) {
            astj astjVar = (astj) obj;
            asti astiVar = ((astk) astjVar.instance).c;
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
                        int i = this.a.g;
                        astjVar.copyOnWrite();
                        astk astkVar = (astk) astjVar.instance;
                        astkVar.b |= 4;
                        astkVar.e = (i * 1000) / ((float) j2);
                    }
                }
            }
            this.a.g = 0;
        }
    }
}

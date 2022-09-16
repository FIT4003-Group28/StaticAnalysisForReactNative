package defpackage;
/* compiled from: PG */
/* renamed from: abur  reason: default package */
/* loaded from: classes.dex */
final class abur implements abwy {
    final /* synthetic */ abus a;

    public abur(abus abusVar) {
        this.a = abusVar;
    }

    @Override // defpackage.abwy
    public final void a(Object obj) {
        if (obj instanceof astj) {
            astj astjVar = (astj) obj;
            acbt acbtVar = this.a.k;
            if (acbtVar == null) {
                return;
            }
            int i = ((acbe) acbtVar).c;
            astjVar.copyOnWrite();
            astk astkVar = (astk) astjVar.instance;
            astk astkVar2 = astk.a;
            astkVar.b |= 2048;
            astkVar.n = i / 1000;
            int i2 = ((acbe) this.a.k).c;
            astjVar.copyOnWrite();
            astk astkVar3 = (astk) astjVar.instance;
            astkVar3.b |= 512;
            astkVar3.l = i2 / 1000;
            int i3 = ((acbe) this.a.k).c;
            astjVar.copyOnWrite();
            astk astkVar4 = (astk) astjVar.instance;
            astkVar4.b |= 1024;
            astkVar4.m = i3 / 1000;
        }
    }
}

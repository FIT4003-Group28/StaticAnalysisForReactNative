package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abye  reason: default package */
/* loaded from: classes.dex */
public final class abye implements abwy {
    final /* synthetic */ abyk a;

    public abye(abyk abykVar) {
        this.a = abykVar;
    }

    @Override // defpackage.abwy
    public final void a(Object obj) {
        if (obj instanceof astj) {
            astj astjVar = (astj) obj;
            String str = this.a.F;
            astjVar.copyOnWrite();
            astk astkVar = (astk) astjVar.instance;
            astk astkVar2 = astk.a;
            str.getClass();
            astkVar.b |= 4096;
            astkVar.o = str;
        } else if (!(obj instanceof astn)) {
        } else {
            astn astnVar = (astn) obj;
            abyi abyiVar = abyi.GOOD;
            int ordinal = this.a.f25J.ordinal();
            if (ordinal == 0) {
                astnVar.copyOnWrite();
                asto astoVar = (asto) astnVar.instance;
                asto astoVar2 = asto.a;
                astoVar.d = 1;
                astoVar.b |= 4;
            } else if (ordinal == 1) {
                astnVar.copyOnWrite();
                asto astoVar3 = (asto) astnVar.instance;
                asto astoVar4 = asto.a;
                astoVar3.d = 2;
                astoVar3.b |= 4;
            } else if (ordinal != 2) {
            } else {
                astnVar.copyOnWrite();
                asto astoVar5 = (asto) astnVar.instance;
                asto astoVar6 = asto.a;
                astoVar5.d = 3;
                astoVar5.b |= 4;
            }
        }
    }
}

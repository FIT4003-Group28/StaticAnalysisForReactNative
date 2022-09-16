package defpackage;
/* compiled from: PG */
/* renamed from: ankd  reason: default package */
/* loaded from: classes.dex */
public final class ankd implements Runnable {
    final /* synthetic */ anki a;
    final /* synthetic */ amuk b;
    final /* synthetic */ int c;

    public ankd(anki ankiVar, amuk amukVar, int i) {
        this.a = ankiVar;
        this.b = amukVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        anki ankiVar = this.a;
        amuk amukVar = this.b;
        int i = this.c;
        ankt[] anktVarArr = ankiVar.d;
        ankt anktVar = anktVarArr[i];
        anktVar.getClass();
        anktVarArr[i] = null;
        int i2 = ankiVar.e;
        while (true) {
            int i3 = ((amxx) amukVar).c;
            if (i2 >= i3) {
                ankiVar.e = i3;
                return;
            } else if (((anie) amukVar.get(i2)).lV(anktVar)) {
                ankiVar.a();
                ankiVar.e = i2 + 1;
                return;
            } else {
                i2++;
            }
        }
    }
}

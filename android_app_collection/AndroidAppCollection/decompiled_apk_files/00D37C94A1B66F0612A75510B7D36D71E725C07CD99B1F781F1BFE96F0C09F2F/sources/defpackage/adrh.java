package defpackage;
/* compiled from: PG */
/* renamed from: adrh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adrh implements Runnable {
    public final /* synthetic */ adrj a;
    public final /* synthetic */ adnt b;
    private final /* synthetic */ int c;

    public /* synthetic */ adrh(adrj adrjVar, adnt adntVar) {
        this.a = adrjVar;
        this.b = adntVar;
    }

    public /* synthetic */ adrh(adrj adrjVar, adnt adntVar, int i) {
        this.c = i;
        this.a = adrjVar;
        this.b = adntVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            adrj adrjVar = this.a;
            adnt adntVar = this.b;
            for (adny adnyVar : adrjVar.b) {
                adnyVar.k(adntVar);
            }
        } else if (i == 1) {
            adrj adrjVar2 = this.a;
            adnt adntVar2 = this.b;
            for (adny adnyVar2 : adrjVar2.b) {
                adnyVar2.j(adntVar2);
            }
        } else {
            adrj adrjVar3 = this.a;
            adnt adntVar3 = this.b;
            for (adny adnyVar3 : adrjVar3.b) {
                adnyVar3.l(adntVar3);
            }
        }
    }
}

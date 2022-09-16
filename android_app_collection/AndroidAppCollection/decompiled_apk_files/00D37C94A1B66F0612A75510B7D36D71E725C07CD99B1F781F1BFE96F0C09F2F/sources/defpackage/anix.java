package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anix  reason: default package */
/* loaded from: classes.dex */
public final class anix implements anir {
    final /* synthetic */ aniz a;
    final /* synthetic */ anjd b;

    public anix(anjd anjdVar, aniz anizVar) {
        this.b = anjdVar;
        this.a = anizVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        anja anjaVar = this.b.b;
        aniz anizVar = this.a;
        anja anjaVar2 = new anja();
        try {
            anjd a = anizVar.a(anjaVar2.a, obj);
            a.d(anjaVar2);
            return a.c;
        } finally {
            anjaVar.a(anjaVar2, anjk.a);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}

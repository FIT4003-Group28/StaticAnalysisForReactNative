package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqci  reason: default package */
/* loaded from: classes4.dex */
public final class bqci extends akvn<aksx> {
    final /* synthetic */ bqcn a;

    public bqci(bqcn bqcnVar) {
        this.a = bqcnVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        final aksx aksxVar = (aksx) obj;
        this.a.a.execute(new Runnable(this, aksxVar) { // from class: bqch
            private final bqci a;
            private final aksx b;

            {
                this.a = this;
                this.b = aksxVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bqci bqciVar = this.a;
                aksx aksxVar2 = this.b;
                bqcn bqcnVar = bqciVar.a;
                bqcnVar.k(bqcnVar.b.indexOf(aksxVar2));
            }
        });
    }
}

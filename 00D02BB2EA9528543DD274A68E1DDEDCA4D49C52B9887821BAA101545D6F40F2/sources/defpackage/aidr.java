package defpackage;
/* compiled from: PG */
/* renamed from: aidr  reason: default package */
/* loaded from: classes2.dex */
final class aidr implements aigd {
    final /* synthetic */ aidy a;

    public aidr(aidy aidyVar) {
        this.a = aidyVar;
    }

    @Override // defpackage.aigd
    public final void a() {
        this.a.c = bvpk.a(new Runnable(this) { // from class: aidq
            private final aidr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aidy aidyVar = this.a.a;
                btlu btluVar = aidyVar.d;
                aidyVar.g(btluVar, btluVar);
            }
        });
        aidy aidyVar = this.a;
        aidyVar.a.a(aidyVar.c, bvrj.UI_THREAD, 0L);
    }
}

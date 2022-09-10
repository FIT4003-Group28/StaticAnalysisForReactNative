package defpackage;
/* compiled from: PG */
/* renamed from: aidt  reason: default package */
/* loaded from: classes2.dex */
final class aidt implements aige {
    final /* synthetic */ aidy a;

    public aidt(aidy aidyVar) {
        this.a = aidyVar;
    }

    @Override // defpackage.aige
    public final void a() {
        this.a.c = bvpk.a(new Runnable(this) { // from class: aids
            private final aidt a;

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

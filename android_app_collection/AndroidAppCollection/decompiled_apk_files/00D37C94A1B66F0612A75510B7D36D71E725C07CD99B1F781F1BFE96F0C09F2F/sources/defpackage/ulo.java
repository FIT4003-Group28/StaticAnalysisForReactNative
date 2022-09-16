package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ulo  reason: default package */
/* loaded from: classes4.dex */
public final class ulo extends uuo {
    final /* synthetic */ ulr a;

    public ulo(ulr ulrVar) {
        this.a = ulrVar;
    }

    @Override // defpackage.uuo
    public final void a(final amuk amukVar) {
        umr.b(new Runnable() { // from class: ulm
            @Override // java.lang.Runnable
            public final void run() {
                ulo uloVar = ulo.this;
                amuk amukVar2 = amukVar;
                ulr ulrVar = uloVar.a;
                ulrVar.e = amukVar2;
                ulrVar.w();
            }
        });
    }

    @Override // defpackage.uuo
    public final void b(final Object obj) {
        umr.b(new Runnable() { // from class: uln
            @Override // java.lang.Runnable
            public final void run() {
                ulo uloVar = ulo.this;
                Object obj2 = obj;
                ulr ulrVar = uloVar.a;
                ulrVar.d = obj2;
                ulrVar.w();
            }
        });
    }
}

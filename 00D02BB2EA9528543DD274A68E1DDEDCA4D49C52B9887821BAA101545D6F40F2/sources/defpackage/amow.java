package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amow  reason: default package */
/* loaded from: classes.dex */
public final class amow implements amcm {
    final /* synthetic */ amox a;

    public amow(amox amoxVar) {
        this.a = amoxVar;
    }

    @Override // defpackage.amcm
    public final void a(final alyh alyhVar, int i, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
        if (i != 0) {
            if (i == 4) {
                return;
            }
            if (i == 1 && this.a.j() && this.a.s(alyhVar, alygVar, alygVar2, new Runnable(this, alyhVar) { // from class: amov
                private final amow a;
                private final alyh b;

                {
                    this.a = this;
                    this.b = alyhVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    amow amowVar = this.a;
                    alyh alyhVar2 = this.b;
                    synchronized (amowVar.a.h) {
                        amowVar.a.h.remove(alyhVar2);
                    }
                }
            })) {
                return;
            }
            synchronized (this.a.h) {
                this.a.h.remove(alyhVar);
            }
            return;
        }
        throw null;
    }
}

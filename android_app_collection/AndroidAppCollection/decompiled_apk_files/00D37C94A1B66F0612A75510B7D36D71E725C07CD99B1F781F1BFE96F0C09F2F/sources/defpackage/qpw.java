package defpackage;
/* compiled from: PG */
/* renamed from: qpw  reason: default package */
/* loaded from: classes4.dex */
public final class qpw implements qpz {
    final /* synthetic */ qpz a;
    final /* synthetic */ qpy b;
    private final /* synthetic */ int c;

    public qpw(qpy qpyVar, qpz qpzVar) {
        this.b = qpyVar;
        this.a = qpzVar;
    }

    public qpw(qpy qpyVar, qpz qpzVar, int i) {
        this.c = i;
        this.b = qpyVar;
        this.a = qpzVar;
    }

    @Override // defpackage.qpz
    public final void b(long j) {
        if (this.c != 0) {
            qpz qpzVar = this.a;
            if (qpzVar == null) {
                return;
            }
            qpzVar.b(j);
            return;
        }
        qpz qpzVar2 = this.a;
        if (qpzVar2 == null) {
            return;
        }
        qpzVar2.b(j);
    }

    @Override // defpackage.qpz
    public final void a(long j, int i, Object obj) {
        if (this.c != 0) {
            this.b.h = null;
            qpz qpzVar = this.a;
            if (qpzVar == null) {
                return;
            }
            qpzVar.a(j, i, obj);
        } else if (this.a != null) {
            if (i == 2001) {
                qpy qpyVar = this.b;
                qpyVar.a.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(qpyVar.i));
                for (tqj tqjVar : this.b.E.a.d) {
                    tqjVar.g();
                }
                i = 2001;
            }
            this.a.a(j, i, obj);
        }
    }
}

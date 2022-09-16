package defpackage;
/* compiled from: PG */
/* renamed from: qx  reason: default package */
/* loaded from: classes4.dex */
final class qx {
    private qy a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized qy a() {
        qy qyVar = this.a;
        if (qyVar == null) {
            return null;
        }
        this.a = qyVar.a;
        return qyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(int i) {
        qy qyVar;
        while (true) {
            qyVar = this.a;
            if (qyVar == null || qyVar.b != i) {
                break;
            }
            this.a = qyVar.a;
            qyVar.d();
        }
        if (qyVar != null) {
            qy qyVar2 = qyVar.a;
            while (qyVar2 != null) {
                qy qyVar3 = qyVar2.a;
                if (qyVar2.b == i) {
                    qyVar.a = qyVar3;
                    qyVar2.d();
                } else {
                    qyVar = qyVar2;
                }
                qyVar2 = qyVar3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(qy qyVar) {
        qy qyVar2 = this.a;
        if (qyVar2 == null) {
            this.a = qyVar;
            return;
        }
        while (true) {
            qy qyVar3 = qyVar2.a;
            if (qyVar3 == null) {
                qyVar2.a = qyVar;
                return;
            }
            qyVar2 = qyVar3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(qy qyVar) {
        qyVar.a = this.a;
        this.a = qyVar;
    }
}

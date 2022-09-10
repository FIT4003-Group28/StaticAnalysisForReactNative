package defpackage;
/* compiled from: PG */
/* renamed from: bqcp  reason: default package */
/* loaded from: classes4.dex */
public final class bqcp<T> extends btrh<T> {
    public bqcp(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        bqcm bqcmVar = (bqcm) this.a;
        alhw alhwVar = (alhw) obj;
        if (alhwVar.a == alje.FIRST_FINGER_DOWN) {
            bqcn bqcnVar = bqcmVar.a;
            bqcnVar.e = true;
            bqcnVar.n();
            bqcn bqcnVar2 = bqcmVar.a;
            if (bqcnVar2.d == -1) {
                return;
            }
            bqcnVar2.j();
        } else if (alhwVar.a != alje.LAST_FINGER_UP) {
        } else {
            bqcn bqcnVar3 = bqcmVar.a;
            bqcnVar3.e = false;
            bqcnVar3.n();
            bqcn bqcnVar4 = bqcmVar.a;
            if (bqcnVar4.d == -1) {
                return;
            }
            bqcnVar4.j();
        }
    }
}

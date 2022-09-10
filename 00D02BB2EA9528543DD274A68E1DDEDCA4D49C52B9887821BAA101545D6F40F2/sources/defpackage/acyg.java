package defpackage;
/* compiled from: PG */
/* renamed from: acyg  reason: default package */
/* loaded from: classes.dex */
public final class acyg<T> extends btrh<T> {
    private final int d;

    public acyg(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ff J;
        int i = this.d;
        if (i == 0) {
            acyc acycVar = (acyc) this.a;
            alhl alhlVar = (alhl) obj;
            acycVar.a.aT(3, true);
            acycVar.a.a.h();
        } else if (i == 1) {
            acyc acycVar2 = (acyc) this.a;
            alhy alhyVar = (alhy) obj;
            acycVar2.a.aT(4, true);
            acycVar2.a.a.h();
        } else if (i == 2) {
            acyc acycVar3 = (acyc) this.a;
            if (((alhw) obj).a != alje.LAST_FINGER_UP) {
                return;
            }
            acycVar3.a.aQ();
        } else if (i == 3) {
            alhx alhxVar = (alhx) obj;
            ((acyc) this.a).a.aQ();
        } else if (i != 4) {
            acyc acycVar4 = (acyc) this.a;
            ege egeVar = (ege) obj;
            acyf acyfVar = acycVar4.a;
            if (!acyfVar.ba || egeVar.b != 3 || (J = acyfVar.J()) == null) {
                return;
            }
            acycVar4.a.aN(btpf.c(J));
        } else {
            acyc acycVar5 = (acyc) this.a;
            ardp ardpVar = (ardp) obj;
            acycVar5.a.aT(5, true);
            acycVar5.a.a.h();
        }
    }

    public acyg(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = 5;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: brml  reason: default package */
/* loaded from: classes4.dex */
public final class brml<T> extends btrh<T> {
    private final int d;

    public brml(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            brmk brmkVar = (brmk) this.a;
            ardp ardpVar = (ardp) obj;
            brmkVar.e();
            brmkVar.f = false;
            return;
        }
        boolean z = true;
        if (i == 1) {
            alhl alhlVar = (alhl) obj;
            ((brmk) this.a).e();
        } else if (i != 2) {
            alhx alhxVar = (alhx) obj;
            ((brmk) this.a).e();
        } else {
            brmk brmkVar2 = (brmk) this.a;
            if (((alhw) obj).a != alje.FIRST_FINGER_DOWN) {
                z = false;
            }
            brmkVar2.e = z;
            if (!z && brmkVar2.f) {
                brmkVar2.c();
            }
            brmkVar2.f = false;
        }
    }
}

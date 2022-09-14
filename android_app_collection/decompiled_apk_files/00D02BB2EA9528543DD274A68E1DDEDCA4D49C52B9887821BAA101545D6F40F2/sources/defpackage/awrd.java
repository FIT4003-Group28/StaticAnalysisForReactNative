package defpackage;
/* compiled from: PG */
/* renamed from: awrd  reason: default package */
/* loaded from: classes3.dex */
public final class awrd<T> extends btrh<T> {
    private final int d;

    public awrd(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            awrc awrcVar = (awrc) this.a;
            amqo amqoVar = (amqo) obj;
            if (amqoVar.a() == null) {
                return;
            }
            awrcVar.a.d(amqoVar.a().C());
        } else if (i != 1) {
            ege egeVar = (ege) obj;
            ((awrc) this.a).g();
        } else {
            awrc awrcVar2 = (awrc) this.a;
            if (((alhw) obj).a != alje.LAST_FINGER_UP) {
                return;
            }
            awrcVar2.g();
        }
    }
}

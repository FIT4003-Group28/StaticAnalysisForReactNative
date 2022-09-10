package defpackage;
/* compiled from: PG */
/* renamed from: dsl  reason: default package */
/* loaded from: classes6.dex */
public final class dsl<T> extends btrh<T> {
    private final int d;

    public dsl(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            dsj dsjVar = (dsj) this.a;
            ahld ahldVar = (ahld) obj;
            if (dsjVar.d.i() == amwd.OFF) {
                return;
            }
            dsjVar.c();
            return;
        }
        alhl alhlVar = (alhl) obj;
        ((dsj) this.a).c();
    }
}

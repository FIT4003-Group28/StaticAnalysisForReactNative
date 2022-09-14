package defpackage;
/* compiled from: PG */
/* renamed from: awoj  reason: default package */
/* loaded from: classes3.dex */
public final class awoj<T> extends btrh<T> {
    public awoj(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        awoh awohVar = (awoh) this.a;
        alhw alhwVar = (alhw) obj;
        synchronized (awohVar.a.d) {
            boolean z = awohVar.a.l;
            if (alhwVar.a == alje.FIRST_FINGER_DOWN) {
                awohVar.a.l = true;
            } else if (alhwVar.a == alje.LAST_FINGER_UP) {
                awohVar.a.l = false;
            }
            awoi awoiVar = awohVar.a;
            if (awoiVar.h && z != awoiVar.l) {
                awoiVar.a.j.b(awoiVar.m);
                awohVar.a.a.j.d();
            }
        }
    }
}

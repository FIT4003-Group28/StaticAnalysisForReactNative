package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bqyg  reason: default package */
/* loaded from: classes4.dex */
public final class bqyg<T> extends btrh<T> {
    public bqyg(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        List<Runnable> i;
        bqyf bqyfVar = (bqyf) this.a;
        btvr btvrVar = (btvr) obj;
        synchronized (bqyfVar) {
            dmyl dmylVar = btvn.e(btvrVar.a).e;
            if (dmylVar == null) {
                dmylVar = dmyl.b;
            }
            bqyfVar.e = dmylVar.a;
            i = bqyfVar.i();
        }
        for (Runnable runnable : i) {
            runnable.run();
        }
    }
}

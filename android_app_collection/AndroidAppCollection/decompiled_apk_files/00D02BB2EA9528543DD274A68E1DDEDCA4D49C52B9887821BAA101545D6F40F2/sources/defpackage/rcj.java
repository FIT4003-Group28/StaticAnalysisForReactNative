package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: rcj  reason: default package */
/* loaded from: classes7.dex */
public final class rcj<T> extends btrh<T> {
    private final int d;

    public rcj(Class<?> cls, T t) {
        super(cls, t);
        this.d = 0;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ((rci) this.a).ay.z(((alco) obj).a.c);
            return;
        }
        rci rciVar = (rci) this.a;
        GmmLocation a = ((amqo) obj).a();
        if (a == null) {
            return;
        }
        rciVar.aB = a;
    }

    public rcj(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = 1;
    }
}

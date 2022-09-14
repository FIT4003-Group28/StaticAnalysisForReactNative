package defpackage;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: cltr  reason: default package */
/* loaded from: classes5.dex */
public final class cltr {
    public final int a;
    public final cmeh b;
    private final CopyOnWriteArrayList<cltq> c;

    public cltr() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private cltr(CopyOnWriteArrayList<cltq> copyOnWriteArrayList, int i, cmeh cmehVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = cmehVar;
    }

    public final cltr a(int i, cmeh cmehVar) {
        return new cltr(this.c, i, cmehVar);
    }

    public final void b(Handler handler, clts cltsVar) {
        cmmn.f(cltsVar);
        this.c.add(new cltq());
    }
}

package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: vpa  reason: default package */
/* loaded from: classes7.dex */
public final class vpa implements Serializable {
    amvh a;
    amvh b;
    public boolean c;
    @dzsi
    bvrt<ddgg> d = null;

    public vpa(amvh amvhVar, amvh amvhVar2) {
        this.a = amvhVar;
        this.b = amvhVar2;
        this.c = !amvhVar2.a();
    }

    public static vpa c() {
        return new vpa(amvh.a, amvh.a);
    }

    public final amvh a(dqvj dqvjVar) {
        return (this.b.a() || !vxx.a.contains(dqvjVar)) ? this.a : this.b;
    }

    public final void b(@dzsi ddgg ddggVar) {
        this.d = bvrt.a(ddggVar);
    }

    public final void d() {
        this.c = true;
    }
}

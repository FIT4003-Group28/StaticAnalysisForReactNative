package defpackage;

import java.util.LinkedHashMap;
/* compiled from: PG */
@Deprecated
/* renamed from: yko  reason: default package */
/* loaded from: classes4.dex */
public class yko implements ykg {
    public final int a;
    final LinkedHashMap b;

    public yko(int i) {
        this.a = i;
        this.b = new ykn(this, ((int) Math.ceil(i / 0.75f)) + 1);
    }

    @Override // defpackage.ykg
    public synchronized Object a(Object obj) {
        obj.getClass();
        return this.b.get(obj);
    }

    @Override // defpackage.ykg
    public synchronized Object b(Object obj) {
        obj.getClass();
        return this.b.remove(obj);
    }

    @Override // defpackage.ykg
    public final synchronized void c() {
        this.b.clear();
    }

    @Override // defpackage.ykg
    public synchronized void d(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        this.b.put(obj, obj2);
    }

    @Override // defpackage.ykg
    public final boolean e(Object obj) {
        throw null;
    }

    public synchronized String toString() {
        return this.b.toString();
    }
}

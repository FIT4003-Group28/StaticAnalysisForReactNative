package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: ahtp  reason: default package */
/* loaded from: classes.dex */
public final class ahtp<T> extends btrh<T> {
    public ahtp(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ahtn ahtnVar = (ahtn) this.a;
        GmmLocation a = ((amqo) obj).a();
        if (a == null || ahnb.a(a, ahtnVar.a) || !ahtnVar.d.compareAndSet(ahtm.SUBSCRIBED, ahtm.FINISHED)) {
            return;
        }
        ahtnVar.e();
        ahtnVar.b.d(a);
    }
}

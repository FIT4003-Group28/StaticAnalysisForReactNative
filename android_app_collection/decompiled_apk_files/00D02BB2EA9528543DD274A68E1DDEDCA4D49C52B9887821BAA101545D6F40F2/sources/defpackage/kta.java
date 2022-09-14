package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: kta  reason: default package */
/* loaded from: classes7.dex */
public final class kta<T> extends btrh<T> {
    public kta(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ksy ksyVar = (ksy) this.a;
        GmmLocation a = ((amqo) obj).a();
        if (a == null) {
            return;
        }
        ksz kszVar = ksyVar.a;
        kszVar.c = a;
        for (ksx ksxVar : kszVar.a) {
            ksxVar.a(ksyVar.a.c);
        }
        ksyVar.a.a.clear();
    }
}

package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crls  reason: default package */
/* loaded from: classes5.dex */
public final class crls<T> extends btrh<T> {
    public crls(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        crlr crlrVar = (crlr) this.a;
        GmmLocation a = ((amqo) obj).a();
        crjy crjyVar = crlrVar.c;
        if (a == null || crjyVar == null) {
            return;
        }
        crlrVar.c(crjyVar, a, null);
    }
}

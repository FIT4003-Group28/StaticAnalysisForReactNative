package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: cksb  reason: default package */
/* loaded from: classes4.dex */
public final class cksb<T> extends btrh<T> {
    public cksb(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        cksa cksaVar = (cksa) this.a;
        GmmLocation a = ((amqo) obj).a();
        if (a != null) {
            cksaVar.b = a.C();
        }
    }
}

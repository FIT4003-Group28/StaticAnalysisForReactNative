package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crso  reason: default package */
/* loaded from: classes5.dex */
public final class crso<T> extends btrh<T> {
    public crso(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        crsn crsnVar = (crsn) this.a;
        GmmLocation a = ((amqo) obj).a();
        if (a != null) {
            crsnVar.a = a;
        }
    }
}

package defpackage;

import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: dguz  reason: default package */
/* loaded from: classes6.dex */
final class dguz extends dgvd {
    final /* synthetic */ Method a;
    final /* synthetic */ Object b;

    public dguz(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    @Override // defpackage.dgvd
    public final <T> T a(Class<T> cls) {
        b(cls);
        return (T) this.a.invoke(this.b, cls);
    }
}

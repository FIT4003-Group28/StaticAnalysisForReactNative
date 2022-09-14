package defpackage;

import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: dgva  reason: default package */
/* loaded from: classes6.dex */
final class dgva extends dgvd {
    final /* synthetic */ Method a;
    final /* synthetic */ int b;

    public dgva(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.dgvd
    public final <T> T a(Class<T> cls) {
        b(cls);
        return (T) this.a.invoke(null, cls, Integer.valueOf(this.b));
    }
}

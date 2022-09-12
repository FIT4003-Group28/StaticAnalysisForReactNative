package defpackage;

import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: dgvb  reason: default package */
/* loaded from: classes6.dex */
final class dgvb extends dgvd {
    final /* synthetic */ Method a;

    public dgvb(Method method) {
        this.a = method;
    }

    @Override // defpackage.dgvd
    public final <T> T a(Class<T> cls) {
        b(cls);
        return (T) this.a.invoke(null, cls, Object.class);
    }
}

package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dede  reason: default package */
/* loaded from: classes.dex */
final class dede extends dedg<Class<?>> {
    @Override // defpackage.dedg
    public final /* bridge */ /* synthetic */ Class<?> a(Class<?> cls) {
        return cls.getSuperclass();
    }

    @Override // defpackage.dedg
    public final /* bridge */ /* synthetic */ Iterable<? extends Class<?>> b(Class<?> cls) {
        return Arrays.asList(cls.getInterfaces());
    }

    @Override // defpackage.dedg
    public final /* bridge */ /* synthetic */ Class c(Class<?> cls) {
        return cls;
    }
}

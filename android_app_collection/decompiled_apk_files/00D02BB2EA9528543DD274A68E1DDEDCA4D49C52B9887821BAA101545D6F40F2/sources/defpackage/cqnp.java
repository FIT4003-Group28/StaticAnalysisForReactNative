package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: cqnp  reason: default package */
/* loaded from: classes.dex */
final class cqnp implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        throw new RuntimeException("Methods should not be called on an argument placeholder.");
    }
}

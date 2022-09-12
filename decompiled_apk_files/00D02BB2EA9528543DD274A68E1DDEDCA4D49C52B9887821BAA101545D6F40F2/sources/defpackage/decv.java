package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: PG */
/* renamed from: decv  reason: default package */
/* loaded from: classes.dex */
class decv<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public final Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        dbsk.g(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}

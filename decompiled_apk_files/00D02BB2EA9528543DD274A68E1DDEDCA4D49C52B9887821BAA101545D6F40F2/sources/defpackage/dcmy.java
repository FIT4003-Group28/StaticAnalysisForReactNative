package defpackage;

import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: dcmy  reason: default package */
/* loaded from: classes5.dex */
final class dcmy<T> {
    private final Field a;

    public dcmy(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(T t, Object obj) {
        try {
            this.a.set(t, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(T t, int i) {
        try {
            this.a.set(t, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}

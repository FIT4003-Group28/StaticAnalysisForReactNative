package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: dgud  reason: default package */
/* loaded from: classes6.dex */
final class dgud implements dguw {
    final /* synthetic */ Constructor a;

    public dgud(Constructor constructor) {
        this.a = constructor;
    }

    @Override // defpackage.dguw
    public final Object a() {
        try {
            return this.a.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke " + this.a + " with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3.getTargetException());
        }
    }
}

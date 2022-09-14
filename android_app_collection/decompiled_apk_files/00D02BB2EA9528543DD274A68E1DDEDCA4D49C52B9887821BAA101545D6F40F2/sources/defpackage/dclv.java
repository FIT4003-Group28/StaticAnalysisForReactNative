package defpackage;

import java.lang.reflect.Array;
/* compiled from: PG */
/* renamed from: dclv  reason: default package */
/* loaded from: classes.dex */
public final class dclv {
    public static <T> T[] a(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }
}

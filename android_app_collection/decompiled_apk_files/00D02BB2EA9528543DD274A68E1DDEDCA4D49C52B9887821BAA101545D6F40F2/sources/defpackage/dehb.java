package defpackage;

import java.lang.reflect.Constructor;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dehb  reason: default package */
/* loaded from: classes6.dex */
final class dehb implements dbrn<Constructor<?>, Boolean> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Boolean a(Constructor<?> constructor) {
        return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
    }
}

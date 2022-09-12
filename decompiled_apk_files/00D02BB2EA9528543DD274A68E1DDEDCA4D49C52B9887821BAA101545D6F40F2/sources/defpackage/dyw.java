package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/* compiled from: PG */
/* renamed from: dyw  reason: default package */
/* loaded from: classes6.dex */
final class dyw implements dbsl<Field> {
    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(@dzsi Field field) {
        Field field2 = field;
        return field2 != null && Modifier.isStatic(field2.getModifiers()) && Modifier.isPublic(field2.getModifiers());
    }
}

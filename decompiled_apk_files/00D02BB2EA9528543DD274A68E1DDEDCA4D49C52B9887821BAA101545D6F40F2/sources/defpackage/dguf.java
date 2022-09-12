package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: dguf  reason: default package */
/* loaded from: classes6.dex */
final class dguf implements dguw {
    final /* synthetic */ Type a;

    public dguf(Type type) {
        this.a = type;
    }

    @Override // defpackage.dguw
    public final Object a() {
        Type type = this.a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new dgtd("Invalid EnumSet type: " + this.a.toString());
        }
        throw new dgtd("Invalid EnumSet type: " + this.a.toString());
    }
}

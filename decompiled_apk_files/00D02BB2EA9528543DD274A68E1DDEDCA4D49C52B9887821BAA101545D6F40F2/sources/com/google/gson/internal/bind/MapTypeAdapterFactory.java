package com.google.gson.internal.bind;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MapTypeAdapterFactory implements dgtm {
    private final dguk a;

    public MapTypeAdapterFactory(dguk dgukVar) {
        this.a = dgukVar;
    }

    @Override // defpackage.dgtm
    public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
        Type[] actualTypeArguments;
        dgtl<Boolean> dgtlVar;
        Type type = dgxdVar.b;
        if (!Map.class.isAssignableFrom(dgxdVar.a)) {
            return null;
        }
        Class<?> c = dgtv.c(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type g = dgtv.g(type, c, Map.class);
            actualTypeArguments = g instanceof ParameterizedType ? ((ParameterizedType) g).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            dgtlVar = dgwy.f;
        } else {
            dgtlVar = dgsxVar.b(dgxd.a(type2));
        }
        return new dgvl(dgsxVar, actualTypeArguments[0], dgtlVar, actualTypeArguments[1], dgsxVar.b(dgxd.a(actualTypeArguments[1])), this.a.a(dgxdVar));
    }
}

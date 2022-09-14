package com.google.gson.internal.bind;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CollectionTypeAdapterFactory implements dgtm {
    private final dguk a;

    public CollectionTypeAdapterFactory(dguk dgukVar) {
        this.a = dgukVar;
    }

    @Override // defpackage.dgtm
    public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
        Type type;
        Type type2 = dgxdVar.b;
        Class<? super T> cls = dgxdVar.a;
        if (Collection.class.isAssignableFrom(cls)) {
            Type g = dgtv.g(type2, cls, Collection.class);
            if (g instanceof WildcardType) {
                g = ((WildcardType) g).getUpperBounds()[0];
            }
            if (g instanceof ParameterizedType) {
                type = ((ParameterizedType) g).getActualTypeArguments()[0];
            } else {
                type = Object.class;
            }
            return new dgvf(dgsxVar, type, dgsxVar.b(dgxd.a(type)), this.a.a(dgxdVar));
        }
        return null;
    }
}

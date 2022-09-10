package com.google.gson.internal.bind;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TypeAdapters$35 implements dgtm {
    final /* synthetic */ Class a;
    public final /* synthetic */ dgtl b;

    public TypeAdapters$35(Class cls, dgtl dgtlVar) {
        this.a = cls;
        this.b = dgtlVar;
    }

    @Override // defpackage.dgtm
    public final <T2> dgtl<T2> a(dgsx dgsxVar, dgxd<T2> dgxdVar) {
        Class<? super T2> cls = dgxdVar.a;
        if (!this.a.isAssignableFrom(cls)) {
            return null;
        }
        return new dgwp(this, cls);
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.a.getName() + ",adapter=" + this.b + "]";
    }
}

package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgvu  reason: default package */
/* loaded from: classes6.dex */
public final class dgvu<T> extends dgtl<T> {
    private final dgsx a;
    private final dgtl<T> b;
    private final Type c;

    public dgvu(dgsx dgsxVar, dgtl<T> dgtlVar, Type type) {
        this.a = dgsxVar;
        this.b = dgtlVar;
        this.c = type;
    }

    @Override // defpackage.dgtl
    public final T a(dgxe dgxeVar) {
        return this.b.a(dgxeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    @Override // defpackage.dgtl
    public final void b(dgxg dgxgVar, T t) {
        dgtl<T> dgtlVar = this.b;
        ?? r1 = this.c;
        Class<?> cls = (t == null || (r1 != Object.class && !(r1 instanceof TypeVariable) && !(r1 instanceof Class))) ? r1 : t.getClass();
        if (cls != r1) {
            dgtlVar = this.a.b(dgxd.a(cls));
            if (dgtlVar instanceof dgvo) {
                dgtl<T> dgtlVar2 = this.b;
                if (!(dgtlVar2 instanceof dgvo)) {
                    dgtlVar = dgtlVar2;
                }
            }
        }
        dgtlVar.b(dgxgVar, t);
    }
}

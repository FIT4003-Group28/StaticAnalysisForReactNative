package defpackage;

import com.google.gson.internal.bind.TypeAdapters$35;
/* compiled from: PG */
/* renamed from: dgwp  reason: default package */
/* loaded from: classes6.dex */
public final class dgwp extends dgtl {
    final /* synthetic */ Class a;
    final /* synthetic */ TypeAdapters$35 b;

    public dgwp(TypeAdapters$35 typeAdapters$35, Class cls) {
        this.b = typeAdapters$35;
        this.a = cls;
    }

    @Override // defpackage.dgtl
    public final Object a(dgxe dgxeVar) {
        Object a = this.b.b.a(dgxeVar);
        if (a == null || this.a.isInstance(a)) {
            return a;
        }
        throw new dgtj("Expected a " + this.a.getName() + " but was " + a.getClass().getName());
    }

    @Override // defpackage.dgtl
    public final void b(dgxg dgxgVar, Object obj) {
        this.b.b.b(dgxgVar, obj);
    }
}

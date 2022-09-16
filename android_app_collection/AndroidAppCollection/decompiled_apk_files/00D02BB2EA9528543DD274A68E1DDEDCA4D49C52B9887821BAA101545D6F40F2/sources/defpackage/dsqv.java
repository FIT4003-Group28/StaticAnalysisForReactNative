package defpackage;

import defpackage.dssj;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dsqv  reason: default package */
/* loaded from: classes.dex */
public final class dsqv<ContainingType extends dssj, Type> extends dspy<ContainingType, Type> {
    final ContainingType a;
    public final Type b;
    final dssj c;
    public final dsqu d;

    public dsqv(ContainingType containingtype, Type type, dssj dssjVar, dsqu dsquVar) {
        if (containingtype == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (dsquVar.c == dsur.MESSAGE && dssjVar == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = containingtype;
        this.b = type;
        this.c = dssjVar;
        this.d = dsquVar;
    }

    @Override // defpackage.dspy
    public final int a() {
        return this.d.b;
    }

    public final Object b(Object obj) {
        dsqu dsquVar = this.d;
        if (dsquVar.d) {
            if (dsquVar.a() != dsus.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                arrayList.add(c(obj2));
            }
            return arrayList;
        }
        return c(obj);
    }

    final Object c(Object obj) {
        return this.d.a() == dsus.ENUM ? this.d.a.a(((Integer) obj).intValue()) : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object d(Object obj) {
        return this.d.a() == dsus.ENUM ? Integer.valueOf(((dsrb) obj).a()) : obj;
    }

    public final dsur e() {
        return this.d.c;
    }

    public final boolean f() {
        return this.d.d;
    }
}

package defpackage;

import java.lang.reflect.Field;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoou  reason: default package */
/* loaded from: classes.dex */
public final class aoou implements Comparable {
    public final Field a;
    public final aoox b;
    public final Class c;
    public final int d;
    public final Field e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final aora i;
    public final Class j;
    public final Object k;
    public final aopo l;

    public aoou(Field field, int i, aoox aooxVar, Class cls, Field field2, int i2, boolean z, boolean z2, aora aoraVar, Class cls2, Object obj, aopo aopoVar) {
        this.a = field;
        this.b = aooxVar;
        this.c = cls;
        this.d = i;
        this.e = field2;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = aoraVar;
        this.j = cls2;
        this.k = obj;
        this.l = aopoVar;
    }

    public static aoou a(int i, aoox aooxVar, aora aoraVar, Class cls, boolean z, aopo aopoVar) {
        b(i);
        aopv.i(aooxVar, "fieldType");
        aopv.i(aoraVar, "oneof");
        aopv.i(cls, "oneofStoredType");
        if (aooxVar.aa != aoow.SCALAR) {
            String valueOf = String.valueOf(aooxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
            sb.append("Oneof is only supported for scalar fields. Field ");
            sb.append(i);
            sb.append(" is of type ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return new aoou(null, i, aooxVar, null, null, 0, false, z, aoraVar, cls, null, aopoVar);
    }

    public static void b(int i) {
        if (i > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("fieldNumber must be positive: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean c(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.d - ((aoou) obj).d;
    }
}

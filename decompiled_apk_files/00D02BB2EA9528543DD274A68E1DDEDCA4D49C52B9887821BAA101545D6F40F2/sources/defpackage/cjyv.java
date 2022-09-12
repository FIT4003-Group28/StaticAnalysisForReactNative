package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cjyv  reason: default package */
/* loaded from: classes4.dex */
public class cjyv<T extends cqkp> {
    public final cqiw<T> a;
    public final cjzk b;
    public final T c;
    public final boolean d;
    public final boolean e;

    public cjyv(cqiw<T> cqiwVar, cjzk cjzkVar, T t, boolean z, boolean z2) {
        this.a = cqiwVar;
        this.b = cjzkVar;
        this.c = t;
        this.d = z;
        this.e = z2;
    }

    public static <T extends cqkp> cjyv<T> a(cjzq<T> cjzqVar, boolean z, boolean z2) {
        return new cjyv<>(cjzqVar.a, cjzqVar.b, cjzqVar.c, z, z2);
    }
}

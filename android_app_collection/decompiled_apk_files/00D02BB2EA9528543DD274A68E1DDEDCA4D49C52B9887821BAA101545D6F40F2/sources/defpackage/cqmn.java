package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmn  reason: default package */
/* loaded from: classes.dex */
public final class cqmn<T extends cqkp> implements cqmp<T> {
    public final cqmp<T>[] a;

    private cqmn(cqmp<T>[] cqmpVarArr) {
        this.a = cqmpVarArr;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmn<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmn<>(cqmpVarArr);
    }
}

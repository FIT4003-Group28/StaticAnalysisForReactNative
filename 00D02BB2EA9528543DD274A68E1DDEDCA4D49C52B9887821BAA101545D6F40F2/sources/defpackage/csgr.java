package defpackage;
/* compiled from: PG */
/* renamed from: csgr  reason: default package */
/* loaded from: classes5.dex */
public final class csgr<T> {
    public final dspy<cshb, T> a;
    public final T b;

    private csgr(dspy<cshb, T> dspyVar, T t) {
        boolean z = false;
        if (dspyVar.a() >= 100000000 && dspyVar.a() < 200000000) {
            z = true;
        }
        dbsk.a(z);
        this.a = dspyVar;
        this.b = t;
    }

    public static <T> csgr<?> a(dspy<cshb, T> dspyVar, T t) {
        return new csgr<>(dspyVar, t);
    }
}

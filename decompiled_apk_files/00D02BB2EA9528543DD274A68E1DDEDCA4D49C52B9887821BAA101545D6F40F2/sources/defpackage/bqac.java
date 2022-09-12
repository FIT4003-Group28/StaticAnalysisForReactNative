package defpackage;
/* compiled from: PG */
/* renamed from: bqac  reason: default package */
/* loaded from: classes4.dex */
abstract class bqac {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static bqab c() {
        return new bpym();
    }

    public abstract double a();

    public abstract float b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(@dzsi alad aladVar, alad aladVar2) {
        return aladVar == null || akqo.e(aladVar.i, aladVar2.i) > a() || Math.abs(aladVar.k - aladVar2.k) > b();
    }
}

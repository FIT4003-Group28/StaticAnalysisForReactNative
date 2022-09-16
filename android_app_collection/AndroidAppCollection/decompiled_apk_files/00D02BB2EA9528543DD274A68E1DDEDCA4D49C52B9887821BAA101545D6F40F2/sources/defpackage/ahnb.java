package defpackage;
/* compiled from: PG */
/* renamed from: ahnb  reason: default package */
/* loaded from: classes.dex */
public final class ahnb {
    public static boolean a(ahnc ahncVar, cqat cqatVar) {
        return c(ahncVar, ahnc.f, cqatVar);
    }

    @Deprecated
    public static boolean b(long j, long j2) {
        return j + ahnc.f < j2;
    }

    public static boolean c(ahnc ahncVar, long j, cqat cqatVar) {
        return ahncVar.d() ? ahncVar.b() + j < cqatVar.e() : ahncVar.c() && ahncVar.getTime() + j < cqatVar.b();
    }
}

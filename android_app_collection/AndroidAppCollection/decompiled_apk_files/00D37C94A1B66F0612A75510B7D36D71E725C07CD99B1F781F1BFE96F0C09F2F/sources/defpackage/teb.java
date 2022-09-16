package defpackage;
/* compiled from: PG */
/* renamed from: teb  reason: default package */
/* loaded from: classes4.dex */
public abstract class teb {
    public abstract void a(int i, String str, tda tdaVar, Throwable th);

    @Deprecated
    public final void b(int i, String str) {
        a(i, str, tda.a, null);
    }

    public final void c(int i, String str, tda tdaVar) {
        a(i, str, tdaVar, null);
    }

    @Deprecated
    public final void d(int i, String str, Throwable th) {
        a(i, str, tda.a, th);
    }
}

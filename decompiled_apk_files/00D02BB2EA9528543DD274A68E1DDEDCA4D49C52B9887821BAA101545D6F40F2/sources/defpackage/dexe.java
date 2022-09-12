package defpackage;
/* compiled from: PG */
/* renamed from: dexe  reason: default package */
/* loaded from: classes6.dex */
public final class dexe extends Exception {
    public dexe(String str, Throwable th) {
        super(str, th);
        dbsk.t(th, "Must provide cause");
    }

    public dexe(Throwable th) {
        super(th);
    }
}

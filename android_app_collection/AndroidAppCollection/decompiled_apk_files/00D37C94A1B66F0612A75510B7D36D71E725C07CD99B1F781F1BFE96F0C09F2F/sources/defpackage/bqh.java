package defpackage;
/* compiled from: PG */
/* renamed from: bqh  reason: default package */
/* loaded from: classes2.dex */
public final class bqh extends aeh {
    public final Throwable a;

    public bqh(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return String.format("FAILURE (%s)", this.a.getMessage());
    }
}

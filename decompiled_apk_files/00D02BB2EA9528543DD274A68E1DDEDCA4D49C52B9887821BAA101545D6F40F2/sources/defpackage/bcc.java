package defpackage;
/* compiled from: PG */
/* renamed from: bcc  reason: default package */
/* loaded from: classes3.dex */
public final class bcc extends bcf {
    public final Throwable a;

    public bcc(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return String.format("FAILURE (%s)", this.a.getMessage());
    }
}

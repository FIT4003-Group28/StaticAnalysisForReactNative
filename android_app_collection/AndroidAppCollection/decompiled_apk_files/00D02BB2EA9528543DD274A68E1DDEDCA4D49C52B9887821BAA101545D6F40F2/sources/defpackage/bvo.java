package defpackage;
/* compiled from: PG */
/* renamed from: bvo  reason: default package */
/* loaded from: classes.dex */
final class bvo extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public bvo(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}

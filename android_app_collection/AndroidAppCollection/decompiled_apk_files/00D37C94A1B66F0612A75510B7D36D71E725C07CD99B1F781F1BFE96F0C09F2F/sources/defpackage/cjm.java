package defpackage;
/* compiled from: PG */
/* renamed from: cjm  reason: default package */
/* loaded from: classes2.dex */
final class cjm extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public cjm(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}

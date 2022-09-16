package defpackage;
/* compiled from: PG */
/* renamed from: azrh  reason: default package */
/* loaded from: classes2.dex */
public final class azrh implements azqy {
    public static final azrh a = new azrh();

    private azrh() {
    }

    @Override // defpackage.azqy
    public final azrd getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // defpackage.azqy
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}

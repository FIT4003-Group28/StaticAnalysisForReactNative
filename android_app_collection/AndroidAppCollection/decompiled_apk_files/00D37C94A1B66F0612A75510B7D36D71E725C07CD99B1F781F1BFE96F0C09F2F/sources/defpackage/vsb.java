package defpackage;
/* compiled from: PG */
/* renamed from: vsb  reason: default package */
/* loaded from: classes4.dex */
public final class vsb extends Exception {
    public vsb(Exception exc) {
        super(exc);
    }

    public vsb(String str) {
        super(str);
    }

    public vsb(Exception exc, byte[] bArr) {
        super("Failed to build metadata from Movie", exc);
    }
}

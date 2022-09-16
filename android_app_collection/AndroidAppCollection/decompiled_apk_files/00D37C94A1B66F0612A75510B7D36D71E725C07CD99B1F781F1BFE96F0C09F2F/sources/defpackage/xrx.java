package defpackage;
/* compiled from: PG */
/* renamed from: xrx  reason: default package */
/* loaded from: classes4.dex */
final class xrx extends Exception {
    public xrx(String str) {
        super(str);
    }

    public xrx(Throwable th) {
        super("Error occured in the image data upload", th);
    }
}

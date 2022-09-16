package defpackage;
/* compiled from: PG */
/* renamed from: cmra  reason: default package */
/* loaded from: classes.dex */
public class cmra extends Exception {
    public cmra() {
    }

    public cmra(String str) {
        super(str);
    }

    public cmra(Throwable th, byte[] bArr) {
        super("Couldn't read data from server.", th);
    }

    public cmra(Throwable th) {
        super(th);
    }
}

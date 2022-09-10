package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsoy  reason: default package */
/* loaded from: classes.dex */
public final class dsoy {
    public final dspp a;
    private final byte[] b;

    public dsoy(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = dspp.D(bArr);
    }

    public final dspd a() {
        this.a.an();
        return new dspa(this.b);
    }
}

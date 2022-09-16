package defpackage;
/* compiled from: PG */
/* renamed from: qso  reason: default package */
/* loaded from: classes4.dex */
public final class qso {
    public final String a;
    public final twx b;
    public final tzc c;

    public qso(String str, tzc tzcVar, twx twxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        qnm.n(tzcVar, "Cannot construct an Api with a null ClientBuilder");
        this.a = str;
        this.c = tzcVar;
        this.b = twxVar;
    }
}

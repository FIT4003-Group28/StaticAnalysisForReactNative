package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: aaqp  reason: default package */
/* loaded from: classes.dex */
public final class aaqp {
    static aaqp a;
    volatile boolean b;
    private final azqb c;
    private final afvn d;

    public aaqp(azqb azqbVar, aadd aaddVar, afvn afvnVar) {
        this.c = azqbVar;
        this.d = afvnVar;
        a = this;
        if (aaddVar != null) {
            aaddVar.a.as(new ayqb() { // from class: aaqo
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    aaqp aaqpVar = aaqp.this;
                    athe atheVar = ((arhd) obj).f;
                    if (atheVar == null) {
                        atheVar = athe.a;
                    }
                    aaqpVar.b = atheVar.g;
                }
            });
        }
    }

    public static aoqu b(Parcel parcel, aoqu aoquVar) {
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return aoquVar;
        }
        aaqp aaqpVar = a;
        if (aaqpVar != null) {
            aaqpVar.a(createByteArray, aoquVar);
        }
        try {
            return aoquVar.mo52toBuilder().mo38mergeFrom(createByteArray, aoos.b()).mo39build();
        } catch (aopx e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static aoqu c(byte[] bArr, aoqu aoquVar) {
        aaqp aaqpVar = a;
        if (aaqpVar != null) {
            return aaqpVar.a(bArr, aoquVar);
        }
        try {
            return aoquVar.mo52toBuilder().mo38mergeFrom(bArr, aoos.b()).mo39build();
        } catch (aopx e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, aoqu] */
    public final aoqu a(final byte[] bArr, aoqu aoquVar) {
        bArr.getClass();
        aoquVar.getClass();
        try {
            ?? n = aoquVar.getParserForType().n(bArr, aoos.b());
            ((aapv) this.c.get()).b(this.d.c(), n, bArr, new amqo() { // from class: aaqn
                @Override // defpackage.amqo
                public final Object get() {
                    aoob H;
                    byte[] bArr2 = bArr;
                    try {
                        if (aaqp.a == null || !aaqp.a.b) {
                            H = zgd.H(aoob.x(bArr2), 1);
                        } else {
                            H = zgd.I(bArr2, 1);
                        }
                        if (H == null) {
                            return arpa.a;
                        }
                        return (arpa) aopi.parseFrom(arpa.a, H, aoos.b());
                    } catch (aopx e) {
                        zep.d("Exception while parsing response context", e);
                        return arpa.a;
                    }
                }
            });
            return n;
        } catch (aopx e) {
            zep.d("Exception while parsing InnerTube response", e);
            return null;
        }
    }
}

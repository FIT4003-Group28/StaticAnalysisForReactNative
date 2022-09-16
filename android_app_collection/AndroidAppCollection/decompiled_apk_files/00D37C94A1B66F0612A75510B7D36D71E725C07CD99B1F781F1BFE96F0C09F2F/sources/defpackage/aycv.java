package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aycv  reason: default package */
/* loaded from: classes2.dex */
final class aycv extends aycw {
    private final ayax b;
    private final ayat c;
    private final aymk d;

    public aycv(aycl ayclVar, int i, ayax ayaxVar, ayat ayatVar, aymk aymkVar) {
        super(ayclVar, i, aymkVar);
        this.b = ayaxVar;
        this.c = ayatVar;
        this.d = aymkVar;
    }

    @Override // defpackage.aycw
    protected final int a(Parcel parcel) {
        int length;
        int read;
        parcel.writeString(this.b.b);
        ayat ayatVar = this.c;
        int a = axzu.a(ayatVar);
        if (a == 0) {
            parcel.writeInt(0);
        } else {
            Object[] e = axzu.e(ayatVar);
            parcel.writeInt(a);
            for (int i = 0; i < a; i++) {
                int i2 = i + i;
                byte[] bArr = (byte[]) e[i2];
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
                Object obj = e[i2 + 1];
                if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(bArr2);
                } else if (!(obj instanceof aycx)) {
                    byte[] b = aycn.b();
                    try {
                        InputStream inputStream = (InputStream) obj;
                        int i3 = 0;
                        while (true) {
                            length = b.length;
                            if (i3 >= length || (read = inputStream.read(b, i3, length - i3)) == -1) {
                                break;
                            }
                            i3 += read;
                        }
                        if (i3 != length) {
                            parcel.writeInt(i3);
                            if (i3 > 0) {
                                parcel.writeByteArray(b, 0, i3);
                            }
                        } else {
                            throw Status.j.withDescription("Metadata value too large").asException();
                        }
                    } finally {
                        aycn.a(b);
                    }
                } else {
                    parcel.writeInt(-1);
                    aycx aycxVar = (aycx) obj;
                    throw null;
                }
            }
        }
        this.d.c();
        ayaw ayawVar = this.b.a;
        return (ayawVar == ayaw.UNARY || ayawVar == ayaw.CLIENT_STREAMING) ? 16 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(axyy axyyVar) {
        this.c.d(ayhf.a);
        this.c.f(ayhf.a, Long.valueOf(Math.max(0L, axyyVar.b(TimeUnit.NANOSECONDS))));
    }
}

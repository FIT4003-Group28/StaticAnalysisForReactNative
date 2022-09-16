package defpackage;

import java.util.Random;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: vaj  reason: default package */
/* loaded from: classes4.dex */
final class vaj extends val {
    private final Random a;
    private final snc b;
    private final long c;
    private final uzy d;

    public vaj(baaw baawVar, Random random, uzy uzyVar, snc sncVar) {
        super(baawVar);
        this.a = random;
        this.c = baawVar.c;
        this.d = uzyVar;
        this.b = sncVar;
    }

    @Override // defpackage.val
    public final long a(String str) {
        long j;
        if (amps.e(str)) {
            j = this.c;
        } else {
            uzy uzyVar = this.d;
            long d = this.b.d() - uzyVar.d;
            char c = 0;
            if (d >= 14400000) {
                long j2 = d / 14400000;
                long max = Math.max(j2, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = uzyVar.a;
                    int i2 = (int) max;
                    int i3 = sArr[i] >> i2;
                    sArr[i] = (short) i3;
                    uzyVar.b[i] = (short) (i3 >> i2);
                }
                uzyVar.d += j2 * 14400000;
            }
            int hashCode = str.hashCode() * uzyVar.c;
            if (!str.isEmpty()) {
                c = str.charAt(0);
            }
            int i4 = ((hashCode >>> 24) + c) & PrivateKeyType.INVALID;
            int length = ((hashCode >>> 16) + str.length()) & PrivateKeyType.INVALID;
            int min = Math.min((int) uzyVar.a[i4], (int) uzyVar.b[length]);
            int i5 = min + 1;
            short min2 = (short) Math.min(32767, i5);
            short[] sArr2 = uzyVar.a;
            if (sArr2[i4] == min) {
                sArr2[i4] = min2;
            }
            short[] sArr3 = uzyVar.b;
            if (sArr3[length] == min) {
                sArr3[length] = min2;
            }
            double sqrt = i5 < 50 ? Math.sqrt(i5) : i5;
            double d2 = this.c;
            Double.isNaN(d2);
            j = (int) (d2 / sqrt);
        }
        if (this.a.nextDouble() * 1000.0d < j) {
            return j;
        }
        return -1L;
    }

    @Override // defpackage.val
    public final baaw b(Long l) {
        if (c()) {
            return e(l);
        }
        return d();
    }

    @Override // defpackage.val
    public final boolean c() {
        return this.c > 0;
    }
}

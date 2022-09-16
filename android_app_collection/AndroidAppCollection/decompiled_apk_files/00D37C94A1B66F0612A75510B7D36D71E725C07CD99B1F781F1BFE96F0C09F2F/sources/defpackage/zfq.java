package defpackage;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: zfq  reason: default package */
/* loaded from: classes4.dex */
public final class zfq {
    private final axnm a;

    public zfq(axnm axnmVar) {
        this.a = axnmVar;
    }

    public final double a(double d, double d2) {
        aqxo.p(d <= d2);
        return d + (((SecureRandom) this.a.get()).nextDouble() * (d2 - d));
    }

    public final String b(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) this.a.get()).nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    public final void c(ArrayList arrayList, int i) {
        int max;
        int size;
        if (this.a != null && (max = Math.max(1, 0)) < i && (size = arrayList.size()) != 0 && max < size) {
            int min = Math.min(i, size) - max;
            while (true) {
                min--;
                if (min < 0) {
                    return;
                }
                int i2 = min + max;
                int nextInt = ((SecureRandom) this.a.get()).nextInt(min + 1) + max;
                int intValue = ((Integer) arrayList.get(i2)).intValue();
                arrayList.set(i2, (Integer) arrayList.get(nextInt));
                arrayList.set(nextInt, Integer.valueOf(intValue));
            }
        }
    }
}

package defpackage;

import android.system.ErrnoException;
import android.system.OsConstants;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: axm  reason: default package */
/* loaded from: classes2.dex */
public final class axm {
    public static boolean a(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }

    public static azm b(pwu pwuVar) {
        pwuVar.H(1);
        int k = pwuVar.k();
        long j = pwuVar.b + k;
        int i = k / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long o = pwuVar.o();
            if (o != -1) {
                jArr[i2] = o;
                jArr2[i2] = pwuVar.o();
                pwuVar.H(2);
                i2++;
            } else {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
        }
        pwuVar.H((int) (j - pwuVar.b));
        return new azm(jArr, jArr2);
    }

    public static Metadata c(azf azfVar, boolean z) {
        Metadata a = new azr().a(azfVar, z ? null : pov.a);
        if (a == null || a.a() == 0) {
            return null;
        }
        return a;
    }
}

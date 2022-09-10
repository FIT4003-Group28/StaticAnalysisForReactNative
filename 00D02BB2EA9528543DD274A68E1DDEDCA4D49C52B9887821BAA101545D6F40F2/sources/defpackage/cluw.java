package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cluw  reason: default package */
/* loaded from: classes5.dex */
public final class cluw {
    public static cluy a(cmnk cmnkVar) {
        cmnkVar.h(1);
        int o = cmnkVar.o();
        long j = cmnkVar.b + o;
        int i = o / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long t = cmnkVar.t();
            if (t != -1) {
                jArr[i2] = t;
                jArr2[i2] = cmnkVar.t();
                cmnkVar.h(2);
                i2++;
            } else {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
        }
        cmnkVar.h((int) (j - cmnkVar.b));
        return new cluy(jArr, jArr2);
    }

    public static Metadata b(cluk clukVar, boolean z) {
        Metadata a = new clvb().a(clukVar, z ? null : cmcs.a);
        if (a == null || a.a() == 0) {
            return null;
        }
        return a;
    }
}

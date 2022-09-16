package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: clyw  reason: default package */
/* loaded from: classes5.dex */
public final class clyw implements cmai {
    private final List<Format> a;

    public clyw() {
        this(null);
    }

    private final List<Format> c(cmah cmahVar) {
        String str;
        int i;
        List<byte[]> list;
        cmnk cmnkVar = new cmnk(cmahVar.d);
        List<Format> list2 = this.a;
        while (cmnkVar.d() > 0) {
            int l = cmnkVar.l();
            int l2 = cmnkVar.b + cmnkVar.l();
            if (l == 134) {
                list2 = new ArrayList<>();
                int l3 = cmnkVar.l() & 31;
                for (int i2 = 0; i2 < l3; i2++) {
                    String y = cmnkVar.y(3);
                    int l4 = cmnkVar.l();
                    int i3 = l4 & 128;
                    if (i3 != 0) {
                        i = l4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte l5 = (byte) cmnkVar.l();
                    cmnkVar.h(1);
                    if (i3 != 0) {
                        byte[] bArr = cmmr.a;
                        list = Collections.singletonList((l5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    clnf clnfVar = new clnf();
                    clnfVar.k = str;
                    clnfVar.c = y;
                    clnfVar.C = i;
                    clnfVar.m = list;
                    list2.add(clnfVar.a());
                }
            }
            cmnkVar.f(l2);
        }
        return list2;
    }

    public final clzy a(cmah cmahVar) {
        return new clzy(c(cmahVar));
    }

    public final cmam b(cmah cmahVar) {
        return new cmam(c(cmahVar));
    }

    public clyw(byte[] bArr) {
        this.a = dcdc.e();
    }
}

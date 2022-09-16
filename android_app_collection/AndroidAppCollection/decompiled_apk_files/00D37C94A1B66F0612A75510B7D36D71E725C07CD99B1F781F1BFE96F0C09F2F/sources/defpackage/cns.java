package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cns  reason: default package */
/* loaded from: classes2.dex */
public final class cns {
    final List a;

    public cns() {
        this((byte[]) null);
    }

    public cns(List list) {
        this.a = list;
    }

    private final List c(aerg aergVar) {
        String str;
        int i;
        List list;
        pwu pwuVar = new pwu(aergVar.a);
        List list2 = this.a;
        while (pwuVar.a() > 0) {
            int i2 = pwuVar.i();
            int i3 = pwuVar.b + pwuVar.i();
            if (i2 == 134) {
                list2 = new ArrayList();
                int i4 = pwuVar.i() & 31;
                for (int i5 = 0; i5 < i4; i5++) {
                    String v = pwuVar.v(3);
                    int i6 = pwuVar.i();
                    int i7 = i6 & 128;
                    if (i7 != 0) {
                        i = i6 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte i8 = (byte) pwuVar.i();
                    pwuVar.H(1);
                    if (i7 != 0) {
                        byte[] bArr = pvr.a;
                        list = Collections.singletonList((i8 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    pis pisVar = new pis();
                    pisVar.k = str;
                    pisVar.c = v;
                    pisVar.C = i;
                    pisVar.m = list;
                    list2.add(pisVar.a());
                }
            }
            pwuVar.G(i3);
        }
        return list2;
    }

    public final bdz a(aerg aergVar) {
        return new bdz(c(aergVar));
    }

    public final beh b(aerg aergVar) {
        return new beh(c(aergVar));
    }

    public cns(byte[] bArr) {
        this.a = amuk.q();
    }
}

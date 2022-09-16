package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: baj  reason: default package */
/* loaded from: classes2.dex */
final class baj extends ban {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int e;

    public baj(bab babVar) {
        super(babVar);
    }

    @Override // defpackage.ban
    protected final boolean a(pwu pwuVar) {
        if (!this.b) {
            int i = pwuVar.i();
            int i2 = i >> 4;
            this.e = i2;
            if (i2 == 2) {
                int i3 = a[(i >> 2) & 3];
                pis pisVar = new pis();
                pisVar.k = "audio/mpeg";
                pisVar.x = 1;
                pisVar.y = i3;
                this.d.rx(pisVar.a());
                this.c = true;
            } else if (i2 == 7 || i2 == 8) {
                String str = i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                pis pisVar2 = new pis();
                pisVar2.k = str;
                pisVar2.x = 1;
                pisVar2.y = 8000;
                this.d.rx(pisVar2.a());
                this.c = true;
            } else if (i2 != 10) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i2);
                throw new bam(sb.toString());
            }
            this.b = true;
        } else {
            pwuVar.H(1);
        }
        return true;
    }

    @Override // defpackage.ban
    protected final boolean b(pwu pwuVar, long j) {
        if (this.e == 2) {
            int a2 = pwuVar.a();
            this.d.c(pwuVar, a2);
            this.d.e(j, 1, a2, 0, null);
            return true;
        }
        int i = pwuVar.i();
        if (i != 0 || this.c) {
            if (this.e == 10 && i != 1) {
                return false;
            }
            int a3 = pwuVar.a();
            this.d.c(pwuVar, a3);
            this.d.e(j, 1, a3, 0, null);
            return true;
        }
        int a4 = pwuVar.a();
        byte[] bArr = new byte[a4];
        pwuVar.B(bArr, 0, a4);
        agqq a5 = aym.a(bArr);
        pis pisVar = new pis();
        pisVar.k = "audio/mp4a-latm";
        pisVar.h = a5.a;
        pisVar.x = a5.b;
        pisVar.y = a5.c;
        pisVar.m = Collections.singletonList(bArr);
        this.d.rx(pisVar.a());
        this.c = true;
        return false;
    }
}

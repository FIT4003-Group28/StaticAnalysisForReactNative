package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ozl  reason: default package */
/* loaded from: classes4.dex */
final class ozl extends ozs {
    private pcj e;
    private pci f;
    private boolean g;

    @Override // defpackage.ozs
    public final int a(oxn oxnVar, oxz oxzVar) {
        pcj pcjVar;
        int i;
        byte b;
        int i2;
        long j = oxnVar.c;
        if (!this.b.a(oxnVar, this.a)) {
            return -1;
        }
        pct pctVar = this.a;
        byte[] bArr = pctVar.a;
        if (this.e == null) {
            this.e = new pcj(bArr);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, this.a.c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            pcj pcjVar2 = this.e;
            int i3 = pcjVar2.e;
            int i4 = pcjVar2.c;
            this.c.d(MediaFormat.b(null, "audio/x-flac", i3 * i4, -1, (pcjVar2.f * 1000000) / i4, pcjVar2.d, i4, singletonList, null));
        } else {
            byte b2 = bArr[0];
            if (b2 != -1) {
                if ((b2 & Byte.MAX_VALUE) == 3 && this.f == null) {
                    pctVar.A(1);
                    int i5 = pctVar.i() / 18;
                    long[] jArr = new long[i5];
                    long[] jArr2 = new long[i5];
                    for (int i6 = 0; i6 < i5; i6++) {
                        jArr[i6] = pctVar.m();
                        jArr2[i6] = pctVar.m();
                        pctVar.A(2);
                    }
                    this.f = new pci(jArr, jArr2);
                }
            } else {
                if (!this.g) {
                    pci pciVar = this.f;
                    if (pciVar != null) {
                        this.d.pS(new pch(pciVar, pcjVar.c, j));
                        this.f = null;
                    } else {
                        this.d.pS(oye.f);
                    }
                    this.g = true;
                }
                oyf oyfVar = this.c;
                pct pctVar2 = this.a;
                oyfVar.f(pctVar2, pctVar2.c);
                this.a.z(0);
                pcj pcjVar3 = this.e;
                pct pctVar3 = this.a;
                pctVar3.A(4);
                long j2 = pctVar3.a[pctVar3.b];
                int i7 = 7;
                while (true) {
                    if (i7 < 0) {
                        break;
                    }
                    if (((1 << i7) & j2) != 0) {
                        i7--;
                    } else if (i7 < 6) {
                        j2 &= i2 - 1;
                        i = 7 - i7;
                    } else if (i7 == 7) {
                        i = 1;
                    }
                }
                i = 0;
                if (i != 0) {
                    for (int i8 = 1; i8 < i; i8++) {
                        if ((pctVar3.a[pctVar3.b + i8] & 192) != 128) {
                            StringBuilder sb = new StringBuilder(62);
                            sb.append("Invalid UTF-8 sequence continuation byte: ");
                            sb.append(j2);
                            throw new NumberFormatException(sb.toString());
                        }
                        j2 = (j2 << 6) | (b & 63);
                    }
                    pctVar3.b += i;
                    int i9 = pcjVar3.a;
                    if (i9 == pcjVar3.b) {
                        j2 *= i9;
                    }
                    this.c.g((j2 * 1000000) / pcjVar3.c, 1, this.a.c, 0, null);
                } else {
                    StringBuilder sb2 = new StringBuilder(55);
                    sb2.append("Invalid UTF-8 sequence first byte: ");
                    sb2.append(j2);
                    throw new NumberFormatException(sb2.toString());
                }
            }
        }
        this.a.v();
        return 0;
    }
}

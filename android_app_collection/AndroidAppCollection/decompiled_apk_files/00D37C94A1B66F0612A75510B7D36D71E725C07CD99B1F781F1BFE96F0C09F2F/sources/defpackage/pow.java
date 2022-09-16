package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: pow  reason: default package */
/* loaded from: classes4.dex */
public final class pow extends poo {
    private final pwu a = new pwu();
    private final pwt b = new pwt();
    private pxg c;

    @Override // defpackage.poo
    protected final Metadata b(pol polVar, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        poz e;
        List list;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j2;
        int i;
        int i2;
        int i3;
        boolean z5;
        long j3;
        int i4;
        long j4;
        pxg pxgVar = this.c;
        if (pxgVar == null || polVar.a != pxgVar.e()) {
            pxg pxgVar2 = new pxg(polVar.f);
            this.c = pxgVar2;
            pxgVar2.a(polVar.f - polVar.a);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.E(array, limit);
        this.b.i(array, limit);
        this.b.l(39);
        long d = (this.b.d(1) << 32) | this.b.d(32);
        this.b.l(20);
        int d2 = this.b.d(12);
        int d3 = this.b.d(8);
        this.a.H(14);
        if (d3 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (d3 == 255) {
            pwu pwuVar = this.a;
            long p = pwuVar.p();
            int i5 = d2 - 4;
            byte[] bArr = new byte[i5];
            pwuVar.B(bArr, 0, i5);
            spliceNullCommand = new PrivateCommand(p, bArr, d);
        } else if (d3 == 4) {
            pwu pwuVar2 = this.a;
            int i6 = pwuVar2.i();
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                e = poz.e(pwuVar2);
                arrayList.add(e);
            }
            spliceNullCommand = new SpliceScheduleCommand(arrayList);
        } else if (d3 == 5) {
            pwu pwuVar3 = this.a;
            pxg pxgVar3 = this.c;
            long p2 = pwuVar3.p();
            boolean z6 = (pwuVar3.i() & 128) != 0;
            List emptyList = Collections.emptyList();
            if (!z6) {
                int i8 = pwuVar3.i();
                boolean z7 = (i8 & 128) != 0;
                boolean z8 = (i8 & 64) != 0;
                int i9 = i8 & 32;
                boolean z9 = (i8 & 16) != 0;
                long d4 = (!z8 || z9) ? -9223372036854775807L : TimeSignalCommand.d(pwuVar3, d);
                if (!z8) {
                    int i10 = pwuVar3.i();
                    ArrayList arrayList2 = new ArrayList(i10);
                    int i11 = 0;
                    while (i11 < i10) {
                        int i12 = pwuVar3.i();
                        if (!z9) {
                            i4 = i10;
                            j4 = TimeSignalCommand.d(pwuVar3, d);
                        } else {
                            i4 = i10;
                            j4 = -9223372036854775807L;
                        }
                        arrayList2.add(new pox(i12, j4, pxgVar3.b(j4)));
                        i11++;
                        i10 = i4;
                    }
                    emptyList = arrayList2;
                }
                if (i9 != 0) {
                    long i13 = pwuVar3.i();
                    z5 = (128 & i13) != 0;
                    j3 = ((((i13 & 1) << 32) | pwuVar3.p()) * 1000) / 90;
                } else {
                    z5 = false;
                    j3 = -9223372036854775807L;
                }
                int m = pwuVar3.m();
                int i14 = pwuVar3.i();
                i = m;
                z4 = z5;
                i3 = pwuVar3.i();
                i2 = i14;
                list = emptyList;
                j2 = j3;
                z = z7;
                j = d4;
                z3 = z9;
                z2 = z8;
            } else {
                list = emptyList;
                j = -9223372036854775807L;
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            spliceNullCommand = new SpliceInsertCommand(p2, z6, z, z2, z3, j, pxgVar3.b(j), list, z4, j2, i, i2, i3);
        } else if (d3 != 6) {
            spliceNullCommand = null;
        } else {
            pwu pwuVar4 = this.a;
            pxg pxgVar4 = this.c;
            long d5 = TimeSignalCommand.d(pwuVar4, d);
            spliceNullCommand = new TimeSignalCommand(d5, pxgVar4.b(d5));
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}

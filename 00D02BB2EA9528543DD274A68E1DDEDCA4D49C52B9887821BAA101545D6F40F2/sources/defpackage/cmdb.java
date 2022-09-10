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
/* renamed from: cmdb  reason: default package */
/* loaded from: classes5.dex */
public final class cmdb extends cmbz {
    private final cmnk a = new cmnk();
    private final cmnj b = new cmnj();
    private cmnv c;

    @Override // defpackage.cmbz
    protected final Metadata b(cmbw cmbwVar, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        long j;
        ArrayList arrayList;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        long j4;
        boolean z6;
        List list;
        long j5;
        long j6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i4;
        int i5;
        int i6;
        boolean z11;
        cmnv cmnvVar = this.c;
        if (cmnvVar == null || cmbwVar.f != cmnvVar.b()) {
            cmnv cmnvVar2 = new cmnv(cmbwVar.d);
            this.c = cmnvVar2;
            cmnvVar2.e(cmbwVar.d - cmbwVar.f);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.c(array, limit);
        this.b.b(array, limit);
        this.b.h(39);
        long j7 = (this.b.j(1) << 32) | this.b.j(32);
        this.b.h(20);
        int j8 = this.b.j(12);
        int j9 = this.b.j(8);
        this.a.h(14);
        if (j9 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (j9 != 255) {
            long j10 = 1;
            long j11 = -9223372036854775807L;
            if (j9 == 4) {
                cmnk cmnkVar = this.a;
                int l = cmnkVar.l();
                ArrayList arrayList2 = new ArrayList(l);
                int i7 = 0;
                while (i7 < l) {
                    long p = cmnkVar.p();
                    boolean z12 = (cmnkVar.l() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (!z12) {
                        int l2 = cmnkVar.l();
                        boolean z13 = (l2 & 128) != 0;
                        boolean z14 = (l2 & 64) != 0;
                        int i8 = l2 & 32;
                        long p2 = z14 ? cmnkVar.p() : -9223372036854775807L;
                        if (!z14) {
                            int l3 = cmnkVar.l();
                            ArrayList arrayList4 = new ArrayList(l3);
                            int i9 = 0;
                            while (i9 < l3) {
                                arrayList4.add(new cmdg(cmnkVar.l(), cmnkVar.p()));
                                i9++;
                                z13 = z13;
                                z14 = z14;
                            }
                            z4 = z13;
                            z5 = z14;
                            arrayList3 = arrayList4;
                        } else {
                            z4 = z13;
                            z5 = z14;
                        }
                        if (i8 != 0) {
                            long l4 = cmnkVar.l();
                            z6 = (l4 & 128) != 0;
                            j = 1;
                            j4 = ((((l4 & 1) << 32) | cmnkVar.p()) * 1000) / 90;
                        } else {
                            j = 1;
                            j4 = -9223372036854775807L;
                            z6 = false;
                        }
                        arrayList = arrayList3;
                        j3 = j4;
                        z3 = z6;
                        j2 = p2;
                        z = z4;
                        z2 = z5;
                        i = cmnkVar.m();
                        i2 = cmnkVar.l();
                        i3 = cmnkVar.l();
                    } else {
                        j = j10;
                        arrayList = arrayList3;
                        j2 = -9223372036854775807L;
                        j3 = -9223372036854775807L;
                        z = false;
                        z2 = false;
                        z3 = false;
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                    }
                    arrayList2.add(new cmdh(p, z12, z, z2, arrayList, j2, z3, j3, i, i2, i3));
                    i7++;
                    j10 = j;
                }
                spliceNullCommand = new SpliceScheduleCommand(arrayList2);
            } else if (j9 == 5) {
                cmnk cmnkVar2 = this.a;
                cmnv cmnvVar3 = this.c;
                long p3 = cmnkVar2.p();
                boolean z15 = (cmnkVar2.l() & 128) != 0;
                List emptyList = Collections.emptyList();
                if (!z15) {
                    int l5 = cmnkVar2.l();
                    boolean z16 = (l5 & 128) != 0;
                    boolean z17 = (l5 & 64) != 0;
                    int i10 = l5 & 32;
                    boolean z18 = (l5 & 16) != 0;
                    long c = (!z17 || z18) ? -9223372036854775807L : TimeSignalCommand.c(cmnkVar2, j7);
                    if (!z17) {
                        int l6 = cmnkVar2.l();
                        ArrayList arrayList5 = new ArrayList(l6);
                        for (int i11 = 0; i11 < l6; i11++) {
                            int l7 = cmnkVar2.l();
                            long c2 = !z18 ? TimeSignalCommand.c(cmnkVar2, j7) : -9223372036854775807L;
                            arrayList5.add(new cmdd(l7, c2, cmnvVar3.d(c2)));
                        }
                        emptyList = arrayList5;
                    }
                    if (i10 != 0) {
                        long l8 = cmnkVar2.l();
                        z11 = (l8 & 128) != 0;
                        j11 = ((((l8 & 1) << 32) | cmnkVar2.p()) * 1000) / 90;
                    } else {
                        z11 = false;
                    }
                    int m = cmnkVar2.m();
                    int l9 = cmnkVar2.l();
                    z10 = z11;
                    i6 = cmnkVar2.l();
                    z7 = z16;
                    i4 = m;
                    i5 = l9;
                    list = emptyList;
                    j6 = j11;
                    long j12 = c;
                    z9 = z18;
                    z8 = z17;
                    j5 = j12;
                } else {
                    list = emptyList;
                    j5 = -9223372036854775807L;
                    j6 = -9223372036854775807L;
                    z7 = false;
                    z8 = false;
                    z9 = false;
                    z10 = false;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                }
                spliceNullCommand = new SpliceInsertCommand(p3, z15, z7, z8, z9, j5, cmnvVar3.d(j5), list, z10, j6, i4, i5, i6);
            } else if (j9 != 6) {
                spliceNullCommand = null;
            } else {
                cmnk cmnkVar3 = this.a;
                cmnv cmnvVar4 = this.c;
                long c3 = TimeSignalCommand.c(cmnkVar3, j7);
                spliceNullCommand = new TimeSignalCommand(c3, cmnvVar4.d(c3));
            }
        } else {
            cmnk cmnkVar4 = this.a;
            long p4 = cmnkVar4.p();
            int i12 = j8 - 4;
            byte[] bArr = new byte[i12];
            cmnkVar4.j(bArr, 0, i12);
            spliceNullCommand = new PrivateCommand(p4, bArr, j7);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}

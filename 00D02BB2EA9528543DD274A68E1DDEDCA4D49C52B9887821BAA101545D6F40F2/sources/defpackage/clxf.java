package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clxf  reason: default package */
/* loaded from: classes5.dex */
public final class clxf {
    private static final byte[] a = cmny.t("OpusHead");

    /* JADX WARN: Removed duplicated region for block: B:155:0x02b0 A[Catch: all -> 0x0232, TRY_LEAVE, TryCatch #0 {all -> 0x0232, blocks: (B:25:0x006b, B:29:0x0075, B:32:0x007f, B:36:0x008e, B:39:0x009b, B:42:0x00aa, B:45:0x00b7, B:48:0x00c4, B:50:0x00ce, B:57:0x00e9, B:58:0x00fc, B:61:0x0115, B:64:0x0122, B:67:0x012f, B:70:0x013c, B:73:0x0149, B:76:0x0156, B:79:0x0163, B:82:0x0170, B:85:0x017d, B:88:0x018d, B:92:0x01a2, B:94:0x01a6, B:96:0x01b7, B:99:0x01c3, B:105:0x01d1, B:110:0x01df, B:153:0x02a0, B:155:0x02b0, B:111:0x01f5, B:113:0x01fe, B:115:0x0208, B:116:0x021a, B:119:0x022c, B:134:0x0252, B:137:0x025f, B:140:0x026b, B:143:0x0277, B:146:0x0283, B:149:0x028f, B:152:0x0299, B:157:0x02ba, B:158:0x02c1), top: B:172:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.Metadata a(defpackage.clwy r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxf.a(clwy, boolean):com.google.android.exoplayer2.metadata.Metadata");
    }

    public static Metadata b(clwx clwxVar) {
        MdtaMetadataEntry mdtaMetadataEntry;
        clwy c = clwxVar.c(1751411826);
        clwy c2 = clwxVar.c(1801812339);
        clwy c3 = clwxVar.c(1768715124);
        if (c == null || c2 == null || c3 == null || d(c.a) != 1835299937) {
            return null;
        }
        cmnk cmnkVar = c2.a;
        cmnkVar.f(12);
        int r = cmnkVar.r();
        String[] strArr = new String[r];
        for (int i = 0; i < r; i++) {
            int r2 = cmnkVar.r();
            cmnkVar.h(4);
            strArr[i] = cmnkVar.y(r2 - 8);
        }
        cmnk cmnkVar2 = c3.a;
        cmnkVar2.f(8);
        ArrayList arrayList = new ArrayList();
        while (cmnkVar2.d() > 8) {
            int i2 = cmnkVar2.b;
            int r3 = cmnkVar2.r();
            int r4 = cmnkVar2.r() - 1;
            if (r4 < 0 || r4 >= r) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(r4);
                sb.toString();
            } else {
                String str = strArr[r4];
                int i3 = i2 + r3;
                int i4 = clxm.b;
                while (true) {
                    int i5 = cmnkVar2.b;
                    if (i5 >= i3) {
                        mdtaMetadataEntry = null;
                        break;
                    }
                    int r5 = cmnkVar2.r();
                    if (cmnkVar2.r() != 1684108385) {
                        cmnkVar2.f(i5 + r5);
                    } else {
                        int r6 = cmnkVar2.r();
                        int r7 = cmnkVar2.r();
                        int i6 = r5 - 16;
                        byte[] bArr = new byte[i6];
                        cmnkVar2.j(bArr, 0, i6);
                        mdtaMetadataEntry = new MdtaMetadataEntry(str, bArr, r7, r6);
                        break;
                    }
                }
                if (mdtaMetadataEntry != null) {
                    arrayList.add(mdtaMetadataEntry);
                }
            }
            cmnkVar2.f(i2 + r3);
        }
        if (!arrayList.isEmpty()) {
            return new Metadata(arrayList);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
        if (r8 == 0) goto L605;
     */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0b7d  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0b9c  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0c02  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0c0f  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0c17  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0c21  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0bf8 A[EDGE_INSN: B:597:0x0bf8->B:545:0x0bf8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0991 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<defpackage.clxx> c(defpackage.clwx r43, defpackage.clva r44, long r45, com.google.android.exoplayer2.drm.DrmInitData r47, boolean r48, defpackage.dbrn<defpackage.clxu, defpackage.clxu> r49) {
        /*
            Method dump skipped, instructions count: 3320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxf.c(clwx, clva, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, dbrn):java.util.List");
    }

    private static int d(cmnk cmnkVar) {
        cmnkVar.f(16);
        return cmnkVar.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(defpackage.cmnk r27, int r28, int r29, int r30, int r31, java.lang.String r32, boolean r33, com.google.android.exoplayer2.drm.DrmInitData r34, defpackage.clxc r35, int r36) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxf.e(cmnk, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, clxc, int):void");
    }

    private static Pair<String, byte[]> f(cmnk cmnkVar, int i) {
        cmnkVar.f(i + 12);
        cmnkVar.h(1);
        h(cmnkVar);
        cmnkVar.h(2);
        int l = cmnkVar.l();
        if ((l & 128) != 0) {
            cmnkVar.h(2);
        }
        if ((l & 64) != 0) {
            cmnkVar.h(cmnkVar.m());
        }
        if ((l & 32) != 0) {
            cmnkVar.h(2);
        }
        cmnkVar.h(1);
        h(cmnkVar);
        String f = cmnf.f(cmnkVar.l());
        if ("audio/mpeg".equals(f) || "audio/vnd.dts".equals(f) || "audio/vnd.dts.hd".equals(f)) {
            return Pair.create(f, null);
        }
        cmnkVar.h(12);
        cmnkVar.h(1);
        int h = h(cmnkVar);
        byte[] bArr = new byte[h];
        cmnkVar.j(bArr, 0, h);
        return Pair.create(f, bArr);
    }

    private static Pair<Integer, clxv> g(cmnk cmnkVar, int i, int i2) {
        Integer num;
        clxv clxvVar;
        Pair<Integer, clxv> create;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = cmnkVar.b;
        while (i5 - i < i2) {
            cmnkVar.f(i5);
            int r = cmnkVar.r();
            cmmn.d(r > 0, "childAtomSize should be positive");
            if (cmnkVar.r() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < r) {
                    cmnkVar.f(i6);
                    int r2 = cmnkVar.r();
                    int r3 = cmnkVar.r();
                    if (r3 == 1718775137) {
                        num2 = Integer.valueOf(cmnkVar.r());
                    } else if (r3 == 1935894637) {
                        cmnkVar.h(4);
                        str = cmnkVar.y(4);
                    } else if (r3 == 1935894633) {
                        i7 = i6;
                        i8 = r2;
                    }
                    i6 += r2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    cmmn.i(num2, "frma atom is mandatory");
                    cmmn.d(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            clxvVar = null;
                            break;
                        }
                        cmnkVar.f(i9);
                        int r4 = cmnkVar.r();
                        if (cmnkVar.r() == 1952804451) {
                            int r5 = cmnkVar.r();
                            cmnkVar.h(1);
                            if (clwz.e(r5) == 0) {
                                cmnkVar.h(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int l = cmnkVar.l();
                                i3 = l & 15;
                                i4 = (l & 240) >> 4;
                            }
                            boolean z = cmnkVar.l() == 1;
                            int l2 = cmnkVar.l();
                            byte[] bArr2 = new byte[16];
                            cmnkVar.j(bArr2, 0, 16);
                            if (!z || l2 != 0) {
                                bArr = null;
                            } else {
                                int l3 = cmnkVar.l();
                                byte[] bArr3 = new byte[l3];
                                cmnkVar.j(bArr3, 0, l3);
                                bArr = bArr3;
                            }
                            num = num2;
                            clxvVar = new clxv(z, str, l2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += r4;
                        }
                    }
                    cmmn.i(clxvVar, "tenc atom is mandatory");
                    create = Pair.create(num, clxvVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += r;
        }
        return null;
    }

    private static int h(cmnk cmnkVar) {
        int l = cmnkVar.l();
        int i = l & 127;
        while ((l & 128) == 128) {
            l = cmnkVar.l();
            i = (i << 7) | (l & 127);
        }
        return i;
    }
}

package defpackage;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbr  reason: default package */
/* loaded from: classes2.dex */
public final class bbr {
    private static final byte[] a = pxi.U("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e5, code lost:
        r13 = r1.u(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ec, code lost:
        if (r11 != 1684108385) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ee, code lost:
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f0, code lost:
        if (r11 == 1684108385) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f3, code lost:
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f4, code lost:
        r1.H(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fc, code lost:
        if (r10 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01fe, code lost:
        if (r13 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0200, code lost:
        if (r14 != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0203, code lost:
        r1.G(r14);
        r1.H(16);
        r2 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r10, r13, r1.u(r15 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0218, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x021f, code lost:
        r2 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0226, code lost:
        if (r2 != 6516084) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0228, code lost:
        r0 = r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0230, code lost:
        if (r1.d() != 1684108385) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0232, code lost:
        r1.H(8);
        r0 = r1.u(r0 - 16);
        r10 = new com.google.android.exoplayer2.metadata.id3.CommentFrame("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0247, code lost:
        r2 = java.lang.String.valueOf(defpackage.bbl.g(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0257, code lost:
        if (r2.length() == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0259, code lost:
        r0 = "Failed to parse comment attribute: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x025e, code lost:
        r0 = new java.lang.String("Failed to parse comment attribute: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0264, code lost:
        android.util.Log.w("MetadataUtil", r0);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x026a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0272, code lost:
        if (r2 == 7233901) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        r1.G(r7);
        r7 = r7 + r8;
        r1.H(r0);
        r3 = new java.util.ArrayList();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0277, code lost:
        if (r2 != 7631467) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027e, code lost:
        if (r2 == 6516589) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0283, code lost:
        if (r2 != 7828084) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028a, code lost:
        if (r2 != 6578553) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x028c, code lost:
        r10 = defpackage.bbx.d(r13, "TDRC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        r8 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0297, code lost:
        if (r2 != 4280916) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0299, code lost:
        r10 = defpackage.bbx.d(r13, "TPE1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02a3, code lost:
        if (r2 != 7630703) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02a5, code lost:
        r10 = defpackage.bbx.d(r13, "TSSE", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02af, code lost:
        if (r2 != 6384738) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b1, code lost:
        r10 = defpackage.bbx.d(r13, "TALB", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r8 >= r7) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02bb, code lost:
        if (r2 != 7108978) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02bd, code lost:
        r10 = defpackage.bbx.d(r13, "USLT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02c7, code lost:
        if (r2 != 6776174) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02c9, code lost:
        r10 = defpackage.bbx.d(r13, "TCON", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02d1, code lost:
        if (r2 != 6779504) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02d3, code lost:
        r10 = defpackage.bbx.d(r13, "TIT1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02da, code lost:
        r2 = java.lang.String.valueOf(defpackage.bbl.g(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e8, code lost:
        if (r2.length() == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        r13 = defpackage.bbx.b;
        r8 = r8 + r1.d();
        r13 = r1.d();
        r14 = (r13 >> 24) & org.chromium.net.PrivateKeyType.INVALID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02ea, code lost:
        "Skipped unknown metadata entry: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ed, code lost:
        r1.G(r8);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02f2, code lost:
        r10 = defpackage.bbx.d(r13, "TCOM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02f9, code lost:
        r10 = defpackage.bbx.d(r13, "TIT2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ff, code lost:
        r1.G(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0302, code lost:
        if (r10 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0304, code lost:
        r3.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0307, code lost:
        r2 = null;
        r11 = false;
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x030e, code lost:
        r1.G(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0311, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
        if (r14 == 169) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0318, code lost:
        if (r3.isEmpty() == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x031b, code lost:
        r3 = new com.google.android.exoplayer2.metadata.Metadata(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (r14 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0369, code lost:
        if (r0 != 13) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r13 != 1735291493) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
        r9 = defpackage.bbx.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r9 <= 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r9 > 192) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        r9 = defpackage.bbx.a[r9 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r9 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
        r10 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", r2, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
        android.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
        if (r13 != 1684632427) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
        r10 = defpackage.bbx.c(1684632427, "TPOS", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
        r1.G(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (r13 != 1953655662) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
        r10 = defpackage.bbx.c(1953655662, "TRCK", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
        if (r13 != 1953329263) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        r10 = defpackage.bbx.b(1953329263, "TBPM", r1, r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
        if (r13 != 1668311404) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        r10 = defpackage.bbx.b(1668311404, "TCMP", r1, r12, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
        if (r13 != 1668249202) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
        r0 = r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
        if (r1.d() != 1684108385) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
        r9 = defpackage.bbl.e(r1.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
        if (r9 != 13) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e6, code lost:
        r13 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
        if (r9 != 14) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ed, code lost:
        r13 = "image/png";
        r9 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f3, code lost:
        if (r13 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
        r0 = new java.lang.StringBuilder(41);
        r0.append("Unrecognized cover art flags: ");
        r0.append(r9);
        android.util.Log.w("MetadataUtil", r0.toString());
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
        r1.H(4);
        r0 = r0 - 16;
        r9 = new byte[r0];
        r11 = r11 ? 1 : 0;
        r11 = r11 ? 1 : 0;
        r11 = r11 ? 1 : 0;
        r1.B(r9, r11, r0);
        r10 = new com.google.android.exoplayer2.metadata.id3.ApicFrame(r13, r2, 3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
        android.util.Log.w("MetadataUtil", "Failed to parse cover art attribute");
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
        if (r13 != 1631670868) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012b, code lost:
        r10 = defpackage.bbx.d(1631670868, "TPE2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0136, code lost:
        if (r13 != 1936682605) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0138, code lost:
        r10 = defpackage.bbx.d(1936682605, "TSOT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0143, code lost:
        if (r13 != 1936679276) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0145, code lost:
        r10 = defpackage.bbx.d(1936679276, "TSO2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0150, code lost:
        if (r13 != 1936679282) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0152, code lost:
        r10 = defpackage.bbx.d(1936679282, "TSOA", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
        if (r13 != 1936679265) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015f, code lost:
        r10 = defpackage.bbx.d(1936679265, "TSOP", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016d, code lost:
        if (r13 != 1936679791) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016f, code lost:
        r10 = defpackage.bbx.d(1936679791, "TSOC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
        if (r13 != 1920233063) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
        r10 = defpackage.bbx.b(1920233063, "ITUNESADVISORY", r1, r11, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018d, code lost:
        if (r13 != 1885823344) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018f, code lost:
        r10 = defpackage.bbx.b(1885823344, "ITUNESGAPLESS", r1, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019d, code lost:
        if (r13 != 1936683886) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019f, code lost:
        r10 = defpackage.bbx.d(1936683886, "TVSHOWSORT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ad, code lost:
        if (r13 != 1953919848) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01af, code lost:
        r10 = defpackage.bbx.d(1953919848, "TVSHOW", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bd, code lost:
        if (r13 != 757935405) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bf, code lost:
        r10 = r2;
        r13 = r10;
        r14 = -1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c4, code lost:
        r2 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c6, code lost:
        if (r2 >= r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c8, code lost:
        r16 = r1.d();
        r11 = r1.d();
        r1.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d7, code lost:
        if (r11 != 1835360622) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d9, code lost:
        r10 = r1.u(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e3, code lost:
        if (r11 != 1851878757) goto L100;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(defpackage.bbk r17) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbr.a(bbk):android.util.Pair");
    }

    public static Metadata b(bbj bbjVar) {
        MdtaMetadataEntry mdtaMetadataEntry;
        bbk b = bbjVar.b(1751411826);
        bbk b2 = bbjVar.b(1801812339);
        bbk b3 = bbjVar.b(1768715124);
        if (b == null || b2 == null || b3 == null || g(b.a) != 1835299937) {
            return null;
        }
        pwu pwuVar = b2.a;
        pwuVar.G(12);
        int d = pwuVar.d();
        String[] strArr = new String[d];
        for (int i = 0; i < d; i++) {
            int d2 = pwuVar.d();
            pwuVar.H(4);
            strArr[i] = pwuVar.v(d2 - 8);
        }
        pwu pwuVar2 = b3.a;
        pwuVar2.G(8);
        ArrayList arrayList = new ArrayList();
        while (pwuVar2.a() > 8) {
            int i2 = pwuVar2.b;
            int d3 = pwuVar2.d();
            int d4 = pwuVar2.d() - 1;
            if (d4 < 0 || d4 >= d) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(d4);
                Log.w("AtomParsers", sb.toString());
            } else {
                String str = strArr[d4];
                int i3 = i2 + d3;
                int i4 = bbx.b;
                while (true) {
                    int i5 = pwuVar2.b;
                    if (i5 >= i3) {
                        mdtaMetadataEntry = null;
                        break;
                    }
                    int d5 = pwuVar2.d();
                    if (pwuVar2.d() != 1684108385) {
                        pwuVar2.G(i5 + d5);
                    } else {
                        int d6 = pwuVar2.d();
                        int d7 = pwuVar2.d();
                        int i6 = d5 - 16;
                        byte[] bArr = new byte[i6];
                        pwuVar2.B(bArr, 0, i6);
                        mdtaMetadataEntry = new MdtaMetadataEntry(str, bArr, d7, d6);
                        break;
                    }
                }
                if (mdtaMetadataEntry != null) {
                    arrayList.add(mdtaMetadataEntry);
                }
            }
            pwuVar2.G(i2 + d3);
        }
        if (!arrayList.isEmpty()) {
            return new Metadata(arrayList);
        }
        return null;
    }

    public static void c(pwu pwuVar) {
        int i = pwuVar.b;
        pwuVar.H(4);
        if (pwuVar.d() != 1751411826) {
            i += 4;
        }
        pwuVar.G(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (r27 == 0) goto L642;
     */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0a18 A[LOOP:13: B:483:0x0a18->B:487:0x0a22, LOOP_START, PHI: r22 
      PHI: (r22v6 int) = (r22v5 int), (r22v7 int) binds: [B:482:0x0a16, B:487:0x0a22] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0d5f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0a0c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(defpackage.bbj r46, defpackage.azp r47, long r48, com.google.android.exoplayer2.drm.DrmInitData r50, boolean r51, defpackage.ampg r52) {
        /*
            Method dump skipped, instructions count: 3440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbr.d(bbj, azp, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, ampg):java.util.List");
    }

    private static int e(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static int f(pwu pwuVar) {
        int i = pwuVar.i();
        int i2 = i & 127;
        while ((i & 128) == 128) {
            i = pwuVar.i();
            i2 = (i2 << 7) | (i & 127);
        }
        return i2;
    }

    private static int g(pwu pwuVar) {
        pwuVar.G(16);
        return pwuVar.d();
    }

    private static Pair h(pwu pwuVar, int i) {
        pwuVar.G(i + 12);
        pwuVar.H(1);
        f(pwuVar);
        pwuVar.H(2);
        int i2 = pwuVar.i();
        if ((i2 & 128) != 0) {
            pwuVar.H(2);
        }
        if ((i2 & 64) != 0) {
            pwuVar.H(pwuVar.m());
        }
        if ((i2 & 32) != 0) {
            pwuVar.H(2);
        }
        pwuVar.H(1);
        f(pwuVar);
        String f = pwl.f(pwuVar.i());
        if ("audio/mpeg".equals(f) || "audio/vnd.dts".equals(f) || "audio/vnd.dts.hd".equals(f)) {
            return Pair.create(f, null);
        }
        pwuVar.H(12);
        pwuVar.H(1);
        int f2 = f(pwuVar);
        byte[] bArr = new byte[f2];
        pwuVar.B(bArr, 0, f2);
        return Pair.create(f, bArr);
    }

    private static Pair i(pwu pwuVar, int i, int i2) {
        Integer num;
        bcd bcdVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = pwuVar.b;
        while (i5 - i < i2) {
            pwuVar.G(i5);
            int d = pwuVar.d();
            boolean z = true;
            asg.c(d > 0, "childAtomSize must be positive");
            if (pwuVar.d() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < d) {
                    pwuVar.G(i6);
                    int d2 = pwuVar.d();
                    int d3 = pwuVar.d();
                    if (d3 == 1718775137) {
                        num2 = Integer.valueOf(pwuVar.d());
                    } else if (d3 == 1935894637) {
                        pwuVar.H(4);
                        str = pwuVar.v(4);
                    } else if (d3 == 1935894633) {
                        i7 = i6;
                        i8 = d2;
                    }
                    i6 += d2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    asg.c(num2 != null, "frma atom is mandatory");
                    asg.c(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            bcdVar = null;
                            break;
                        }
                        pwuVar.G(i9);
                        int d4 = pwuVar.d();
                        if (pwuVar.d() == 1952804451) {
                            int d5 = pwuVar.d();
                            pwuVar.H(1);
                            if (bbl.f(d5) == 0) {
                                pwuVar.H(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int i10 = pwuVar.i();
                                i3 = i10 & 15;
                                i4 = (i10 & 240) >> 4;
                            }
                            boolean z2 = pwuVar.i() == 1;
                            int i11 = pwuVar.i();
                            byte[] bArr2 = new byte[16];
                            pwuVar.B(bArr2, 0, 16);
                            if (!z2 || i11 != 0) {
                                bArr = null;
                            } else {
                                int i12 = pwuVar.i();
                                byte[] bArr3 = new byte[i12];
                                pwuVar.B(bArr3, 0, i12);
                                bArr = bArr3;
                            }
                            num = num2;
                            bcdVar = new bcd(z2, str, i11, bArr2, i4, i3, bArr);
                        } else {
                            i9 += d4;
                        }
                    }
                    if (bcdVar == null) {
                        z = false;
                    }
                    asg.c(z, "tenc atom is mandatory");
                    int i13 = pxi.a;
                    create = Pair.create(num, bcdVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(defpackage.pwu r21, int r22, int r23, int r24, int r25, java.lang.String r26, boolean r27, com.google.android.exoplayer2.drm.DrmInitData r28, defpackage.bbo r29, int r30) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbr.j(pwu, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, bbo, int):void");
    }
}

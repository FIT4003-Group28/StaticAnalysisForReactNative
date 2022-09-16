package defpackage;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ColorInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pfb  reason: default package */
/* loaded from: classes4.dex */
public final class pfb implements pez {
    final /* synthetic */ pfe a;

    public pfb(pfe pfeVar) {
        this.a = pfeVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.pez
    public final void a(int i) {
        int i2;
        int i3;
        char c;
        List singletonList;
        List list;
        int i4;
        int i5;
        int i6;
        int i7;
        ColorInfo colorInfo;
        int i8;
        byte[] bArr;
        int i9;
        pfc pfcVar;
        azy azxVar;
        pwi pwiVar;
        int i10;
        pwi pwiVar2;
        int i11;
        pfe pfeVar = this.a;
        if (i == 160) {
            if (pfeVar.B != 2) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < pfeVar.F; i13++) {
                i12 += pfeVar.G[i13];
            }
            pfc pfcVar2 = (pfc) pfeVar.d.get(pfeVar.H);
            int i14 = 0;
            while (i14 < pfeVar.F) {
                long j = ((pfcVar2.e * i14) / 1000) + pfeVar.C;
                int i15 = pfeVar.f254J;
                if (i14 == 0) {
                    if (!pfeVar.L) {
                        i15 |= 1;
                    }
                    i3 = i15;
                    i2 = 0;
                } else {
                    i2 = i14;
                    i3 = i15;
                }
                int i16 = pfeVar.G[i2];
                int i17 = i12 - i16;
                pfeVar.i(pfcVar2, j, i3, i16, i17);
                i14 = i2 + 1;
                i12 = i17;
            }
            pfeVar.B = 0;
        } else if (i == 174) {
            String str = pfeVar.p.b;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_AV1".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                pfc pfcVar3 = pfeVar.p;
                azh azhVar = pfeVar.M;
                int i18 = pfcVar3.c;
                String str2 = pfcVar3.b;
                switch (str2.hashCode()) {
                    case -2095576542:
                        if (str2.equals("V_MPEG4/ISO/AP")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -2095575984:
                        if (str2.equals("V_MPEG4/ISO/SP")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1985379776:
                        if (str2.equals("A_MS/ACM")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1784763192:
                        if (str2.equals("A_TRUEHD")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1730367663:
                        if (str2.equals("A_VORBIS")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1482641358:
                        if (str2.equals("A_MPEG/L2")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1482641357:
                        if (str2.equals("A_MPEG/L3")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1373388978:
                        if (str2.equals("V_MS/VFW/FOURCC")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -933872740:
                        if (str2.equals("S_DVBSUB")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case -538363189:
                        if (str2.equals("V_MPEG4/ISO/ASP")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -538363109:
                        if (str2.equals("V_MPEG4/ISO/AVC")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -425012669:
                        if (str2.equals("S_VOBSUB")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case -356037306:
                        if (str2.equals("A_DTS/LOSSLESS")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 62923557:
                        if (str2.equals("A_AAC")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 62923603:
                        if (str2.equals("A_AC3")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 62927045:
                        if (str2.equals("A_DTS")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82318131:
                        if (str2.equals("V_AV1")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82338133:
                        if (str2.equals("V_VP8")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82338134:
                        if (str2.equals("V_VP9")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 99146302:
                        if (str2.equals("S_HDMV/PGS")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 444813526:
                        if (str2.equals("V_THEORA")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 542569478:
                        if (str2.equals("A_DTS/EXPRESS")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 725957860:
                        if (str2.equals("A_PCM/INT/LIT")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 738597099:
                        if (str2.equals("S_TEXT/ASS")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case 855502857:
                        if (str2.equals("V_MPEGH/ISO/HEVC")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1422270023:
                        if (str2.equals("S_TEXT/UTF8")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1809237540:
                        if (str2.equals("V_MPEG2")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1950749482:
                        if (str2.equals("A_EAC3")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1950789798:
                        if (str2.equals("A_FLAC")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1951062397:
                        if (str2.equals("A_OPUS")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                String str3 = "audio/x-unknown";
                switch (c) {
                    case 0:
                        str3 = "video/x-vnd.on2.vp8";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 1:
                        str3 = "video/x-vnd.on2.vp9";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 2:
                        str3 = "video/av01";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 3:
                        str3 = "video/mpeg2";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        byte[] bArr2 = pfcVar3.j;
                        singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                        str3 = "video/mp4v-es";
                        list = singletonList;
                        i4 = -1;
                        i5 = -1;
                        break;
                    case 7:
                        ayq a = ayq.a(new pwu(pfcVar3.j));
                        list = a.a;
                        pfcVar3.W = a.b;
                        str3 = "video/avc";
                        i4 = -1;
                        i5 = -1;
                        break;
                    case '\b':
                        azq a2 = azq.a(new pwu(pfcVar3.j));
                        list = a2.a;
                        pfcVar3.W = a2.b;
                        str3 = "video/hevc";
                        i4 = -1;
                        i5 = -1;
                        break;
                    case '\t':
                        Pair a3 = pfc.a(new pwu(pfcVar3.j));
                        str3 = (String) a3.first;
                        singletonList = (List) a3.second;
                        list = singletonList;
                        i4 = -1;
                        i5 = -1;
                        break;
                    case '\n':
                        str3 = "video/x-unknown";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 11:
                        str3 = "audio/vorbis";
                        list = pfc.b(pfcVar3.j);
                        i4 = -1;
                        i5 = 8192;
                        break;
                    case '\f':
                        ArrayList arrayList = new ArrayList(3);
                        arrayList.add(pfcVar3.j);
                        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(pfcVar3.P).array());
                        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(pfcVar3.Q).array());
                        str3 = "audio/opus";
                        list = arrayList;
                        i4 = -1;
                        i5 = 5760;
                        break;
                    case '\r':
                        singletonList = Collections.singletonList(pfcVar3.j);
                        str3 = "audio/mp4a-latm";
                        list = singletonList;
                        i4 = -1;
                        i5 = -1;
                        break;
                    case 14:
                        str3 = "audio/mpeg-L2";
                        i4 = -1;
                        list = null;
                        i5 = 4096;
                        break;
                    case 15:
                        str3 = "audio/mpeg";
                        i4 = -1;
                        list = null;
                        i5 = 4096;
                        break;
                    case 16:
                        str3 = "audio/ac3";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 17:
                        str3 = "audio/eac3";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 18:
                        pfcVar3.R = new pfd();
                        str3 = "audio/true-hd";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 19:
                    case 20:
                        str3 = "audio/vnd.dts";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 21:
                        str3 = "audio/vnd.dts.hd";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 22:
                        singletonList = Collections.singletonList(pfcVar3.j);
                        str3 = "audio/flac";
                        list = singletonList;
                        i4 = -1;
                        i5 = -1;
                        break;
                    case 23:
                        if (pfc.d(new pwu(pfcVar3.j))) {
                            i4 = pxi.g(pfcVar3.N);
                            if (i4 != 0) {
                                str3 = "audio/raw";
                                list = null;
                                i5 = -1;
                                break;
                            } else {
                                int i19 = pfcVar3.N;
                                StringBuilder sb = new StringBuilder(75);
                                sb.append("Unsupported PCM bit depth: ");
                                sb.append(i19);
                                sb.append(". Setting mimeType to audio/x-unknown");
                                Log.w("MatroskaExtractor", sb.toString());
                            }
                        } else {
                            Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        }
                        i4 = -1;
                        list = null;
                        i5 = -1;
                    case 24:
                        i4 = pxi.g(pfcVar3.N);
                        if (i4 == 0) {
                            int i20 = pfcVar3.N;
                            StringBuilder sb2 = new StringBuilder(75);
                            sb2.append("Unsupported PCM bit depth: ");
                            sb2.append(i20);
                            sb2.append(". Setting mimeType to audio/x-unknown");
                            Log.w("MatroskaExtractor", sb2.toString());
                            i4 = -1;
                            list = null;
                            i5 = -1;
                            break;
                        } else {
                            str3 = "audio/raw";
                            list = null;
                            i5 = -1;
                        }
                    case 25:
                        str3 = "application/x-subrip";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 26:
                        str3 = "text/x-ssa";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 27:
                        singletonList = Collections.singletonList(pfcVar3.j);
                        str3 = "application/vobsub";
                        list = singletonList;
                        i4 = -1;
                        i5 = -1;
                        break;
                    case 28:
                        str3 = "application/pgs";
                        i4 = -1;
                        list = null;
                        i5 = -1;
                        break;
                    case 29:
                        byte[] bArr3 = pfcVar3.j;
                        singletonList = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                        str3 = "application/dvbsubs";
                        list = singletonList;
                        i4 = -1;
                        i5 = -1;
                        break;
                    default:
                        throw pjq.c("Unrecognized codec identifier.");
                }
                int i21 = (pfcVar3.T ? 1 : 0) | (true != pfcVar3.S ? 0 : 2);
                pis pisVar = new pis();
                if (pwl.j(str3)) {
                    pisVar.x = pfcVar3.M;
                    pisVar.y = pfcVar3.O;
                    pisVar.z = i4;
                    i6 = 1;
                } else if (pwl.l(str3)) {
                    if (pfcVar3.p == 0) {
                        int i22 = pfcVar3.n;
                        if (i22 == -1) {
                            i22 = pfcVar3.l;
                        }
                        pfcVar3.n = i22;
                        int i23 = pfcVar3.o;
                        if (i23 == -1) {
                            i23 = pfcVar3.m;
                        }
                        pfcVar3.o = i23;
                    }
                    float f = (pfcVar3.n == -1 || (i9 = pfcVar3.o) == -1) ? -1.0f : (pfcVar3.m * i7) / (pfcVar3.l * i9);
                    if (pfcVar3.w) {
                        if (pfcVar3.C == -1.0f || pfcVar3.D == -1.0f || pfcVar3.E == -1.0f || pfcVar3.F == -1.0f || pfcVar3.G == -1.0f || pfcVar3.H == -1.0f || pfcVar3.I == -1.0f || pfcVar3.f253J == -1.0f || pfcVar3.K == -1.0f || pfcVar3.L == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            order.put((byte) 0);
                            order.putShort((short) ((pfcVar3.C * 50000.0f) + 0.5f));
                            order.putShort((short) ((pfcVar3.D * 50000.0f) + 0.5f));
                            order.putShort((short) ((pfcVar3.E * 50000.0f) + 0.5f));
                            order.putShort((short) ((pfcVar3.F * 50000.0f) + 0.5f));
                            order.putShort((short) ((pfcVar3.G * 50000.0f) + 0.5f));
                            order.putShort((short) ((pfcVar3.H * 50000.0f) + 0.5f));
                            order.putShort((short) ((pfcVar3.I * 50000.0f) + 0.5f));
                            order.putShort((short) ((pfcVar3.f253J * 50000.0f) + 0.5f));
                            order.putShort((short) (pfcVar3.K + 0.5f));
                            order.putShort((short) (pfcVar3.L + 0.5f));
                            order.putShort((short) pfcVar3.A);
                            order.putShort((short) pfcVar3.B);
                        }
                        colorInfo = new ColorInfo(pfcVar3.x, pfcVar3.z, pfcVar3.y, bArr);
                    } else {
                        colorInfo = null;
                    }
                    int i24 = "htc_video_rotA-000".equals(pfcVar3.a) ? 0 : "htc_video_rotA-090".equals(pfcVar3.a) ? 90 : "htc_video_rotA-180".equals(pfcVar3.a) ? 180 : "htc_video_rotA-270".equals(pfcVar3.a) ? 270 : -1;
                    if (pfcVar3.q == 0 && Float.compare(pfcVar3.r, 0.0f) == 0 && Float.compare(pfcVar3.s, 0.0f) == 0) {
                        if (Float.compare(pfcVar3.t, 0.0f) == 0) {
                            i8 = 0;
                        } else if (Float.compare(pfcVar3.s, 90.0f) == 0) {
                            i8 = 90;
                        } else if (Float.compare(pfcVar3.s, -180.0f) == 0 || Float.compare(pfcVar3.s, 180.0f) == 0) {
                            i8 = 180;
                        } else if (Float.compare(pfcVar3.s, -90.0f) == 0) {
                            i8 = 270;
                        }
                        pisVar.p = pfcVar3.l;
                        pisVar.q = pfcVar3.m;
                        pisVar.t = f;
                        pisVar.s = i8;
                        pisVar.u = pfcVar3.u;
                        pisVar.v = pfcVar3.v;
                        pisVar.w = colorInfo;
                        i6 = 2;
                    }
                    i8 = i24;
                    pisVar.p = pfcVar3.l;
                    pisVar.q = pfcVar3.m;
                    pisVar.t = f;
                    pisVar.s = i8;
                    pisVar.u = pfcVar3.u;
                    pisVar.v = pfcVar3.v;
                    pisVar.w = colorInfo;
                    i6 = 2;
                } else {
                    if (!"application/x-subrip".equals(str3)) {
                        if ("text/x-ssa".equals(str3)) {
                            list = new ArrayList(2);
                            list.add(pfe.a);
                            list.add(pfcVar3.j);
                        } else if (!"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw pjq.a("Unexpected MIME type.", null);
                        }
                    }
                    i6 = 3;
                }
                pisVar.b(i18);
                pisVar.k = str3;
                pisVar.l = i5;
                pisVar.c = pfcVar3.U;
                pisVar.d = i21;
                pisVar.m = list;
                pisVar.n = pfcVar3.k;
                Format a4 = pisVar.a();
                pfcVar3.V = azhVar.pT(pfcVar3.c, i6);
                pfcVar3.V.rx(a4);
                SparseArray sparseArray = pfeVar.d;
                pfc pfcVar4 = pfeVar.p;
                sparseArray.put(pfcVar4.c, pfcVar4);
                pfcVar = null;
            } else {
                pfcVar = null;
            }
            pfeVar.p = pfcVar;
        } else if (i == 19899) {
            int i25 = pfeVar.r;
            if (i25 != -1) {
                long j2 = pfeVar.s;
                if (j2 != -1) {
                    if (i25 != 475249515) {
                        return;
                    }
                    pfeVar.u = j2;
                    return;
                }
            }
            throw pjq.a("Mandatory element SeekID or SeekPosition not found", null);
        } else if (i == 25152) {
            pfc pfcVar5 = pfeVar.p;
            if (!pfcVar5.g) {
                return;
            }
            if (pfcVar5.i == null) {
                throw pjq.a("Encrypted Track found but ContentEncKeyID was not found", null);
            }
            pfcVar5.k = new DrmInitData(new DrmInitData.SchemeData(phk.a, "video/webm", pfeVar.p.i.b));
        } else if (i == 28032) {
            pfc pfcVar6 = pfeVar.p;
            if (pfcVar6.g && pfcVar6.h != null) {
                throw pjq.a("Combining encryption and compression is not supported", null);
            }
        } else if (i == 357149030) {
            if (pfeVar.m == -9223372036854775807L) {
                pfeVar.m = 1000000L;
            }
            long j3 = pfeVar.n;
            if (j3 == -9223372036854775807L) {
                return;
            }
            pfeVar.o = pfeVar.c(j3);
        } else if (i == 374648427) {
            if (pfeVar.d.size() == 0) {
                throw pjq.a("No valid tracks were found", null);
            }
            pfeVar.M.b();
        } else if (i == 475249515 && !pfeVar.q) {
            azh azhVar2 = pfeVar.M;
            if (pfeVar.l == -1 || pfeVar.o == -9223372036854775807L || (pwiVar = pfeVar.w) == null || (i10 = pwiVar.a) == 0 || (pwiVar2 = pfeVar.x) == null || pwiVar2.a != i10) {
                pfeVar.w = null;
                pfeVar.x = null;
                azxVar = new azx(pfeVar.o);
            } else {
                int[] iArr = new int[i10];
                long[] jArr = new long[i10];
                long[] jArr2 = new long[i10];
                long[] jArr3 = new long[i10];
                for (int i26 = 0; i26 < i10; i26++) {
                    jArr3[i26] = pfeVar.w.a(i26);
                    jArr[i26] = pfeVar.l + pfeVar.x.a(i26);
                }
                int i27 = 0;
                while (true) {
                    i11 = i10 - 1;
                    if (i27 >= i11) {
                        break;
                    }
                    int i28 = i27 + 1;
                    iArr[i27] = (int) (jArr[i28] - jArr[i27]);
                    jArr2[i27] = jArr3[i28] - jArr3[i27];
                    i27 = i28;
                }
                iArr[i11] = (int) ((pfeVar.l + pfeVar.k) - jArr[i11]);
                long j4 = pfeVar.o - jArr3[i11];
                jArr2[i11] = j4;
                if (j4 <= 0) {
                    StringBuilder sb3 = new StringBuilder(72);
                    sb3.append("Discarding last cue point with unexpected duration: ");
                    sb3.append(j4);
                    Log.w("MatroskaExtractor", sb3.toString());
                    iArr = Arrays.copyOf(iArr, i11);
                    jArr = Arrays.copyOf(jArr, i11);
                    jArr2 = Arrays.copyOf(jArr2, i11);
                    jArr3 = Arrays.copyOf(jArr3, i11);
                }
                pfeVar.w = null;
                pfeVar.x = null;
                azxVar = new ayy(iArr, jArr, jArr2, jArr3);
            }
            azhVar2.ry(azxVar);
            pfeVar.q = true;
        }
    }
}

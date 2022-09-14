package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.filament.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clwi  reason: default package */
/* loaded from: classes5.dex */
public final class clwi implements clwg {
    final /* synthetic */ clwl a;

    public clwi(clwl clwlVar) {
        this.a = clwlVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.clwg
    public final void a(int i) {
        int i2;
        char c;
        char c2;
        List<byte[]> singletonList;
        List<byte[]> list;
        int i3;
        String str;
        int i4;
        ColorInfo colorInfo;
        int i5;
        byte[] bArr;
        int i6;
        cmoc a;
        clvg clvfVar;
        cmnb cmnbVar;
        int i7;
        cmnb cmnbVar2;
        int i8;
        clwl clwlVar = this.a;
        int i9 = 0;
        if (i == 160) {
            if (clwlVar.y != 2) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < clwlVar.C; i11++) {
                i10 += clwlVar.D[i11];
            }
            clwj clwjVar = clwlVar.e.get(clwlVar.E);
            int i12 = 0;
            while (i12 < clwlVar.C) {
                long j = clwlVar.z + ((clwjVar.e * i12) / 1000);
                int i13 = clwlVar.G;
                if (i12 == 0) {
                    if (!clwlVar.I) {
                        i13 |= 1;
                    }
                    i2 = 0;
                } else {
                    i2 = i12;
                }
                int i14 = clwlVar.D[i2];
                int i15 = i10 - i14;
                clwlVar.a(clwjVar, j, i13, i14, i15);
                i12 = i2 + 1;
                i10 = i15;
            }
            clwlVar.y = 0;
        } else if (i == 174) {
            clwj clwjVar2 = clwlVar.o;
            String str2 = clwjVar2.b;
            int i16 = 4;
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
                        c = '\f';
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
                        c = 31;
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
                        c = 29;
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
                        c = 30;
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
                case 635596514:
                    if (str2.equals("A_PCM/FLOAT/IEEE")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 725948237:
                    if (str2.equals("A_PCM/INT/BIG")) {
                        c = 25;
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
                        c = 28;
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
                        c = 27;
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
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    clup clupVar = clwlVar.J;
                    int i17 = clwjVar2.c;
                    switch (str2.hashCode()) {
                        case -2095576542:
                            if (str2.equals("V_MPEG4/ISO/AP")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -2095575984:
                            if (str2.equals("V_MPEG4/ISO/SP")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1985379776:
                            if (str2.equals("A_MS/ACM")) {
                                c2 = 23;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1784763192:
                            if (str2.equals("A_TRUEHD")) {
                                c2 = 18;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1730367663:
                            if (str2.equals("A_VORBIS")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1482641358:
                            if (str2.equals("A_MPEG/L2")) {
                                c2 = 14;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1482641357:
                            if (str2.equals("A_MPEG/L3")) {
                                c2 = 15;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1373388978:
                            if (str2.equals("V_MS/VFW/FOURCC")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -933872740:
                            if (str2.equals("S_DVBSUB")) {
                                c2 = 31;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -538363189:
                            if (str2.equals("V_MPEG4/ISO/ASP")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -538363109:
                            if (str2.equals("V_MPEG4/ISO/AVC")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -425012669:
                            if (str2.equals("S_VOBSUB")) {
                                c2 = 29;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -356037306:
                            if (str2.equals("A_DTS/LOSSLESS")) {
                                c2 = 21;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62923557:
                            if (str2.equals("A_AAC")) {
                                c2 = '\r';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62923603:
                            if (str2.equals("A_AC3")) {
                                c2 = 16;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62927045:
                            if (str2.equals("A_DTS")) {
                                c2 = 19;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 82318131:
                            if (str2.equals("V_AV1")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 82338133:
                            if (str2.equals("V_VP8")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 82338134:
                            if (str2.equals("V_VP9")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 99146302:
                            if (str2.equals("S_HDMV/PGS")) {
                                c2 = 30;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 444813526:
                            if (str2.equals("V_THEORA")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 542569478:
                            if (str2.equals("A_DTS/EXPRESS")) {
                                c2 = 20;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 635596514:
                            if (str2.equals("A_PCM/FLOAT/IEEE")) {
                                c2 = 26;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 725948237:
                            if (str2.equals("A_PCM/INT/BIG")) {
                                c2 = 25;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 725957860:
                            if (str2.equals("A_PCM/INT/LIT")) {
                                c2 = 24;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 738597099:
                            if (str2.equals("S_TEXT/ASS")) {
                                c2 = 28;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 855502857:
                            if (str2.equals("V_MPEGH/ISO/HEVC")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1422270023:
                            if (str2.equals("S_TEXT/UTF8")) {
                                c2 = 27;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1809237540:
                            if (str2.equals("V_MPEG2")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1950749482:
                            if (str2.equals("A_EAC3")) {
                                c2 = 17;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1950789798:
                            if (str2.equals("A_FLAC")) {
                                c2 = 22;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1951062397:
                            if (str2.equals("A_OPUS")) {
                                c2 = '\f';
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    String str3 = "audio/raw";
                    switch (c2) {
                        case 0:
                            str3 = "video/x-vnd.on2.vp8";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 1:
                            str3 = "video/x-vnd.on2.vp9";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 2:
                            str3 = "video/av01";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 3:
                            str3 = "video/mpeg2";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            byte[] bArr2 = clwjVar2.k;
                            singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                            str3 = "video/mp4v-es";
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 7:
                            cmoa a2 = cmoa.a(new cmnk(clwjVar2.k));
                            list = a2.a;
                            clwjVar2.Y = a2.b;
                            str3 = "video/avc";
                            singletonList = list;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case '\b':
                            cmoe a3 = cmoe.a(new cmnk(clwjVar2.k));
                            list = a3.a;
                            clwjVar2.Y = a3.b;
                            str3 = "video/hevc";
                            singletonList = list;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case '\t':
                            Pair<String, List<byte[]>> a4 = clwj.a(new cmnk(clwjVar2.k));
                            str3 = (String) a4.first;
                            singletonList = (List) a4.second;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case '\n':
                            str3 = "video/x-unknown";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 11:
                            singletonList = clwj.b(clwjVar2.k);
                            i3 = 8192;
                            str3 = "audio/vorbis";
                            str = null;
                            i16 = -1;
                            break;
                        case '\f':
                            singletonList = new ArrayList<>(3);
                            singletonList.add(clwjVar2.k);
                            singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(clwjVar2.R).array());
                            singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(clwjVar2.S).array());
                            i3 = 5760;
                            str3 = "audio/opus";
                            str = null;
                            i16 = -1;
                            break;
                        case '\r':
                            singletonList = Collections.singletonList(clwjVar2.k);
                            clqx a5 = clqy.a(clwjVar2.k);
                            clwjVar2.Q = a5.a;
                            clwjVar2.O = a5.b;
                            str3 = "audio/mp4a-latm";
                            str = a5.c;
                            i3 = -1;
                            i16 = -1;
                            break;
                        case 14:
                            str3 = "audio/mpeg-L2";
                            singletonList = null;
                            i3 = 4096;
                            str = null;
                            i16 = -1;
                            break;
                        case 15:
                            str3 = "audio/mpeg";
                            singletonList = null;
                            i3 = 4096;
                            str = null;
                            i16 = -1;
                            break;
                        case 16:
                            str3 = "audio/ac3";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 17:
                            str3 = "audio/eac3";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 18:
                            clwjVar2.T = new clwk();
                            str3 = "audio/true-hd";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 19:
                        case 20:
                            str3 = "audio/vnd.dts";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 21:
                            str3 = "audio/vnd.dts.hd";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 22:
                            singletonList = Collections.singletonList(clwjVar2.k);
                            str3 = "audio/flac";
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 23:
                            if (clwj.c(new cmnk(clwjVar2.k))) {
                                i16 = cmny.M(clwjVar2.P);
                                if (i16 == 0) {
                                    int i18 = clwjVar2.P;
                                    StringBuilder sb = new StringBuilder(75);
                                    sb.append("Unsupported PCM bit depth: ");
                                    sb.append(i18);
                                    sb.append(". Setting mimeType to ");
                                    sb.append("audio/x-unknown");
                                    sb.toString();
                                }
                                singletonList = null;
                                i3 = -1;
                                str = null;
                                break;
                            }
                            str3 = "audio/x-unknown";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 24:
                            i16 = cmny.M(clwjVar2.P);
                            if (i16 == 0) {
                                int i19 = clwjVar2.P;
                                StringBuilder sb2 = new StringBuilder(89);
                                sb2.append("Unsupported little endian PCM bit depth: ");
                                sb2.append(i19);
                                sb2.append(". Setting mimeType to ");
                                sb2.append("audio/x-unknown");
                                sb2.toString();
                                str3 = "audio/x-unknown";
                                singletonList = null;
                                i3 = -1;
                                str = null;
                                i16 = -1;
                                break;
                            }
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            break;
                        case 25:
                            int i20 = clwjVar2.P;
                            if (i20 == 8) {
                                singletonList = null;
                                i3 = -1;
                                str = null;
                                i16 = 3;
                                break;
                            } else if (i20 == 16) {
                                i16 = 268435456;
                                singletonList = null;
                                i3 = -1;
                                str = null;
                                break;
                            } else {
                                StringBuilder sb3 = new StringBuilder(86);
                                sb3.append("Unsupported big endian PCM bit depth: ");
                                sb3.append(i20);
                                sb3.append(". Setting mimeType to ");
                                sb3.append("audio/x-unknown");
                                sb3.toString();
                                str3 = "audio/x-unknown";
                                singletonList = null;
                                i3 = -1;
                                str = null;
                                i16 = -1;
                                break;
                            }
                        case 26:
                            int i21 = clwjVar2.P;
                            if (i21 != 32) {
                                StringBuilder sb4 = new StringBuilder(90);
                                sb4.append("Unsupported floating point PCM bit depth: ");
                                sb4.append(i21);
                                sb4.append(". Setting mimeType to ");
                                sb4.append("audio/x-unknown");
                                sb4.toString();
                                str3 = "audio/x-unknown";
                                singletonList = null;
                                i3 = -1;
                                str = null;
                                i16 = -1;
                                break;
                            }
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            break;
                        case 27:
                            str3 = "application/x-subrip";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 28:
                            str3 = "text/x-ssa";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case 29:
                            singletonList = Collections.singletonList(clwjVar2.k);
                            str3 = "application/vobsub";
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            str3 = "application/pgs";
                            singletonList = null;
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            byte[] bArr3 = clwjVar2.k;
                            singletonList = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                            str3 = "application/dvbsubs";
                            i3 = -1;
                            str = null;
                            i16 = -1;
                            break;
                        default:
                            throw new clob("Unrecognized codec identifier.");
                    }
                    byte[] bArr4 = clwjVar2.N;
                    if (bArr4 != null && (a = cmoc.a(new cmnk(bArr4))) != null) {
                        str = a.a;
                        str3 = "video/dolby-vision";
                    }
                    int i22 = (clwjVar2.V ? 1 : 0) | (true != clwjVar2.U ? 0 : 2);
                    clnf clnfVar = new clnf();
                    if (cmnf.a(str3)) {
                        clnfVar.x = clwjVar2.O;
                        clnfVar.y = clwjVar2.Q;
                        clnfVar.z = i16;
                    } else if (!cmnf.b(str3)) {
                        if (!"application/x-subrip".equals(str3)) {
                            if ("text/x-ssa".equals(str3)) {
                                singletonList = new ArrayList<>(2);
                                singletonList.add(clwl.a);
                                singletonList.add(clwjVar2.k);
                            } else if (!"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                                throw new clob("Unexpected MIME type.");
                            }
                        }
                    } else {
                        if (clwjVar2.q == 0) {
                            int i23 = clwjVar2.o;
                            if (i23 == -1) {
                                i23 = clwjVar2.m;
                            }
                            clwjVar2.o = i23;
                            int i24 = clwjVar2.p;
                            if (i24 == -1) {
                                i24 = clwjVar2.n;
                            }
                            clwjVar2.p = i24;
                        }
                        float f = (clwjVar2.o == -1 || (i6 = clwjVar2.p) == -1) ? -1.0f : (clwjVar2.n * i4) / (clwjVar2.m * i6);
                        if (clwjVar2.x) {
                            if (clwjVar2.D == -1.0f || clwjVar2.E == -1.0f || clwjVar2.F == -1.0f || clwjVar2.G == -1.0f || clwjVar2.H == -1.0f || clwjVar2.I == -1.0f || clwjVar2.J == -1.0f || clwjVar2.K == -1.0f || clwjVar2.L == -1.0f || clwjVar2.M == -1.0f) {
                                bArr = null;
                            } else {
                                bArr = new byte[25];
                                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                order.put((byte) 0);
                                order.putShort((short) ((clwjVar2.D * 50000.0f) + 0.5f));
                                order.putShort((short) ((clwjVar2.E * 50000.0f) + 0.5f));
                                order.putShort((short) ((clwjVar2.F * 50000.0f) + 0.5f));
                                order.putShort((short) ((clwjVar2.G * 50000.0f) + 0.5f));
                                order.putShort((short) ((clwjVar2.H * 50000.0f) + 0.5f));
                                order.putShort((short) ((clwjVar2.I * 50000.0f) + 0.5f));
                                order.putShort((short) ((clwjVar2.J * 50000.0f) + 0.5f));
                                order.putShort((short) ((clwjVar2.K * 50000.0f) + 0.5f));
                                order.putShort((short) (clwjVar2.L + 0.5f));
                                order.putShort((short) (clwjVar2.M + 0.5f));
                                order.putShort((short) clwjVar2.B);
                                order.putShort((short) clwjVar2.C);
                            }
                            colorInfo = new ColorInfo(clwjVar2.y, clwjVar2.A, clwjVar2.z, bArr);
                        } else {
                            colorInfo = null;
                        }
                        int intValue = clwl.c.containsKey(clwjVar2.a) ? clwl.c.get(clwjVar2.a).intValue() : -1;
                        if (clwjVar2.r == 0 && Float.compare(clwjVar2.s, 0.0f) == 0 && Float.compare(clwjVar2.t, 0.0f) == 0) {
                            if (Float.compare(clwjVar2.u, 0.0f) == 0) {
                                i5 = 0;
                            } else if (Float.compare(clwjVar2.t, 90.0f) == 0) {
                                i5 = 90;
                            } else if (Float.compare(clwjVar2.t, -180.0f) == 0 || Float.compare(clwjVar2.t, 180.0f) == 0) {
                                i5 = 180;
                            } else if (Float.compare(clwjVar2.t, -90.0f) == 0) {
                                i5 = 270;
                            }
                            clnfVar.p = clwjVar2.m;
                            clnfVar.q = clwjVar2.n;
                            clnfVar.t = f;
                            clnfVar.s = i5;
                            clnfVar.u = clwjVar2.v;
                            clnfVar.v = clwjVar2.w;
                            clnfVar.w = colorInfo;
                        }
                        i5 = intValue;
                        clnfVar.p = clwjVar2.m;
                        clnfVar.q = clwjVar2.n;
                        clnfVar.t = f;
                        clnfVar.s = i5;
                        clnfVar.u = clwjVar2.v;
                        clnfVar.v = clwjVar2.w;
                        clnfVar.w = colorInfo;
                    }
                    if (!clwl.c.containsKey(clwjVar2.a)) {
                        clnfVar.b = clwjVar2.a;
                    }
                    clnfVar.b(i17);
                    clnfVar.k = str3;
                    clnfVar.l = i3;
                    clnfVar.c = clwjVar2.W;
                    clnfVar.d = i22;
                    clnfVar.m = singletonList;
                    clnfVar.h = str;
                    clnfVar.n = clwjVar2.l;
                    Format a6 = clnfVar.a();
                    clwjVar2.X = clupVar.RT(clwjVar2.c);
                    clwjVar2.X.a(a6);
                    SparseArray<clwj> sparseArray = clwlVar.e;
                    clwj clwjVar3 = clwlVar.o;
                    sparseArray.put(clwjVar3.c, clwjVar3);
                    break;
            }
            clwlVar.o = null;
        } else if (i == 19899) {
            int i25 = clwlVar.q;
            if (i25 != -1) {
                long j2 = clwlVar.r;
                if (j2 != -1) {
                    if (i25 != 475249515) {
                        return;
                    }
                    clwlVar.t = j2;
                    return;
                }
            }
            throw new clob("Mandatory element SeekID or SeekPosition not found");
        } else if (i == 25152) {
            clwj clwjVar4 = clwlVar.o;
            if (!clwjVar4.h) {
                return;
            }
            if (clwjVar4.j == null) {
                throw new clob("Encrypted Track found but ContentEncKeyID was not found");
            }
            clwjVar4.l = new DrmInitData(null, true, new DrmInitData.SchemeData(cllt.a, "video/webm", clwlVar.o.j.b));
        } else if (i == 28032) {
            clwj clwjVar5 = clwlVar.o;
            if (clwjVar5.h && clwjVar5.i != null) {
                throw new clob("Combining encryption and compression is not supported");
            }
        } else if (i == 357149030) {
            if (clwlVar.l == -9223372036854775807L) {
                clwlVar.l = 1000000L;
            }
            long j3 = clwlVar.m;
            if (j3 == -9223372036854775807L) {
                return;
            }
            clwlVar.n = clwlVar.b(j3);
        } else if (i == 374648427) {
            if (clwlVar.e.size() == 0) {
                throw new clob("No valid tracks were found");
            }
            clwlVar.J.RS();
        } else if (i == 475249515 && !clwlVar.p) {
            clup clupVar2 = clwlVar.J;
            if (clwlVar.k != -1 && clwlVar.n != -9223372036854775807L && (cmnbVar = clwlVar.v) != null && (i7 = cmnbVar.a) != 0 && (cmnbVar2 = clwlVar.w) != null && cmnbVar2.a == i7) {
                int[] iArr = new int[i7];
                long[] jArr = new long[i7];
                long[] jArr2 = new long[i7];
                long[] jArr3 = new long[i7];
                for (int i26 = 0; i26 < i7; i26++) {
                    jArr3[i26] = clwlVar.v.b(i26);
                    jArr[i26] = clwlVar.k + clwlVar.w.b(i26);
                }
                while (true) {
                    i8 = i7 - 1;
                    if (i9 >= i8) {
                        break;
                    }
                    int i27 = i9 + 1;
                    iArr[i9] = (int) (jArr[i27] - jArr[i9]);
                    jArr2[i9] = jArr3[i27] - jArr3[i9];
                    i9 = i27;
                }
                iArr[i8] = (int) ((clwlVar.k + clwlVar.j) - jArr[i8]);
                long j4 = clwlVar.n - jArr3[i8];
                jArr2[i8] = j4;
                if (j4 <= 0) {
                    StringBuilder sb5 = new StringBuilder(72);
                    sb5.append("Discarding last cue point with unexpected duration: ");
                    sb5.append(j4);
                    sb5.toString();
                    iArr = Arrays.copyOf(iArr, i8);
                    jArr = Arrays.copyOf(jArr, i8);
                    jArr2 = Arrays.copyOf(jArr2, i8);
                    jArr3 = Arrays.copyOf(jArr3, i8);
                }
                clwlVar.v = null;
                clwlVar.w = null;
                clvfVar = new clui(iArr, jArr, jArr2, jArr3);
            } else {
                clwlVar.v = null;
                clwlVar.w = null;
                clvfVar = new clvf(clwlVar.n);
            }
            clupVar2.b(clvfVar);
            clwlVar.p = true;
        }
    }
}

package defpackage;

import android.util.Log;
import com.google.cardboard.sdk.R;
import java.nio.ByteBuffer;
import java.util.List;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: psx  reason: default package */
/* loaded from: classes4.dex */
public final class psx extends ptb {
    private final pwu a = new pwu();
    private final pwt d = new pwt();
    private int e = -1;
    private final int f;
    private final psv[] g;
    private psv h;
    private List i;
    private List j;
    private psw k;
    private int l;

    public psx(int i, List list) {
        this.f = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = pvr.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.g = new psv[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.g[i2] = new psv();
        }
        this.h = this.g[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List g() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psx.g():java.util.List");
    }

    private final void l() {
        psv psvVar;
        psw pswVar = this.k;
        if (pswVar != null) {
            this.d.i(pswVar.b, pswVar.c);
            int i = 3;
            int d = this.d.d(3);
            int d2 = this.d.d(5);
            int i2 = 6;
            int i3 = 7;
            if (d == 7) {
                this.d.l(2);
                d = this.d.d(6);
                if (d < 7) {
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("Invalid extended service number: ");
                    sb.append(d);
                    Log.w("Cea708Decoder", sb.toString());
                }
            }
            if (d2 == 0) {
                if (d != 0) {
                    StringBuilder sb2 = new StringBuilder(59);
                    sb2.append("serviceNumber is non-zero (");
                    sb2.append(d);
                    sb2.append(") when blockSize is 0");
                    Log.w("Cea708Decoder", sb2.toString());
                }
            } else if (d == this.f) {
                boolean z = false;
                while (this.d.a() > 0) {
                    int d3 = this.d.d(8);
                    if (d3 != 16) {
                        if (d3 > 31) {
                            if (d3 > 127) {
                                if (d3 <= 159) {
                                    switch (d3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            int i4 = d3 - 128;
                                            if (this.l != i4) {
                                                this.l = i4;
                                                this.h = this.g[i4];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            for (int i5 = 1; i5 <= 8; i5++) {
                                                if (this.d.n()) {
                                                    this.g[8 - i5].d();
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (this.d.n()) {
                                                    this.g[8 - i6].o = true;
                                                }
                                            }
                                            break;
                                        case 138:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (this.d.n()) {
                                                    this.g[8 - i7].o = false;
                                                }
                                            }
                                            break;
                                        case 139:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (this.d.n()) {
                                                    this.g[8 - i8].o = !psvVar.o;
                                                }
                                            }
                                            break;
                                        case 140:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (this.d.n()) {
                                                    this.g[8 - i9].e();
                                                }
                                            }
                                            break;
                                        case 141:
                                            this.d.l(8);
                                            break;
                                        case 142:
                                            i2 = 6;
                                            break;
                                        case 143:
                                            m();
                                            break;
                                        case 144:
                                            if (this.h.n) {
                                                this.d.d(4);
                                                this.d.d(2);
                                                this.d.d(2);
                                                boolean n = this.d.n();
                                                boolean n2 = this.d.n();
                                                this.d.d(3);
                                                this.d.d(3);
                                                this.h.g(n, n2);
                                                break;
                                            } else {
                                                this.d.l(16);
                                                break;
                                            }
                                        case 145:
                                            if (this.h.n) {
                                                int a = psv.a(this.d.d(2), this.d.d(2), this.d.d(2), this.d.d(2));
                                                int a2 = psv.a(this.d.d(2), this.d.d(2), this.d.d(2), this.d.d(2));
                                                this.d.l(2);
                                                psv.j(this.d.d(2), this.d.d(2), this.d.d(2));
                                                this.h.h(a, a2);
                                                break;
                                            } else {
                                                this.d.l(24);
                                                break;
                                            }
                                        case 146:
                                            if (this.h.n) {
                                                this.d.l(4);
                                                int d4 = this.d.d(4);
                                                this.d.l(2);
                                                this.d.d(6);
                                                psv psvVar2 = this.h;
                                                if (psvVar2.A != d4) {
                                                    psvVar2.c('\n');
                                                }
                                                psvVar2.A = d4;
                                                break;
                                            } else {
                                                this.d.l(16);
                                                break;
                                            }
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            StringBuilder sb3 = new StringBuilder(31);
                                            sb3.append("Invalid C1 command: ");
                                            sb3.append(d3);
                                            Log.w("Cea708Decoder", sb3.toString());
                                            break;
                                        case 151:
                                            if (this.h.n) {
                                                int a3 = psv.a(this.d.d(2), this.d.d(2), this.d.d(2), this.d.d(2));
                                                this.d.d(2);
                                                psv.j(this.d.d(2), this.d.d(2), this.d.d(2));
                                                this.d.n();
                                                this.d.n();
                                                this.d.d(2);
                                                this.d.d(2);
                                                int d5 = this.d.d(2);
                                                this.d.l(8);
                                                this.h.i(a3, d5);
                                                break;
                                            } else {
                                                this.d.l(32);
                                                break;
                                            }
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i10 = d3 - 152;
                                            psv psvVar3 = this.g[i10];
                                            this.d.l(2);
                                            boolean n3 = this.d.n();
                                            boolean n4 = this.d.n();
                                            this.d.n();
                                            int d6 = this.d.d(i);
                                            boolean n5 = this.d.n();
                                            int d7 = this.d.d(i3);
                                            int d8 = this.d.d(8);
                                            int d9 = this.d.d(4);
                                            int d10 = this.d.d(4);
                                            this.d.l(2);
                                            this.d.d(i2);
                                            this.d.l(2);
                                            int d11 = this.d.d(i);
                                            int d12 = this.d.d(i);
                                            psvVar3.n = true;
                                            psvVar3.o = n3;
                                            psvVar3.v = n4;
                                            psvVar3.p = d6;
                                            psvVar3.q = n5;
                                            psvVar3.r = d7;
                                            psvVar3.s = d8;
                                            psvVar3.t = d9;
                                            int i11 = d10 + 1;
                                            if (psvVar3.u != i11) {
                                                psvVar3.u = i11;
                                                while (true) {
                                                    if ((n4 && psvVar3.l.size() >= psvVar3.u) || psvVar3.l.size() >= 15) {
                                                        psvVar3.l.remove(0);
                                                    }
                                                }
                                            }
                                            if (d11 != 0 && psvVar3.x != d11) {
                                                psvVar3.x = d11;
                                                int i12 = d11 - 1;
                                                int i13 = psv.h[i12];
                                                boolean z2 = psv.g[i12];
                                                int i14 = psv.e[i12];
                                                int i15 = psv.f[i12];
                                                psvVar3.i(i13, psv.d[i12]);
                                            }
                                            if (d12 != 0 && psvVar3.y != d12) {
                                                psvVar3.y = d12;
                                                int i16 = d12 - 1;
                                                int i17 = psv.j[i16];
                                                int i18 = psv.i[i16];
                                                psvVar3.g(false, false);
                                                psvVar3.h(psv.a, psv.k[i16]);
                                            }
                                            if (this.l != i10) {
                                                this.l = i10;
                                                this.h = this.g[i10];
                                                break;
                                            }
                                            break;
                                    }
                                } else if (d3 <= 255) {
                                    this.h.c((char) (d3 & PrivateKeyType.INVALID));
                                } else {
                                    StringBuilder sb4 = new StringBuilder(33);
                                    sb4.append("Invalid base command: ");
                                    sb4.append(d3);
                                    Log.w("Cea708Decoder", sb4.toString());
                                }
                                i = 3;
                                i2 = 6;
                                i3 = 7;
                            } else if (d3 == 127) {
                                this.h.c((char) 9835);
                            } else {
                                this.h.c((char) (d3 & PrivateKeyType.INVALID));
                            }
                            z = true;
                        } else if (d3 != 0) {
                            if (d3 == i) {
                                this.i = g();
                            } else if (d3 != 8) {
                                switch (d3) {
                                    case 12:
                                        m();
                                        break;
                                    case 13:
                                        this.h.c('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (d3 < 17 || d3 > 23) {
                                            if (d3 < 24) {
                                                StringBuilder sb5 = new StringBuilder(31);
                                                sb5.append("Invalid C0 command: ");
                                                sb5.append(d3);
                                                Log.w("Cea708Decoder", sb5.toString());
                                                break;
                                            } else {
                                                StringBuilder sb6 = new StringBuilder(54);
                                                sb6.append("Currently unsupported COMMAND_P16 Command: ");
                                                sb6.append(d3);
                                                Log.w("Cea708Decoder", sb6.toString());
                                                this.d.l(16);
                                                break;
                                            }
                                        } else {
                                            StringBuilder sb7 = new StringBuilder(55);
                                            sb7.append("Currently unsupported COMMAND_EXT1 Command: ");
                                            sb7.append(d3);
                                            Log.w("Cea708Decoder", sb7.toString());
                                            this.d.l(8);
                                            break;
                                        }
                                        break;
                                }
                            } else {
                                psv psvVar4 = this.h;
                                int length = psvVar4.m.length();
                                if (length > 0) {
                                    psvVar4.m.delete(length - 1, length);
                                }
                            }
                        }
                        i = 3;
                        i2 = 6;
                        i3 = 7;
                    } else {
                        int d13 = this.d.d(8);
                        if (d13 <= 31) {
                            if (d13 > 7) {
                                if (d13 <= 15) {
                                    this.d.l(8);
                                } else if (d13 <= 23) {
                                    this.d.l(16);
                                } else {
                                    this.d.l(24);
                                }
                            }
                            i = 3;
                            i2 = 6;
                            i3 = 7;
                        } else {
                            if (d13 <= 127) {
                                if (d13 != 32) {
                                    if (d13 != 33) {
                                        if (d13 != 37) {
                                            if (d13 != 42) {
                                                if (d13 != 44) {
                                                    if (d13 != 63) {
                                                        if (d13 != 57) {
                                                            if (d13 != 58) {
                                                                if (d13 != 60) {
                                                                    if (d13 == 61) {
                                                                        this.h.c((char) 8480);
                                                                    } else {
                                                                        switch (d13) {
                                                                            case 48:
                                                                                this.h.c((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.h.c((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.h.c((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.h.c((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.h.c((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.h.c((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (d13) {
                                                                                    case 118:
                                                                                        this.h.c((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.h.c((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.h.c((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.h.c((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.h.c((char) 9474);
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                                                                        this.h.c((char) 9488);
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                                                        this.h.c((char) 9492);
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                                                        this.h.c((char) 9472);
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                                                        this.h.c((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.h.c((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        StringBuilder sb8 = new StringBuilder(33);
                                                                                        sb8.append("Invalid G2 character: ");
                                                                                        sb8.append(d13);
                                                                                        Log.w("Cea708Decoder", sb8.toString());
                                                                                        break;
                                                                                }
                                                                        }
                                                                    }
                                                                } else {
                                                                    this.h.c((char) 339);
                                                                }
                                                            } else {
                                                                this.h.c((char) 353);
                                                            }
                                                        } else {
                                                            this.h.c((char) 8482);
                                                        }
                                                    } else {
                                                        this.h.c((char) 376);
                                                    }
                                                } else {
                                                    this.h.c((char) 338);
                                                }
                                            } else {
                                                this.h.c((char) 352);
                                            }
                                        } else {
                                            this.h.c((char) 8230);
                                        }
                                    } else {
                                        this.h.c((char) 160);
                                    }
                                } else {
                                    this.h.c(' ');
                                }
                            } else {
                                if (d13 <= 159) {
                                    if (d13 <= 135) {
                                        this.d.l(32);
                                    } else if (d13 <= 143) {
                                        this.d.l(40);
                                    } else {
                                        this.d.l(2);
                                        this.d.l(this.d.d(6) * 8);
                                    }
                                } else if (d13 > 255) {
                                    StringBuilder sb9 = new StringBuilder(37);
                                    sb9.append("Invalid extended command: ");
                                    sb9.append(d13);
                                    Log.w("Cea708Decoder", sb9.toString());
                                } else if (d13 == 160) {
                                    this.h.c((char) 13252);
                                } else {
                                    StringBuilder sb10 = new StringBuilder(33);
                                    sb10.append("Invalid G3 character: ");
                                    sb10.append(d13);
                                    Log.w("Cea708Decoder", sb10.toString());
                                    this.h.c('_');
                                }
                                i = 3;
                                i2 = 6;
                                i3 = 7;
                            }
                            i = 3;
                            i2 = 6;
                            i3 = 7;
                            z = true;
                        }
                    }
                }
                if (z) {
                    this.i = g();
                }
            }
            this.k = null;
        }
    }

    private final void m() {
        for (int i = 0; i < 8; i++) {
            this.g[i].e();
        }
    }

    @Override // defpackage.ptb
    protected final psk a() {
        List list = this.i;
        this.j = list;
        ptx.a(list);
        return new ptm(list, 1);
    }

    @Override // defpackage.ptb
    protected final void c(psn psnVar) {
        psw pswVar;
        ByteBuffer byteBuffer = psnVar.d;
        ptx.a(byteBuffer);
        this.a.E(byteBuffer.array(), byteBuffer.limit());
        while (this.a.a() >= 3) {
            int i = this.a.i() & 7;
            int i2 = i & 3;
            int i3 = i & 4;
            byte i4 = (byte) this.a.i();
            byte i5 = (byte) this.a.i();
            if (i2 != 2) {
                if (i2 == 3) {
                    i2 = 3;
                }
            }
            if (i3 == 4) {
                if (i2 == 3) {
                    l();
                    int i6 = (i4 & 192) >> 6;
                    int i7 = this.e;
                    if (i7 != -1 && i6 != (3 & (i7 + 1))) {
                        m();
                        int i8 = this.e;
                        StringBuilder sb = new StringBuilder(71);
                        sb.append("Sequence number discontinuity. previous=");
                        sb.append(i8);
                        sb.append(" current=");
                        sb.append(i6);
                        Log.w("Cea708Decoder", sb.toString());
                    }
                    this.e = i6;
                    int i9 = i4 & 63;
                    if (i9 == 0) {
                        i9 = 64;
                    }
                    pswVar = new psw(i9);
                    this.k = pswVar;
                    byte[] bArr = pswVar.b;
                    int i10 = pswVar.c;
                    pswVar.c = i10 + 1;
                    bArr[i10] = i5;
                } else {
                    ptx.c(true);
                    pswVar = this.k;
                    if (pswVar == null) {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = pswVar.b;
                        int i11 = pswVar.c;
                        int i12 = i11 + 1;
                        pswVar.c = i12;
                        bArr2[i11] = i4;
                        pswVar.c = i12 + 1;
                        bArr2[i12] = i5;
                    }
                }
                int i13 = pswVar.c;
                int i14 = pswVar.a;
                if (i13 == (i14 + i14) - 1) {
                    l();
                }
            }
        }
    }

    @Override // defpackage.ptb
    protected final boolean d() {
        return this.i != this.j;
    }

    @Override // defpackage.pmr
    public final String e() {
        throw null;
    }

    @Override // defpackage.ptb, defpackage.pmr
    public final /* bridge */ /* synthetic */ void f() {
    }

    @Override // defpackage.ptb, defpackage.pmr
    public final void j() {
        super.j();
        this.i = null;
        this.j = null;
        this.l = 0;
        this.h = this.g[0];
        m();
        this.k = null;
    }
}

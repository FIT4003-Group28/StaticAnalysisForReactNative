package defpackage;

import com.google.android.filament.R;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmgo  reason: default package */
/* loaded from: classes5.dex */
public final class cmgo extends cmgs {
    private final cmnk a = new cmnk();
    private final cmnj d = new cmnj();
    private final int e;
    private final cmgm[] f;
    private cmgm g;
    private List<cmfw> h;
    private List<cmfw> i;
    private cmgn j;
    private int k;

    public cmgo(int i, List<byte[]> list) {
        this.e = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = cmmr.a;
            if (list.size() == 1 && list.get(0).length == 1) {
                byte b = list.get(0)[0];
            }
        }
        this.f = new cmgm[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f[i2] = new cmgm();
        }
        this.g = this.f[0];
    }

    private final void j() {
        cmgm cmgmVar;
        cmgn cmgnVar = this.j;
        if (cmgnVar != null) {
            int i = cmgnVar.d;
            int i2 = cmgnVar.b;
            int i3 = (i2 + i2) - 1;
            if (i != i3) {
                int i4 = cmgnVar.a;
                StringBuilder sb = new StringBuilder(131);
                sb.append("DtvCcPacket ended prematurely; size is ");
                sb.append(i3);
                sb.append(", but current index is ");
                sb.append(i);
                sb.append(" (sequence number ");
                sb.append(i4);
                sb.append("); ignoring packet");
                sb.toString();
            } else {
                this.d.b(cmgnVar.c, i);
                int j = this.d.j(3);
                int j2 = this.d.j(5);
                int i5 = 6;
                int i6 = 7;
                if (j == 7) {
                    this.d.h(2);
                    j = this.d.j(6);
                    if (j < 7) {
                        StringBuilder sb2 = new StringBuilder(44);
                        sb2.append("Invalid extended service number: ");
                        sb2.append(j);
                        sb2.toString();
                    }
                }
                if (j2 == 0) {
                    if (j != 0) {
                        StringBuilder sb3 = new StringBuilder(59);
                        sb3.append("serviceNumber is non-zero (");
                        sb3.append(j);
                        sb3.append(") when blockSize is 0");
                        sb3.toString();
                    }
                } else if (j == this.e) {
                    boolean z = false;
                    while (this.d.c() > 0) {
                        int j3 = this.d.j(8);
                        if (j3 == 16) {
                            int j4 = this.d.j(8);
                            if (j4 <= 31) {
                                i6 = 7;
                                if (j4 > 7) {
                                    if (j4 <= 15) {
                                        this.d.h(8);
                                    } else if (j4 <= 23) {
                                        this.d.h(16);
                                    } else {
                                        this.d.h(24);
                                    }
                                }
                            } else {
                                i6 = 7;
                                if (j4 <= 127) {
                                    if (j4 != 32) {
                                        if (j4 != 33) {
                                            if (j4 != 37) {
                                                if (j4 != 42) {
                                                    if (j4 != 44) {
                                                        if (j4 != 63) {
                                                            if (j4 != 57) {
                                                                if (j4 != 58) {
                                                                    if (j4 != 60) {
                                                                        if (j4 == 61) {
                                                                            this.g.d((char) 8480);
                                                                        } else {
                                                                            switch (j4) {
                                                                                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                                                                    this.g.d((char) 9608);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                                                                    this.g.d((char) 8216);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                                                                    this.g.d((char) 8217);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                                                                    this.g.d((char) 8220);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                                                                    this.g.d((char) 8221);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                                                                    this.g.d((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (j4) {
                                                                                        case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                                                                            this.g.d((char) 8539);
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                                                                            this.g.d((char) 8540);
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                                                                            this.g.d((char) 8541);
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                                                                            this.g.d((char) 8542);
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                                                                            this.g.d((char) 9474);
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                                                                            this.g.d((char) 9488);
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                                                            this.g.d((char) 9492);
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                                                            this.g.d((char) 9472);
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                                                            this.g.d((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.g.d((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            StringBuilder sb4 = new StringBuilder(33);
                                                                                            sb4.append("Invalid G2 character: ");
                                                                                            sb4.append(j4);
                                                                                            sb4.toString();
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        this.g.d((char) 339);
                                                                    }
                                                                } else {
                                                                    this.g.d((char) 353);
                                                                }
                                                            } else {
                                                                this.g.d((char) 8482);
                                                            }
                                                        } else {
                                                            this.g.d((char) 376);
                                                        }
                                                    } else {
                                                        this.g.d((char) 338);
                                                    }
                                                } else {
                                                    this.g.d((char) 352);
                                                }
                                            } else {
                                                this.g.d((char) 8230);
                                            }
                                        } else {
                                            this.g.d((char) 160);
                                        }
                                    } else {
                                        this.g.d(' ');
                                    }
                                } else if (j4 <= 159) {
                                    if (j4 <= 135) {
                                        this.d.h(32);
                                    } else if (j4 <= 143) {
                                        this.d.h(40);
                                    } else {
                                        this.d.h(2);
                                        this.d.h(this.d.j(6) * 8);
                                    }
                                } else if (j4 > 255) {
                                    StringBuilder sb5 = new StringBuilder(37);
                                    sb5.append("Invalid extended command: ");
                                    sb5.append(j4);
                                    sb5.toString();
                                } else if (j4 == 160) {
                                    this.g.d((char) 13252);
                                } else {
                                    StringBuilder sb6 = new StringBuilder(33);
                                    sb6.append("Invalid G3 character: ");
                                    sb6.append(j4);
                                    sb6.toString();
                                    this.g.d('_');
                                }
                                i5 = 6;
                                z = true;
                            }
                        } else if (j3 > 31) {
                            if (j3 > 127) {
                                if (j3 <= 159) {
                                    switch (j3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            int i7 = j3 - 128;
                                            if (this.k != i7) {
                                                this.k = i7;
                                                this.g = this.f[i7];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (this.d.i()) {
                                                    this.f[8 - i8].c();
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (this.d.i()) {
                                                    this.f[8 - i9].o = true;
                                                }
                                            }
                                            break;
                                        case 138:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (this.d.i()) {
                                                    this.f[8 - i10].o = false;
                                                }
                                            }
                                            break;
                                        case 139:
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (this.d.i()) {
                                                    this.f[8 - i11].o = !cmgmVar.o;
                                                }
                                            }
                                            break;
                                        case 140:
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (this.d.i()) {
                                                    this.f[8 - i12].b();
                                                }
                                            }
                                            break;
                                        case 141:
                                            this.d.h(8);
                                            break;
                                        case 142:
                                            break;
                                        case 143:
                                            m();
                                            break;
                                        case 144:
                                            if (this.g.n) {
                                                this.d.j(4);
                                                this.d.j(2);
                                                this.d.j(2);
                                                boolean i13 = this.d.i();
                                                boolean i14 = this.d.i();
                                                this.d.j(3);
                                                this.d.j(3);
                                                this.g.g(i13, i14);
                                                break;
                                            } else {
                                                this.d.h(16);
                                                break;
                                            }
                                        case 145:
                                            if (this.g.n) {
                                                int f = cmgm.f(this.d.j(2), this.d.j(2), this.d.j(2), this.d.j(2));
                                                int f2 = cmgm.f(this.d.j(2), this.d.j(2), this.d.j(2), this.d.j(2));
                                                this.d.h(2);
                                                cmgm.j(this.d.j(2), this.d.j(2), this.d.j(2));
                                                this.g.h(f, f2);
                                                break;
                                            } else {
                                                this.d.h(24);
                                                break;
                                            }
                                        case 146:
                                            if (this.g.n) {
                                                this.d.h(4);
                                                int j5 = this.d.j(4);
                                                this.d.h(2);
                                                this.d.j(6);
                                                cmgm cmgmVar2 = this.g;
                                                if (cmgmVar2.A != j5) {
                                                    cmgmVar2.d('\n');
                                                }
                                                cmgmVar2.A = j5;
                                                break;
                                            } else {
                                                this.d.h(16);
                                                break;
                                            }
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            StringBuilder sb7 = new StringBuilder(31);
                                            sb7.append("Invalid C1 command: ");
                                            sb7.append(j3);
                                            sb7.toString();
                                            break;
                                        case 151:
                                            if (this.g.n) {
                                                int f3 = cmgm.f(this.d.j(2), this.d.j(2), this.d.j(2), this.d.j(2));
                                                this.d.j(2);
                                                cmgm.j(this.d.j(2), this.d.j(2), this.d.j(2));
                                                this.d.i();
                                                this.d.i();
                                                this.d.j(2);
                                                this.d.j(2);
                                                int j6 = this.d.j(2);
                                                this.d.h(8);
                                                this.g.i(f3, j6);
                                                break;
                                            } else {
                                                this.d.h(32);
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
                                            int i15 = j3 - 152;
                                            cmgm cmgmVar3 = this.f[i15];
                                            this.d.h(2);
                                            boolean i16 = this.d.i();
                                            boolean i17 = this.d.i();
                                            this.d.i();
                                            int j7 = this.d.j(3);
                                            boolean i18 = this.d.i();
                                            int j8 = this.d.j(i6);
                                            int j9 = this.d.j(8);
                                            int j10 = this.d.j(4);
                                            int j11 = this.d.j(4);
                                            this.d.h(2);
                                            this.d.j(i5);
                                            this.d.h(2);
                                            int j12 = this.d.j(3);
                                            int j13 = this.d.j(3);
                                            cmgmVar3.n = true;
                                            cmgmVar3.o = i16;
                                            cmgmVar3.v = i17;
                                            cmgmVar3.p = j7;
                                            cmgmVar3.q = i18;
                                            cmgmVar3.r = j8;
                                            cmgmVar3.s = j9;
                                            cmgmVar3.t = j10;
                                            int i19 = j11 + 1;
                                            if (cmgmVar3.u != i19) {
                                                cmgmVar3.u = i19;
                                                while (true) {
                                                    if ((i17 && cmgmVar3.l.size() >= cmgmVar3.u) || cmgmVar3.l.size() >= 15) {
                                                        cmgmVar3.l.remove(0);
                                                    }
                                                }
                                            }
                                            if (j12 != 0 && cmgmVar3.x != j12) {
                                                cmgmVar3.x = j12;
                                                int i20 = j12 - 1;
                                                int i21 = cmgm.h[i20];
                                                boolean z2 = cmgm.g[i20];
                                                int i22 = cmgm.e[i20];
                                                int i23 = cmgm.f[i20];
                                                cmgmVar3.i(i21, cmgm.d[i20]);
                                            }
                                            if (j13 != 0 && cmgmVar3.y != j13) {
                                                cmgmVar3.y = j13;
                                                int i24 = j13 - 1;
                                                int i25 = cmgm.j[i24];
                                                int i26 = cmgm.i[i24];
                                                cmgmVar3.g(false, false);
                                                cmgmVar3.h(cmgm.a, cmgm.k[i24]);
                                            }
                                            if (this.k != i15) {
                                                this.k = i15;
                                                this.g = this.f[i15];
                                                break;
                                            }
                                            break;
                                    }
                                    z = true;
                                } else if (j3 <= 255) {
                                    this.g.d((char) (j3 & 255));
                                } else {
                                    StringBuilder sb8 = new StringBuilder(33);
                                    sb8.append("Invalid base command: ");
                                    sb8.append(j3);
                                    sb8.toString();
                                    i6 = 7;
                                }
                                i5 = 6;
                                i6 = 7;
                                z = true;
                            } else if (j3 == 127) {
                                this.g.d((char) 9835);
                            } else {
                                this.g.d((char) (j3 & 255));
                            }
                            z = true;
                        } else if (j3 != 0) {
                            if (j3 == 3) {
                                this.h = k();
                            } else if (j3 != 8) {
                                switch (j3) {
                                    case 12:
                                        m();
                                        break;
                                    case 13:
                                        this.g.d('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (j3 < 17 || j3 > 23) {
                                            if (j3 < 24) {
                                                StringBuilder sb9 = new StringBuilder(31);
                                                sb9.append("Invalid C0 command: ");
                                                sb9.append(j3);
                                                sb9.toString();
                                                break;
                                            } else {
                                                StringBuilder sb10 = new StringBuilder(54);
                                                sb10.append("Currently unsupported COMMAND_P16 Command: ");
                                                sb10.append(j3);
                                                sb10.toString();
                                                this.d.h(16);
                                                break;
                                            }
                                        } else {
                                            StringBuilder sb11 = new StringBuilder(55);
                                            sb11.append("Currently unsupported COMMAND_EXT1 Command: ");
                                            sb11.append(j3);
                                            sb11.toString();
                                            this.d.h(8);
                                            break;
                                        }
                                        break;
                                }
                            } else {
                                cmgm cmgmVar4 = this.g;
                                int length = cmgmVar4.m.length();
                                if (length > 0) {
                                    cmgmVar4.m.delete(length - 1, length);
                                }
                            }
                        }
                        i5 = 6;
                    }
                    if (z) {
                        this.h = k();
                    }
                }
            }
            this.j = null;
        }
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
    private final java.util.List<defpackage.cmfw> k() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmgo.k():java.util.List");
    }

    private final void m() {
        for (int i = 0; i < 8; i++) {
            this.f[i].b();
        }
    }

    @Override // defpackage.cmgs, defpackage.cltd
    public final void d() {
        super.d();
        this.h = null;
        this.i = null;
        this.k = 0;
        this.g = this.f[0];
        m();
        this.j = null;
    }

    @Override // defpackage.cmgs, defpackage.cltd
    public final /* bridge */ /* synthetic */ void e() {
    }

    @Override // defpackage.cmgs
    protected final boolean g() {
        return this.h != this.i;
    }

    @Override // defpackage.cmgs
    protected final cmga h() {
        List<cmfw> list = this.h;
        this.i = list;
        cmmn.f(list);
        return new cmgt(list);
    }

    @Override // defpackage.cmgs
    protected final void i(cmgd cmgdVar) {
        cmgn cmgnVar;
        ByteBuffer byteBuffer = cmgdVar.b;
        cmmn.f(byteBuffer);
        this.a.c(byteBuffer.array(), byteBuffer.limit());
        while (this.a.d() >= 3) {
            int l = this.a.l() & 7;
            int i = l & 3;
            int i2 = l & 4;
            byte l2 = (byte) this.a.l();
            byte l3 = (byte) this.a.l();
            if (i != 2) {
                if (i == 3) {
                    i = 3;
                }
            }
            if (i2 == 4) {
                if (i == 3) {
                    j();
                    int i3 = (l2 & 192) >> 6;
                    int i4 = l2 & 63;
                    if (i4 == 0) {
                        i4 = 64;
                    }
                    cmgnVar = new cmgn(i3, i4);
                    this.j = cmgnVar;
                    byte[] bArr = cmgnVar.c;
                    int i5 = cmgnVar.d;
                    cmgnVar.d = i5 + 1;
                    bArr[i5] = l3;
                } else {
                    cmmn.a(true);
                    cmgnVar = this.j;
                    if (cmgnVar != null) {
                        byte[] bArr2 = cmgnVar.c;
                        int i6 = cmgnVar.d;
                        int i7 = i6 + 1;
                        cmgnVar.d = i7;
                        bArr2[i6] = l2;
                        cmgnVar.d = i7 + 1;
                        bArr2[i7] = l3;
                    }
                }
                int i8 = cmgnVar.d;
                int i9 = cmgnVar.b;
                if (i8 == (i9 + i9) - 1) {
                    j();
                }
            }
        }
    }
}

package defpackage;

import android.media.MediaCodec;
import android.view.Surface;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: afmg */
/* loaded from: classes.dex */
public final class afmg {
    private static afmc a;
    private static afmd b;

    public static void A(aflm aflmVar) {
        aflmVar.aQ(new aece());
    }

    public static void B(aflm aflmVar) {
        aflmVar.aQ(new aecf());
    }

    public static void C(aflm aflmVar) {
        aflmVar.aQ(new aecg());
    }

    public static void D(aflm aflmVar) {
        aflmVar.aQ(new aech());
    }

    public static void E(aflm aflmVar) {
        aflmVar.aQ(new aeci());
    }

    public static void F(aflm aflmVar) {
        aflmVar.aQ(new aecj());
    }

    public static void G(aflm aflmVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                aflmVar.aQ(new aeeq());
            } else {
                aflmVar.aQ(new aeep());
            }
        } else if (z2) {
            aflmVar.aQ(new aebg());
        } else {
            aflmVar.aQ(new aebf());
        }
    }

    public static void H(aflm aflmVar, long j) {
        aeck aeckVar = new aeck();
        aeckVar.i(j);
        aflmVar.aQ(aeckVar);
    }

    public static void I(aflm aflmVar) {
        aflmVar.aQ(new aecl());
    }

    public static void J(aflm aflmVar, boolean z) {
        if (z) {
            aflmVar.aQ(new aeer());
        } else {
            aflmVar.aQ(new aebh());
        }
    }

    public static void K(aflm aflmVar) {
        aflmVar.aQ(new aecm());
    }

    public static void L(aflm aflmVar) {
        aflmVar.aP(new aecn());
    }

    public static void M(aflm aflmVar) {
        aflmVar.aQ(new aeco());
    }

    public static void N(aflm aflmVar) {
        aflmVar.aQ(new aecp());
    }

    public static void O(aflm aflmVar) {
        aflmVar.aQ(new aecs());
    }

    public static void P(aflm aflmVar) {
        aflmVar.aQ(new aect());
    }

    public static void Q(aflm aflmVar) {
        aflmVar.aQ(new aecu());
    }

    public static void R(aflm aflmVar) {
        aflmVar.aQ(new aecv());
    }

    public static void S(aflm aflmVar) {
        aflmVar.aQ(new aecw());
    }

    public static void T(aflm aflmVar) {
        aflmVar.aQ(new aecx());
    }

    public static void U(aflm aflmVar) {
        aflmVar.aP(new aecy());
    }

    public static void V(aflm aflmVar) {
        aflmVar.aQ(new aecz());
    }

    public static void W(aflm aflmVar) {
        aflmVar.aQ(new aeda());
    }

    public static void X(aflm aflmVar) {
        aflmVar.aQ(new aedb());
    }

    public static void Y(aflm aflmVar) {
        aflmVar.aP(new aedc());
    }

    public static void Z(aflm aflmVar) {
        aflmVar.aQ(new aedd());
    }

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "INVALID";
            case 2:
                return "MEDIA_CODEC";
            case 3:
                return "MEDIA_CODEC_HARDWARE_ONLY";
            case 4:
                return "LIBVPX";
            case 5:
                return "LIBOPUS";
            case 6:
                return "LIBOPUS_AMBISONICS";
            case 7:
                return "MEDIA_CODEC_VORBIS_AMBISONICS";
            case 8:
                return "LIBGAV1";
            default:
                return "null";
        }
    }

    public static void aA(aflm aflmVar) {
        aflmVar.aQ(new aeen());
    }

    public static void aB(aflm aflmVar) {
        aflmVar.aQ(new aeeo());
    }

    public static void aC(aflm aflmVar, boolean z) {
        if (z) {
            aflmVar.aQ(new aees());
        } else {
            aflmVar.aQ(new aeeu());
        }
    }

    public static void aD(aflm aflmVar) {
        aflmVar.aQ(new aeew());
    }

    public static void aE(aflm aflmVar) {
        aflmVar.aQ(new aeex());
    }

    public static void aF(aflm aflmVar) {
        aflmVar.aQ(new aeey());
    }

    public static void aG(aflm aflmVar) {
        aflmVar.aQ(new aeez());
    }

    public static void aH(aflm aflmVar) {
        aflmVar.aQ(new aefa());
    }

    public static void aI(aflm aflmVar) {
        aflmVar.aQ(new aefb());
    }

    public static void aJ(aflm aflmVar) {
        aflmVar.aQ(new aefc());
    }

    public static void aK(aflm aflmVar) {
        aflmVar.aQ(new aefd());
    }

    public static void aL(aflm aflmVar) {
        aflmVar.aQ(new aefe());
    }

    public static void aM(aflm aflmVar) {
        aflmVar.aQ(new aeff());
    }

    public static void aN(aflm aflmVar) {
        aflmVar.aQ(new aefg());
    }

    public static void aO(aflm aflmVar) {
        aflmVar.aQ(new aefh());
    }

    public static void aP(aflm aflmVar) {
        aflmVar.aQ(new aefi());
    }

    public static void aQ(aflm aflmVar) {
        aflmVar.aQ(new aefj());
    }

    public static void aR(aflm aflmVar) {
        aflmVar.aQ(new aefk());
    }

    public static void aS(aflm aflmVar) {
        aflmVar.aQ(new aefl());
    }

    public static void aT(aflm aflmVar) {
        aflmVar.aQ(new aefm());
    }

    public static void aU(aflm aflmVar, int i) {
        aflmVar.aQ(new aebq(i));
    }

    public static void aV(aflm aflmVar, int i) {
        aflmVar.aQ(new aebr(i));
    }

    public static int aW(int i) {
        return i - 1;
    }

    public static afkn aX(long j, Throwable th, boolean z, afkn afknVar) {
        cff cffVar = (cff) th;
        if (cffVar.b != null) {
            String str = true != z ? "info." : "info.provisioning.";
            afkl afklVar = afkl.DRM;
            int i = cffVar.b.a;
            StringBuilder sb = new StringBuilder(str.length() + 11);
            sb.append(str);
            sb.append(i);
            afkn afknVar2 = new afkn(afklVar, "net.badstatus", j, sb.toString());
            afknVar2.f();
            return afknVar2;
        } else if (th instanceof cfe) {
            afkn afknVar3 = new afkn(afkl.DRM, "net.timeout", j, true != z ? null : "info.provisioning");
            afknVar3.f();
            return afknVar3;
        } else if (!(th instanceof cev)) {
            return afknVar;
        } else {
            afkn afknVar4 = new afkn(afkl.DRM, "net.connect", j, true != z ? null : "info.provisioning");
            afknVar4.f();
            return afknVar4;
        }
    }

    public static String aY(MediaCodec.CodecException codecException) {
        return codecException.getDiagnosticInfo().replace("android.media.MediaCodec", "MC");
    }

    public static String aZ(Surface surface) {
        return surface == null ? "null" : surface.isValid() ? "valid" : "invalid";
    }

    public static void aa(aflm aflmVar) {
        aflmVar.aQ(new aede());
    }

    public static void ab(aflm aflmVar) {
        aflmVar.aQ(new aedg());
    }

    public static void ac(aflm aflmVar) {
        aflmVar.aP(new aedh());
    }

    public static void ad(aflm aflmVar) {
        aflmVar.aQ(new aedi());
    }

    public static void ae(aflm aflmVar) {
        aflmVar.aQ(new aedk());
    }

    public static void af(aflm aflmVar) {
        aflmVar.aQ(new aedl());
    }

    public static void ag(aflm aflmVar) {
        aflmVar.aQ(new aedm());
    }

    public static void ah(aflm aflmVar) {
        aflmVar.aQ(new aedn());
    }

    public static void ai(aflm aflmVar) {
        aflmVar.aQ(new aedp());
    }

    public static void aj(aflm aflmVar) {
        aflmVar.aQ(new aedq());
    }

    public static void ak(aflm aflmVar) {
        aflmVar.aQ(new aedr());
    }

    public static void al(aflm aflmVar) {
        aflmVar.aQ(new aeds());
    }

    public static void am(aflm aflmVar) {
        aflmVar.aQ(new aedt());
    }

    public static void an(aflm aflmVar, String str) {
        aflmVar.aQ(new aedu(str));
    }

    public static void ao(aflm aflmVar) {
        aflmVar.aQ(new aedv());
    }

    public static void ap(aflm aflmVar) {
        aflmVar.aQ(new aedw());
    }

    public static void aq(aflm aflmVar) {
        aflmVar.aQ(new aedx());
    }

    public static void ar(aflm aflmVar) {
        aflmVar.aQ(new aedy());
    }

    public static void as(aflm aflmVar) {
        aflmVar.aQ(new aeea());
    }

    public static void at(aflm aflmVar) {
        aflmVar.aQ(new aeeb());
    }

    public static void au(aflm aflmVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                aflmVar.aQ(new aeet());
            } else {
                aflmVar.aQ(new aeev());
            }
        } else if (z2) {
            aflmVar.aQ(new aebj());
        } else {
            aflmVar.aQ(new aebl());
        }
    }

    public static void av(aflm aflmVar, long j, long j2) {
        aeed aeedVar = new aeed();
        aeedVar.i(j);
        aflmVar.aP(aeedVar);
        aeec aeecVar = new aeec();
        aeecVar.i(j2);
        aflmVar.aP(aeecVar);
    }

    public static void aw(aflm aflmVar) {
        aflmVar.aP(new aeeg());
    }

    public static void ax(aflm aflmVar, long j, long j2) {
        aeef aeefVar = new aeef();
        aeefVar.i(j - j2);
        aflmVar.aP(aeefVar);
        aeee aeeeVar = new aeee();
        aeeeVar.i(j);
        aflmVar.aP(aeeeVar);
    }

    public static void ay(aflm aflmVar) {
        aflmVar.aP(new aeeh());
    }

    public static void az(aflm aflmVar) {
        aflmVar.aP(new aeei());
    }

    public static avz b(String str, boolean z, Set set, Set set2, int i) {
        if (b == null) {
            b = new afmd();
        }
        return (avz) b.a(str, z, set, set2, i);
    }

    public static void ba(aeul aeulVar, boolean z, long j) {
        afms.a(aeulVar.i());
        afms.a(aeulVar.j());
        afms.a(aeulVar.n());
        afms.a(aeulVar.k());
        afms.a(aeulVar.h());
        boolean z2 = false;
        afms.c(!z || aeulVar.b() == null || (aeulVar.b() instanceof afnh), "MediaView must be null or an implementation of ExtendedMediaView");
        afms.c(j > 0 || j == -1, String.format(Locale.US, "TransitionPositionsMs: %d must be greater than 0 or UNKNOWN", Long.valueOf(j)));
        boolean o = aeulVar.o(8);
        boolean o2 = aeulVar.o(16);
        if (!o || !o2) {
            z2 = true;
        }
        afms.b(z2);
    }

    public static boolean bb(aeul aeulVar, int i) {
        return (aeulVar.f() & i) != 0;
    }

    public static final pdz bc(byte[] bArr) {
        int length;
        if (bArr != null && (length = bArr.length) > 32) {
            try {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 32, length);
                if (bArr[8] == 0) {
                    awzf awzfVar = (awzf) aopi.parseFrom(awzf.a, copyOfRange);
                    if (awzfVar == null) {
                        afkj.d(afki.DRM, "Widevine PSSH Proto parsing failed.");
                        return null;
                    } else if ((awzfVar.b & 32) == 0) {
                        return null;
                    } else {
                        return new pdz(awzfVar.c.I(), awzfVar.d, (awzfVar.b & 256) != 0 ? awzfVar.e : 120);
                    }
                }
                afkj.e(afki.DRM, "Expected PSSH version 0, actual version %s ", Byte.valueOf(bArr[8]));
                return null;
            } catch (aopx | ArrayIndexOutOfBoundsException unused) {
                afkj.d(afki.DRM, "Could not parse drmInitData");
            }
        }
        return null;
    }

    public static osv c(String str, boolean z, Set set, Set set2, int i) {
        if (a == null) {
            a = new afmc();
        }
        return (osv) a.a(str, z, set, set2, i);
    }

    public static long d(FormatStreamModel formatStreamModel, PlayerConfigModel playerConfigModel) {
        return e(formatStreamModel, playerConfigModel, 2, 6);
    }

    public static long e(FormatStreamModel formatStreamModel, PlayerConfigModel playerConfigModel, int i, int i2) {
        if (!formatStreamModel.J() && playerConfigModel.af() && playerConfigModel.U().contains(Integer.valueOf(i2))) {
            long K = playerConfigModel.K();
            if (K == Long.MAX_VALUE) {
                return 0L;
            }
            if (formatStreamModel.P() && (i == 2 || i == 10000)) {
                if (formatStreamModel.f + (formatStreamModel.d() > 240 ? 128000 : 48000) > K) {
                    return K / 8;
                }
            }
            aqke aqkeVar = playerConfigModel.c.z;
            if (aqkeVar == null) {
                aqkeVar = aqke.b;
            }
            if (aqkeVar.i) {
                return K / 8;
            }
        }
        return 0L;
    }

    public static void f(aflm aflmVar) {
        aflmVar.aP(new aeaw());
    }

    public static void g(aflm aflmVar, long j, long j2) {
        aeav aeavVar = new aeav();
        aeavVar.i(j - j2);
        aflmVar.aP(aeavVar);
        aeau aeauVar = new aeau();
        aeauVar.i(j);
        aflmVar.aP(aeauVar);
    }

    public static void h(aflm aflmVar) {
        aflmVar.aP(new aeax());
    }

    public static void i(aflm aflmVar) {
        aflmVar.aP(new aeay());
    }

    public static void j(aflm aflmVar) {
        aflmVar.aQ(new aebd());
    }

    public static void k(aflm aflmVar) {
        aflmVar.aQ(new aebe());
    }

    public static void l(aflm aflmVar, boolean z) {
        if (z) {
            aflmVar.aQ(new aebi());
        } else {
            aflmVar.aQ(new aebk());
        }
    }

    public static void m(aflm aflmVar) {
        aflmVar.aQ(new aebm());
    }

    public static void n(aflm aflmVar) {
        aflmVar.aQ(new aebn());
    }

    public static void o(aflm aflmVar) {
        aflmVar.aQ(new aebo());
    }

    public static void p(aflm aflmVar) {
        aflmVar.aQ(new aebp());
    }

    public static void q(aflm aflmVar) {
        aflmVar.aQ(new aebu());
    }

    public static void r(aflm aflmVar) {
        aflmVar.aQ(new aebv());
    }

    public static void s(aflm aflmVar) {
        aflmVar.aQ(new aebw());
    }

    public static void t(aflm aflmVar) {
        aflmVar.aQ(new aebx());
    }

    public static void u(aflm aflmVar) {
        aflmVar.aQ(new aeby());
    }

    public static void v(aflm aflmVar) {
        aflmVar.aQ(new aebz());
    }

    public static void w(aflm aflmVar) {
        aflmVar.aQ(new aeca());
    }

    public static void x(aflm aflmVar) {
        aflmVar.aQ(new aecb());
    }

    public static void y(aflm aflmVar) {
        aflmVar.aQ(new aecc());
    }

    public static void z(aflm aflmVar) {
        aflmVar.aQ(new aecd());
    }
}

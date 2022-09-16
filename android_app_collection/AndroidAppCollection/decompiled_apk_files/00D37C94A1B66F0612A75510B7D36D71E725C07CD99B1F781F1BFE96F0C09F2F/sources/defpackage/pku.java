package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pku  reason: default package */
/* loaded from: classes4.dex */
public final class pku {
    public static int[] a() {
        amuf f = amuk.f();
        int[] iArr = pkv.b;
        int length = iArr.length;
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                f.h(Integer.valueOf(i2));
            }
        }
        f.h(2);
        return almu.y(f.g());
    }

    public static String b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static int c(int i) {
        return i & 7;
    }

    public static final pju d(pvy pvyVar) {
        return new pju(pvyVar.a());
    }

    public static final void e(pju pjuVar, pvy pvyVar) {
        int i = pju.b;
        pvz pvzVar = pjuVar.a;
        for (int i2 = 0; i2 < pvzVar.b(); i2++) {
            pvyVar.b(pvzVar.a(i2));
        }
    }

    public static final void f(int[] iArr, pvy pvyVar) {
        for (int i : iArr) {
            pvyVar.b(i);
        }
    }

    public static final void g(int i, boolean z, pvy pvyVar) {
        if (z) {
            pvyVar.b(i);
        }
    }

    public static boolean h(aacz aaczVar) {
        apyy b = aaczVar.b();
        if (b != null) {
            asxj asxjVar = b.e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            return asxjVar.n.equals("rotating_strings");
        }
        return false;
    }

    public static kva i() {
        return new kva(kvz.class);
    }

    public static kwa j() {
        return new kwa(kwm.class);
    }

    public static ampq k(String str, aajl aajlVar) {
        return ampq.i((awjr) aajlVar.f(str).g(awjr.class).W());
    }

    public static ampq l(ampq ampqVar) {
        atss b;
        if (ampqVar.h() && (b = ((awjr) ampqVar.c()).b()) != null) {
            atse l = nni.l(b);
            if (l == null || l.g <= 0) {
                return amon.a;
            }
            return ampq.j(Integer.valueOf((int) TimeUnit.SECONDS.toDays(l.g)));
        }
        return amon.a;
    }

    public static final void m(Optional optional, attl attlVar, attp attpVar, acti actiVar, Optional optional2, Optional optional3) {
        atpx atpxVar;
        aqxo.q(!optional2.isPresent() || !optional3.isPresent(), "videoId and playlistId cannot both be present.");
        if (optional.isPresent()) {
            atpxVar = (atpx) optional.filter(gka.n).map(ioc.s).orElse(atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN);
        } else if (attlVar != attl.UNKNOWN_FORMAT_TYPE) {
            atpxVar = atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_ALREADY_SAVED;
        } else {
            atpxVar = atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
        }
        atpx atpxVar2 = atpxVar;
        ahdq.f(attpVar, actiVar, (String) optional2.orElse(null), (String) optional3.orElse(null), attlVar, atpxVar2 == atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_ALREADY_SAVED, agqn.OFFLINE_IMMEDIATELY, atpxVar2);
    }
}

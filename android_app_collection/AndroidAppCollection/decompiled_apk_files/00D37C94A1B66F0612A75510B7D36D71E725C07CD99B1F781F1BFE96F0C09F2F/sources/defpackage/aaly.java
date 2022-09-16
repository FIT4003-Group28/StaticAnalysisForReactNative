package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: aaly  reason: default package */
/* loaded from: classes.dex */
public final class aaly {
    public static final FormatStreamModel a(Uri.Builder builder, String str, long j, aopc aopcVar) {
        String uri = builder.build().toString();
        aopcVar.copyOnWrite();
        aqzx aqzxVar = (aqzx) aopcVar.instance;
        aopr aoprVar = aqzx.a;
        uri.getClass();
        aqzxVar.c |= 2;
        aqzxVar.e = uri;
        return new FormatStreamModel((aqzx) aopcVar.mo39build(), str, j, false);
    }

    public static aoqu b(auri auriVar) {
        if (auriVar == null) {
            return null;
        }
        int i = auriVar.b;
        if ((i & 1) != 0) {
            aurf aurfVar = auriVar.d;
            return aurfVar == null ? aurf.a : aurfVar;
        } else if ((i & 2) != 0) {
            aurg aurgVar = auriVar.e;
            return aurgVar == null ? aurg.a : aurgVar;
        } else if ((i & 4) != 0) {
            aurk aurkVar = auriVar.f;
            return aurkVar == null ? aurk.a : aurkVar;
        } else if ((i & 8) != 0) {
            aurs aursVar = auriVar.g;
            return aursVar == null ? aurs.a : aursVar;
        } else if ((i & 16) != 0) {
            aurt aurtVar = auriVar.h;
            return aurtVar == null ? aurt.a : aurtVar;
        } else if ((i & 32) != 0) {
            aurq aurqVar = auriVar.i;
            return aurqVar == null ? aurq.a : aurqVar;
        } else if ((i & 64) != 0) {
            aurv aurvVar = auriVar.j;
            return aurvVar == null ? aurv.a : aurvVar;
        } else if ((i & 128) != 0) {
            aurh aurhVar = auriVar.k;
            return aurhVar == null ? aurh.a : aurhVar;
        } else if ((i & 256) != 0) {
            auqy auqyVar = auriVar.l;
            return auqyVar == null ? auqy.a : auqyVar;
        } else if ((i & 512) != 0) {
            arbx arbxVar = auriVar.m;
            return arbxVar == null ? arbx.a : arbxVar;
        } else if ((i & 1024) != 0) {
            arct arctVar = auriVar.n;
            return arctVar == null ? arct.a : arctVar;
        } else if ((i & 2048) != 0) {
            aurr aurrVar = auriVar.o;
            return aurrVar == null ? aurr.a : aurrVar;
        } else if ((i & 4096) != 0) {
            aurx aurxVar = auriVar.p;
            return aurxVar == null ? aurx.a : aurxVar;
        } else if ((i & 8192) != 0) {
            auru auruVar = auriVar.q;
            return auruVar == null ? auru.a : auruVar;
        } else if ((i & 16384) != 0) {
            auqw auqwVar = auriVar.r;
            return auqwVar == null ? auqw.a : auqwVar;
        } else if ((32768 & i) != 0) {
            auqx auqxVar = auriVar.s;
            return auqxVar == null ? auqx.a : auqxVar;
        } else if ((65536 & i) != 0) {
            aurb aurbVar = auriVar.t;
            return aurbVar == null ? aurb.a : aurbVar;
        } else if ((131072 & i) != 0) {
            aure aureVar = auriVar.u;
            return aureVar == null ? aure.a : aureVar;
        } else if ((262144 & i) != 0) {
            auqv auqvVar = auriVar.v;
            return auqvVar == null ? auqv.a : auqvVar;
        } else if ((524288 & i) != 0) {
            apwn apwnVar = auriVar.w;
            return apwnVar == null ? apwn.a : apwnVar;
        } else if ((1048576 & i) != 0) {
            apwl apwlVar = auriVar.x;
            return apwlVar == null ? apwl.a : apwlVar;
        } else if ((2097152 & i) != 0) {
            avro avroVar = auriVar.y;
            return avroVar == null ? avro.a : avroVar;
        } else if ((4194304 & i) != 0) {
            avrx avrxVar = auriVar.z;
            return avrxVar == null ? avrx.a : avrxVar;
        } else if ((8388608 & i) != 0) {
            avor avorVar = auriVar.A;
            return avorVar == null ? avor.a : avorVar;
        } else if ((16777216 & i) != 0) {
            avot avotVar = auriVar.B;
            return avotVar == null ? avot.a : avotVar;
        } else if ((33554432 & i) != 0) {
            avou avouVar = auriVar.C;
            return avouVar == null ? avou.a : avouVar;
        } else if ((67108864 & i) != 0) {
            avpi avpiVar = auriVar.D;
            return avpiVar == null ? avpi.a : avpiVar;
        } else if ((134217728 & i) != 0) {
            avqd avqdVar = auriVar.E;
            return avqdVar == null ? avqd.a : avqdVar;
        } else if ((268435456 & i) != 0) {
            ausc auscVar = auriVar.F;
            return auscVar == null ? ausc.a : auscVar;
        } else if ((536870912 & i) != 0) {
            avqv avqvVar = auriVar.G;
            return avqvVar == null ? avqv.a : avqvVar;
        } else if ((1073741824 & i) != 0) {
            ausg ausgVar = auriVar.H;
            return ausgVar == null ? ausg.a : ausgVar;
        } else if ((i & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            ausd ausdVar = auriVar.I;
            return ausdVar == null ? ausd.a : ausdVar;
        } else {
            int i2 = auriVar.c;
            if ((i2 & 1) != 0) {
                ausa ausaVar = auriVar.f121J;
                return ausaVar == null ? ausa.a : ausaVar;
            } else if ((i2 & 2) != 0) {
                ausf ausfVar = auriVar.K;
                return ausfVar == null ? ausf.a : ausfVar;
            } else if ((i2 & 4) != 0) {
                avpr avprVar = auriVar.L;
                return avprVar == null ? avpr.a : avprVar;
            } else if ((i2 & 8) != 0) {
                ausb ausbVar = auriVar.M;
                return ausbVar == null ? ausb.a : ausbVar;
            } else if ((i2 & 16) != 0) {
                avpn avpnVar = auriVar.N;
                return avpnVar == null ? avpn.a : avpnVar;
            } else if ((i2 & 32) != 0) {
                aury auryVar = auriVar.O;
                return auryVar == null ? aury.a : auryVar;
            } else if ((i2 & 64) != 0) {
                auqz auqzVar = auriVar.P;
                return auqzVar == null ? auqz.a : auqzVar;
            } else if ((i2 & 128) != 0) {
                aurz aurzVar = auriVar.Q;
                return aurzVar == null ? aurz.a : aurzVar;
            } else if ((i2 & 256) == 0) {
                return null;
            } else {
                aura auraVar = auriVar.R;
                return auraVar == null ? aura.a : auraVar;
            }
        }
    }

    public static vne c(Context context, String str, ankw ankwVar, vlk vlkVar) {
        vlo d = vlr.d(context, ankwVar);
        d.b();
        d.c = str;
        d.d("innertube_safety_mode_enabled");
        d.e(fdg.q);
        vlr a = d.a();
        vli a2 = vlj.a();
        a2.f(abga.g(context));
        a2.e(awtk.a);
        a2.b(a);
        return vlkVar.a(a2.a());
    }

    public static vne d(Context context, String str, ankw ankwVar, vlk vlkVar) {
        Uri a = yhr.a(context, "innertube", "innertube.pb");
        vli a2 = vlj.a();
        a2.e(awtm.a);
        a2.f(a);
        lto ltoVar = lto.q;
        vlo d = vlr.d(context, ankwVar);
        d.c = str;
        d.d("com.google.android.libraries.youtube.innertube.pref.player_config_supplier");
        d.e(new abfi(ltoVar));
        a2.b(d.a());
        lto ltoVar2 = lto.r;
        vlo d2 = vlr.d(context, ankwVar);
        d2.c = str;
        d2.d("attribution_data");
        d2.e(new abfi(ltoVar2, 2));
        a2.b(d2.a());
        a2.d(new vnj(awtm.a));
        return vlkVar.a(a2.a());
    }
}

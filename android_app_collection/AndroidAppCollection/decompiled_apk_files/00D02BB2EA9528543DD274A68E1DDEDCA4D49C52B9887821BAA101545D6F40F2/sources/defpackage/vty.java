package defpackage;

import android.graphics.Color;
import java.util.List;
/* compiled from: PG */
/* renamed from: vty  reason: default package */
/* loaded from: classes7.dex */
public final class vty {
    private static final int[] f = {6, 10, 14, 20};
    public final akto a;
    public final aktg b;
    public final aktg c;
    public final akte d;
    public final akte e;

    public vty(akto aktoVar, List<akra> list) {
        this.a = aktoVar;
        double[] a = akxa.a(list);
        aktg a2 = a(aktoVar, -1, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAIAAAACAAQMAAAD58POIAAAAA3NCSVQICAjb4U/gAAAABlBMVEUAAAAAAAClZ7nPAAAAAXRSTlMAQObYZgAAAAlwSFlzAAAOxAAADsQBlSsOGwAAACVJREFUSIljYAAD+////zAgg1GBUYFRgVGBUYFRgVGBUQFaCQAAAXeckHM1uEMAAAAASUVORK5CYII", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAIAAAACAAQMAAAD58POIAAAAA3NCSVQICAjb4U/gAAAABlBMVEUAAAAAAAClZ7nPAAAAAXRSTlMAQObYZgAAAAlwSFlzAAAOxAAADsQBlSsOGwAAAJZJREFUSInt0LERwyAMhWH5KCg9AqMwmhmNUTyCSwqflSD7fNIjlzQpXOh1fA0/EMky8056Dg4ODo+Chfn4DvyePocOFc5aLig3TAh0gr3V3iugU3OHpiAhzB02hFVBhPThLWdqQSA9/vljn369GUg2VFItRFsuUA0EGyqpZDfCAbDsALkBpAE2gHkFiBUgDFAAJvL9ay/602YGRMNLmgAAAABJRU5ErkJggg");
        this.b = a2;
        aktg a3 = a(aktoVar, Color.argb(255, 0, 0, 128), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAIAAAACAAQMAAAD58POIAAAAA3NCSVQICAjb4U/gAAAABlBMVEUAAAAAAAClZ7nPAAAAAXRSTlMAQObYZgAAAAlwSFlzAAAOxAAADsQBlSsOGwAAACZJREFUSIljYAAB/gMMDMwfGBBgVGBUYFRgVGBUYFRgVGBUgGYCAPT14QGPN/OFAAAAAElFTkSuQmCC", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAIAAAACAAQMAAAD58POIAAAAA3NCSVQICAjb4U/gAAAABlBMVEUAAAAAAAClZ7nPAAAAAXRSTlMAQObYZgAAAAlwSFlzAAAOxAAADsQBlSsOGwAAANpJREFUSInt0b0RgzAMhmFxFC49gkdhNBiNURjBJQUXJV/kH0nucynsgp8HI947iLDiSbRm6mvChAkTfgY7M4D5KbB5SMwH0cJ8e6hTIjNOHYK8vPFVYC3DttPBfhRYXg6Izak9qhsb1FFtfOiQvgHhbhBzPypIVwPZ3ELrfAVS0EML9FC5VqGy2wDmqXIBFSpN0fy57ADbVbmACpUvqFBpYA1I1eW4M6EYYELxCROKiAFMKLpNKFJNKFIHMOVot6Gf1JeDfYDHwXY7SNlBHOByEE4H6+FgoX9fb+/26Kq784CsAAAAAElFTkSuQmCC");
        this.c = a3;
        this.d = b(aktoVar, a, 1, a2);
        this.e = b(aktoVar, a, 0, a3);
    }

    private static aktg a(akto aktoVar, int i, String str, String str2) {
        List<albt> e = albu.e(f, albu.a);
        dmns bZ = dmnt.d.bZ();
        dmsk bZ2 = dmsl.l.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsl dmslVar = (dmsl) bZ2.b;
        dmslVar.a |= 1;
        dmslVar.b = i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmnt dmntVar = (dmnt) bZ.b;
        str.getClass();
        dmntVar.a |= 1;
        dmntVar.b = str;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsl dmslVar2 = (dmsl) bZ2.b;
        dmnt bK = bZ.bK();
        bK.getClass();
        dmslVar2.j = bK;
        dmslVar2.a |= 512;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmnt dmntVar2 = (dmnt) bZ.b;
        str2.getClass();
        dmntVar2.a |= 1;
        dmntVar2.b = str2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsl dmslVar3 = (dmsl) bZ2.b;
        dmnt bK2 = bZ.bK();
        bK2.getClass();
        dmslVar3.k = bK2;
        dmslVar3.a |= 1024;
        return aktoVar.e().c(albu.b(e, dcdc.f(bZ2), bntp.STEP_ARROW_OVERLAY));
    }

    private static akte b(akto aktoVar, double[] dArr, int i, aktg aktgVar) {
        dmqd dmqdVar = (dmqd) dmqg.p.bZ();
        dspd b = akxh.b(dArr);
        if (dmqdVar.c) {
            dmqdVar.bF();
            dmqdVar.c = false;
        }
        dmqg dmqgVar = (dmqg) dmqdVar.b;
        b.getClass();
        int i2 = dmqgVar.a | 1;
        dmqgVar.a = i2;
        dmqgVar.b = b;
        dmqgVar.a = i2 | 2;
        dmqgVar.c = dArr.length >> 1;
        dmqg dmqgVar2 = (dmqg) dmqdVar.b;
        dmqgVar2.h = 2;
        dmqgVar2.a |= 16;
        int ordinal = bntp.STEP_ARROW_OVERLAY.ordinal();
        if (dmqdVar.c) {
            dmqdVar.bF();
            dmqdVar.c = false;
        }
        dmqg dmqgVar3 = (dmqg) dmqdVar.b;
        int i3 = dmqgVar3.a | 1024;
        dmqgVar3.a = i3;
        dmqgVar3.n = ordinal;
        dmqgVar3.a = i3 | 2048;
        dmqgVar3.o = i;
        int a = aktgVar.a();
        if (dmqdVar.c) {
            dmqdVar.bF();
            dmqdVar.c = false;
        }
        dmqg dmqgVar4 = (dmqg) dmqdVar.b;
        dmqgVar4.a |= 256;
        dmqgVar4.l = a;
        return aktoVar.c().c((dmqg) dmqdVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_DOUBLE);
    }
}

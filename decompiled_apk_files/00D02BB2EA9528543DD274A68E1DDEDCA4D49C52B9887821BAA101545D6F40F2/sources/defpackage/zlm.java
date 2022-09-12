package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zlm  reason: default package */
/* loaded from: classes7.dex */
public final class zlm {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r2 != 7) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.dccx<defpackage.jho> r1, defpackage.dqvj r2, defpackage.afwo r3, android.content.res.Resources r4) {
        /*
            afwm r0 = defpackage.afwm.TRAFFIC
            dqvj r0 = defpackage.dqvj.DRIVE
            int r2 = r2.ordinal()
            if (r2 == 0) goto L2b
            r0 = 1
            if (r2 == r0) goto L21
            r0 = 3
            if (r2 == r0) goto L17
            r0 = 5
            if (r2 == r0) goto L2b
            r0 = 7
            if (r2 == r0) goto L2b
            goto L34
        L17:
            afwm r2 = defpackage.afwm.TRANSIT
            jho r2 = b(r2, r3, r4)
            r1.g(r2)
            goto L34
        L21:
            afwm r2 = defpackage.afwm.BICYCLING
            jho r2 = b(r2, r3, r4)
            r1.g(r2)
            goto L34
        L2b:
            afwm r2 = defpackage.afwm.TRAFFIC
            jho r2 = b(r2, r3, r4)
            r1.g(r2)
        L34:
            afwm r2 = defpackage.afwm.SATELLITE
            jho r2 = b(r2, r3, r4)
            r1.g(r2)
            afwm r2 = defpackage.afwm.TERRAIN
            jho r2 = b(r2, r3, r4)
            r1.g(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlm.a(dccx, dqvj, afwo, android.content.res.Resources):void");
    }

    static jho b(afwm afwmVar, final afwo afwoVar, Resources resources) {
        String string;
        View.OnClickListener onClickListener;
        deaa deaaVar;
        deaa deaaVar2;
        deaa deaaVar3;
        deaa deaaVar4;
        deaa deaaVar5;
        jhm a = jhm.a();
        afwm afwmVar2 = afwm.TRAFFIC;
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = afwmVar.ordinal();
        if (ordinal == 0) {
            string = resources.getString(R.string.ALL_TRAFFIC);
        } else if (ordinal == 1) {
            string = resources.getString(R.string.LAYER_BICYCLING);
        } else if (ordinal == 2) {
            string = resources.getString(R.string.LAYER_PUBLIC_TRANSIT);
        } else if (ordinal != 3) {
            string = ordinal != 4 ? "" : resources.getString(R.string.LAYERS_TERRAIN);
        } else {
            string = resources.getString(R.string.LAYER_SATELLITE);
        }
        a.a = string;
        int ordinal2 = afwmVar.ordinal();
        cjtd cjtdVar = null;
        if (ordinal2 == 0) {
            onClickListener = new View.OnClickListener(afwoVar) { // from class: zlg
                private final afwo a;

                {
                    this.a = afwoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    afwo afwoVar2 = this.a;
                    afwoVar2.c(afwm.TRAFFIC, !afwoVar2.d(afwm.TRAFFIC));
                }
            };
        } else if (ordinal2 == 1) {
            onClickListener = new View.OnClickListener(afwoVar) { // from class: zlh
                private final afwo a;

                {
                    this.a = afwoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    afwo afwoVar2 = this.a;
                    afwoVar2.c(afwm.BICYCLING, !afwoVar2.d(afwm.BICYCLING));
                }
            };
        } else if (ordinal2 == 2) {
            onClickListener = new View.OnClickListener(afwoVar) { // from class: zli
                private final afwo a;

                {
                    this.a = afwoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    afwo afwoVar2 = this.a;
                    afwoVar2.c(afwm.TRANSIT, !afwoVar2.d(afwm.TRANSIT));
                }
            };
        } else if (ordinal2 != 3) {
            onClickListener = ordinal2 != 4 ? null : new View.OnClickListener(afwoVar) { // from class: zlk
                private final afwo a;

                {
                    this.a = afwoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    afwo afwoVar2 = this.a;
                    afwoVar2.c(afwm.TERRAIN, !afwoVar2.d(afwm.TERRAIN));
                }
            };
        } else {
            onClickListener = new View.OnClickListener(afwoVar) { // from class: zlj
                private final afwo a;

                {
                    this.a = afwoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    afwo afwoVar2 = this.a;
                    afwoVar2.c(afwm.SATELLITE, !afwoVar2.d(afwm.SATELLITE));
                }
            };
        }
        a.d(onClickListener);
        int ordinal3 = afwmVar.ordinal();
        if (ordinal3 == 0) {
            cjta b = cjtd.b();
            b.d = dtxn.bB;
            ddzy bZ = deab.c.bZ();
            if (afwoVar.d(afwm.TRAFFIC)) {
                deaaVar = deaa.TOGGLE_ON;
            } else {
                deaaVar = deaa.TOGGLE_OFF;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deab deabVar = (deab) bZ.b;
            deabVar.b = deaaVar.d;
            deabVar.a |= 1;
            b.a = bZ.bK();
            cjtdVar = b.a();
        } else if (ordinal3 == 1) {
            cjta b2 = cjtd.b();
            b2.d = dtxn.bw;
            ddzy bZ2 = deab.c.bZ();
            if (afwoVar.d(afwm.BICYCLING)) {
                deaaVar2 = deaa.TOGGLE_ON;
            } else {
                deaaVar2 = deaa.TOGGLE_OFF;
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            deab deabVar2 = (deab) bZ2.b;
            deabVar2.b = deaaVar2.d;
            deabVar2.a |= 1;
            b2.a = bZ2.bK();
            cjtdVar = b2.a();
        } else if (ordinal3 == 2) {
            cjta b3 = cjtd.b();
            b3.d = dtxn.bC;
            ddzy bZ3 = deab.c.bZ();
            if (afwoVar.d(afwm.TRANSIT)) {
                deaaVar3 = deaa.TOGGLE_ON;
            } else {
                deaaVar3 = deaa.TOGGLE_OFF;
            }
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            deab deabVar3 = (deab) bZ3.b;
            deabVar3.b = deaaVar3.d;
            deabVar3.a |= 1;
            b3.a = bZ3.bK();
            cjtdVar = b3.a();
        } else if (ordinal3 == 3) {
            cjta b4 = cjtd.b();
            b4.d = dtxn.bz;
            ddzy bZ4 = deab.c.bZ();
            if (afwoVar.d(afwm.SATELLITE)) {
                deaaVar4 = deaa.TOGGLE_ON;
            } else {
                deaaVar4 = deaa.TOGGLE_OFF;
            }
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            deab deabVar4 = (deab) bZ4.b;
            deabVar4.b = deaaVar4.d;
            deabVar4.a |= 1;
            b4.a = bZ4.bK();
            cjtdVar = b4.a();
        } else if (ordinal3 == 4) {
            cjta b5 = cjtd.b();
            b5.d = dtxn.bA;
            ddzy bZ5 = deab.c.bZ();
            if (afwoVar.d(afwm.TERRAIN)) {
                deaaVar5 = deaa.TOGGLE_ON;
            } else {
                deaaVar5 = deaa.TOGGLE_OFF;
            }
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            deab deabVar5 = (deab) bZ5.b;
            deabVar5.b = deaaVar5.d;
            deabVar5.a |= 1;
            b5.a = bZ5.bK();
            cjtdVar = b5.a();
        }
        a.f = cjtdVar;
        a.i = true;
        a.k = new zll(afwoVar, afwmVar);
        return a.c();
    }
}

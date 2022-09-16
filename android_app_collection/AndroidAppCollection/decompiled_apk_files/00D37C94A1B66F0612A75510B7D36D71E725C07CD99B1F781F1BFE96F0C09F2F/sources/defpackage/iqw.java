package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: iqw  reason: default package */
/* loaded from: classes3.dex */
public final class iqw extends ipg implements ynl {
    private static final Pattern aF = Pattern.compile("RD.*");
    public yzj aA;
    public acti aB;
    public boolean aC;
    public int aD;
    public aacz aE;
    private View aG;
    private View aH;
    private TextView aI;
    private View aJ;
    private View aK;
    private TextView aL;
    private ImageView aM;
    private yiy aN;
    private PlaybackStartDescriptor aO;
    private CharSequence aP;
    public View ae;
    public View af;
    public View ag;
    public ailf ah;
    public ajmy ai;
    public adoa ak;
    public airr al;
    public aire am;
    public yni an;
    public izq ao;
    public aios ap;
    public niz aq;
    public nxh ar;
    public fvf as;
    public String at;
    public int au;
    public String av;
    public long aw;
    public CountDownLatch ay;
    public PlayerResponseModel az;
    public final iqv aj = new iqv(this);
    public boolean ax = true;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r8 != 5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aM() {
        /*
            r10 = this;
            airr r0 = r10.al
            java.lang.String r0 = r0.q()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            android.view.View r3 = r10.aG
            r3.setVisibility(r1)
            android.view.View r1 = r10.aJ
            iqs r3 = new iqs
            r3.<init>(r10, r0, r2)
            r1.setOnClickListener(r3)
            int r1 = r10.aD
            int r3 = r1 + (-1)
            r4 = 0
            if (r1 == 0) goto Lc6
            r1 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            if (r3 == r2) goto L53
            if (r3 == r7) goto L53
            if (r3 == r6) goto L43
            if (r3 == r5) goto L33
            if (r3 == r1) goto L43
            r3 = r4
            goto L62
        L33:
            if (r0 == 0) goto L3c
            r3 = 29041(0x7171, float:4.0695E-41)
            acup r3 = defpackage.acuo.b(r3)
            goto L62
        L3c:
            r3 = 27431(0x6b27, float:3.8439E-41)
            acup r3 = defpackage.acuo.b(r3)
            goto L62
        L43:
            if (r0 == 0) goto L4c
            r3 = 29042(0x7172, float:4.0697E-41)
            acup r3 = defpackage.acuo.b(r3)
            goto L62
        L4c:
            r3 = 27429(0x6b25, float:3.8436E-41)
            acup r3 = defpackage.acuo.b(r3)
            goto L62
        L53:
            if (r0 == 0) goto L5c
            r3 = 29037(0x716d, float:4.069E-41)
            acup r3 = defpackage.acuo.b(r3)
            goto L62
        L5c:
            r3 = 27427(0x6b23, float:3.8433E-41)
            acup r3 = defpackage.acuo.b(r3)
        L62:
            if (r3 == 0) goto L6e
            acti r8 = r10.aB
            acte r9 = new acte
            r9.<init>(r3)
            r8.n(r9)
        L6e:
            android.view.View r3 = r10.aK
            iqs r8 = new iqs
            r8.<init>(r10, r0)
            r3.setOnClickListener(r8)
            int r3 = r10.aD
            int r8 = r3 + (-1)
            if (r3 == 0) goto Lc5
            if (r8 == r2) goto La9
            if (r8 == r7) goto La9
            if (r8 == r6) goto L99
            if (r8 == r5) goto L89
            if (r8 == r1) goto L99
            goto Lb8
        L89:
            if (r0 == 0) goto L92
            r0 = 29039(0x716f, float:4.0692E-41)
            acup r4 = defpackage.acuo.b(r0)
            goto Lb8
        L92:
            r0 = 27432(0x6b28, float:3.844E-41)
            acup r4 = defpackage.acuo.b(r0)
            goto Lb8
        L99:
            if (r0 == 0) goto La2
            r0 = 29040(0x7170, float:4.0694E-41)
            acup r4 = defpackage.acuo.b(r0)
            goto Lb8
        La2:
            r0 = 27430(0x6b26, float:3.8438E-41)
            acup r4 = defpackage.acuo.b(r0)
            goto Lb8
        La9:
            if (r0 == 0) goto Lb2
            r0 = 29038(0x716e, float:4.0691E-41)
            acup r4 = defpackage.acuo.b(r0)
            goto Lb8
        Lb2:
            r0 = 27428(0x6b24, float:3.8435E-41)
            acup r4 = defpackage.acuo.b(r0)
        Lb8:
            if (r4 == 0) goto Lc4
            acti r0 = r10.aB
            acte r1 = new acte
            r1.<init>(r4)
            r0.n(r1)
        Lc4:
            return
        Lc5:
            throw r4
        Lc6:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqw.aM():void");
    }

    private final boolean aN() {
        return !TextUtils.isEmpty(this.at) && TextUtils.isEmpty(this.av);
    }

    public final void aG() {
        adnt e = this.ak.e();
        if (e != null && e.a() == 1) {
            this.ak.e().A(this.av);
        }
        if (this.aC && this.ar.c()) {
            this.aq.r(1, 2);
        }
        this.as.i(fvl.e(this.aP).b());
        this.an.m(this);
    }

    public final void aH(PlayerResponseModel playerResponseModel) {
        this.ap.k(playerResponseModel.t(), new iqu(this), this.av);
    }

    public final void aI() {
        if (!aN()) {
            this.ae.setVisibility(0);
            this.af.setVisibility(8);
            this.ag.setVisibility(8);
            this.aN = yiy.c(new iqv(this, 1));
            aJ(this.av, yit.c(mJ(), this.aN));
            return;
        }
        aL();
    }

    public final void aJ(String str, yiw yiwVar) {
        this.ah.h(str, this.aO.y(), this.aO.j(), -1, yiwVar);
    }

    public final void aK(adnt adntVar, boolean z) {
        if (mJ() == null) {
            ku();
        } else if (adntVar == null && !z) {
            ku();
        } else if (z) {
            this.aI.setText(mJ().getString(R.string.reconnecting));
            this.aH.setVisibility(0);
        } else {
            int a = adntVar.a();
            if (a == 0) {
                if (adntVar.ai()) {
                    this.aI.setText(mJ().getString(R.string.reconnecting));
                } else {
                    this.aI.setText(mJ().getString(R.string.connecting));
                }
                this.aH.setVisibility(0);
            } else if (a != 1) {
                ku();
            } else {
                this.aH.setVisibility(8);
                if (!aN() && this.az == null) {
                    return;
                }
                aM();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r1 != 5) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aL() {
        /*
            r4 = this;
            android.view.View r0 = r4.ae
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r4.af
            r0.setVisibility(r1)
            android.view.View r0 = r4.ag
            r1 = 0
            r0.setVisibility(r1)
            adoa r0 = r4.ak
            adnt r0 = r0.e()
            if (r0 != 0) goto L1b
            return
        L1b:
            int r0 = r0.a()
            if (r0 == 0) goto L2c
            adoa r0 = r4.ak
            boolean r0 = r0.m()
            if (r0 != 0) goto L2c
            r4.aM()
        L2c:
            int r0 = r4.aD
            int r1 = r0 + (-1)
            if (r0 == 0) goto L5f
            r0 = 3
            if (r1 == r0) goto L45
            r0 = 4
            if (r1 == r0) goto L3c
            r0 = 5
            if (r1 == r0) goto L45
            goto L4d
        L3c:
            android.widget.TextView r0 = r4.aL
            r1 = 2132018847(0x7f14069f, float:1.9676012E38)
            r0.setText(r1)
            goto L4d
        L45:
            android.widget.TextView r0 = r4.aL
            r1 = 2132018846(0x7f14069e, float:1.967601E38)
            r0.setText(r1)
        L4d:
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.az
            if (r0 == 0) goto L5e
            ajmy r1 = r4.ai
            android.widget.ImageView r2 = r4.aM
            aalc r0 = r0.b()
            ajmu r3 = defpackage.ajmu.b
            r1.j(r2, r0, r3)
        L5e:
            return
        L5f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqw.aL():void");
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        CountDownLatch countDownLatch;
        if (i != -1) {
            if (i == 0) {
                aK(((adob) obj).a(), this.ak.m());
                return null;
            } else if (i == 1) {
                afwb afwbVar = (afwb) obj;
                if (this.al.q() == null) {
                    return null;
                }
                this.ay = new CountDownLatch(2);
                return null;
            } else if (i == 2) {
                if (((ahhm) obj).c() != aijx.VIDEO_WATCH_LOADED || (countDownLatch = this.ay) == null) {
                    return null;
                }
                countDownLatch.countDown();
                if (this.ay.getCount() != 0) {
                    return null;
                }
                aG();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{adob.class, afwb.class, ahhm.class};
    }

    @Override // defpackage.dh, defpackage.dp
    public final void lU() {
        super.lU();
        this.ao = null;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        atcj atcjVar = this.aE.b().n;
        if (atcjVar == null) {
            atcjVar = atcj.a;
        }
        this.aC = atcjVar.k;
        this.aP = rh().getText(R.string.video_added_to_tv_queue);
        this.aB.d(acuo.a(14908), aafr.b(this.m.getByteArray("navigation_endpoint")), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    @Override // defpackage.dh, defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mS() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqw.mS():void");
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.remote_watch_dialog_fragment, viewGroup, false);
        this.ae = inflate.findViewById(R.id.loading);
        this.af = inflate.findViewById(R.id.error);
        this.ag = inflate.findViewById(R.id.content);
        this.aH = inflate.findViewById(R.id.connecting);
        this.aI = (TextView) inflate.findViewById(R.id.connecting_textview);
        this.aG = inflate.findViewById(R.id.remote_actions);
        this.aJ = inflate.findViewById(R.id.play);
        this.aL = (TextView) inflate.findViewById(R.id.play_text);
        this.aK = inflate.findViewById(R.id.queue);
        this.aM = (ImageView) inflate.findViewById(R.id.thumbnail);
        return inflate;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void my() {
        super.my();
        yiy yiyVar = this.aN;
        if (yiyVar != null) {
            yiyVar.d();
            this.aN = null;
        }
        if (this.ax) {
            this.an.m(this);
        }
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        oy.getWindow().requestFeature(1);
        return oy;
    }
}

package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acmt  reason: default package */
/* loaded from: classes.dex */
public final class acmt implements View.OnClickListener, abwt {
    public final atht a;
    public final List b;
    public final acmr c;
    public final ViewGroup d;
    public final acti e;
    public final byte[] f;
    public PopupWindow g;
    private final ajxz h;
    private final Context i;
    private final aafo j;
    private final apoj k;
    private final LayoutInflater l;
    private final List m = new ArrayList();
    private final Map n = new HashMap();
    private int o = -1;

    public acmt(Context context, acmr acmrVar, atht athtVar, ajxz ajxzVar, aafo aafoVar, acti actiVar, int i, int i2) {
        apoj apojVar;
        this.i = context;
        this.c = acmrVar;
        athtVar.getClass();
        this.a = athtVar;
        this.h = ajxzVar;
        this.j = aafoVar;
        this.e = actiVar;
        athq athqVar = athtVar.c;
        aqxo.y((athqVar == null ? athq.a : athqVar).b == 65153809);
        athq athqVar2 = athtVar.c;
        athqVar2 = athqVar2 == null ? athq.a : athqVar2;
        if (athqVar2.b == 65153809) {
            apojVar = (apoj) athqVar2.c;
        } else {
            apojVar = apoj.a;
        }
        this.b = athtVar.e;
        this.l = LayoutInflater.from(context);
        ImageButton imageButton = new ImageButton(context);
        if ((apojVar.b & 32) != 0) {
            arhs arhsVar = apojVar.g;
            arhr b = arhr.b((arhsVar == null ? arhs.a : arhsVar).c);
            imageButton.setImageResource(ajxzVar.a(b == null ? arhr.UNKNOWN : b));
        }
        if ((apojVar.b & 65536) != 0) {
            aovr aovrVar = apojVar.r;
            imageButton.setContentDescription((aovrVar == null ? aovr.a : aovrVar).c);
        }
        byte[] I = apojVar.t.I();
        this.f = I;
        this.k = apojVar;
        imageButton.setOnClickListener(this);
        imageButton.setBackgroundColor(0);
        zag.l(imageButton, imageButton.getBackground(), 1);
        actiVar.D(new acte(I));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.addView(imageButton);
        ViewGroup.LayoutParams layoutParams = imageButton.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
    }

    public static final int c(LinearLayout linearLayout, View view) {
        return ((-linearLayout.getMeasuredHeight()) - view.getHeight()) - view.getPaddingTop();
    }

    @Override // defpackage.abwt
    public final void a(int i) {
        this.n.remove(Integer.valueOf(i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r2 == ((defpackage.acke) r5.c).aH) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (r2 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
        if (r2 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
        if (r2 == ((defpackage.acke) r5.c).aG) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
        if (r2 == ((defpackage.acke) r5.c).e.aM()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
        if (r2 == ((defpackage.acke) r5.c).aA) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
        if (r2 == ((defpackage.acke) r5.c).aB) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.List r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.Iterator r6 = r6.iterator()
            r1 = 1
        L9:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r1 = r6.next()
            athy r1 = (defpackage.athy) r1
            int r2 = r1.b
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L24
            java.lang.Object r2 = r1.c
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L25
        L24:
            r2 = 0
        L25:
            int r1 = r1.d
            int r1 = defpackage.akel.aE(r1)
            if (r1 != 0) goto L2e
            r1 = 1
        L2e:
            int r1 = r1 + (-1)
            switch(r1) {
                case 1: goto L7f;
                case 2: goto L76;
                case 3: goto L69;
                case 4: goto L60;
                case 5: goto L52;
                case 6: goto L3e;
                case 7: goto L35;
                default: goto L33;
            }
        L33:
            r1 = 0
            goto L88
        L35:
            acmr r1 = r5.c
            acke r1 = (defpackage.acke) r1
            boolean r1 = r1.aH
            if (r2 != r1) goto L33
            goto L87
        L3e:
            acmr r1 = r5.c
            acke r1 = (defpackage.acke) r1
            aths r1 = r1.aD
            if (r1 == 0) goto L4e
            int r1 = r1.b
            r1 = r1 & 16
            if (r1 == 0) goto L4e
            r1 = 1
            goto L4f
        L4e:
            r1 = 0
        L4f:
            if (r2 != r1) goto L33
            goto L87
        L52:
            acmr r1 = r5.c
            acke r1 = (defpackage.acke) r1
            int r1 = r1.aC
            if (r1 > r0) goto L5c
            r1 = 0
            goto L5d
        L5c:
            r1 = 1
        L5d:
            if (r2 != r1) goto L33
            goto L87
        L60:
            acmr r1 = r5.c
            acke r1 = (defpackage.acke) r1
            boolean r1 = r1.aG
            if (r2 != r1) goto L33
            goto L87
        L69:
            acmr r1 = r5.c
            acke r1 = (defpackage.acke) r1
            ackg r1 = r1.e
            boolean r1 = r1.aM()
            if (r2 != r1) goto L33
            goto L87
        L76:
            acmr r1 = r5.c
            acke r1 = (defpackage.acke) r1
            boolean r1 = r1.aA
            if (r2 != r1) goto L33
            goto L87
        L7f:
            acmr r1 = r5.c
            acke r1 = (defpackage.acke) r1
            boolean r1 = r1.aB
            if (r2 != r1) goto L33
        L87:
            r1 = 1
        L88:
            if (r1 != 0) goto L9
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmt.b(java.util.List):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0216, code lost:
        if (android.os.SystemClock.elapsedRealtime() < (r12 + r10)) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0256, code lost:
        if (android.os.SystemClock.elapsedRealtime() < (r12 + r10)) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0259, code lost:
        r2 = r16.i;
        r5 = r3.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025d, code lost:
        if (r5 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025f, code lost:
        r5 = defpackage.arag.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0261, code lost:
        defpackage.zag.r(r2, defpackage.ajgl.b(r5).toString(), 1);
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r17) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmt.onClick(android.view.View):void");
    }
}

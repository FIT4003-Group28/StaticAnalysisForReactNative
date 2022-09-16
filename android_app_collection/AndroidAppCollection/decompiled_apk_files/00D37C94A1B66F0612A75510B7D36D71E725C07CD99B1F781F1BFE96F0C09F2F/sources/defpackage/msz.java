package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EndorsementMetadataSwapRendererOuterClass;
/* compiled from: PG */
/* renamed from: msz  reason: default package */
/* loaded from: classes3.dex */
public final class msz implements ajru, lmt, geq, ynl {
    protected final Context a;
    final frf b;
    msy c;
    private final aafo d;
    private final yni e;
    private final fyx f;
    private final ajyc g;
    private final lmu h;
    private final jll i;
    private final emg j;
    private final ajrb k;
    private aplx l;
    private final ajsa m;
    private mlo n;
    private final mlp o;
    private final FrameLayout p;
    private awbh q;
    private final aacz r;

    public msz(Context context, yni yniVar, aafo aafoVar, fyx fyxVar, ajyc ajycVar, aacz aaczVar, lmu lmuVar, jll jllVar, emg emgVar, ajrb ajrbVar, ajsa ajsaVar, mlp mlpVar) {
        this.a = context;
        this.e = yniVar;
        this.d = aafoVar;
        this.f = fyxVar;
        this.g = ajycVar;
        this.j = emgVar;
        this.k = ajrbVar;
        frf frfVar = new frf(zhn.j(context, R.attr.ytSeparator).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        this.b = frfVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.p = frameLayout;
        frameLayout.setBackground(frfVar);
        this.h = lmuVar;
        lmuVar.a(this);
        this.i = jllVar;
        this.m = ajsaVar;
        this.r = aaczVar;
        this.o = mlpVar;
    }

    private final int g() {
        return this.a.getResources().getConfiguration().orientation;
    }

    private static apmi h(awbh awbhVar) {
        if ((awbhVar.b & 2097152) != 0) {
            apmg apmgVar = awbhVar.t;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            apmi apmiVar = apmgVar.d;
            return apmiVar == null ? apmi.a : apmiVar;
        }
        return null;
    }

    private static boolean i(awbh awbhVar) {
        if (awbhVar != null) {
            aunb aunbVar = awbhVar.A;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            return aunbVar.qn(EndorsementMetadataSwapRendererOuterClass.endorsementMetadataSwapRenderer);
        }
        return false;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.p;
    }

    @Override // defpackage.lmt
    public final fjz d() {
        msy msyVar = this.c;
        if (msyVar == null) {
            return null;
        }
        return msyVar.r;
    }

    @Override // defpackage.lmt
    public final aplx e() {
        return this.l;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        fmj fmjVar;
        int i2 = 0;
        if (i != -1) {
            if (i == 0) {
                boolean a = ((fyw) obj).a();
                msy msyVar = this.c;
                if (msyVar == null || (fmjVar = msyVar.p) == null) {
                    return null;
                }
                if (true != a) {
                    i2 = 8;
                }
                View view = fmjVar.f;
                if (!fmjVar.e || view == null || !fmjVar.c) {
                    return null;
                }
                view.setVisibility(i2);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{fyw.class};
    }

    @Override // defpackage.geq
    public final aynr oI(int i) {
        if (this.n != null) {
            if ((i == 1 || i == 2) && i(this.q)) {
                this.n.c();
            } else if (i == 0 && i(this.q)) {
                this.n.b();
            }
        }
        return aynr.f();
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        if (geqVar instanceof msz) {
            return akzj.f(((msz) geqVar).q, this.q);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x027f, code lost:
        if (r8 != 10) goto L310;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x062c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:382:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msz.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.q = null;
        this.e.m(this);
        msy msyVar = this.c;
        if (msyVar != null) {
            msyVar.qZ(ajsaVar);
            this.p.removeAllViews();
            ajsaVar.b(this.c.i);
        }
        mlo mloVar = this.n;
        if (mloVar != null) {
            mloVar.a();
        }
    }
}

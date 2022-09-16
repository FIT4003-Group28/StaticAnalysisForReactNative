package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jzb  reason: default package */
/* loaded from: classes3.dex */
public final class jzb implements aich, airt, ynl {
    public final dt a;
    public final jza b;
    public final akfg c;
    public boolean d;
    public ampq e;
    public awan f;
    private final jxt g;
    private final jxt h;
    private final jyz i;
    private final Handler j;
    private final aadd k;
    private VideoQuality[] l;
    private int m;
    private int n;

    public jzb(final dt dtVar, final jyz jyzVar, jza jzaVar, Handler handler, aadd aaddVar, akfg akfgVar) {
        this.a = dtVar;
        jxt jxtVar = new jxt(dtVar.getString(R.string.quality_title), new jxs() { // from class: jyv
            @Override // defpackage.jxs
            public final void a() {
                jyz.this.c(dtVar);
            }
        });
        this.g = jxtVar;
        jxt jxtVar2 = new jxt(dtVar.getString(R.string.quality_title), new jyy(this));
        this.h = jxtVar2;
        jxtVar.e = zag.f(dtVar, 2131233385, R.attr.ytTextPrimary);
        jxtVar2.e = zag.f(dtVar, 2131233385, R.attr.ytTextPrimary);
        this.i = jyzVar;
        this.b = jzaVar;
        this.j = handler;
        this.k = aaddVar;
        this.c = akfgVar;
        this.e = amon.a;
        this.f = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
        e();
    }

    private final void d(final jxt jxtVar, String str) {
        final String d = amps.d(str);
        if (ylr.e()) {
            jxtVar.d(d);
        } else {
            this.j.post(new Runnable() { // from class: jyx
                @Override // java.lang.Runnable
                public final void run() {
                    jxt.this.d(d);
                }
            });
        }
    }

    private final void e() {
        atdy atdyVar = this.k.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        atdz atdzVar = atdyVar.k;
        if (atdzVar == null) {
            atdzVar = atdz.a;
        }
        if (atdzVar.c) {
            this.n = 3;
            return;
        }
        auaf auafVar = this.k.a().j;
        if (auafVar == null) {
            auafVar = auaf.a;
        }
        if (auafVar.x) {
            this.n = 2;
        } else {
            this.n = 1;
        }
    }

    public final jxt a() {
        return this.n == 3 ? this.h : this.g;
    }

    public final void b(ahge ahgeVar) {
        int i = 0;
        boolean z = ahgeVar.a() == -2;
        this.f = ahgeVar.b();
        if (this.l != null) {
            while (true) {
                VideoQuality[] videoQualityArr = this.l;
                if (i >= videoQualityArr.length) {
                    i = -1;
                    break;
                } else if (videoQualityArr[i].a == ahgeVar.a()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            pH(this.l, i, z);
        }
    }

    public final void c(String str) {
        akfg akfgVar = this.c;
        fvg d = fvl.d();
        d.e(true);
        d.k(str);
        d.i(-1);
        akfgVar.n(d.b());
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ae(jvb.e, jvb.f).I().G(aypa.a()).aa(new ayqb() { // from class: jyw
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                jzb.this.b((ahge) obj);
            }
        }, jww.g)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                b((ahge) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahge.class};
    }

    @Override // defpackage.aich
    public final void pG(boolean z) {
        this.g.g(z);
        this.d = z;
        jxt jxtVar = this.h;
        if (!jxtVar.g) {
            jxtVar.g(true);
        }
        if (!z) {
            d(this.h, this.a.getString(R.string.video_quality_unavailable_menu_item_secondary_text));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
        if (r5 != defpackage.awan.VIDEO_QUALITY_SETTING_ADVANCED_MENU) goto L27;
     */
    @Override // defpackage.aich
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pH(com.google.android.libraries.youtube.innertube.model.media.VideoQuality[] r8, int r9, boolean r10) {
        /*
            r7 = this;
            com.google.android.libraries.youtube.innertube.model.media.VideoQuality[] r0 = r7.l
            if (r0 == r8) goto L7
            r7.e()
        L7:
            r7.l = r8
            jyz r1 = r7.i
            int r4 = r7.m
            int r6 = r7.n
            r2 = r8
            r3 = r9
            r5 = r10
            r1.a(r2, r3, r4, r5, r6)
            int r0 = r7.n
            int r1 = r7.m
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L2b
            if (r9 != 0) goto L2b
            if (r8 == 0) goto L28
            if (r1 <= 0) goto L28
            int r9 = r8.length
            if (r1 >= r9) goto L28
            r9 = r1
            goto L29
        L28:
            r9 = 0
        L29:
            r0 = 0
            goto L2c
        L2b:
            r0 = r9
        L2c:
            if (r8 == 0) goto L3c
            if (r9 < 0) goto L3c
            int r1 = r8.length
            if (r9 >= r1) goto L3c
            r8 = r8[r9]
            java.lang.String r8 = r8.b
            ampq r8 = defpackage.ampq.i(r8)
            goto L3e
        L3c:
            amon r8 = defpackage.amon.a
        L3e:
            r7.e = r8
            int r8 = r7.n
            if (r8 == r2) goto L48
            if (r0 == 0) goto L48
            r7.m = r0
        L48:
            jxt r8 = r7.a()
            dt r9 = r7.a
            int r0 = r7.n
            ampq r1 = r7.e
            java.lang.String r4 = ""
            java.lang.Object r1 = r1.e(r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r1 = r1.toString()
            awan r5 = r7.f
            r6 = 2
            if (r0 != r6) goto L69
            if (r10 != 0) goto L67
            r0 = 2
            goto L69
        L67:
            r0 = 2
            goto L70
        L69:
            r10 = 3
            if (r0 != r10) goto Lbd
            awan r10 = defpackage.awan.VIDEO_QUALITY_SETTING_ADVANCED_MENU
            if (r5 == r10) goto Lbd
        L70:
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 == 0) goto L77
            goto L82
        L77:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r3] = r1
            r4 = 2132018985(0x7f140729, float:1.9676292E38)
            java.lang.String r4 = r9.getString(r4, r10)
        L82:
            r10 = 2132018982(0x7f140726, float:1.9676286E38)
            if (r0 != r6) goto L90
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r4
            java.lang.String r1 = r9.getString(r10, r0)
            goto Lbd
        L90:
            awan r0 = defpackage.awan.VIDEO_QUALITY_SETTING_UNKNOWN
            int r0 = r5.ordinal()
            if (r0 == 0) goto Lb5
            if (r0 == r2) goto La9
            if (r0 == r6) goto L9d
            goto Lbd
        L9d:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r3] = r4
            r0 = 2132018983(0x7f140727, float:1.9676288E38)
            java.lang.String r1 = r9.getString(r0, r10)
            goto Lbd
        La9:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r3] = r4
            r0 = 2132018984(0x7f140728, float:1.967629E38)
            java.lang.String r1 = r9.getString(r0, r10)
            goto Lbd
        Lb5:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r4
            java.lang.String r1 = r9.getString(r10, r0)
        Lbd:
            java.lang.String r9 = r1.toString()
            r7.d(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzb.pH(com.google.android.libraries.youtube.innertube.model.media.VideoQuality[], int, boolean):void");
    }

    @Override // defpackage.aich
    public final void q(aicg aicgVar) {
        this.i.b(aicgVar);
        this.b.b(aicgVar);
    }
}

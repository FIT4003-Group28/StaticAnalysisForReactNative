package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: kyz  reason: default package */
/* loaded from: classes3.dex */
public final class kyz extends ajwd implements ynl {
    public final ajsm a;
    public final Handler b;
    public final Resources c;
    awda d;
    public final RecyclerView e;
    public final akaf f;
    public int g;
    public int h;
    public int i = 0;
    final View.OnClickListener j;
    private final ajrj k;
    private final ajqh l;
    private final int m;
    private final int n;
    private final int o;
    private final ajsm p;
    private final ajsm q;
    private final kxd r;
    private final laa s;
    private final yni t;
    private final Context u;
    private final lbd v;
    private final ajxt w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* JADX WARN: Removed duplicated region for block: B:152:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kyz(android.content.Context r3, defpackage.ajyi r4, defpackage.yni r5, android.os.Handler r6, defpackage.ajxt r7, defpackage.lbd r8, defpackage.awda r9, android.support.v7.widget.RecyclerView r10, defpackage.akaf r11) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyz.<init>(android.content.Context, ajyi, yni, android.os.Handler, ajxt, lbd, awda, android.support.v7.widget.RecyclerView, akaf):void");
    }

    public static boolean d(awcz awczVar) {
        int T;
        return awczVar.b == 122814739 && (T = awwc.T(((awdi) awczVar.c).k)) != 0 && T == 3;
    }

    public final void b(boolean z) {
        if (this.r == null) {
            return;
        }
        if (z && zdg.e(this.u)) {
            this.f.r().lT(new kyx(this));
        }
        if (this.d.qn(awco.c) && ((Boolean) this.d.qm(awco.c)).booleanValue()) {
            this.r.a = 1;
            this.l.h(Integer.MAX_VALUE);
        } else {
            this.r.a = 0;
            this.l.h(this.m);
        }
        this.q.l();
    }

    public final void c() {
        if (!this.x) {
            return;
        }
        boolean z = false;
        boolean z2 = this.d.qn(awco.c) && ((Boolean) this.d.qm(awco.c)).booleanValue();
        if (this.n == 0 || z2 || this.o > 0) {
            z = true;
        }
        if (z != this.p.isEmpty()) {
            return;
        }
        if (z) {
            this.p.add(this.s);
        } else {
            this.p.clear();
        }
        this.p.l();
    }

    @Override // defpackage.ajwd, defpackage.zdx
    public final void j() {
        awdk awdkVar;
        awdk awdkVar2;
        this.t.m(this);
        awdg awdgVar = this.d.d;
        if (awdgVar == null) {
            awdgVar = awdg.a;
        }
        if (awdgVar.b == 122710540) {
            awdkVar = (awdk) awdgVar.c;
        } else {
            awdkVar = awdk.a;
        }
        if ((awdkVar.b & 512) != 0) {
            lbd lbdVar = this.v;
            awdg awdgVar2 = this.d.d;
            if (awdgVar2 == null) {
                awdgVar2 = awdg.a;
            }
            if (awdgVar2.b == 122710540) {
                awdkVar2 = (awdk) awdgVar2.c;
            } else {
                awdkVar2 = awdk.a;
            }
            String str = awdkVar2.l;
            if (str == null) {
                return;
            }
            lbdVar.a.remove(str);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        awdu awduVar;
        awdu awduVar2;
        awdu awduVar3;
        awdb awdbVar;
        awdu awduVar4;
        int i2 = 0;
        if (i != -1) {
            if (i == 0) {
                kxc kxcVar = (kxc) obj;
                int size = this.d.e.size();
                int i3 = this.g;
                if (size <= i3) {
                    return null;
                }
                awdx awdxVar = (awdx) this.d.e.get(i3);
                if (awdxVar.b == 147633782) {
                    awduVar = (awdu) awdxVar.c;
                } else {
                    awduVar = awdu.a;
                }
                if (awduVar.c.size() == 0 || this.h == kxcVar.a()) {
                    return null;
                }
                awdx awdxVar2 = (awdx) this.d.e.get(this.g);
                if (awdxVar2.b == 147633782) {
                    awduVar2 = (awdu) awdxVar2.c;
                } else {
                    awduVar2 = awdu.a;
                }
                if (awduVar2.c.size() <= kxcVar.a()) {
                    return null;
                }
                awdx awdxVar3 = (awdx) this.d.e.get(this.g);
                if (awdxVar3.b == 147633782) {
                    awduVar3 = (awdu) awdxVar3.c;
                } else {
                    awduVar3 = awdu.a;
                }
                awdn awdnVar = (awdn) awduVar3.c.get(kxcVar.a());
                if (awdnVar.b == 117337765) {
                    awdbVar = (awdb) awdnVar.c;
                } else {
                    awdbVar = awdb.a;
                }
                awcz[] awczVarArr = (awcz[]) awdbVar.c.toArray(new awcz[0]);
                ArrayList arrayList = new ArrayList();
                for (awcz awczVar : awczVarArr) {
                    arrayList.add(awczVar);
                }
                this.b.removeCallbacksAndMessages(null);
                this.a.m(jny.j);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    int dimensionPixelSize = this.c.getDimensionPixelSize(R.dimen.watch_card_item_padding_top_bottom);
                    int i5 = dimensionPixelSize + dimensionPixelSize;
                    if (((awcz) arrayList.get(i4)).b != 153515154) {
                        if (d((awcz) arrayList.get(i4))) {
                            this.a.add(fju.a((int) (this.c.getDimensionPixelSize(R.dimen.watch_card_list_item_compact_thumbnail_width) / this.c.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1))));
                            if (i4 < arrayList.size() - 1) {
                                this.a.add(fju.a(this.c.getDimensionPixelSize(R.dimen.line_separator_height) + i5));
                            }
                        } else {
                            this.a.add(fju.a(((int) (this.c.getDimensionPixelSize(R.dimen.watch_card_list_item_thumbnail_width) / this.c.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1))) + i5));
                        }
                    } else {
                        this.a.add(fju.a(((int) (this.c.getDimensionPixelSize(R.dimen.list_item_thumbnail_width) / this.c.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1))) + i5));
                    }
                }
                int i6 = awdbVar.b;
                if ((i6 & 2) != 0 && (i6 & 4) != 0) {
                    ajsm ajsmVar = this.a;
                    arag aragVar = awdbVar.e;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    apzg apzgVar = awdbVar.d;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    ajsmVar.add(new kzq(aragVar, apzgVar));
                }
                int i7 = 0;
                while (i2 < arrayList.size()) {
                    this.b.postDelayed(new kyv(this, arrayList, i2, i7), i2 * 100);
                    if (d((awcz) arrayList.get(i2)) && i2 < arrayList.size() - 1) {
                        i7++;
                    }
                    i2++;
                    i7++;
                }
                this.h = kxcVar.a();
                aopc aopcVar = (aopc) this.d.mo52toBuilder();
                aopcVar.e(awco.b, Integer.valueOf(kxcVar.a()));
                awda awdaVar = (awda) aopcVar.mo39build();
                this.d = awdaVar;
                aopa mo52toBuilder = ((awdx) awdaVar.e.get(this.g)).mo52toBuilder();
                awdx awdxVar4 = (awdx) mo52toBuilder.instance;
                if (awdxVar4.b == 147633782) {
                    awduVar4 = (awdu) awdxVar4.c;
                } else {
                    awduVar4 = awdu.a;
                }
                aopc aopcVar2 = (aopc) awduVar4.mo52toBuilder();
                aopcVar2.e(awcp.b, Integer.valueOf(this.h));
                aopcVar2.e(awcp.c, true);
                awdu awduVar5 = (awdu) aopcVar2.mo39build();
                mo52toBuilder.copyOnWrite();
                awdx awdxVar5 = (awdx) mo52toBuilder.instance;
                awduVar5.getClass();
                awdxVar5.c = awduVar5;
                awdxVar5.b = 147633782;
                this.a.o(awduVar4, (awdu) awdxVar5.c);
                aopc aopcVar3 = (aopc) this.d.mo52toBuilder();
                aopcVar3.cx(this.g, mo52toBuilder);
                this.d = (awda) aopcVar3.mo39build();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{kxc.class};
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(defpackage.awdn r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyz.h(awdn):void");
    }
}

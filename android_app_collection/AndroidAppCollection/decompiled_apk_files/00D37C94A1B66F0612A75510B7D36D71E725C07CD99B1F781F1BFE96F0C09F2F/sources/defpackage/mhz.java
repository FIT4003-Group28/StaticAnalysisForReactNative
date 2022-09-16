package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: mhz  reason: default package */
/* loaded from: classes3.dex */
public final class mhz extends ajsl {
    public final Context a;
    public final aafo b;
    public final ajxz c;
    public final ggb d;
    public final yrj e;
    public aqel f;
    public boolean g;
    mhy h;
    mhy i;
    mhy j;
    public final fvf k;
    private final ajrx l;
    private final ajmy m;
    private final FrameLayout n;
    private final acuh o;
    private final ajrp p;
    private final aacz q;

    public mhz(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajxz ajxzVar, ggb ggbVar, aacz aaczVar, acuh acuhVar, yrj yrjVar, fvf fvfVar) {
        this.a = context;
        this.l = gemVar;
        this.b = aafoVar;
        this.c = ajxzVar;
        this.m = ajmyVar;
        this.d = ggbVar;
        this.q = aaczVar;
        this.o = acuhVar;
        ajrp ajrpVar = new ajrp(aafoVar, gemVar);
        this.p = ajrpVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setOnClickListener(ajrpVar);
        gemVar.c(frameLayout);
        this.e = yrjVar;
        this.k = fvfVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.l).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        apoj apojVar;
        aqel aqelVar = (aqel) obj;
        ajrp ajrpVar = this.p;
        acti actiVar = ajrsVar.a;
        if ((aqelVar.b & 16) != 0) {
            apzgVar = aqelVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        if (this.g) {
            return;
        }
        this.f = aqelVar;
        this.n.removeAllViews();
        int i = this.a.getResources().getConfiguration().orientation;
        boolean z = (aqelVar.b & 1024) != 0 && aqelVar.m;
        if (i == 2) {
            if (this.i == null) {
                this.i = new mhy(this, this.a, this.m, this.q, z);
            }
            this.j = this.i;
        } else {
            if (this.h == null) {
                this.h = new mhy(this, this.a, this.m, this.q, z);
            }
            this.j = this.h;
        }
        mhy mhyVar = this.j;
        acti actiVar2 = ajrsVar.a;
        TextView textView = mhyVar.e;
        arag aragVar = mhyVar.k.f.e;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = mhyVar.f;
        arag aragVar2 = mhyVar.k.f.f;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        mhz mhzVar = mhyVar.k;
        aqel aqelVar2 = mhzVar.f;
        int i2 = aqelVar2.c;
        if (i2 != 13) {
            mhyVar.b.h(mhyVar.d, i2 == 1 ? (avhn) aqelVar2.d : null);
        } else {
            ImageView imageView = mhyVar.d;
            ajxz ajxzVar = mhzVar.c;
            arhr b = arhr.b(((arhs) aqelVar2.d).c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(ajxzVar.a(b));
        }
        if ((mhyVar.k.f.b & 256) == 0) {
            mhyVar.h.setVisibility(8);
        } else {
            mhyVar.h.setVisibility(0);
        }
        apok apokVar = mhyVar.k.f.i;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((1 & apokVar.b) != 0) {
            apok apokVar2 = mhyVar.k.f.i;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag", mhyVar.k.f);
        mhyVar.i.a(apojVar, actiVar2, hashMap);
        if (mhyVar.i.h) {
            mhyVar.g.setPadding(0, 0, 0, 0);
        } else {
            TextView textView3 = mhyVar.g;
            int i3 = mhyVar.c;
            textView3.setPadding(i3, 0, i3, 0);
        }
        if (zew.y(mhyVar.k.a) && eog.aJ(mhyVar.l)) {
            mhyVar.j.e(false);
        }
        mhyVar.a.setBackground(mhyVar.j);
        this.n.addView(this.j.a);
        if (!this.o.b(aqelVar)) {
            this.o.a(aqelVar);
            aafo aafoVar = this.b;
            apzg apzgVar2 = this.f.h;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar.c(apzgVar2, null);
        }
        this.l.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqel) obj).n.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.p.c();
    }
}

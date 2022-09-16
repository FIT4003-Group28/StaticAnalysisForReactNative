package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: msk  reason: default package */
/* loaded from: classes3.dex */
public final class msk implements ajru, lmt {
    protected final Context a;
    public final ajmy b;
    public final aafo c;
    public final ajyc d;
    public final ajxz e;
    public final snc f;
    public final fms g;
    public final akbk h;
    public final lmu i;
    public final jkv j;
    public final ftb k;
    public final kua l;
    public final akem m;
    public aplx n;
    public itx o;
    private final FrameLayout p;
    private msi q;
    private msi r;
    private msi s;
    private msi t;
    private msi u;

    public msk(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar, fms fmsVar, akbk akbkVar, snc sncVar, lmu lmuVar, jkv jkvVar, ftb ftbVar, kua kuaVar, akem akemVar) {
        this.a = context;
        this.b = ajmyVar;
        this.c = aafoVar;
        this.d = ajycVar;
        this.e = ajxzVar;
        this.g = fmsVar;
        this.h = akbkVar;
        this.f = sncVar;
        this.i = lmuVar;
        this.j = jkvVar;
        this.k = ftbVar;
        this.l = kuaVar;
        this.m = akemVar;
        lmuVar.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.p = frameLayout;
        frameLayout.setBackgroundDrawable(new frf(zhn.j(context, R.attr.ytSeparator).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public static apmi f(awar awarVar) {
        apmg apmgVar = awarVar.r;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 2) != 0) {
            apmg apmgVar2 = awarVar.r;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmi apmiVar = apmgVar2.d;
            return apmiVar == null ? apmi.a : apmiVar;
        }
        return null;
    }

    public static apzg g(awar awarVar) {
        apuq apuqVar;
        if (awarVar.c == 33) {
            apuqVar = (apuq) awarVar.d;
        } else {
            apuqVar = apuq.a;
        }
        apur apurVar = apuqVar.c;
        if (apurVar == null) {
            apurVar = apur.a;
        }
        if ((apurVar.b & 2) != 0) {
            apur apurVar2 = apuqVar.c;
            if (apurVar2 == null) {
                apurVar2 = apur.a;
            }
            apzg apzgVar = apurVar2.d;
            return apzgVar == null ? apzg.a : apzgVar;
        }
        return null;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.p;
    }

    @Override // defpackage.lmt
    public final fjz d() {
        msi msiVar = this.u;
        if (msiVar == null) {
            return null;
        }
        return msiVar.e.r;
    }

    @Override // defpackage.lmt
    public final aplx e() {
        return this.n;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        itx itxVar = (itx) obj;
        if (itxVar.d() != null) {
            ajrsVar.a.u(new acte(itxVar.d()), null);
        }
        aopc aopcVar = (aopc) itxVar.a.mo52toBuilder();
        if (!aopcVar.qn(aqxw.b)) {
            aopcVar.e(aqxw.b, aqxw.a);
        }
        if (!((aqxw) aopcVar.qm(aqxw.b)).d) {
            aopa mo52toBuilder = ((aqxw) aopcVar.qm(aqxw.b)).mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            aqxw aqxwVar = (aqxw) mo52toBuilder.instance;
            aqxwVar.c |= 1;
            aqxwVar.d = true;
            aopcVar.e(aqxw.b, (aqxw) mo52toBuilder.mo39build());
            aafx.c(this.c, Collections.unmodifiableList(((aqya) aopcVar.instance).i), itxVar);
        }
        itxVar.c((aqya) aopcVar.mo39build());
        this.o = itxVar;
        this.p.removeAllViews();
        if (this.a.getResources().getConfiguration().orientation != 1) {
            if (this.r == null) {
                this.r = new msi(this, R.layout.video_feed_entry);
            }
            this.u = this.r;
        } else if (itxVar.e() == 4 && !zew.y(this.a)) {
            if (this.s == null) {
                this.s = new msg(this);
            }
            this.u = this.s;
        } else if (itxVar.e() != 6 || zew.y(this.a)) {
            if (this.q == null) {
                this.q = new msi(this, R.layout.video_feed_entry);
            }
            this.u = this.q;
        } else {
            if (this.t == null) {
                this.t = new msi(this, R.layout.video_feed_entry_full_bleed);
            }
            this.u = this.t;
        }
        this.u.a(ajrsVar);
        this.p.addView(this.u.d);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}

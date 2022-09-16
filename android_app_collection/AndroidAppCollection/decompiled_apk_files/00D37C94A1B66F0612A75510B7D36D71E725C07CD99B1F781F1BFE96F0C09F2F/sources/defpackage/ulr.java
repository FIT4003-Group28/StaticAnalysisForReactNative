package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ulr  reason: default package */
/* loaded from: classes4.dex */
public final class ulr extends xo {
    public Object d;
    public amuk e;
    public final zgd g;
    private final Context h;
    private final ujx i;
    private final ampq j;
    private final uky k;
    private final s l;
    private final upq m;
    private final ampq n;
    private final boolean o;
    private final ulk p;
    private final int r;
    private final wpn t;
    private final List q = new ArrayList();
    private final uuo u = new ulo(this);
    public amuk f = amuk.q();
    private final u s = new u() { // from class: ull
        @Override // defpackage.u
        public final void a(Object obj) {
            ulr ulrVar = ulr.this;
            amuk amukVar = (amuk) obj;
            uwp.f();
            qo a = qr.a(new ulp(ulrVar, amukVar));
            ulrVar.f = amukVar;
            a.a(ulrVar);
        }
    };

    public ulr(Context context, ult ultVar, s sVar, unl unlVar, aoul aoulVar, upq upqVar, int i, ampq ampqVar, ampq ampqVar2) {
        context.getClass();
        this.h = context;
        ujx ujxVar = ultVar.a;
        ujxVar.getClass();
        this.i = ujxVar;
        zgd zgdVar = ultVar.f;
        zgdVar.getClass();
        this.g = zgdVar;
        uky ukyVar = ultVar.b;
        ukyVar.getClass();
        this.k = ukyVar;
        this.j = ampqVar;
        ultVar.c.getClass();
        this.o = ultVar.d;
        this.l = sVar;
        this.m = upqVar;
        this.n = ampqVar2;
        uox uoxVar = ultVar.e;
        uoxVar.getClass();
        aoulVar.getClass();
        this.p = new ulk(ukyVar, uoxVar, aoulVar, upqVar, unlVar);
        this.t = new wpn(context);
        this.r = i;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.q.size() + this.f.size();
    }

    @Override // defpackage.xo
    public final int c(int i) {
        return i < this.q.size() ? 0 : 1;
    }

    @Override // defpackage.xo
    public final yo f(ViewGroup viewGroup, int i) {
        if (i == 0) {
            AccountParticle accountParticle = (AccountParticle) LayoutInflater.from(new ContextThemeWrapper(viewGroup.getContext(), 2132083262)).inflate(R.layout.account_list_item, viewGroup, false);
            lj.Y(accountParticle, lj.i(accountParticle) + accountParticle.getResources().getDimensionPixelSize(R.dimen.account_particle_avatar_margin_start) + this.r, accountParticle.getPaddingTop(), lj.h(accountParticle) + this.r, accountParticle.getPaddingBottom());
            return new uli(accountParticle, this.g, this.i, this.j, this.o, this.n, null, null, null);
        }
        Context context = this.h;
        upq upqVar = this.m;
        wpn wpnVar = this.t;
        umg umgVar = new umg(context, upqVar, viewGroup, new umf(wpnVar.a(uml.COLOR_ON_SURFACE), wpnVar.a(uml.TEXT_PRIMARY), wpnVar.a(uml.COLOR_PRIMARY_GOOGLE), wpnVar.a(uml.COLOR_ON_PRIMARY_GOOGLE)));
        int i2 = this.r;
        View view = umgVar.a;
        lj.Y(view, lj.i(view) + i2, umgVar.a.getPaddingTop(), lj.h(umgVar.a) + i2, umgVar.a.getPaddingBottom());
        return umgVar;
    }

    @Override // defpackage.xo
    public final void o(yo yoVar, int i) {
        if (yoVar instanceof uli) {
            uli uliVar = (uli) yoVar;
            final ulk ulkVar = this.p;
            final Object obj = this.q.get(i);
            upq upqVar = ulkVar.e;
            AccountParticle accountParticle = uliVar.t;
            accountParticle.m = true;
            accountParticle.a(upqVar);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ulj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ulk ulkVar2 = ulk.this;
                    Object obj2 = obj;
                    ulkVar2.b.a(ulkVar2.a.a(), ulkVar2.c);
                    ulkVar2.e.d(tmd.a(), view);
                    unl unlVar = ulkVar2.f;
                    ExpressSignInLayout expressSignInLayout = unlVar.a;
                    unlVar.b.b.g(obj2);
                    expressSignInLayout.post(new unc(expressSignInLayout, 1));
                    ulkVar2.b.a(ulkVar2.a.a(), ulkVar2.d);
                }
            };
            uliVar.t.i.a(obj);
            ampq ampqVar = uliVar.u;
            uliVar.E();
            ampq ampqVar2 = uliVar.v;
            uliVar.a.setOnClickListener(onClickListener);
            AccountParticle accountParticle2 = (AccountParticle) uliVar.a;
            accountParticle2.k.setAlpha(1.0f);
            accountParticle2.l.setAlpha(1.0f);
            AccountParticleDisc accountParticleDisc = accountParticle2.j;
            accountParticleDisc.setAlpha(1.0f);
            accountParticleDisc.a.setColorFilter((ColorFilter) null);
            accountParticle2.findViewById(R.id.og_account_deactivated_help_tooltip).setVisibility(8);
        } else if (!(yoVar instanceof umg)) {
        } else {
            final umg umgVar = (umg) yoVar;
            final umd umdVar = (umd) this.f.get(i - this.q.size());
            umgVar.x.a = ampq.j(Integer.valueOf(umdVar.c));
            umgVar.x.a(umgVar.w);
            umgVar.t.setImageDrawable(udy.a(umdVar.a, umgVar.v));
            umgVar.u.setText(umdVar.b);
            umgVar.a.setOnClickListener(new View.OnClickListener() { // from class: ume
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    umg umgVar2 = umg.this;
                    umd umdVar2 = umdVar;
                    umgVar2.w.d(tmd.a(), view);
                    umdVar2.d.onClick(view);
                }
            });
        }
    }

    @Override // defpackage.xo
    public final void p(yo yoVar) {
        if (yoVar instanceof uli) {
            uli uliVar = (uli) yoVar;
            uliVar.t.b(this.p.e);
            uliVar.t.m = false;
        } else if (!(yoVar instanceof umg)) {
        } else {
            umg umgVar = (umg) yoVar;
            umgVar.x.b(umgVar.w);
            umgVar.x.a = amon.a;
        }
    }

    @Override // defpackage.xo
    public final void r() {
        this.k.b(this.u);
        this.d = this.k.a();
        this.e = amuk.o(((uld) this.k).d());
        this.l.f(this.s);
        w();
    }

    @Override // defpackage.xo
    public final void t() {
        this.l.j(this.s);
        this.k.c(this.u);
        this.q.clear();
    }

    public final void w() {
        uwp.f();
        ArrayList arrayList = new ArrayList(this.q);
        ArrayList arrayList2 = new ArrayList(this.e);
        Object obj = this.d;
        if (obj != null) {
            arrayList2.remove(obj);
        }
        qo a = qr.a(new ulq(arrayList, arrayList2));
        this.q.clear();
        this.q.addAll(arrayList2);
        a.a(this);
    }
}

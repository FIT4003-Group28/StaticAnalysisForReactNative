package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: xli  reason: default package */
/* loaded from: classes4.dex */
public final class xli {
    public final Context a;
    public final aafo b;
    public final yrj c;
    public final xyc d;
    public final aagi e;
    public final afvn f;
    public final ajvj g;
    public final akck h;
    public xlj i;
    public DialogInterface.OnCancelListener j;
    public DialogInterface.OnCancelListener k;
    public String l;
    public xwd m;
    public final emm n;
    private final Activity o;
    private final ajmr p;
    private final ajxz q;
    private final yzj r;
    private final yzv s;
    private final xnq t;
    private final xmw u;
    private final akbv v;
    private aypg w;
    private final aacz x;

    public xli(Activity activity, Context context, ajmr ajmrVar, aafo aafoVar, ajxz ajxzVar, yzj yzjVar, yrj yrjVar, yzv yzvVar, emm emmVar, xyc xycVar, xnq xnqVar, xmw xmwVar, akce akceVar, akbx akbxVar, akck akckVar, aacz aaczVar, aagi aagiVar, afvn afvnVar, ajvj ajvjVar) {
        this.o = activity;
        context.getClass();
        this.a = context;
        ajmrVar.getClass();
        this.p = ajmrVar;
        aafoVar.getClass();
        this.b = aafoVar;
        this.q = ajxzVar;
        yzjVar.getClass();
        this.r = yzjVar;
        this.c = yrjVar;
        this.s = yzvVar;
        this.n = emmVar;
        this.d = xycVar;
        this.t = xnqVar;
        this.u = xmwVar;
        this.x = aaczVar;
        aagiVar.getClass();
        this.e = aagiVar;
        this.f = afvnVar;
        ajvjVar.getClass();
        this.g = ajvjVar;
        akckVar.getClass();
        this.v = akbxVar.a(new abki(akceVar, 1));
        this.h = akckVar;
        akckVar.f = new xkw(this);
    }

    public static final CharSequence p(aqav aqavVar) {
        aufe aufeVar;
        aplq aplqVar = aqavVar.B;
        if (aplqVar == null) {
            aplqVar = aplq.a;
        }
        arag aragVar = null;
        if (aplqVar.b == 99391126) {
            aplq aplqVar2 = aqavVar.B;
            if (aplqVar2 == null) {
                aplqVar2 = aplq.a;
            }
            if (aplqVar2.b == 99391126) {
                aufeVar = (aufe) aplqVar2.c;
            } else {
                aufeVar = aufe.a;
            }
            for (aufc aufcVar : aufeVar.f) {
                if (aufcVar.d) {
                    if ((aufcVar.b & 1) != 0 && (aragVar = aufcVar.c) == null) {
                        aragVar = arag.a;
                    }
                    return ajgl.b(aragVar);
                }
            }
            return null;
        }
        return null;
    }

    public final acti a() {
        Activity activity = this.o;
        if (activity instanceof acth) {
            return ((acth) activity).oi();
        }
        return null;
    }

    public final apoj b(apoj apojVar) {
        acti a = a();
        if (a != null) {
            aopa createBuilder = auqr.a.createBuilder();
            String k = a.k();
            createBuilder.copyOnWrite();
            auqr auqrVar = (auqr) createBuilder.instance;
            k.getClass();
            auqrVar.b |= 1;
            auqrVar.c = k;
            auqr auqrVar2 = (auqr) createBuilder.mo39build();
            aopc aopcVar = (aopc) apojVar.mo52toBuilder();
            apzg apzgVar = apojVar.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aopc aopcVar2 = (aopc) apzgVar.mo52toBuilder();
            aopcVar2.e(auqs.b, auqrVar2);
            aopcVar.copyOnWrite();
            apoj apojVar2 = (apoj) aopcVar.instance;
            apzg apzgVar2 = (apzg) aopcVar2.mo39build();
            apzgVar2.getClass();
            apojVar2.n = apzgVar2;
            apojVar2.b |= 8192;
            return (apoj) aopcVar.mo39build();
        }
        return apojVar;
    }

    public final aqbc c(aqbc aqbcVar) {
        if (a() != null) {
            apok apokVar = aqbcVar.f;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            aopa mo52toBuilder = apokVar.mo52toBuilder();
            apok apokVar2 = aqbcVar.f;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            apoj b = b(apojVar);
            mo52toBuilder.copyOnWrite();
            apok apokVar3 = (apok) mo52toBuilder.instance;
            b.getClass();
            apokVar3.c = b;
            apokVar3.b |= 1;
            apok apokVar4 = (apok) mo52toBuilder.mo39build();
            aopa mo52toBuilder2 = aqbcVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            aqbc aqbcVar2 = (aqbc) mo52toBuilder2.instance;
            apokVar4.getClass();
            aqbcVar2.f = apokVar4;
            aqbcVar2.b |= 32;
            return (aqbc) mo52toBuilder2.mo39build();
        }
        return aqbcVar;
    }

    public final void d(CharSequence charSequence, ampq ampqVar, int i, final xlp xlpVar, final ajyj ajyjVar, final xwd xwdVar, final Long l, boolean z, final boolean z2) {
        final boolean z3;
        if (xwdVar.k()) {
            z3 = z;
        } else if (!z || xwdVar.m()) {
            if (z2) {
                this.h.w();
            }
            if (this.l == null) {
                return;
            }
            xxs.g(this.e.a(this.f.c()), this.l, false);
            return;
        } else {
            z3 = true;
        }
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this.a).setMessage(charSequence).setNegativeButton(R.string.comments_discard_negative_button, new DialogInterface.OnClickListener() { // from class: xle
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                xli xliVar = xli.this;
                xlp xlpVar2 = xlpVar;
                ajyj ajyjVar2 = ajyjVar;
                xwd xwdVar2 = xwdVar;
                Long l2 = l;
                boolean z4 = z3;
                dialogInterface.dismiss();
                xliVar.e(xlpVar2, ajyjVar2, xwdVar2.a(), l2, true, z4);
            }
        }).setPositiveButton(i, new DialogInterface.OnClickListener() { // from class: xlf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                xli xliVar = xli.this;
                boolean z4 = z2;
                dialogInterface.dismiss();
                if (z4) {
                    xliVar.h.w();
                }
                if (xliVar.l != null) {
                    xxs.g(xliVar.e.a(xliVar.f.c()), xliVar.l, false);
                }
            }
        }).setCancelable(false);
        if (ampqVar.h()) {
            cancelable.setTitle((CharSequence) ampqVar.c());
        }
        AlertDialog create = cancelable.create();
        create.setOnShowListener(new xlh(this, 1));
        create.setOnDismissListener(new xlg(this, 2));
        create.show();
        ((Button) create.findViewById(16908313)).setTextColor(zhn.j(this.a, R.attr.ytCallToAction).orElse(0));
        ((Button) create.findViewById(16908314)).setTextColor(zhn.j(this.a, R.attr.ytCallToAction).orElse(0));
    }

    public final void e(final xlp xlpVar, ajyj ajyjVar, CharSequence charSequence, Long l, final boolean z, boolean z2) {
        boolean z3;
        if (z || this.c.o()) {
            apzt apztVar = this.x.b().z;
            if (apztVar == null) {
                apztVar = apzt.a;
            }
            if (!apztVar.e) {
                final xvr xvrVar = new xvr(this.a, this.o, this.p, this.v, this.q, xlpVar.i, xlpVar.j, this.x, this.g);
                this.m = xvrVar;
                xvrVar.d(charSequence, z);
                new ajnj(xvrVar.d, new yyj(), xvrVar.s ? xvrVar.p : xvrVar.o, false).k(xlpVar.a);
                Spanned spanned = xlpVar.e;
                if (!TextUtils.isEmpty(spanned)) {
                    xvrVar.f.setHint(spanned);
                }
                awlh awlhVar = xlpVar.f;
                if (awlhVar != null) {
                    arag aragVar = awlhVar.b;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    Spanned b = ajgl.b(aragVar);
                    xvrVar.j.setText(b);
                    zag.o(xvrVar.j, !TextUtils.isEmpty(b));
                    arag aragVar2 = xlpVar.f.c;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    Spanned a = aafv.a(aragVar2, this.b, false);
                    xvrVar.m.setText(a);
                    zag.o(xvrVar.n, !TextUtils.isEmpty(a));
                    zag.o(xvrVar.m, !TextUtils.isEmpty(a));
                } else {
                    Spanned spanned2 = xlpVar.d;
                    if (spanned2 != null) {
                        xvrVar.k.setText(spanned2);
                        zag.o(xvrVar.k, !TextUtils.isEmpty(spanned2));
                        zag.o(xvrVar.l, !TextUtils.isEmpty(spanned2));
                    }
                }
                this.j = new xky(this, xlpVar, ajyjVar, xvrVar, l, z2, 1);
                this.k = new xky(this, xlpVar, ajyjVar, xvrVar, l, z2);
                xvrVar.e(this.j);
                xvrVar.y = new xkr(this, xvrVar, xlpVar, ajyjVar, l, z2);
                apoj apojVar = xlpVar.h;
                if (apojVar != null) {
                    int i = apojVar.b;
                    if ((i & 32) != 0 && (i & 16384) != 0) {
                        ajxz ajxzVar = this.q;
                        arhs arhsVar = apojVar.g;
                        if (arhsVar == null) {
                            arhsVar = arhs.a;
                        }
                        arhr b2 = arhr.b(arhsVar.c);
                        if (b2 == null) {
                            b2 = arhr.UNKNOWN;
                        }
                        int a2 = ajxzVar.a(b2);
                        xvrVar.u = new Runnable() { // from class: xla
                            @Override // java.lang.Runnable
                            public final void run() {
                                xli.this.i(xlpVar, xvrVar);
                            }
                        };
                        xvrVar.r.setVisibility(0);
                        xvrVar.q.setVisibility(0);
                        xvrVar.q.setImageResource(a2);
                    }
                }
                apzt apztVar2 = this.x.b().z;
                if (apztVar2 == null) {
                    apztVar2 = apzt.a;
                }
                if (!apztVar2.d || this.n.d() == null) {
                    z3 = true;
                } else {
                    boolean booleanValue = this.n.c().booleanValue();
                    xvrVar.v = new Runnable() { // from class: xlc
                        @Override // java.lang.Runnable
                        public final void run() {
                            xli xliVar = xli.this;
                            xvr xvrVar2 = xvrVar;
                            if (!xliVar.n.c().booleanValue()) {
                                bahu b3 = bahu.b(xliVar.n.d().longValue());
                                bahu c = bahu.c((b3.b + 500) / 1000);
                                int i2 = b3.a() > 0 ? 2 : 1;
                                balp balpVar = new balp();
                                balpVar.e();
                                balpVar.i(":");
                                balpVar.h();
                                balpVar.a = i2;
                                balpVar.f();
                                balpVar.i(":");
                                balpVar.h();
                                balpVar.a = 2;
                                balpVar.g();
                                xvrVar2.f.append(String.valueOf(balpVar.a().a(c.e())).concat(" "));
                            }
                        }
                    };
                    if (xvrVar.i.getVisibility() == 4) {
                        xvrVar.i.setVisibility(8);
                    }
                    xvrVar.h.setVisibility(0);
                    xvrVar.h.setEnabled(!booleanValue);
                    Drawable l2 = iy.l(po.b(xvrVar.b, R.drawable.ic_timestamp));
                    z3 = true;
                    l2.setTint(zhn.j(xvrVar.b, true != booleanValue ? R.attr.ytTextSecondary : R.attr.ytTextDisabled).orElse(0));
                    xvrVar.h.setImageDrawable(l2);
                    zag.l(xvrVar.h, null, 1);
                }
                xvrVar.a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xkq
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        acti a3;
                        xli xliVar = xli.this;
                        xlp xlpVar2 = xlpVar;
                        boolean z4 = z;
                        if (xlpVar2.f != null && !z4 && (a3 = xliVar.a()) != null) {
                            a3.n(new acte(xlpVar2.f.d));
                        }
                        xliVar.k();
                    }
                });
                int i2 = z3 ? 1 : 0;
                int i3 = z3 ? 1 : 0;
                xvrVar.a.setOnDismissListener(new xlg(this, i2));
                if (z2) {
                    xvrVar.x = z3;
                    xvrVar.c(z3);
                }
                if (!xvrVar.a.isShowing() && !xvrVar.c.isDestroyed() && !xvrVar.c.isFinishing()) {
                    xvrVar.a.show();
                    Window window = xvrVar.a.getWindow();
                    if (xvrVar.s) {
                        ((View) window.findViewById(16908331).getParent()).setMinimumHeight(0);
                    }
                    window.setLayout(-1, -2);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.gravity = 80;
                    window.setAttributes(attributes);
                    window.setBackgroundDrawable(xvrVar.t);
                    window.setSoftInputMode(5);
                    xvrVar.f.requestFocus();
                }
            } else {
                avhn avhnVar = xlpVar.a;
                arag aragVar3 = xlpVar.l;
                arag aragVar4 = xlpVar.m;
                awlh awlhVar2 = xlpVar.f;
                apoj apojVar2 = xlpVar.h;
                apoj apojVar3 = xlpVar.i;
                aqus aqusVar = xlpVar.j;
                aqak aqakVar = xlpVar.n;
                aqbc aqbcVar = xlpVar.o;
                final xwb xwbVar = new xwb();
                Bundle bundle = new Bundle();
                aphq.m(bundle, "profile_photo", avhnVar);
                if (aragVar3 != null) {
                    aphq.m(bundle, "caption", aragVar3);
                }
                if (aragVar4 != null) {
                    aphq.m(bundle, "hint", aragVar4);
                }
                if (awlhVar2 != null) {
                    aphq.m(bundle, "zero_step", awlhVar2);
                }
                if (apojVar2 != null) {
                    aphq.m(bundle, "camera_button", apojVar2);
                }
                if (apojVar3 != null) {
                    aphq.m(bundle, "emoji_picker_button", apojVar3);
                }
                if (aqusVar != null) {
                    aphq.m(bundle, "emoji_picker_renderer", aqusVar);
                }
                if (aqakVar != null) {
                    aphq.m(bundle, "comment_dialog_renderer", aqakVar);
                }
                if (aqbcVar != null) {
                    aphq.m(bundle, "reply_dialog_renderer", aqbcVar);
                }
                if (charSequence != null) {
                    bundle.putCharSequence("comment_text", charSequence);
                }
                bundle.putBoolean("retry", z);
                xwbVar.ae(bundle);
                this.m = xwbVar;
                if (z2) {
                    xwbVar.aB = true;
                    xwbVar.aE(true);
                }
                this.j = new xld(this, xlpVar, ajyjVar, xwbVar, l, z2, 1);
                this.k = new xld(this, xlpVar, ajyjVar, xwbVar, l, z2);
                xwbVar.ax = this.j;
                xwbVar.aH = new xks(this, xwbVar, xlpVar, ajyjVar, l, z2);
                xwbVar.au = new Runnable() { // from class: xlb
                    @Override // java.lang.Runnable
                    public final void run() {
                        xli.this.i(xlpVar, xwbVar);
                    }
                };
                xwbVar.ay = new xlh(this);
                xwbVar.aw = new xlg(this);
                eo supportFragmentManager = ((dt) this.o).getSupportFragmentManager();
                dp f = supportFragmentManager.f("comment_dialog_fragment");
                if (f != null) {
                    ((xwc) f).dismiss();
                }
                if (!xwbVar.ap() && !supportFragmentManager.Z()) {
                    xwbVar.qw(supportFragmentManager, "comment_dialog_fragment");
                }
            }
            aagh a3 = this.e.a(this.f.c());
            if (!TextUtils.isEmpty(xlpVar.k)) {
                aypg aypgVar = this.w;
                if (aypgVar != null && !aypgVar.e()) {
                    ayqi.c((AtomicReference) this.w);
                }
                this.w = null;
                this.w = a3.h(xlpVar.k, false).X(aypa.a()).as(new xkz(this, 1));
                a3.f(xlpVar.k).g(aqai.class).o(new xkz(this)).m(new xkz(this, 2)).l(new aypv() { // from class: xkx
                    @Override // defpackage.aypv
                    public final void a() {
                        xli.this.g.g(null);
                    }
                }).S();
                return;
            }
            this.g.g(null);
            return;
        }
        this.s.b();
    }

    public final void h(aqbc aqbcVar, xmd xmdVar, aqav aqavVar, boolean z) {
        arag aragVar;
        arag aragVar2;
        apoj apojVar;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        if ((aqbcVar.b & 32) == 0) {
            zep.b("No reply button specified for comment reply dialog.");
            return;
        }
        apok apokVar = aqbcVar.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) == 0) {
            zep.b("No button renderer specified for comment reply dialog.");
            return;
        }
        apok apokVar2 = aqbcVar.f;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar2 = apokVar2.c;
        if (apojVar2 == null) {
            apojVar2 = apoj.a;
        }
        if ((apojVar2.b & 8192) == 0) {
            zep.b("No service endpoint specified for comment reply dialog.");
            return;
        }
        aqbc c = c(aqbcVar);
        avhn avhnVar = c.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        avhn avhnVar2 = avhnVar;
        arag aragVar6 = null;
        if ((c.b & 4096) != 0) {
            aragVar = c.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((c.b & 16) != 0) {
            aragVar2 = c.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        apok apokVar3 = c.f;
        if (apokVar3 == null) {
            apokVar3 = apok.a;
        }
        apoj apojVar3 = apokVar3.c;
        if (apojVar3 == null) {
            apojVar3 = apoj.a;
        }
        apzg apzgVar = apojVar3.n;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        apzg apzgVar2 = apzgVar;
        if ((c.b & 128) != 0) {
            apok apokVar4 = c.g;
            if (apokVar4 == null) {
                apokVar4 = apok.a;
            }
            apoj apojVar4 = apokVar4.c;
            if (apojVar4 == null) {
                apojVar4 = apoj.a;
            }
            apojVar = apojVar4;
        } else {
            apojVar = null;
        }
        apok apokVar5 = c.i;
        if (apokVar5 == null) {
            apokVar5 = apok.a;
        }
        apoj apojVar5 = apokVar5.c;
        if (apojVar5 == null) {
            apojVar5 = apoj.a;
        }
        apoj apojVar6 = apojVar5;
        aunb aunbVar = c.j;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aunb aunbVar2 = aunbVar;
        String str = c.k;
        if ((c.b & 4096) != 0) {
            arag aragVar7 = c.h;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
            aragVar3 = aragVar7;
        } else {
            aragVar3 = null;
        }
        if ((c.b & 16) != 0) {
            arag aragVar8 = c.e;
            if (aragVar8 == null) {
                aragVar8 = arag.a;
            }
            aragVar4 = aragVar8;
        } else {
            aragVar4 = null;
        }
        xlp xlpVar = new xlp(1, avhnVar2, xmdVar, aqavVar, b, b2, null, apzgVar2, apojVar, apojVar6, aunbVar2, str, aragVar3, aragVar4, null, c);
        if ((c.b & 8) != 0) {
            aragVar5 = c.d;
            if (aragVar5 == null) {
                aragVar6 = arag.a;
            }
            e(xlpVar, null, aafv.a(aragVar5, this.b, false), null, false, z);
        }
        aragVar5 = aragVar6;
        e(xlpVar, null, aafv.a(aragVar5, this.b, false), null, false, z);
    }

    public final void j() {
        xlj xljVar = this.i;
        if (xljVar != null) {
            xljVar.a();
        }
    }

    public final void k() {
        xlj xljVar = this.i;
        if (xljVar != null) {
            xljVar.b();
        }
    }

    public final void l(final String str, final ajyj ajyjVar, final xlp xlpVar, final xwd xwdVar, final Long l) {
        if (xlpVar.g != null) {
            zdt zdtVar = new zdt() { // from class: xkv
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    xli.this.n(xwdVar, (cff) obj, xlpVar, ajyjVar, str, l);
                }
            };
            xmw xmwVar = this.u;
            Activity activity = (Activity) xmwVar.a.get();
            activity.getClass();
            xko xkoVar = (xko) xmwVar.b.get();
            xkoVar.getClass();
            xxx xxxVar = (xxx) xmwVar.c.get();
            xxxVar.getClass();
            xna xnaVar = (xna) xmwVar.d.get();
            xnaVar.getClass();
            xkb xkbVar = (xkb) xmwVar.e.get();
            xkbVar.getClass();
            xwdVar.getClass();
            str.getClass();
            xmv xmvVar = new xmv(activity, xkoVar, xxxVar, xnaVar, xkbVar, (ajin) xmwVar.f.get(), ajyjVar, xlpVar, xwdVar, str, l, zdtVar);
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xmvVar);
            this.b.c(xlpVar.g, hashMap);
            return;
        }
        zag.q(this.a, R.string.error_comment_failed, 1);
        xwdVar.dismiss();
    }

    public final void m(final ajyj ajyjVar, final String str, final xlp xlpVar, final xwd xwdVar) {
        if (xlpVar.g != null) {
            zdt zdtVar = new zdt() { // from class: xku
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    xli.this.n(xwdVar, (cff) obj, xlpVar, ajyjVar, str, null);
                }
            };
            xnq xnqVar = this.t;
            aafo aafoVar = this.b;
            Activity activity = (Activity) xnqVar.a.get();
            activity.getClass();
            xko xkoVar = (xko) xnqVar.b.get();
            xkoVar.getClass();
            xwdVar.getClass();
            str.getClass();
            xnp xnpVar = new xnp(activity, xkoVar, ajyjVar, xlpVar, xwdVar, str, zdtVar, aafoVar);
            afw afwVar = new afw();
            afwVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xnpVar);
            this.b.c(xlpVar.g, afwVar);
            return;
        }
        zag.q(this.a, R.string.error_comment_failed, 1);
        xwdVar.dismiss();
    }

    public final void n(xwd xwdVar, cff cffVar, xlp xlpVar, ajyj ajyjVar, CharSequence charSequence, Long l) {
        xwdVar.dismiss();
        if (cffVar != null) {
            this.r.e(cffVar);
        } else {
            zag.q(this.a, R.string.error_comment_failed, 1);
        }
        e(xlpVar, ajyjVar, charSequence, l, true, false);
    }

    public final void o(aqbc aqbcVar, xmd xmdVar, aqav aqavVar, boolean z) {
        arag aragVar;
        arag aragVar2;
        apoj apojVar;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        if ((aqbcVar.b & 32) == 0) {
            zep.b("No reply button specified for comment dialog.");
            return;
        }
        apok apokVar = aqbcVar.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) == 0) {
            zep.b("No button renderer specified for comment dialog.");
            return;
        }
        apok apokVar2 = aqbcVar.f;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar2 = apokVar2.c;
        if (apojVar2 == null) {
            apojVar2 = apoj.a;
        }
        if ((apojVar2.b & 8192) == 0) {
            zep.b("No service endpoint specified for comment dialog.");
            return;
        }
        aqbc c = c(aqbcVar);
        avhn avhnVar = c.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        avhn avhnVar2 = avhnVar;
        arag aragVar6 = null;
        if ((c.b & 4096) != 0) {
            aragVar = c.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((c.b & 16) != 0) {
            aragVar2 = c.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        apok apokVar3 = c.f;
        if (apokVar3 == null) {
            apokVar3 = apok.a;
        }
        apoj apojVar3 = apokVar3.c;
        if (apojVar3 == null) {
            apojVar3 = apoj.a;
        }
        apzg apzgVar = apojVar3.n;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        apzg apzgVar2 = apzgVar;
        if ((c.b & 128) != 0) {
            apok apokVar4 = c.g;
            if (apokVar4 == null) {
                apokVar4 = apok.a;
            }
            apoj apojVar4 = apokVar4.c;
            if (apojVar4 == null) {
                apojVar4 = apoj.a;
            }
            apojVar = apojVar4;
        } else {
            apojVar = null;
        }
        apok apokVar5 = c.i;
        if (apokVar5 == null) {
            apokVar5 = apok.a;
        }
        apoj apojVar5 = apokVar5.c;
        if (apojVar5 == null) {
            apojVar5 = apoj.a;
        }
        apoj apojVar6 = apojVar5;
        aunb aunbVar = c.j;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aunb aunbVar2 = aunbVar;
        String str = c.k;
        if ((c.b & 4096) != 0) {
            arag aragVar7 = c.h;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
            aragVar3 = aragVar7;
        } else {
            aragVar3 = null;
        }
        if ((c.b & 16) != 0) {
            arag aragVar8 = c.e;
            if (aragVar8 == null) {
                aragVar8 = arag.a;
            }
            aragVar4 = aragVar8;
        } else {
            aragVar4 = null;
        }
        xlp xlpVar = new xlp(2, avhnVar2, xmdVar, aqavVar, b, b2, null, apzgVar2, apojVar, apojVar6, aunbVar2, str, aragVar3, aragVar4, null, c);
        if ((c.b & 8) != 0) {
            aragVar5 = c.d;
            if (aragVar5 == null) {
                aragVar6 = arag.a;
            }
            e(xlpVar, null, aafv.a(aragVar5, this.b, false), null, false, z);
        }
        aragVar5 = aragVar6;
        e(xlpVar, null, aafv.a(aragVar5, this.b, false), null, false, z);
    }

    public final void i(xlp xlpVar, xwd xwdVar) {
        apzg apzgVar;
        apoj apojVar = xlpVar.h;
        if (apojVar == null) {
            apzgVar = null;
        } else {
            apzgVar = apojVar.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        }
        if (apzgVar != null) {
            xkt xktVar = xkt.a;
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xktVar);
            this.b.c(apzgVar, hashMap);
            return;
        }
        zag.q(this.a, R.string.error_video_attachment_failed, 1);
        xwdVar.dismiss();
    }

    public final void g(aqca aqcaVar, xmd xmdVar) {
        arag aragVar;
        apoj apojVar;
        arag aragVar2 = null;
        if ((aqcaVar.b & 32) == 0) {
            if (!this.d.c(aqcaVar)) {
                zep.b("No button renderer specified for comment detail simplebox.");
                return;
            } else if ((this.d.a(aqcaVar).b & 8192) == 0) {
                zep.b("No service endpoint specified for comment detail simplebox.");
                return;
            } else {
                xyc xycVar = this.d;
                xycVar.b(aqcaVar, b(xycVar.a(aqcaVar)));
                avhn avhnVar = aqcaVar.e;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                avhn avhnVar2 = avhnVar;
                if ((aqcaVar.b & 16) != 0) {
                    aragVar = aqcaVar.f;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                Spanned b = ajgl.b(aragVar);
                apzg apzgVar = this.d.a(aqcaVar).n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                apzg apzgVar2 = apzgVar;
                apok apokVar = aqcaVar.h;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                if ((apokVar.b & 1) != 0) {
                    apok apokVar2 = aqcaVar.h;
                    if (apokVar2 == null) {
                        apokVar2 = apok.a;
                    }
                    apoj apojVar2 = apokVar2.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    apojVar = apojVar2;
                } else {
                    apojVar = null;
                }
                apok apokVar3 = aqcaVar.j;
                if (apokVar3 == null) {
                    apokVar3 = apok.a;
                }
                apoj apojVar3 = apokVar3.c;
                if (apojVar3 == null) {
                    apojVar3 = apoj.a;
                }
                apoj apojVar4 = apojVar3;
                aunb aunbVar = aqcaVar.k;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                aunb aunbVar2 = aunbVar;
                String str = aqcaVar.l;
                if ((aqcaVar.b & 16) != 0 && (aragVar2 = aqcaVar.f) == null) {
                    aragVar2 = arag.a;
                }
                e(new xlp(1, avhnVar2, xmdVar, null, null, b, null, apzgVar2, apojVar, apojVar4, aunbVar2, str, null, aragVar2, null, null), null, null, null, false, false);
                return;
            }
        }
        aafo aafoVar = this.b;
        apzg apzgVar3 = aqcaVar.g;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        aafoVar.c(apzgVar3, null);
    }

    public final void f(aqca aqcaVar, ajyj ajyjVar) {
        awlh awlhVar;
        arag aragVar;
        apoj apojVar;
        arag aragVar2 = null;
        if ((aqcaVar.b & 32) == 0) {
            if (!this.d.c(aqcaVar)) {
                zep.b("No button renderer specified for comment simplebox.");
                return;
            }
            apoj a = this.d.a(aqcaVar);
            if ((a.b & 8192) == 0) {
                zep.b("No service endpoint specified for comment simplebox.");
                return;
            }
            Long d = this.n.d();
            this.d.b(aqcaVar, b(a));
            awlj awljVar = aqcaVar.i;
            if (awljVar == null) {
                awljVar = awlj.a;
            }
            if ((awljVar.b & 1) != 0) {
                awlj awljVar2 = aqcaVar.i;
                if (awljVar2 == null) {
                    awljVar2 = awlj.a;
                }
                awlh awlhVar2 = awljVar2.c;
                if (awlhVar2 == null) {
                    awlhVar2 = awlh.a;
                }
                awlhVar = awlhVar2;
            } else {
                awlhVar = null;
            }
            avhn avhnVar = aqcaVar.e;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            avhn avhnVar2 = avhnVar;
            if ((aqcaVar.b & 16) != 0) {
                aragVar = aqcaVar.f;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b = ajgl.b(aragVar);
            apzg apzgVar = this.d.a(aqcaVar).n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            apzg apzgVar2 = apzgVar;
            if ((aqcaVar.b & 1024) != 0) {
                apok apokVar = aqcaVar.h;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                apoj apojVar2 = apokVar.c;
                if (apojVar2 == null) {
                    apojVar2 = apoj.a;
                }
                apojVar = apojVar2;
            } else {
                apojVar = null;
            }
            apok apokVar2 = aqcaVar.j;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar3 = apokVar2.c;
            if (apojVar3 == null) {
                apojVar3 = apoj.a;
            }
            apoj apojVar4 = apojVar3;
            aunb aunbVar = aqcaVar.k;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aunb aunbVar2 = aunbVar;
            String str = aqcaVar.l;
            if ((aqcaVar.b & 16) != 0 && (aragVar2 = aqcaVar.f) == null) {
                aragVar2 = arag.a;
            }
            e(new xlp(1, avhnVar2, null, null, null, b, awlhVar, apzgVar2, apojVar, apojVar4, aunbVar2, str, null, aragVar2, null, null), ajyjVar, null, d, false, false);
            return;
        }
        aafo aafoVar = this.b;
        apzg apzgVar3 = aqcaVar.g;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        aafoVar.c(apzgVar3, null);
    }
}

package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.Editable;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowTooltipCommandOuterClass;
import com.google.protos.youtube.api.innertube.TooltipRendererOuterClass;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: abpu  reason: default package */
/* loaded from: classes.dex */
public final class abpu implements DialogInterface.OnDismissListener, abkm, abkn, abkx, ynl {
    public final abpi a;
    public final EditText b;
    public final aafo d;
    public final akge e;
    public final abjy f;
    public abkm g;
    public boolean h;
    public boolean i;
    private final Context j;
    private final Activity k;
    private final Dialog l;
    private final abky m;
    private final abha n;
    private final abgz o;
    private assk q;
    private Editable r;
    private boolean s;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    private final Handler p = new Handler();
    private boolean t = false;

    public abpu(Context context, abgz abgzVar, azqb azqbVar, Activity activity, abky abkyVar, yni yniVar, aafo aafoVar, abha abhaVar, abpj abpjVar, akge akgeVar, abjy abjyVar) {
        this.j = context;
        this.o = abgzVar;
        this.k = activity;
        this.m = abkyVar;
        this.d = aafoVar;
        this.n = abhaVar;
        this.e = akgeVar;
        this.f = abjyVar;
        Dialog dialog = new Dialog(context, R.style.action_panel_dialog_theme);
        this.l = dialog;
        dialog.setOnDismissListener(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_chat_action_panel_dialog, (ViewGroup) null, false);
        inflate.findViewById(R.id.action_panel_dialog).setOnClickListener(new View.OnClickListener() { // from class: abpq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abpu.this.a();
            }
        });
        acti actiVar = ((abiq) azqbVar.get()).p;
        Context context2 = (Context) abpjVar.a.get();
        context2.getClass();
        ajmy ajmyVar = (ajmy) abpjVar.b.get();
        ajmyVar.getClass();
        ((ajyi) abpjVar.c.get()).getClass();
        ajxz ajxzVar = (ajxz) abpjVar.d.get();
        ajxzVar.getClass();
        aafo aafoVar2 = (aafo) abpjVar.e.get();
        aafoVar2.getClass();
        abks abksVar = (abks) abpjVar.f.get();
        abksVar.getClass();
        ((abkl) abpjVar.g.get()).getClass();
        abkj abkjVar = (abkj) abpjVar.h.get();
        abkjVar.getClass();
        ajvj ajvjVar = (ajvj) abpjVar.i.get();
        ajvjVar.getClass();
        abjx abjxVar = (abjx) abpjVar.j.get();
        abjxVar.getClass();
        zhf zhfVar = (zhf) abpjVar.k.get();
        zhfVar.getClass();
        ajsk ajskVar = (ajsk) abpjVar.l.get();
        ajskVar.getClass();
        akge akgeVar2 = (akge) abpjVar.m.get();
        akgeVar2.getClass();
        abka abkaVar = (abka) abpjVar.n.get();
        abkaVar.getClass();
        ((abse) abpjVar.o.get()).getClass();
        abhy abhyVar = (abhy) abpjVar.p.get();
        abhyVar.getClass();
        inflate.getClass();
        abpi abpiVar = new abpi(context2, ajmyVar, ajxzVar, aafoVar2, abksVar, abkjVar, ajvjVar, abjxVar, zhfVar, ajskVar, akgeVar2, abkaVar, abhyVar, inflate, true, true, actiVar);
        this.a = abpiVar;
        akgeVar.g(inflate);
        this.b = abpiVar.r();
        dialog.setContentView(abpiVar.w);
        abpiVar.t = true;
        abpiVar.u = true;
        abpiVar.r = this;
        yniVar.g(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.e.f();
        if (this.k.isFinishing() || this.k.isDestroyed() || !this.l.isShowing()) {
            return;
        }
        this.l.dismiss();
        this.m.a(this);
    }

    @Override // defpackage.abkx
    public final int b() {
        return 2;
    }

    @Override // defpackage.abkx
    public final void c() {
        a();
    }

    @Override // defpackage.abkm
    public final void d() {
        if (this.k.isFinishing() || this.k.isDestroyed() || !this.l.isShowing()) {
            return;
        }
        this.l.dismiss();
    }

    @Override // defpackage.abkm
    public final void f(assu assuVar) {
        if (this.g != null) {
            a();
            this.g.f(assuVar);
        }
    }

    @Override // defpackage.abkm
    public final void g(CharSequence charSequence) {
        if (this.g != null) {
            a();
            this.g.g(charSequence);
        }
    }

    @Override // defpackage.abkm
    public final void h(apzg apzgVar) {
        if (this.g != null) {
            a();
            this.g.h(apzgVar);
        }
    }

    @Override // defpackage.abkx
    public final void i() {
        boolean z = this.s;
        Window window = this.l.getWindow();
        if (window == null) {
            Log.e(getClass().getSimpleName(), "Dialog.getWindow() is null.");
        } else {
            window.setLayout(-1, -2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setSoftInputMode((true != z ? 5 : 3) | 16);
            TypedValue typedValue = new TypedValue();
            if (!this.j.getTheme().resolveAttribute(16842802, typedValue, true) || typedValue.type != 4) {
                attributes.dimAmount = 0.5f;
            } else {
                attributes.dimAmount = typedValue.getFloat();
            }
            window.setAttributes(attributes);
        }
        this.l.show();
        if (this.q != null) {
            this.a.e();
            this.a.d(this.q);
        }
        Editable editable = this.r;
        if (editable != null) {
            this.b.setText(editable);
            this.b.setSelection(this.r.length());
        }
        if (this.s) {
            this.a.I();
        } else {
            this.b.requestFocus();
        }
        assk asskVar = this.q;
        if (asskVar.b == 121323709) {
            asrs asrsVar = (asrs) asskVar.c;
            if ((asrsVar.b & 128) == 0) {
                return;
            }
            apzg apzgVar = asrsVar.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (this.t) {
                return;
            }
            this.t = true;
            if (apzgVar.qn(ShowTooltipCommandOuterClass.showTooltipCommand)) {
                auvv auvvVar = (auvv) apzgVar.qm(ShowTooltipCommandOuterClass.showTooltipCommand);
                aunb aunbVar = auvvVar.c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(TooltipRendererOuterClass.tooltipRenderer)) {
                    aunb aunbVar2 = auvvVar.c;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    final avjf avjfVar = (avjf) aunbVar2.qm(TooltipRendererOuterClass.tooltipRenderer);
                    if ("live-chat-message-input".equals(avjfVar.d)) {
                        this.p.postDelayed(new Runnable() { // from class: abpr
                            @Override // java.lang.Runnable
                            public final void run() {
                                abpu abpuVar = abpu.this;
                                avjf avjfVar2 = avjfVar;
                                akge akgeVar = abpuVar.e;
                                akfp k = akgeVar.k(avjfVar2);
                                k.a = abpuVar.a.r();
                                k.l();
                                akgeVar.c(k.a());
                            }
                        }, 500L);
                        if (!zdg.e(this.j)) {
                            return;
                        }
                        this.a.r().setAccessibilityDelegate(new abps(this, avjfVar));
                        return;
                    }
                }
            }
            this.n.a(amuk.r(apzgVar), this.o, true);
        }
    }

    public final void j() {
        this.t = false;
        this.a.r().setAccessibilityDelegate(null);
    }

    public final void k(assk asskVar, Editable editable, boolean z, boolean z2) {
        this.h = z2;
        this.q = asskVar;
        this.r = editable;
        this.s = z;
        this.m.b(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        boolean z = false;
        if (i != -1) {
            if (i == 0) {
                ahgn ahgnVar = (ahgn) obj;
                if (ahgnVar.d() != aijs.FULLSCREEN && ahgnVar.d() != aijs.DEFAULT) {
                    a();
                }
                if (ahgnVar.d() == aijs.FULLSCREEN) {
                    z = true;
                }
                if (this.f.a() || this.h == z) {
                    return null;
                }
                a();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahgn.class};
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((abpt) it.next()).a(this.a.h());
        }
        this.m.a(this);
    }

    @Override // defpackage.abkm
    public final void e(apoj apojVar) {
        int i = apojVar.b;
        if ((32768 & i) == 0) {
            if ((i & 512) == 0) {
                return;
            }
            zag.r(this.j, apojVar.j, 0);
            return;
        }
        aafo aafoVar = this.d;
        apzg apzgVar = apojVar.p;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
    }
}

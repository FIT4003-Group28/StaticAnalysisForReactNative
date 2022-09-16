package defpackage;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aurf  reason: default package */
/* loaded from: classes2.dex */
public class aurf implements auqz {
    public final aurp a;
    public final gga b;
    public final String c;
    public final Executor d;
    public final auon e;
    public final dxio<ache> f;
    @dzsi
    public aujb g;
    private final CharSequence h;
    private final CharSequence i;
    private final cqtd j;
    private final long k;
    private final cjtd l;
    private final cjtd m;
    private final cjtd n;
    private final cjtd o;
    private final cqat p;
    private final dxio<afha> q;
    private final boolean r;
    @dzsi
    private Intent s;
    private Boolean t;

    public aurf(auqf auqfVar, aurp aurpVar, cqat cqatVar, gga ggaVar, auhi auhiVar, Executor executor, auon auonVar, dxio<afha> dxioVar, dxio<ache> dxioVar2) {
        Integer num;
        boolean z = false;
        this.t = false;
        this.a = aurpVar;
        this.b = ggaVar;
        this.p = cqatVar;
        this.d = executor;
        this.e = auonVar;
        this.q = dxioVar;
        this.f = dxioVar2;
        auqj auqjVar = auqfVar.j;
        if (((auqjVar == null ? auqj.d : auqjVar).a & 1) != 0) {
            auqj auqjVar2 = auqfVar.j;
            num = Integer.valueOf((int) (auqjVar2 == null ? auqj.d : auqjVar2).b);
        } else {
            num = null;
        }
        if (num != null) {
            this.g = auhiVar.h(num.intValue());
        }
        aujb aujbVar = this.g;
        auin w = aujbVar == null ? null : aujbVar.w();
        this.h = auqfVar.d;
        this.i = auqfVar.e;
        if (!auqfVar.f.equals(dspd.b) && Build.VERSION.SDK_INT >= 23) {
            this.j = cqtt.a(((BitmapDrawable) Icon.createWithData(auqfVar.f.G(), 0, auqfVar.f.c()).loadDrawable(ggaVar)).getBitmap());
        } else if (w != null) {
            this.j = cqrt.f(w.j);
            this.t = true;
        } else {
            this.j = cqrt.f(2131232368);
            this.t = true;
        }
        this.c = auqfVar.b;
        this.k = auqfVar.c;
        int a = auqh.a(auqfVar.g);
        if (a != 0 && a == 2) {
            z = true;
        }
        this.r = z;
        this.s = null;
        if ((auqfVar.a & 128) != 0) {
            dplx dplxVar = auqfVar.h;
            Intent a2 = bvrq.a(dplxVar == null ? dplx.g : dplxVar);
            this.s = a2;
            a2.putExtra("extra_is_launched_from_inbox_key", true);
        }
        cjta b = cjtd.b();
        if ((auqfVar.a & 2048) != 0) {
            b.g(auqfVar.k);
        }
        b.d = dtxs.u;
        this.l = b.a();
        b.d = dtxs.x;
        this.m = b.a();
        b.d = dtxs.v;
        this.n = b.a();
        b.d = dtxs.w;
        this.o = b.a();
    }

    @Override // defpackage.auqz
    public CharSequence a() {
        return this.h;
    }

    @Override // defpackage.auqz
    public CharSequence b() {
        return this.i;
    }

    @Override // defpackage.auqz
    public CharSequence c() {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.p.b() - this.k);
        if (bvtb.a(seconds) == 0) {
            return this.b.getString(R.string.NOW).toLowerCase(Locale.getDefault());
        }
        return bvtb.f(this.b.getResources(), seconds, bvsz.MINIMAL, new bvsw());
    }

    @Override // defpackage.auqz
    public CharSequence d() {
        bvsi bvsiVar = new bvsi(this.b);
        bvsiVar.c(this.h);
        bvsiVar.c(this.i);
        bvsiVar.c(c());
        String bvsiVar2 = bvsiVar.toString();
        return this.r ? this.b.getString(R.string.UNREAD_NOTIFICATION_CONTENT_DESCRIPTION, new Object[]{bvsiVar2}) : bvsiVar2;
    }

    @Override // defpackage.auqz
    public cqtd e() {
        return this.j;
    }

    @Override // defpackage.auqz
    public cqkl f(cjqm cjqmVar) {
        if (this.s != null) {
            this.q.a().f(this.b, this.s, 1);
        }
        return cqkl.a;
    }

    @Override // defpackage.auqz
    @dzsi
    public cjtd g() {
        return this.l;
    }

    @Override // defpackage.auqz
    public Boolean h() {
        return this.t;
    }

    @Override // defpackage.auqz
    public jht i() {
        jhu h = jhv.h();
        if (k()) {
            jhm jhmVar = new jhm();
            jhmVar.a = this.b.getText(R.string.MANAGE);
            jhmVar.d(new View.OnClickListener(this) { // from class: aurc
                private final aurf a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aurf aurfVar = this.a;
                    if (aurfVar.k()) {
                        bszv.ba(aurfVar.b, btgd.g(aurfVar.g));
                    }
                }
            });
            jhmVar.f = this.m;
            h.d(jhmVar.c());
        }
        jhm jhmVar2 = new jhm();
        jhmVar2.a = this.b.getText(R.string.DELETE_BUTTON);
        jhmVar2.d(new View.OnClickListener(this) { // from class: aurd
            private final aurf a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aurf aurfVar = this.a;
                aurfVar.d.execute(new Runnable(aurfVar) { // from class: aurb
                    private final aurf a;

                    {
                        this.a = aurfVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aurf aurfVar2 = this.a;
                        aurfVar2.e.d(aurfVar2.c);
                        aurfVar2.a.o();
                    }
                });
            }
        });
        jhmVar2.f = this.n;
        h.d(jhmVar2.c());
        jhm jhmVar3 = new jhm();
        jhmVar3.a = this.b.getText(R.string.SEND_FEEDBACK);
        jhmVar3.d(new View.OnClickListener(this) { // from class: aure
            private final aurf a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f.a().k(false, true, achc.INBOX, null);
            }
        });
        jhmVar3.f = this.o;
        h.d(jhmVar3.c());
        bvsi bvsiVar = new bvsi(this.b);
        bvsiVar.c(this.b.getString(R.string.NOTIFICATION_OVERFLOW_MENU_CONTENT_DESCRIPTION));
        bvsiVar.c(d());
        ((jhi) h).e = bvsiVar.toString();
        return h.b();
    }

    @Override // defpackage.auqz
    public Boolean j() {
        return Boolean.valueOf(this.r);
    }

    public final boolean k() {
        aujb aujbVar = this.g;
        return (aujbVar == null || aujbVar.b() == null) ? false : true;
    }
}

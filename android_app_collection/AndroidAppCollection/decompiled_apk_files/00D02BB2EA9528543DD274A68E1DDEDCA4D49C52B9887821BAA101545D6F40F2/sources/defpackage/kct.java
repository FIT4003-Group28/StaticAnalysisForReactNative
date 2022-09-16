package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kct  reason: default package */
/* loaded from: classes7.dex */
public class kct implements kch {
    public final kcp a;
    public final cfnr b;
    public final Executor c;
    public boolean d;
    @dzsi
    kco e;
    private final Context f;
    private final ldm g;
    private final crmw h;

    public kct(Context context, kcp kcpVar, cfns cfnsVar, ldm ldmVar, crmw crmwVar, cqhn cqhnVar, Executor executor) {
        this.f = context;
        this.a = kcpVar;
        this.b = cfnsVar.a(cfnq.CARGO_ARRIVAL_CARD, new Handler(Looper.getMainLooper()));
        this.g = ldmVar;
        this.h = crmwVar;
        this.c = executor;
    }

    public static CharSequence e(Context context) {
        Drawable a = cqrt.g(2131232444, nql.bq).a(context);
        a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
        return TextUtils.concat(bvsx.g(a), " ", context.getResources().getString(R.string.ARRIVAL_DASHBOARD_SENTIMENT_SURVEY_THANKYOU));
    }

    @Override // defpackage.kch
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.kch
    public CharSequence b() {
        return e(this.f);
    }

    @Override // defpackage.kch
    @dzsi
    public kcg c() {
        return this.e;
    }

    public boolean d() {
        dqvj dqvjVar;
        ldm ldmVar = this.g;
        ilo iloVar = ldmVar.d;
        String str = ldmVar.b;
        ddom g = this.h.g();
        if (iloVar == null || str == null) {
            return false;
        }
        cfnr cfnrVar = this.b;
        String string = this.f.getResources().getString(R.string.WELCOME_TO);
        String str2 = this.g.c;
        dpum h = iloVar.aj() != null ? iloVar.aj().h() : null;
        String o = !akqi.a.equals(iloVar.ai()) ? iloVar.ai().o() : null;
        Long c = this.h.c();
        boolean booleanValue = this.h.d().booleanValue();
        if ((g.a & 2) != 0) {
            dqvj c2 = dqvj.c(g.e);
            if (c2 == null) {
                c2 = dqvj.DRIVE;
            }
            dqvjVar = c2;
        } else {
            dqvjVar = null;
        }
        cfnrVar.a(string, str, str2, h, o, c, booleanValue, dqvjVar, this.h.e(), new bvqg(this) { // from class: kcq
            private final kct a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final kct kctVar = this.a;
                dier dierVar = (dier) obj;
                dieq dieqVar = dierVar.b;
                if (dieqVar == null) {
                    dieqVar = dieq.f;
                }
                if (diep.a(dieqVar.b) == 2) {
                    kcp kcpVar = kctVar.a;
                    cfnr cfnrVar2 = kctVar.b;
                    Runnable runnable = new Runnable(kctVar) { // from class: kcr
                        private final kct a;

                        {
                            this.a = kctVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final kct kctVar2 = this.a;
                            kctVar2.e = null;
                            kctVar2.c.execute(new Runnable(kctVar2) { // from class: kcs
                                private final kct a;

                                {
                                    this.a = kctVar2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    cqkx.p(this.a);
                                }
                            });
                        }
                    };
                    Context a = kcpVar.a.a();
                    kcp.a(a, 1);
                    bvrb a2 = kcpVar.b.a();
                    kcp.a(a2, 2);
                    cfon a3 = kcpVar.c.a();
                    kcp.a(a3, 3);
                    kcp.a(cfnrVar2, 4);
                    kcp.a(dierVar, 5);
                    kcp.a(runnable, 6);
                    kctVar.e = new kco(a, a2, a3, cfnrVar2, dierVar, runnable);
                    kctVar.d = true;
                    cqkx.p(kctVar);
                }
            }
        });
        return true;
    }
}

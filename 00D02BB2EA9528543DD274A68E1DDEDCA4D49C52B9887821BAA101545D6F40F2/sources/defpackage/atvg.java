package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atvg  reason: default package */
/* loaded from: classes2.dex */
public class atvg extends atss<crra> implements atyc {
    private static final long b = TimeUnit.SECONDS.toMillis(30);
    private final akqq A;
    private final audo B;
    private final atyd C;
    private final atyd D;
    public boolean a;
    @dzsi
    private final crfl c;
    private final int d;

    public atvg(btrm btrmVar, cref crefVar, Context context, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z, cqhn cqhnVar, bvjj bvjjVar, @dzsi crfl crflVar, btvo btvoVar, bvsl bvslVar, crra crraVar) {
        super(crraVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, b);
        this.a = false;
        final aryv aryvVar = crraVar.a;
        this.c = crflVar;
        this.d = ((Integer) aryvVar.b.h(new dbrn(aryvVar) { // from class: aryu
            private final aryv a;

            {
                this.a = aryvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dowa dowaVar = this.a.d;
                dowa dowaVar2 = dowa.KILOMETERS;
                int intValue = ((Integer) obj).intValue();
                if (dowaVar != dowaVar2) {
                    intValue = (int) (intValue / 0.62137f);
                }
                return Integer.valueOf(intValue);
            }
        }).b()).intValue();
        this.A = crraVar.c;
        this.B = new audj(aryvVar, false);
        this.v = cjtd.a(dtxw.cH);
        this.p = context.getResources().getString(R.string.SPEED_LIMIT_QUESTION_TEXT, bvslVar.j(((Float) aryvVar.b.h(new dbrn(aryvVar) { // from class: aryt
            private final aryv a;

            {
                this.a = aryvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Float.valueOf(((Integer) obj).intValue() / (this.a.d == dowa.KILOMETERS ? 3.6f : 2.2369363f));
            }
        }).b()).floatValue(), aryvVar.d).toString());
        int s = bvjjVar.s(bvjk.jz, 0);
        if (s < 3) {
            this.q = this.j.getText(R.string.MIDTRIP_UGC_VOTE_SAFETY_TEXT);
            bvjjVar.W(bvjk.jz, s + 1);
        }
        this.C = new atwd(cqhnVar, context, cjtd.a(dtxw.cI), new atwb(this) { // from class: atva
            private final atvg a;

            {
                this.a = this;
            }

            @Override // defpackage.atwb
            public final boolean a() {
                return this.a.a;
            }
        }, cqrt.l(R.string.MIDTRIP_UGC_VOTE_YES), R.drawable.animated_check, R.drawable.animated_confirm_button, new atwc(this) { // from class: atvb
            private final atvg a;

            {
                this.a = this;
            }

            @Override // defpackage.atwc
            public final void a() {
                this.a.g(6);
            }
        }, new atvy(this) { // from class: atvc
            private final atvg a;

            {
                this.a = this;
            }

            @Override // defpackage.atvy
            public final void a() {
                this.a.p();
            }
        });
        this.D = new atwd(cqhnVar, context, cjtd.a(dtxw.cJ), new atwb(this) { // from class: atvd
            private final atvg a;

            {
                this.a = this;
            }

            @Override // defpackage.atwb
            public final boolean a() {
                return this.a.a;
            }
        }, cqrt.l(R.string.MIDTRIP_UGC_VOTE_NO), R.drawable.animated_close, R.drawable.animated_deny_button, new atwc(this) { // from class: atve
            private final atvg a;

            {
                this.a = this;
            }

            @Override // defpackage.atwc
            public final void a() {
                this.a.g(4);
            }
        }, new atvy(this) { // from class: atvf
            private final atvg a;

            {
                this.a = this;
            }

            @Override // defpackage.atvy
            public final void a() {
                this.a.p();
            }
        });
        atsm S = S(true);
        S.h = cjtd.a(dtxw.cK);
        M(S.a());
    }

    @Override // defpackage.atss, defpackage.atxz
    public atxx U() {
        return atxx.SPEED_LIMIT_MODERATION;
    }

    @Override // defpackage.atyc
    public audo d() {
        return this.B;
    }

    @Override // defpackage.atyc
    public atyd e() {
        return this.C;
    }

    @Override // defpackage.atyc
    public atyd f() {
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        bvrj.UI_THREAD.c();
        if (!this.a && this.c != null) {
            this.a = true;
            cqkx.p(this);
            this.c.j(this.A, this.d, i);
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atxm  reason: default package */
/* loaded from: classes2.dex */
public class atxm extends atss<crqm> implements atyf, ahvp, ajwt, ajxc {
    public static final /* synthetic */ int H = 0;
    private static final long I = TimeUnit.SECONDS.toMillis(10);
    public final Executor A;
    public boolean B;
    public boolean C;
    public final Set<czha> D;
    public final Set<czha> E;
    @dzsi
    public cxsx F;
    @dzsi
    public SendKitPickerResult G;
    private final bwfp J;
    private final dcdc<ajxq> K;
    private final ajah L;
    private final ajbm M;
    private final crzp<aufb> N;
    private final atsn O;
    private final atsn P;
    public final akfa a;
    public final aufc b;
    public final ahvq c;
    public final ajus d;

    public atxm(crqm crqmVar, btrm btrmVar, btvo btvoVar, cref crefVar, akfa akfaVar, ahwf ahwfVar, final aufc aufcVar, final gga ggaVar, cqat cqatVar, ajus ajusVar, dehq dehqVar, Executor executor, atsr atsrVar, cqhn cqhnVar, cjqy cjqyVar, cjqq cjqqVar, boolean z, ajae ajaeVar, cqkj cqkjVar) {
        super(crqmVar, ggaVar, btrmVar, btvoVar, crefVar, ggaVar.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, I);
        this.B = false;
        this.C = false;
        this.D = new HashSet();
        this.E = new HashSet();
        this.F = null;
        atxb atxbVar = new atxb(this);
        this.N = atxbVar;
        atxc atxcVar = new atxc(this);
        this.O = atxcVar;
        atxd atxdVar = new atxd(this);
        this.P = atxdVar;
        this.a = akfaVar;
        this.b = aufcVar;
        this.d = ajusVar;
        this.A = dehqVar;
        final ahvq D = ahwfVar.D();
        dbsk.s(D);
        this.c = D;
        D.a(this);
        aufcVar.i().d(atxbVar, dehqVar);
        bwfp f = bwfp.f(ggaVar.getApplicationContext(), false);
        this.J = f;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(134742016);
        intent.setType("text/plain");
        dbsk.s(f);
        f.g(intent);
        this.K = dcdc.q(dcft.o(f.a(akfaVar.j()), new dbrn(this, D, ggaVar, aufcVar) { // from class: atwy
            private final atxm a;
            private final ahvq b;
            private final Context c;
            private final aufc d;

            {
                this.a = this;
                this.b = D;
                this.c = ggaVar;
                this.d = aufcVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new atxl(this.a, this.b, (ResolveInfo) obj, this.c, this.d);
            }
        }));
        this.L = new atxe(ajaeVar, ggaVar, cqkjVar);
        this.M = new atxf(this, ajaeVar, ggaVar, cqkjVar);
        atsm S = super.S(false);
        S.c = cqrt.l(R.string.JOURNEY_CANCEL);
        S.g = atxdVar;
        S.h = as();
        super.M(S.a());
        atsm R = super.R(true);
        R.f = atxv.SHARE;
        R.c = cqrt.l(R.string.START_JOURNEY_SHARING);
        R.g = atxcVar;
        R.h = cjtd.a(dtxu.dm);
        super.L(R.a());
    }

    @Override // defpackage.ahvp
    public void G() {
        if (this.c.d() == 2) {
            p();
        }
    }

    @Override // defpackage.atss, defpackage.atxz
    public void Ob() {
        super.Ob();
        this.b.i().c(this.N);
        this.c.b(this);
        if (!this.C) {
            this.c.f();
        }
    }

    @Override // defpackage.atss, defpackage.atxz
    public atxx U() {
        return atxx.JRNY_PEOPLE_PICKER;
    }

    @Override // defpackage.atyf
    @dzsi
    public CharSequence ao() {
        if (this.E.isEmpty() || this.D.isEmpty()) {
            if (this.D.isEmpty()) {
                return null;
            }
            return cqrt.l(R.string.JOURNEY_SHARING_LINK_SHARE_WARNING).a(this.f);
        }
        return cqrt.l(R.string.JOURNEY_SHARING_SMS_PRICE_AND_LINK_SHARE_WARNING).a(this.f);
    }

    @Override // defpackage.atyf
    public Boolean ap() {
        return Boolean.valueOf(this.B);
    }

    public CharSequence aq() {
        return this.f.getString(R.string.JOURNEY_SHARING_PEOPLE_PICKER_POPUP_HEADER);
    }

    @Override // defpackage.atyf
    public cqkl ar() {
        p();
        return cqkl.a;
    }

    @Override // defpackage.atyf
    public cjtd as() {
        return cjtd.a(dtxu.dW);
    }

    @Override // defpackage.atyf
    public ajah at() {
        return this.L;
    }

    @Override // defpackage.atyf
    public ajbm au() {
        return this.M;
    }

    @Override // defpackage.atss, defpackage.atxz
    public Boolean c() {
        return true;
    }

    @Override // defpackage.atyf
    public ajwt d() {
        return this;
    }

    @Override // defpackage.atyf
    public ajxc e() {
        return this;
    }

    @Override // defpackage.ajxc
    public ajxw f() {
        return new atxi(this);
    }

    @Override // defpackage.ajxc
    public dbsz<SendKitPickerResult> g() {
        return new dbsz(this) { // from class: atwv
            private final atxm a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                final atxm atxmVar = this.a;
                final SendKitPickerResult sendKitPickerResult = (SendKitPickerResult) obj;
                atxmVar.A.execute(new Runnable(atxmVar, sendKitPickerResult) { // from class: atxa
                    private final atxm a;
                    private final SendKitPickerResult b;

                    {
                        this.a = atxmVar;
                        this.b = sendKitPickerResult;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        atxm atxmVar2 = this.a;
                        SendKitPickerResult sendKitPickerResult2 = this.b;
                        atxmVar2.t();
                        ahvq ahvqVar = atxmVar2.c;
                        String j = atxmVar2.j();
                        dbsk.s(j);
                        ahvqVar.i(j, atxmVar2.b.b(), sendKitPickerResult2);
                        atxmVar2.C = true;
                        atxmVar2.p();
                    }
                });
            }
        };
    }

    @Override // defpackage.ajxc
    public dbsz<cxsx> h() {
        return new dbsz(this) { // from class: atwu
            private final atxm a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                this.a.F = (cxsx) obj;
            }
        };
    }

    @Override // defpackage.ajxc
    public ajxz i() {
        return new atxj(this);
    }

    @Override // defpackage.ajxc
    @dzsi
    public String j() {
        return this.a.j().t();
    }

    @Override // defpackage.ajwt
    public List<ajxq> k() {
        return this.K;
    }

    @Override // defpackage.ajxc
    public dbsl<String> l() {
        return new dbsl(this) { // from class: atww
            private final atxm a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                atxm atxmVar = this.a;
                String str = (String) obj;
                if (str != null) {
                    return atxmVar.c.c(str);
                }
                return false;
            }
        };
    }

    @Override // defpackage.ajxc
    public ajxx m() {
        return new ajxx(this) { // from class: atwx
            private final atxm a;

            {
                this.a = this;
            }

            @Override // defpackage.ajxx
            public final void a(String[] strArr, ajxy ajxyVar) {
                this.a.c.g(strArr, new atwz(ajxyVar));
            }
        };
    }

    @Override // defpackage.ajwt
    public Boolean s() {
        return Boolean.TRUE;
    }
}

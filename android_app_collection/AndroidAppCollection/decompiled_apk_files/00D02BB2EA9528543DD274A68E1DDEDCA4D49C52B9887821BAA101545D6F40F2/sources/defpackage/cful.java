package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cful  reason: default package */
/* loaded from: classes4.dex */
public class cful extends cftb<Integer> {
    public final dxio<aesb> a;
    public final dxio<bqji> b;
    private final cftt c;
    private final Resources d;
    private final CharSequence e;
    private final CharSequence f;
    private final Boolean g;
    private final cfuk h;

    @Deprecated
    public cful(cftt cfttVar, dxio<aesb> dxioVar, dxio<bqji> dxioVar2, Resources resources) {
        this.h = new cfuk(this);
        this.c = cfttVar;
        this.a = dxioVar;
        this.b = dxioVar2;
        this.d = resources;
        this.e = "";
        this.f = "";
        this.g = false;
    }

    @Override // defpackage.cfta
    public cqkl a() {
        cftt cfttVar = this.c;
        cfuk cfukVar = this.h;
        cfui cfuiVar = cfttVar.c;
        final cfts cftsVar = new cfts(cfttVar, cfukVar);
        dcbg b = dcbg.b(cfuiVar.c);
        final axru axruVar = cfuiVar.a;
        axruVar.getClass();
        dcdc z = b.o(dbst.a(new dbsl(axruVar) { // from class: cfuf
            private final axru a;

            {
                this.a = axruVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.a((String) obj);
            }
        })).z();
        if (z.isEmpty()) {
            cftsVar.a();
        } else {
            cfuiVar.b.c((String[]) z.toArray(new String[z.size()]), new axrv(cftsVar) { // from class: cfug
                private final cfts a;

                {
                    this.a = cftsVar;
                }

                @Override // defpackage.axrv
                public final void a(int[] iArr) {
                    cfts cftsVar2 = this.a;
                    if (!dcbg.b(decl.m(iArr)).q(cfuh.a)) {
                        Executor executor = cftsVar2.a.b;
                        cfuk cfukVar2 = cftsVar2.b;
                        cfukVar2.getClass();
                        executor.execute(new Runnable(cfukVar2) { // from class: cftr
                            private final cfuk a;

                            {
                                this.a = cfukVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.a();
                            }
                        });
                        return;
                    }
                    cftsVar2.a.a.a().m();
                    cftsVar2.a();
                }
            });
        }
        return cqkl.a;
    }

    @Override // defpackage.cftb
    protected final int b() {
        return R.raw.ic_rate_review_white;
    }

    @Override // defpackage.cfta
    public Integer c() {
        return Integer.valueOf((int) R.string.WRITE_A_REVIEW);
    }

    @Override // defpackage.cftb, defpackage.cfta
    public CharSequence d() {
        return this.e;
    }

    @Override // defpackage.cftb, defpackage.cfta
    public CharSequence e() {
        return g().booleanValue() ? this.f : this.d.getString(R.string.WRITE_A_REVIEW_ONBOARDING_DESCRIPTION);
    }

    @Override // defpackage.cfta
    public ddho f(cfsz cfszVar) {
        cfsz cfszVar2 = cfsz.DEFAULT;
        return cfszVar.ordinal() != 1 ? dtxl.eA : dtxl.eq;
    }

    @Override // defpackage.cftb, defpackage.cfta
    public Boolean g() {
        return this.g;
    }

    public cful(cftt cfttVar, dxio<aesb> dxioVar, dxio<bqji> dxioVar2, Resources resources, CharSequence charSequence, CharSequence charSequence2) {
        this.h = new cfuk(this);
        this.c = cfttVar;
        this.a = dxioVar;
        this.b = dxioVar2;
        this.d = resources;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = true;
    }
}

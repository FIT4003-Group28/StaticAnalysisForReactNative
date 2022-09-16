package com.google.android.apps.youtube.app.account.profilecard;

import com.google.android.apps.youtube.app.account.profilecard.DefaultProfileCardController;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultProfileCardController extends DialogFragmentController implements ebn {
    public aash a;
    public Executor b;
    public aaqf c;
    public afvn d;
    public fqv e;
    public acti f;
    public final srr g;
    public final aafo h;

    public DefaultProfileCardController(dt dtVar, srr srrVar, aafo aafoVar) {
        super(dtVar, "DefaultProfileCardController");
        this.g = srrVar;
        this.h = aafoVar;
    }

    public final void g(String str, String str2, final String str3, boolean z, byte[] bArr, final ebp ebpVar) {
        aasg aasgVar = new aasg(this.c, this.d.c(), str, str2, str3);
        if (bArr == null || bArr.length <= 0) {
            aasgVar.i();
        } else {
            aasgVar.k(bArr);
        }
        if (z) {
            ankt a = this.a.a(aasgVar, this.b);
            Executor executor = this.b;
            ylv ylvVar = new ylv() { // from class: ebi
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    DefaultProfileCardController defaultProfileCardController = DefaultProfileCardController.this;
                    ebp ebpVar2 = ebpVar;
                    ajxd ajxdVar = new ajxd(defaultProfileCardController.e.a(th), true, null, null);
                    ebpVar2.aG();
                    ebpVar2.ap.add(ebp.aK(ajxdVar, ebpVar2.aq));
                }
            };
            ebpVar.getClass();
            ylx.k(a, executor, ylvVar, new ebo(ebpVar, 1));
            return;
        }
        ylx.k(this.a.a(aasgVar, this.b), this.b, new ylv() { // from class: ebj
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                DefaultProfileCardController defaultProfileCardController = DefaultProfileCardController.this;
                defaultProfileCardController.g.c(str3);
            }
        }, new ylw() { // from class: ebk
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                DefaultProfileCardController defaultProfileCardController = DefaultProfileCardController.this;
                artr artrVar = (artr) obj;
                defaultProfileCardController.g.b(artrVar.f.I(), str3);
                aafo aafoVar = defaultProfileCardController.h;
                apzg apzgVar = artrVar.h;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.a(apzgVar);
            }
        });
    }

    @Override // defpackage.ebn
    public final void h(final String str, final String str2, final String str3, boolean z, apzg apzgVar) {
        ebp ebpVar;
        final byte[] I = apzgVar.c.I();
        if (z) {
            k();
            ebp ebpVar2 = (ebp) i();
            if (ebpVar2 == null) {
                final ebp ebpVar3 = new ebp();
                ebpVar3.aq = new ajyw() { // from class: ebl
                    @Override // defpackage.ajyw
                    public final void lk() {
                        DefaultProfileCardController defaultProfileCardController = DefaultProfileCardController.this;
                        ebp ebpVar4 = ebpVar3;
                        String str4 = str;
                        String str5 = str2;
                        String str6 = str3;
                        byte[] bArr = I;
                        ebpVar4.aG();
                        ebpVar4.ap.add(ebp.aK(ajxe.a(), null));
                        defaultProfileCardController.g(str4, str5, str6, true, bArr, ebpVar4);
                    }
                };
                j(ebpVar3);
                ebpVar2 = ebpVar3;
            }
            this.f.d(acuo.a(66557), apzgVar, null);
            ebpVar2.ar = this.f;
            ebpVar = ebpVar2;
        } else {
            ebpVar = null;
        }
        g(str, str2, str3, z, I, ebpVar);
    }
}

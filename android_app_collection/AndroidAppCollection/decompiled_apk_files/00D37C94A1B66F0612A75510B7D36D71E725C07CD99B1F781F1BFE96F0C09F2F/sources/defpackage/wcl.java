package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AccountsListRenderer;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;
/* compiled from: PG */
/* renamed from: wcl  reason: default package */
/* loaded from: classes4.dex */
public final class wcl extends ajsl implements wdf {
    public final Context a;
    public final wbc b;
    public final Handler c;
    public final dp d;
    public final wdg e;
    private final Resources f;
    private final afvn g;
    private final wal h;
    private final wbg i;
    private final wcu j;
    private final FrameLayout k;

    public wcl(Context context, afvn afvnVar, wal walVar, wbg wbgVar, Activity activity, Handler handler, wcv wcvVar, wbc wbcVar, dp dpVar) {
        this.a = context;
        this.f = activity.getResources();
        this.g = afvnVar;
        this.h = walVar;
        this.i = wbgVar;
        this.b = wbcVar;
        this.d = dpVar;
        this.c = handler;
        FrameLayout frameLayout = new FrameLayout(context);
        this.k = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j = wcvVar.a(wbcVar, frameLayout);
        this.e = new wdi(dpVar, ake.h(context), this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.k;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        final PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer = (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer) obj;
        aunb aunbVar = passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        final PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer = (PasswordAuthRendererOuterClass$PasswordAuthRenderer) aunbVar.qm(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer);
        this.j.n(passwordAuthRendererOuterClass$PasswordAuthRenderer);
        this.k.addView(this.j.f);
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 1024) != 0) {
            int i = passwordAuthRendererOuterClass$PasswordAuthRenderer.m;
        }
        wbg wbgVar = this.i;
        int r = akpq.r(passwordAuthRendererOuterClass$PasswordAuthRenderer.m);
        if (r == 0) {
            r = 1;
        }
        ankt a = wbgVar.a(r);
        if (a != null) {
            ylx.k(a, anjk.a, new ylv() { // from class: wch
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    wcl.this.b.j(1);
                }
            }, new ylw() { // from class: wci
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj2) {
                    final wcl wclVar = wcl.this;
                    final PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer2 = passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;
                    final PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer2 = passwordAuthRendererOuterClass$PasswordAuthRenderer;
                    final AccountIdentity accountIdentity = (AccountIdentity) obj2;
                    wclVar.c.post(new Runnable() { // from class: wcj
                        @Override // java.lang.Runnable
                        public final void run() {
                            wcl.this.f(passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer2, accountIdentity, passwordAuthRendererOuterClass$PasswordAuthRenderer2);
                        }
                    });
                }
            });
        } else {
            f(passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer, null, passwordAuthRendererOuterClass$PasswordAuthRenderer);
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer = (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.j.qZ(ajsaVar);
    }

    public final void f(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer, AccountIdentity accountIdentity, PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer) {
        aowy aowyVar;
        String str;
        String obj;
        if (accountIdentity == null) {
            if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 256) != 0) {
                apwe apweVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.k;
                if (apweVar == null) {
                    apweVar = apwe.b;
                }
                accountIdentity = AccountIdentity.m(apweVar);
            } else {
                accountIdentity = (AccountIdentity) this.g.c();
            }
        }
        waj b = this.h.b(accountIdentity);
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 512) != 0) {
            aunb aunbVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.l;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aowyVar = (aowy) aunbVar.qm(AccountsListRenderer.accountItemRenderer);
        } else {
            aowyVar = null;
        }
        if (aowyVar != null) {
            arag aragVar = aowyVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            str = ajgl.b(aragVar).toString();
        } else {
            str = b.b;
        }
        if (adq.a(this.a).b() != 0 && !wgd.b(this.a)) {
            return;
        }
        if ((passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.b & 2) != 0) {
            arag aragVar2 = passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            obj = ajgl.b(aragVar2).toString();
        } else {
            arag aragVar3 = passwordAuthRendererOuterClass$PasswordAuthRenderer.c;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            obj = ajgl.b(aragVar3).toString();
        }
        final adt adtVar = new adt();
        adtVar.a = obj;
        adtVar.b = str;
        if ((passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.b & 4) == 0 || !passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.e || !wgd.b(this.a)) {
            adtVar.c = this.f.getString(17039360);
        } else {
            adtVar.d = true;
        }
        this.e.a(adtVar.a());
        wcu wcuVar = this.j;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: wcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wcl.this.e.a(adtVar.a());
            }
        };
        wcuVar.e.setImageResource(2131232507);
        wcuVar.e.setOnClickListener(onClickListener);
        wcuVar.e.setVisibility(0);
        TextView textView = wcuVar.h;
        textView.setPadding(textView.getPaddingLeft(), wcuVar.h.getPaddingTop(), wcuVar.b.getDimensionPixelSize(R.dimen.biometric_icon_size), wcuVar.h.getPaddingBottom());
    }
}

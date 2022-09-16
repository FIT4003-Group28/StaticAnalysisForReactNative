package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wjn  reason: default package */
/* loaded from: classes4.dex */
public final class wjn extends win implements wif, whu, whw {
    public atvt a;
    public String ae;
    public String af;
    public wjm ag;
    public aafo ah;
    private ImageButton ai;
    private long aj;
    public ContentLoadingProgressBar b;
    public Button c;
    public CodeInputView d;
    public asbk e = asbk.CODE_DELIVERY_METHOD_UNKNOWN;

    public static final boolean p(atvt atvtVar) {
        if (atvtVar != null) {
            int i = atvtVar.b;
            if ((i & 1) == 0 || (i & 2) == 0) {
                return false;
            }
            atvu atvuVar = atvtVar.e;
            if (atvuVar == null) {
                atvuVar = atvu.a;
            }
            atvw atvwVar = atvuVar.b;
            if (atvwVar == null) {
                atvwVar = atvw.a;
            }
            if ((atvwVar.b & 2) == 0) {
                return false;
            }
            atvv atvvVar = atvtVar.f;
            if (atvvVar == null) {
                atvvVar = atvv.a;
            }
            apoj apojVar = atvvVar.b;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 256) == 0) {
                return false;
            }
            atvv atvvVar2 = atvtVar.f;
            if (atvvVar2 == null) {
                atvvVar2 = atvv.a;
            }
            apoj apojVar2 = atvvVar2.b;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            return (apojVar2.b & 8192) != 0;
        }
        return false;
    }

    private final View q(ViewGroup viewGroup, Bundle bundle, LayoutInflater layoutInflater) {
        String str;
        arag aragVar;
        if (bundle != null) {
            str = bundle.getString("SAVED_VERIFICATION_CODE", "");
        } else {
            atvu atvuVar = this.a.e;
            if (atvuVar == null) {
                atvuVar = atvu.a;
            }
            atvw atvwVar = atvuVar.b;
            if (atvwVar == null) {
                atvwVar = atvw.a;
            }
            str = atvwVar.c;
        }
        View inflate = layoutInflater.inflate(R.layout.verification_result_error_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.body);
        this.d = (CodeInputView) inflate.findViewById(R.id.code_input_view);
        this.c = (Button) inflate.findViewById(R.id.resend_code_button);
        this.ai = (ImageButton) inflate.findViewById(R.id.close_button);
        this.b = (ContentLoadingProgressBar) inflate.findViewById(R.id.progress_bar);
        atvt atvtVar = this.a;
        arag aragVar2 = null;
        if ((atvtVar.b & 1) != 0) {
            aragVar = atvtVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        atvt atvtVar2 = this.a;
        if ((atvtVar2.b & 2) != 0 && (aragVar2 = atvtVar2.d) == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        this.d.g(str);
        this.d.e(str.length() < 6 ? str.length() : 5);
        this.d.b = this;
        Button button = this.c;
        atvv atvvVar = this.a.f;
        if (atvvVar == null) {
            atvvVar = atvv.a;
        }
        apoj apojVar = atvvVar.b;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        arag aragVar3 = apojVar.i;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        button.setText(ajgl.b(aragVar3));
        this.c.setOnClickListener(new wjl(this, 1));
        ImageButton imageButton = this.ai;
        if (imageButton != null) {
            imageButton.setOnClickListener(new wjl(this));
        }
        return inflate;
    }

    @Override // defpackage.whu
    public final void a() {
        this.b.a();
        wjm wjmVar = this.ag;
        if (wjmVar != null) {
            wjmVar.aP();
        }
    }

    @Override // defpackage.whu
    public final void b(atwh atwhVar) {
        this.b.a();
        wjm wjmVar = this.ag;
        if (wjmVar != null) {
            wjmVar.aQ(atwhVar);
        }
    }

    @Override // defpackage.whu
    public final void c(atwc atwcVar, long j) {
        this.b.a();
        wjm wjmVar = this.ag;
        if (wjmVar != null) {
            wjmVar.aR(atwcVar, j);
        }
    }

    @Override // defpackage.whw
    public final void d(atwe atweVar) {
        this.b.a();
        wjm wjmVar = this.ag;
        if (wjmVar != null) {
            wjmVar.aS(atweVar);
        }
    }

    @Override // defpackage.whw
    public final void e() {
        this.b.a();
        wjm wjmVar = this.ag;
        if (wjmVar != null) {
            wjmVar.aP();
        }
    }

    @Override // defpackage.whw
    public final void g(atvt atvtVar) {
        this.b.a();
        wjm wjmVar = this.ag;
        if (wjmVar != null) {
            wjmVar.aT(atvtVar);
        }
    }

    @Override // defpackage.wif
    public final void h(String str) {
        aqxo.p(p(this.a));
        this.ah.getClass();
        this.ag.getClass();
        this.b.b();
        whx whxVar = new whx(this, this.ah);
        Long valueOf = Long.valueOf(this.aj);
        apzg apzgVar = this.a.g;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        whxVar.c(valueOf, str, apzgVar);
        this.c.setEnabled(false);
        this.d.setEnabled(false);
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        try {
            Bundle bundle2 = this.m;
            this.a = (atvt) aphq.i(bundle2, "ARG_RENDERER", atvt.a, aoos.b());
            asbk b = asbk.b(bundle2.getInt("ARG_CODE_DELIVERY_METHOD"));
            this.e = b;
            if (b == null) {
                this.e = asbk.CODE_DELIVERY_METHOD_UNKNOWN;
            }
            this.ae = bundle2.getString("ARG_COUNTRY_CODE");
            this.af = bundle2.getString("ARG_PHONE_NUMBER");
            this.aj = bundle2.getLong("ARG_IDV_REQUEST_ID");
        } catch (aopx e) {
            String valueOf = String.valueOf(atvt.class.getName());
            throw new RuntimeException(valueOf.length() != 0 ? "Failed to parse a known parcelable proto ".concat(valueOf) : new String("Failed to parse a known parcelable proto "), e);
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        this.a.getClass();
        aqxo.p(this.e != asbk.CODE_DELIVERY_METHOD_UNKNOWN);
        this.ae.getClass();
        this.af.getClass();
        Context b = wpu.b(mJ());
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(b);
        FrameLayout frameLayout = new FrameLayout(b);
        if (p(this.a)) {
            frameLayout.addView(q(frameLayout, bundle, cloneInContext));
        } else {
            zep.l("PhoneVerificationCodeInputErrorScreenRenderer invalid.");
            wjm wjmVar = this.ag;
            if (wjmVar != null) {
                wjmVar.aP();
            }
        }
        return frameLayout;
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dt mJ = mJ();
        View view = this.O;
        if (mJ == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        Bundle bundle = new Bundle();
        LayoutInflater cloneInContext = ((LayoutInflater) mJ.getSystemService("layout_inflater")).cloneInContext(wpu.b(mJ));
        oz(bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        View q = q(viewGroup, bundle, cloneInContext);
        viewGroup.removeAllViews();
        viewGroup.addView(q);
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putString("SAVED_VERIFICATION_CODE", this.d.b());
    }
}

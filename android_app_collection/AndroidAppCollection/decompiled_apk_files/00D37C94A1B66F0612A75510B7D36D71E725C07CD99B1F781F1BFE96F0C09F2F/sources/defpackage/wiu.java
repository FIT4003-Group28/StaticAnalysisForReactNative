package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wiu  reason: default package */
/* loaded from: classes4.dex */
public final class wiu extends wij implements wif, whw {
    public CodeInputView a;
    private atwc ae;
    private long af;
    public wit b;
    public aafo c;
    private ImageButton d;
    private ContentLoadingProgressBar e;

    private final View o(ViewGroup viewGroup, Bundle bundle, LayoutInflater layoutInflater) {
        arag aragVar;
        String str = "";
        if (bundle != null) {
            str = bundle.getString("SAVED_VERIFICATION_CODE", str);
        }
        atwc atwcVar = this.ae;
        if ((atwcVar.b & 2) != 0) {
            aragVar = atwcVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        View inflate = layoutInflater.inflate(R.layout.verification_code_entry_fragment, viewGroup, false);
        this.a = (CodeInputView) inflate.findViewById(R.id.code_input_view);
        this.e = (ContentLoadingProgressBar) inflate.findViewById(R.id.progress_bar);
        ((TextView) inflate.findViewById(R.id.title)).setText(b);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.back_arrow_button);
        this.d = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: wir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wiu wiuVar = wiu.this;
                if (wiuVar.b != null) {
                    wiuVar.a.c();
                    wiuVar.b.a();
                }
            }
        });
        this.a.g(str);
        CodeInputView codeInputView = this.a;
        codeInputView.b = this;
        codeInputView.e(str.length() < 6 ? str.length() : 5);
        this.a.post(new Runnable() { // from class: wis
            @Override // java.lang.Runnable
            public final void run() {
                wiu.this.a.h();
            }
        });
        return inflate;
    }

    @Override // defpackage.whw
    public final void d(atwe atweVar) {
        this.e.a();
        wit witVar = this.b;
        if (witVar != null) {
            witVar.c(atweVar);
        }
    }

    @Override // defpackage.whw
    public final void e() {
        this.e.a();
        wit witVar = this.b;
        if (witVar != null) {
            witVar.b();
        }
    }

    @Override // defpackage.whw
    public final void g(atvt atvtVar) {
        this.e.a();
        wit witVar = this.b;
        if (witVar != null) {
            witVar.d(atvtVar);
        }
    }

    @Override // defpackage.wif
    public final void h(String str) {
        apzg apzgVar;
        this.e.b();
        this.a.setEnabled(false);
        whx whxVar = new whx(this, this.c);
        Long valueOf = Long.valueOf(this.af);
        atwc atwcVar = this.ae;
        if (atwcVar.c == 3) {
            apzgVar = (apzg) atwcVar.d;
        } else {
            apzgVar = apzg.a;
        }
        whxVar.c(valueOf, str, apzgVar);
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        this.af = bundle2.getLong("ARG_IDV_REQUEST_ID");
        byte[] byteArray = bundle2.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.ae = (atwc) aopi.parseFrom(atwc.a, byteArray, aoos.b());
            } catch (aopx e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        Context b = wpu.b(mJ());
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(b);
        FrameLayout frameLayout = new FrameLayout(b);
        atwc atwcVar = this.ae;
        if (atwcVar == null || (atwcVar.b & 2) == 0 || atwcVar.c != 3) {
            zep.l("PhoneVerificationCodeInputScreenRenderer invalid.");
            wit witVar = this.b;
            if (witVar != null) {
                witVar.b();
            }
        } else {
            frameLayout.addView(o(frameLayout, bundle, cloneInContext));
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
        LayoutInflater cloneInContext = ((LayoutInflater) mJ.getSystemService("layout_inflater")).cloneInContext(wpu.b(mJ));
        Bundle bundle = new Bundle();
        oz(bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        View o = o(viewGroup, bundle, cloneInContext);
        viewGroup.removeAllViews();
        viewGroup.addView(o);
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putString("SAVED_VERIFICATION_CODE", this.a.b());
    }
}

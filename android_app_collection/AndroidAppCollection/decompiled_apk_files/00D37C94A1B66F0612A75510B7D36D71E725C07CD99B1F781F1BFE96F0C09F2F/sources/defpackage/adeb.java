package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import com.google.android.libraries.youtube.mdx.manualpairing.TvCodeEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;
/* compiled from: PG */
/* renamed from: adeb  reason: default package */
/* loaded from: classes.dex */
public final class adeb extends addl {
    public adea a;

    @Override // defpackage.dp
    public final void lJ(Bundle bundle) {
        super.lJ(bundle);
        adea adeaVar = this.a;
        if (!zdg.e(adeaVar.a)) {
            adeaVar.g.requestFocus();
        }
        InputMethodManager inputMethodManager = (InputMethodManager) adeaVar.a.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(adeaVar.g, 1);
        }
        if (bundle != null) {
            adeaVar.g.setText(bundle.getString("extraTvCode"));
        }
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        this.a.e.N();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        adea adeaVar = this.a;
        View inflate = layoutInflater.inflate(R.layout.mdx_updated_use_tv_code_fragment, viewGroup, false);
        Context context = inflate.getContext();
        TypedValue typedValue = new TypedValue();
        boolean z = context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
        if (((inflate.getResources().getConfiguration().uiMode & 48) == 16) ^ z) {
            ((oa) adeaVar.a).getDelegate().u(true != z ? 2 : 1);
        }
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(MdxPairingEndpointOuterClass.mdxPairingEndpoint, atdo.a);
        adeaVar.b.d(acuo.a(27854), (apzg) aopcVar.mo39build(), null);
        adeaVar.f = (TextInputLayout) inflate.findViewById(R.id.tv_code_layout);
        int integer = context.getResources().getInteger(R.integer.mdx_use_tv_code_max_length);
        adeaVar.h = context.getResources().getInteger(R.integer.mdx_use_tv_code_full_code_length);
        adeaVar.g = (TvCodeEditText) inflate.findViewById(R.id.tv_code);
        addz addzVar = new addz(adeaVar, adeaVar.g, integer, adeaVar.h);
        adeaVar.g.addTextChangedListener(addzVar);
        adeaVar.g.setOnKeyListener(addzVar);
        adeaVar.g.setOnTouchListener(addzVar);
        adeaVar.g.requestFocus();
        adeaVar.i = (Button) inflate.findViewById(R.id.connect);
        adeaVar.i.getBackground().setColorFilter(zhn.d(adeaVar.a, R.attr.ytIconDisabled), PorterDuff.Mode.MULTIPLY);
        adeaVar.i.setTextColor(zhn.d(adeaVar.a, R.attr.ytTextDisabled));
        adeaVar.i.setEnabled(false);
        adeaVar.i.setOnClickListener(new addw(adeaVar, 1));
        adeaVar.b.n(new acte(acuo.b(27855)));
        inflate.findViewById(R.id.learn_more).setOnClickListener(new addw(adeaVar));
        adeaVar.b.n(new acte(acuo.b(27856)));
        return inflate;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.a.e.O();
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putString("extraTvCode", String.valueOf(this.a.g.mo589getText()));
    }
}

package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DropdownRendererOuterClass;
/* compiled from: PG */
/* renamed from: ajul  reason: default package */
/* loaded from: classes.dex */
public final class ajul extends ov {
    public final asof a;
    public ImageButton b;
    public TextInputLayout c;
    public EditText d;
    public Spinner e;
    public Spinner f;
    public EditText g;
    public final ajum h;
    private final ampq i;

    public ajul(Context context, zhf zhfVar, asof asofVar, ampq ampqVar, ajum ajumVar) {
        super(context, zhfVar.a);
        this.a = asofVar;
        this.i = ampqVar;
        this.h = ajumVar;
        setContentView(R.layout.legal_report_form);
    }

    public final void a() {
        ajum ajumVar = this.h;
        ajumVar.d.b(ajumVar.a, this, this.d.getText().toString(), (aqrc) this.e.getSelectedItem(), (aqrc) this.f.getSelectedItem(), false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ov, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        super.onCreate(bundle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Drawable a = akf.a(getContext(), 2131232439);
        yzh.e(a, zhn.d(getContext(), R.attr.ytBrandIconInactive), PorterDuff.Mode.SRC_IN);
        toolbar.q(a);
        toolbar.r(new ajuh(this, 1));
        asof asofVar = this.a;
        arag aragVar5 = null;
        if ((asofVar.b & 1) != 0) {
            aragVar = asofVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        toolbar.w(ajgl.b(aragVar));
        toolbar.o(R.string.cancel);
        ImageButton imageButton = (ImageButton) findViewById(R.id.send_report);
        this.b = imageButton;
        imageButton.setOnClickListener(new ajuh(this));
        ImageButton imageButton2 = this.b;
        apok apokVar = this.a.n;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 256) != 0) {
            apok apokVar2 = this.a.n;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            aragVar2 = apojVar2.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        imageButton2.setContentDescription(ajgl.b(aragVar2));
        if (this.i.h()) {
            TextView textView = (TextView) findViewById(R.id.timestamp_label);
            asof asofVar2 = this.a;
            if ((asofVar2.b & 2) != 0) {
                aragVar4 = asofVar2.d;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            zag.m(textView, ajgl.b(aragVar4));
            ((TextView) findViewById(R.id.timestamp)).setText(((ajuo) this.i.c()).toString());
            findViewById(R.id.timestamp_container).setVisibility(0);
        }
        YouTubeTextView youTubeTextView = (YouTubeTextView) findViewById(R.id.description_hint);
        asof asofVar3 = this.a;
        if ((asofVar3.b & 32) != 0) {
            aragVar3 = asofVar3.g;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        youTubeTextView.setText(ajgl.b(aragVar3));
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.description_container);
        this.c = textInputLayout;
        textInputLayout.C(false);
        EditText editText = (EditText) findViewById(R.id.description);
        this.d = editText;
        asof asofVar4 = this.a;
        if ((asofVar4.b & 32) != 0 && (aragVar5 = asofVar4.g) == null) {
            aragVar5 = arag.a;
        }
        editText.setContentDescription(ajgl.b(aragVar5));
        this.d.addTextChangedListener(new ajuk(this));
        if (this.a.f > 0) {
            this.c.k(true);
            this.c.l(this.a.f);
            this.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.a.f)});
        }
        ajui ajuiVar = new ajui(this);
        this.e = (Spinner) findViewById(R.id.issue_type);
        if ((this.a.b & 256) != 0) {
            Spinner spinner = this.e;
            Context context = getContext();
            aunb aunbVar = this.a.j;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            spinner.setAdapter((SpinnerAdapter) new ajug(context, (aqrd) ajjh.l(aunbVar, DropdownRendererOuterClass.dropdownRenderer)));
            this.e.setOnTouchListener(ajuiVar);
            Spinner spinner2 = this.e;
            aunb aunbVar2 = this.a.j;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            spinner2.setOnItemSelectedListener(new ajuj(this, spinner2, ((aqrd) ajjh.l(aunbVar2, DropdownRendererOuterClass.dropdownRenderer)).d));
            this.e.setVisibility(0);
        }
        this.f = (Spinner) findViewById(R.id.affiliation);
        if ((this.a.b & 512) != 0) {
            Spinner spinner3 = this.f;
            Context context2 = getContext();
            aunb aunbVar3 = this.a.k;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            spinner3.setAdapter((SpinnerAdapter) new ajug(context2, (aqrd) ajjh.l(aunbVar3, DropdownRendererOuterClass.dropdownRenderer)));
            this.f.setOnTouchListener(ajuiVar);
            Spinner spinner4 = this.f;
            aunb aunbVar4 = this.a.k;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            spinner4.setOnItemSelectedListener(new ajuj(this, spinner4, ((aqrd) ajjh.l(aunbVar4, DropdownRendererOuterClass.dropdownRenderer)).d));
            this.f.setVisibility(0);
        }
        this.g = (EditText) findViewById(R.id.name);
        asof asofVar5 = this.a;
        if ((asofVar5.b & 2048) != 0) {
            EditText editText2 = this.g;
            arag aragVar6 = asofVar5.l;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            editText2.setContentDescription(ajgl.b(aragVar6));
            TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(R.id.name_container);
            textInputLayout2.C(true);
            textInputLayout2.o = true;
            arag aragVar7 = this.a.l;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
            textInputLayout2.B(ajgl.b(aragVar7));
            textInputLayout2.setVisibility(0);
        }
        TextView textView2 = (TextView) findViewById(R.id.name_subtext);
        arag aragVar8 = this.a.m;
        if (aragVar8 == null) {
            aragVar8 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar8));
        TextView textView3 = (TextView) findViewById(R.id.required);
        arag aragVar9 = this.a.i;
        if (aragVar9 == null) {
            aragVar9 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar9));
        TextView textView4 = (TextView) findViewById(R.id.footer);
        arag aragVar10 = this.a.h;
        if (aragVar10 == null) {
            aragVar10 = arag.a;
        }
        zag.m(textView4, ajgl.b(aragVar10));
    }
}

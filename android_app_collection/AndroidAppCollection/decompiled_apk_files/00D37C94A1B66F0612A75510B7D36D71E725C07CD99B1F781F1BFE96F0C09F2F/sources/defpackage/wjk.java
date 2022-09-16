package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wjk  reason: default package */
/* loaded from: classes4.dex */
public final class wjk extends wim implements CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener, TextWatcher, whu {
    public static final /* synthetic */ int al = 0;
    public Button a;
    public String ae;
    public asbk af = asbk.CODE_DELIVERY_METHOD_UNKNOWN;
    public String ag;
    public wjj ah;
    public aafo ai;
    public zhf aj;
    public aken ak;
    private TextView am;
    private TextView an;
    private ImageButton ao;
    private Spinner ap;
    private TextView aq;
    private View ar;
    private LinearLayout as;
    private ArrayList at;
    private List au;
    private Map av;
    private Map aw;
    public ContentLoadingProgressBar b;
    public EditText c;
    public atwh d;
    public String e;

    private final View aE(ViewGroup viewGroup, Bundle bundle, LayoutInflater layoutInflater) {
        String str;
        String str2;
        String str3;
        asbk asbkVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        arag aragVar6;
        ViewGroup viewGroup2;
        Spanned spanned;
        LayoutInflater layoutInflater2 = layoutInflater;
        if (bundle != null) {
            str2 = bundle.getString("SAVED_COUNTRY_CODE");
            str3 = bundle.getString("SAVED_PHONE_NUMBER");
            asbkVar = asbk.b(bundle.getInt("SAVED_CODE_DELIVERY_METHOD"));
            if (asbkVar == null) {
                asbkVar = asbk.CODE_DELIVERY_METHOD_UNKNOWN;
            }
            str = bundle.getString("SAVED_ERROR_MESSAGE");
        } else {
            str = null;
            str2 = null;
            str3 = null;
            asbkVar = null;
        }
        boolean z = false;
        ViewGroup viewGroup3 = (ViewGroup) layoutInflater2.inflate(R.layout.verification_phone_entry_fragment, viewGroup, false);
        this.b = (ContentLoadingProgressBar) viewGroup3.findViewById(R.id.progress_bar);
        this.am = (TextView) viewGroup3.findViewById(R.id.title);
        this.ao = (ImageButton) viewGroup3.findViewById(R.id.back_arrow_button);
        this.ap = (Spinner) viewGroup3.findViewById(R.id.countries);
        this.a = (Button) viewGroup3.findViewById(R.id.send_code_button);
        this.c = (EditText) viewGroup3.findViewById(R.id.phone_number_field);
        this.aq = (TextView) viewGroup3.findViewById(R.id.phone_number_label);
        this.ar = viewGroup3.findViewById(R.id.phone_number_underline);
        this.an = (TextView) viewGroup3.findViewById(R.id.error_message);
        this.as = (LinearLayout) viewGroup3.findViewById(R.id.code_delivery_radio_group);
        atwh atwhVar = this.d;
        if ((atwhVar.b & 1) != 0) {
            aragVar = atwhVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        atwg atwgVar = this.d.g;
        if (atwgVar == null) {
            atwgVar = atwg.a;
        }
        apoj apojVar = atwgVar.b;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 256) != 0) {
            atwg atwgVar2 = this.d.g;
            if (atwgVar2 == null) {
                atwgVar2 = atwg.a;
            }
            apoj apojVar2 = atwgVar2.b;
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
        Spanned b2 = ajgl.b(aragVar2);
        atwh atwhVar2 = this.d;
        if ((atwhVar2.b & 32) != 0) {
            aragVar3 = atwhVar2.h;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        Spanned b3 = ajgl.b(aragVar3);
        atwj atwjVar = this.d.e;
        if (atwjVar == null) {
            atwjVar = atwj.a;
        }
        asia asiaVar = atwjVar.b;
        if (asiaVar == null) {
            asiaVar = asia.a;
        }
        arag aragVar7 = asiaVar.c;
        if (aragVar7 == null) {
            aragVar7 = arag.a;
        }
        Spanned b4 = ajgl.b(aragVar7);
        this.at = new ArrayList();
        atwi atwiVar = this.d.f;
        if (atwiVar == null) {
            atwiVar = atwi.a;
        }
        ashz ashzVar = atwiVar.b;
        if (ashzVar == null) {
            ashzVar = ashz.a;
        }
        int size = ashzVar.c.size();
        this.as.setWeightSum(size);
        int i = 0;
        while (i < size) {
            atwi atwiVar2 = this.d.f;
            if (atwiVar2 == null) {
                atwiVar2 = atwi.a;
            }
            ashz ashzVar2 = atwiVar2.b;
            if (ashzVar2 == null) {
                ashzVar2 = ashz.a;
            }
            ashy ashyVar = (ashy) ashzVar2.c.get(i);
            int i2 = size;
            ViewGroup viewGroup4 = (ViewGroup) layoutInflater2.inflate(R.layout.verification_phone_entry_radio_button, this.as, z);
            RadioButton radioButton = (RadioButton) viewGroup4.findViewById(R.id.radio_button);
            if ((ashyVar.b & 1) != 0) {
                aragVar6 = ashyVar.e;
                if (aragVar6 == null) {
                    aragVar6 = arag.a;
                }
            } else {
                aragVar6 = null;
            }
            radioButton.setText(ajgl.b(aragVar6));
            aken akenVar = this.ak;
            if (akenVar.a) {
                akenVar.b(radioButton);
                viewGroup2 = viewGroup3;
                spanned = b3;
                radioButton.setPaddingRelative((int) rb().getResources().getDimension(R.dimen.av_radio_button_text_spacing), radioButton.getPaddingTop(), radioButton.getPaddingEnd(), radioButton.getPaddingBottom());
            } else {
                viewGroup2 = viewGroup3;
                spanned = b3;
            }
            this.at.add(i, new jj(radioButton, ashyVar));
            this.as.addView(viewGroup4, i);
            i++;
            size = i2;
            layoutInflater2 = layoutInflater;
            viewGroup3 = viewGroup2;
            b3 = spanned;
            z = false;
        }
        ViewGroup viewGroup5 = viewGroup3;
        Spanned spanned2 = b3;
        if (asbkVar != null) {
            for (int i3 = 0; i3 < this.at.size(); i3++) {
                ashy ashyVar2 = (ashy) ((jj) this.at.get(i3)).b;
                boolean z2 = (ashyVar2.c == 3 ? ((Integer) ashyVar2.d).intValue() : 0) == asbkVar.d;
                ((RadioButton) ((jj) this.at.get(i3)).a).setChecked(z2);
                if (z2) {
                    this.af = asbkVar;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.at.size(); i4++) {
                boolean z3 = ((ashy) ((jj) this.at.get(i4)).b).h;
                ((RadioButton) ((jj) this.at.get(i4)).a).setChecked(z3);
                if (z3) {
                    ashy ashyVar3 = (ashy) ((jj) this.at.get(i4)).b;
                    this.af = asbk.b(ashyVar3.c == 3 ? ((Integer) ashyVar3.d).intValue() : 0);
                }
            }
        }
        if (str3 != null) {
            this.e = str3;
            this.c.setText(str3);
        }
        this.am.setText(b);
        this.a.setText(b2.toString().toUpperCase(Locale.getDefault()));
        this.aq.setText(b4);
        this.ao.setOnClickListener(new wji(this, 1));
        this.a.setOnClickListener(new wji(this));
        this.au = new ArrayList();
        this.av = new HashMap();
        this.aw = new HashMap();
        ArrayAdapter arrayAdapter = new ArrayAdapter(mJ(), R.layout.country_spinner_item);
        atwi atwiVar3 = this.d.d;
        if (atwiVar3 == null) {
            atwiVar3 = atwi.a;
        }
        ashz ashzVar3 = atwiVar3.b;
        if (ashzVar3 == null) {
            ashzVar3 = ashz.a;
        }
        Spanned spanned3 = null;
        for (ashy ashyVar4 : ashzVar3.c) {
            if ((ashyVar4.b & 1) != 0) {
                aragVar4 = ashyVar4.e;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            Spanned b5 = ajgl.b(aragVar4);
            if ((ashyVar4.b & 2) != 0) {
                aragVar5 = ashyVar4.f;
                if (aragVar5 == null) {
                    aragVar5 = arag.a;
                }
            } else {
                aragVar5 = null;
            }
            Spanned b6 = ajgl.b(aragVar5);
            String str4 = ashyVar4.c == 2 ? (String) ashyVar4.d : "";
            if (TextUtils.equals(str2, str4)) {
                this.ae = str4;
            } else {
                if (TextUtils.isEmpty(str2) && ashyVar4.h) {
                    this.ae = str4;
                }
                this.au.add(b5);
                this.av.put(b5, b6);
                this.aw.put(b5, str4);
            }
            spanned3 = b5;
            this.au.add(b5);
            this.av.put(b5, b6);
            this.aw.put(b5, str4);
        }
        List list = this.au;
        Collections.sort(list, utr.c);
        arrayAdapter.addAll(list);
        arrayAdapter.setDropDownViewResource(R.layout.country_spinner_dropdown_item);
        this.ap.setAdapter((SpinnerAdapter) arrayAdapter);
        this.ap.setSelection(this.au.indexOf(spanned3));
        this.c.setHint((CharSequence) this.av.get(spanned3));
        aF();
        if (str != null) {
            s(str);
        } else if (!TextUtils.isEmpty(spanned2)) {
            s(spanned2.toString());
        }
        this.c.post(new Runnable() { // from class: wjh
            @Override // java.lang.Runnable
            public final void run() {
                wjk wjkVar = wjk.this;
                wjkVar.c.requestFocus();
                wjkVar.r();
            }
        });
        return viewGroup5;
    }

    private final void aF() {
        Button button = this.a;
        boolean z = false;
        if (!TextUtils.isEmpty(this.ae) && !TextUtils.isEmpty(this.e) && this.af.d > 0) {
            z = true;
        }
        button.setEnabled(z);
        p();
    }

    private final void aG() {
        EditText editText = this.c;
        if (editText != null) {
            editText.removeTextChangedListener(this);
        }
        Spinner spinner = this.ap;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(null);
        }
        if (this.at != null) {
            for (int i = 0; i < this.at.size(); i++) {
                ((RadioButton) ((jj) this.at.get(i)).a).setOnCheckedChangeListener(null);
            }
        }
    }

    private final void aH() {
        EditText editText = this.c;
        if (editText != null) {
            editText.addTextChangedListener(this);
        }
        Spinner spinner = this.ap;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        if (this.at != null) {
            for (int i = 0; i < this.at.size(); i++) {
                ((RadioButton) ((jj) this.at.get(i)).a).setOnCheckedChangeListener(this);
            }
        }
    }

    @Override // defpackage.dp
    public final void V(boolean z) {
        if (!z) {
            this.c.requestFocus();
            r();
        }
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        aG();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        aH();
    }

    @Override // defpackage.whu
    public final void a() {
        this.a.setEnabled(true);
        this.b.a();
        q();
        wjj wjjVar = this.ah;
        if (wjjVar != null) {
            wjjVar.aM();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // defpackage.whu
    public final void b(atwh atwhVar) {
        this.a.setEnabled(true);
        this.b.a();
        q();
        wjj wjjVar = this.ah;
        if (wjjVar != null) {
            wjjVar.aN(atwhVar);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // defpackage.whu
    public final void c(atwc atwcVar, long j) {
        this.a.setEnabled(true);
        this.b.a();
        q();
        wjj wjjVar = this.ah;
        if (wjjVar != null) {
            wjjVar.aO(atwcVar, j);
        }
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        byte[] byteArray = this.m.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.d = (atwh) aopi.parseFrom(atwh.a, byteArray, aoos.b());
            } catch (aopx e) {
                String valueOf = String.valueOf(atwh.class.getName());
                throw new RuntimeException(valueOf.length() != 0 ? "Failed to parse a known parcelable proto ".concat(valueOf) : new String("Failed to parse a known parcelable proto "), e);
            }
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(layoutInflater.getContext(), this.aj.a);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        atwh atwhVar = this.d;
        if (atwhVar != null && (atwhVar.b & 1) != 0) {
            atwg atwgVar = atwhVar.g;
            if (atwgVar == null) {
                atwgVar = atwg.a;
            }
            apoj apojVar = atwgVar.b;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 256) != 0) {
                atwg atwgVar2 = atwhVar.g;
                if (atwgVar2 == null) {
                    atwgVar2 = atwg.a;
                }
                apoj apojVar2 = atwgVar2.b;
                if (apojVar2 == null) {
                    apojVar2 = apoj.a;
                }
                if ((apojVar2.b & 8192) != 0) {
                    atwj atwjVar = atwhVar.e;
                    if (atwjVar == null) {
                        atwjVar = atwj.a;
                    }
                    asia asiaVar = atwjVar.b;
                    if (asiaVar == null) {
                        asiaVar = asia.a;
                    }
                    if ((asiaVar.b & 2) != 0) {
                        atwi atwiVar = atwhVar.f;
                        if (atwiVar == null) {
                            atwiVar = atwi.a;
                        }
                        ashz ashzVar = atwiVar.b;
                        if (ashzVar == null) {
                            ashzVar = ashz.a;
                        }
                        if (ashzVar.c.size() > 0) {
                            atwi atwiVar2 = atwhVar.d;
                            if (atwiVar2 == null) {
                                atwiVar2 = atwi.a;
                            }
                            ashz ashzVar2 = atwiVar2.b;
                            if (ashzVar2 == null) {
                                ashzVar2 = ashz.a;
                            }
                            if (ashzVar2.c.size() > 0) {
                                frameLayout.addView(aE(frameLayout, bundle, cloneInContext));
                                return frameLayout;
                            }
                        }
                    }
                }
            }
        }
        zep.l("PhoneVerificationContactNumberInputScreenRenderer invalid.");
        wjj wjjVar = this.ah;
        if (wjjVar != null) {
            wjjVar.aM();
        }
        return frameLayout;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            for (int i = 0; i < this.at.size(); i++) {
                if (((jj) this.at.get(i)).a == compoundButton) {
                    ashy ashyVar = (ashy) ((jj) this.at.get(i)).b;
                    this.af = asbk.b(ashyVar.c == 3 ? ((Integer) ashyVar.d).intValue() : 0);
                } else {
                    ((RadioButton) ((jj) this.at.get(i)).a).setChecked(false);
                }
            }
            aF();
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context rb = rb();
        View view = this.O;
        if (rb == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        aG();
        Bundle bundle = new Bundle();
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(rb, this.aj.a));
        oz(bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        View aE = aE(viewGroup, bundle, from);
        viewGroup.removeAllViews();
        viewGroup.addView(aE);
        aH();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.aw.get(this.au.get(i));
        if (!TextUtils.equals(str, this.ae)) {
            this.c.setHint((CharSequence) this.av.get(this.au.get(i)));
            this.ae = str;
            aF();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        p();
        this.e = this.c.getText().toString();
        aF();
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putInt("SAVED_CODE_DELIVERY_METHOD", this.af.d);
        bundle.putString("SAVED_COUNTRY_CODE", this.ae);
        bundle.putString("SAVED_PHONE_NUMBER", this.e);
        bundle.putString("SAVED_ERROR_MESSAGE", this.an.getText().toString());
    }

    public final void p() {
        dt mJ = mJ();
        if (mJ != null) {
            this.as.setVisibility(0);
            this.an.setVisibility(8);
            this.an.setText("");
            this.ar.setBackgroundColor(zhn.d(mJ, R.attr.ytCallToAction));
        }
    }

    public final void q() {
        dt mJ = mJ();
        if (mJ != null) {
            ((InputMethodManager) mJ.getSystemService("input_method")).hideSoftInputFromWindow(this.c.getWindowToken(), 0);
        }
    }

    public final void r() {
        Context rb = rb();
        if (rb != null) {
            ((InputMethodManager) rb.getSystemService("input_method")).showSoftInput(this.c, 0);
        }
    }

    public final void s(String str) {
        dt mJ = mJ();
        if (mJ == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.as.setVisibility(8);
        this.an.setVisibility(0);
        this.an.setText(str);
        this.ar.setBackgroundColor(ake.d(mJ, R.color.av_error_text));
    }
}

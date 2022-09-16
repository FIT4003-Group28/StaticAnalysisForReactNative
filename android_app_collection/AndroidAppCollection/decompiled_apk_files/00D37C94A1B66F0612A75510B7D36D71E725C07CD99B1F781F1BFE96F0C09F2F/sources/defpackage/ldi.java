package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ldi  reason: default package */
/* loaded from: classes3.dex */
public final class ldi extends lcb {
    public aafo ae;
    public afvn af;
    public acrr ag;
    acti ah;
    aurq ai;
    ldh aj;
    public String ak;
    public RadioGroup al;
    public RadioGroup am;
    public ScrollView an;
    public acgf ao;
    public apwt ap;

    public static ldi aG(aurq aurqVar, acti actiVar) {
        aurqVar.getClass();
        ldi ldiVar = new ldi();
        ldiVar.ah = actiVar;
        Bundle bundle = new Bundle();
        aphq.m(bundle, "renderer", aurqVar);
        ldiVar.ae(bundle);
        return ldiVar;
    }

    private final RadioGroup.OnCheckedChangeListener aK() {
        return new RadioGroup.OnCheckedChangeListener() { // from class: ldd
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                ldi ldiVar = ldi.this;
                ldiVar.ak = ((RadioButton) radioGroup.findViewById(i)).getText().toString();
                if (radioGroup.equals(ldiVar.al)) {
                    ldiVar.aI(ldiVar.am);
                } else if (!radioGroup.equals(ldiVar.am)) {
                } else {
                    ldiVar.aI(ldiVar.al);
                }
            }
        };
    }

    public final String aH() {
        String x = apwt.x();
        String a = this.ap.a();
        if (x.isEmpty() || a.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(x.length() + 1 + String.valueOf(a).length());
        sb.append(x);
        sb.append("-");
        sb.append(a);
        return sb.toString();
    }

    public final void aI(RadioGroup radioGroup) {
        radioGroup.setOnCheckedChangeListener(null);
        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(aK());
    }

    public final void aJ(LayoutInflater layoutInflater, RadioGroup radioGroup, aurw aurwVar) {
        auro auroVar;
        auro auroVar2;
        TextView textView = (TextView) layoutInflater.inflate(R.layout.voice_language_selector_section_title, (ViewGroup) radioGroup, false);
        arag aragVar = aurwVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        radioGroup.addView(textView);
        for (aurp aurpVar : aurwVar.c) {
            final RadioButton radioButton = (RadioButton) layoutInflater.inflate(R.layout.voice_language_selector_item, (ViewGroup) radioGroup, false);
            radioButton.setId(View.generateViewId());
            if (aurpVar.b == 64166933) {
                auroVar = (auro) aurpVar.c;
            } else {
                auroVar = auro.a;
            }
            radioButton.setText(auroVar.c);
            radioGroup.addView(radioButton);
            if (aurpVar.b == 64166933) {
                auroVar2 = (auro) aurpVar.c;
            } else {
                auroVar2 = auro.a;
            }
            if (akzj.i(auroVar2.e, this.ak)) {
                radioButton.setChecked(true);
                this.an.post(new Runnable() { // from class: ldf
                    @Override // java.lang.Runnable
                    public final void run() {
                        ldi.this.an.scrollTo(0, Math.round(radioButton.getY()));
                    }
                });
            }
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        aoqu aoquVar;
        super.mQ(bundle);
        try {
            aoquVar = aphq.j(this.m, "renderer", aurq.a, aoos.b());
        } catch (RuntimeException unused) {
            zep.b("Failed to merge proto for renderer");
            aoquVar = null;
        }
        this.ai = (aurq) aoquVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [char] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // defpackage.dp
    public final View mc(final LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String valueOf;
        super.mc(layoutInflater, viewGroup, bundle);
        if (mJ() instanceof ldh) {
            this.aj = (ldh) mJ();
        }
        View inflate = layoutInflater.inflate(R.layout.voice_language_selector_fragment, viewGroup, false);
        this.an = (ScrollView) inflate.findViewById(R.id.scroll_view);
        ((TextView) inflate.findViewById(R.id.title)).setText(R.string.select_voice_language);
        this.al = (RadioGroup) inflate.findViewById(R.id.suggested_language_group);
        this.am = (RadioGroup) inflate.findViewById(R.id.all_language_group);
        ylx.i(this.ao.d(), new ylw() { // from class: lde
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                auro auroVar;
                ldi ldiVar = ldi.this;
                LayoutInflater layoutInflater2 = layoutInflater;
                ldiVar.ak = (String) obj;
                ArrayList arrayList = new ArrayList(Arrays.asList(ldiVar.al, ldiVar.am));
                int i = 0;
                loop0: while (true) {
                    if (i >= ldiVar.ai.e.size()) {
                        i = -1;
                        break;
                    }
                    for (aurp aurpVar : ((aurw) ldiVar.ai.e.get(i)).c) {
                        if (aurpVar.b == 64166933) {
                            auroVar = (auro) aurpVar.c;
                        } else {
                            auroVar = auro.a;
                        }
                        if (akzj.i(auroVar.e, ldiVar.ak)) {
                            break loop0;
                        }
                    }
                    i++;
                }
                for (int i2 = 0; i2 < ldiVar.ai.e.size(); i2++) {
                    aurw aurwVar = (aurw) ldiVar.ai.e.get(i2);
                    if (!aurwVar.d || i == i2) {
                        ldiVar.aJ(layoutInflater2, (RadioGroup) arrayList.get(i2), aurwVar);
                    } else {
                        LinearLayout linearLayout = (LinearLayout) layoutInflater2.inflate(R.layout.voice_language_selector_section_title_collapsed, (ViewGroup) arrayList.get(i2), false);
                        TextView textView = (TextView) linearLayout.findViewById(R.id.collapsed_title_text);
                        arag aragVar = aurwVar.b;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                        textView.setText(ajgl.b(aragVar));
                        ((RadioGroup) arrayList.get(i2)).addView(linearLayout);
                        linearLayout.setOnClickListener(new ldg(ldiVar, layoutInflater2, (RadioGroup) arrayList.get(i2), aurwVar));
                    }
                }
                ldiVar.ah.n(new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_SELECTION));
            }
        });
        TextView textView = (TextView) inflate.findViewById(R.id.cancel_button);
        CharSequence text = rh().getText(17039360);
        if (text instanceof String) {
            valueOf = akzj.h((String) text);
        } else {
            int length = text.length();
            char[] cArr = new char[length];
            for (int i = 0; i < length; i++) {
                int charAt = text.charAt(i);
                if (akzj.j(charAt)) {
                    charAt ^= 32;
                }
                cArr[i] = (char) charAt;
            }
            valueOf = String.valueOf(cArr);
        }
        textView.setText(valueOf);
        textView.setOnClickListener(new ldc(this, 1));
        this.ah.n(new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_CANCEL_BUTTON));
        TextView textView2 = (TextView) inflate.findViewById(R.id.apply_button);
        textView2.setText(rh().getText(R.string.ok_button));
        textView2.setOnClickListener(new ldc(this));
        this.ah.n(new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_SELECTION));
        this.al.setOnCheckedChangeListener(aK());
        this.am.setOnCheckedChangeListener(aK());
        return inflate;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        dt mJ = mJ();
        if (mJ instanceof ldh) {
            ((ldh) mJ).b();
        }
    }
}

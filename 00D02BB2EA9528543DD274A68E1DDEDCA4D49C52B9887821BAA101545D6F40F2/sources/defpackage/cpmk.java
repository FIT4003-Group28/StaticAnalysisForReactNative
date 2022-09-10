package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.addressinput.widget.components.DelayAutocompleteTextView;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: cpmk  reason: default package */
/* loaded from: classes5.dex */
public final class cpmk {
    private static final LinearLayout.LayoutParams o = new LinearLayout.LayoutParams(-1, -2);
    public final UUID a;
    public Context b;
    public DelayAutocompleteTextView c;
    public cpmx d;
    public cpnm e;
    public cpms f;
    public cpmm g;
    public final cpnu h;
    private final ViewGroup i;
    private cpnf j;
    private TextView k;
    private TextView l;
    private RadioGroup m;
    private dhab n;

    public cpmk(Context context, ViewGroup viewGroup) {
        cpnk cpnkVar = new cpnk();
        this.h = cpnkVar;
        UUID randomUUID = UUID.randomUUID();
        this.a = randomUUID;
        String uuid = randomUUID.toString();
        if (uuid != null) {
            cpnkVar.b = uuid;
            this.i = viewGroup;
            this.b = context;
            if (context != null) {
                cpnkVar.a = context;
                this.j = new cpnf(context);
                this.f = cpms.d().a();
                TextView textView = (TextView) this.j.a.inflate(R.layout.address_textview, (ViewGroup) null, false);
                this.k = textView;
                textView.setText(R.string.address_label);
                View view = this.k;
                ViewGroup.LayoutParams layoutParams = o;
                viewGroup.addView(view, layoutParams);
                DelayAutocompleteTextView delayAutocompleteTextView = (DelayAutocompleteTextView) this.j.a.inflate(R.layout.address_autocomplete_textview, (ViewGroup) null, false);
                this.c = delayAutocompleteTextView;
                delayAutocompleteTextView.a(new cpmg(this));
                viewGroup.addView(this.c, layoutParams);
                TextView textView2 = (TextView) this.j.a.inflate(R.layout.address_feedback_textview, (ViewGroup) null, false);
                this.l = textView2;
                if (textView2 != null) {
                    cpnkVar.d = textView2;
                    RadioGroup radioGroup = (RadioGroup) this.j.a.inflate(R.layout.feedback_suggestion_options, (ViewGroup) null, false);
                    this.m = radioGroup;
                    if (radioGroup != null) {
                        cpnkVar.e = radioGroup;
                        LinearLayout linearLayout = new LinearLayout(this.b);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(this.l);
                        linearLayout.addView(this.m);
                        viewGroup.addView(linearLayout, layoutParams);
                        a();
                        cpnkVar.c(new cpmh(this));
                        return;
                    }
                    throw new NullPointerException("Null feedbackSuggestions");
                }
                throw new NullPointerException("Null feedbackMessage");
            }
            throw new NullPointerException("Null context");
        }
        throw new NullPointerException("Null feedbackLoopId");
    }

    public final void a() {
        this.k.setVisibility(true != this.f.a() ? 8 : 0);
        int b = (int) (this.f.b() * this.b.getResources().getDisplayMetrics().density);
        if (od.s(this.c) == 1) {
            DelayAutocompleteTextView delayAutocompleteTextView = this.c;
            delayAutocompleteTextView.setPadding(b, delayAutocompleteTextView.getPaddingTop(), this.c.getPaddingLeft(), this.c.getPaddingBottom());
        } else {
            DelayAutocompleteTextView delayAutocompleteTextView2 = this.c;
            delayAutocompleteTextView2.setPadding(delayAutocompleteTextView2.getPaddingLeft(), this.c.getPaddingTop(), b, this.c.getPaddingBottom());
        }
        cpnu cpnuVar = this.h;
        String c = this.f.c();
        if (c != null) {
            ((cpnk) cpnuVar).g = c;
            return;
        }
        throw new NullPointerException("Null addressLanguage");
    }

    public final dehn<Boolean> b() {
        if (f()) {
            cpnv b = this.h.b();
            if (c() != cpnd.USER_INPUT_NOT_VERIFIED) {
                b.k();
                return deha.a(true);
            }
            String d = d();
            b.d().setTextColor(akm.c(b.a(), R.color.feedback_error_text_color));
            dstm bZ = dstn.b.bZ();
            String g = b.g();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            g.getClass();
            ((dstn) bZ.b).a = g;
            dstn bK = bZ.bK();
            dhai bZ2 = dhaj.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhaj dhajVar = (dhaj) bZ2.b;
            d.getClass();
            dhajVar.b();
            dhajVar.a.add(d);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            bK.getClass();
            ((dhaj) bZ2.b).b = bK;
            dhaj bK2 = bZ2.bK();
            dhac bZ3 = dhad.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            bK2.getClass();
            ((dhad) bZ3.b).a = bK2;
            dhad bK3 = bZ3.bK();
            dhae bZ4 = dhaf.d.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            bK3.getClass();
            ((dhaf) bZ4.b).b = bK3;
            String b2 = b.b();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            b2.getClass();
            ((dhaf) bZ4.b).c = b2;
            if (b.f() != null) {
                dhab f = b.f();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                f.getClass();
                ((dhaf) bZ4.b).a = f;
            }
            dhaf bK4 = bZ4.bK();
            b.a = bK4;
            return deew.h(deew.h(b.c().a(bK4), new cpno(b), dege.a), new cpmj(this, b), dege.a);
        }
        throw new IllegalStateException("Feedback controller was not set. You must set feedback controller when using methods that require one.");
    }

    public final cpnd c() {
        return this.c.b;
    }

    public final String d() {
        return this.c.getText().toString();
    }

    public final void e(dgrn dgrnVar) {
        dhaa bZ = dhab.c.bZ();
        dhag bZ2 = dhah.c.bZ();
        int i = dgrnVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhah dhahVar = (dhah) bZ2.b;
        dhahVar.a = i;
        dhahVar.b = dgrnVar.c;
        dhah bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bK.getClass();
        ((dhab) bZ.b).a = bK;
        dhab bK2 = bZ.bK();
        this.n = bK2;
        ((cpnk) this.h).f = bK2;
    }

    public final boolean f() {
        return this.e != null;
    }
}

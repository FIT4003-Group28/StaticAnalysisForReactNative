package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.text.DateFormat;
import java.util.GregorianCalendar;
/* compiled from: PG */
/* renamed from: vyc  reason: default package */
/* loaded from: classes4.dex */
public final class vyc implements vyd {
    private static final CharSequence o = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
    public final vxk a;
    public final GregorianCalendar b;
    public final View c;
    public final TextView d;
    public final EditText e;
    public final EditText f;
    public final EditText g;
    public DateFormat h;
    public final vxu i;
    public boolean j;
    public boolean k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    private final aafo p;
    private final TextView q;

    public vyc(Context context, aafo aafoVar, vxk vxkVar, View view, TextView textView, TextView textView2) {
        this.a = vxkVar;
        this.p = aafoVar;
        view.getClass();
        textView.getClass();
        this.q = textView;
        textView2.getClass();
        this.d = textView2;
        View findViewById = view.findViewById(R.id.no_gplus_content);
        findViewById.getClass();
        this.c = findViewById;
        EditText editText = (EditText) view.findViewById(R.id.given_name);
        editText.getClass();
        this.e = editText;
        EditText editText2 = (EditText) view.findViewById(R.id.family_name);
        editText2.getClass();
        this.f = editText2;
        EditText editText3 = (EditText) view.findViewById(R.id.birthday);
        editText3.getClass();
        this.g = editText3;
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: vxy
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                vyc vycVar = vyc.this;
                if (z) {
                    vycVar.g.performClick();
                }
            }
        });
        vya vyaVar = new vya(this);
        editText.addTextChangedListener(vyaVar);
        editText2.addTextChangedListener(vyaVar);
        editText3.addTextChangedListener(vyaVar);
        this.i = new vxu(context, (EditText) view.findViewById(R.id.gender_text), (Spinner) view.findViewById(R.id.gender_spinner));
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.b = gregorianCalendar;
        gregorianCalendar.setTimeInMillis(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aatn aatnVar, Bundle bundle) {
        aatnVar.getClass();
        this.k = true;
        this.e.setHint(aatnVar.b());
        this.f.setHint(aatnVar.a());
        if (bundle == null) {
            this.e.setText(aatnVar.d());
            this.f.setText(aatnVar.c());
        }
        CharSequence charSequence = null;
        for (CharSequence charSequence2 : aatnVar.e(this.p)) {
            charSequence = charSequence == null ? charSequence2 : TextUtils.concat(charSequence, o, charSequence2);
        }
        if (!aatnVar.g()) {
            this.e.setInputType(0);
        }
        if (!aatnVar.f()) {
            this.f.setInputType(0);
        }
        this.q.setText(charSequence);
        this.l = aatnVar.h(3);
        this.m = aatnVar.h(1);
        this.n = aatnVar.h(2);
    }

    @Override // defpackage.vyd
    public final void aH(int i, int i2, int i3) {
        this.b.set(i, i2, i3);
        b();
    }

    public final void b() {
        this.g.setText(this.h.format(Long.valueOf(this.b.getTimeInMillis())));
    }

    public final boolean c() {
        return !TextUtils.isEmpty(this.g.getText());
    }

    public final boolean d() {
        return !TextUtils.isEmpty(this.e.getText()) && !TextUtils.isEmpty(this.f.getText());
    }
}

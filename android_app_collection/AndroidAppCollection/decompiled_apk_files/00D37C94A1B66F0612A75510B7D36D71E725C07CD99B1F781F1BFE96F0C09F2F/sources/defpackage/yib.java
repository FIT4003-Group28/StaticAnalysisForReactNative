package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import java.text.NumberFormat;
import java.text.ParseException;
/* compiled from: PG */
/* renamed from: yib  reason: default package */
/* loaded from: classes4.dex */
public final class yib {
    public final Context a;
    public final View b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final EditText g;
    public final ImageView h;
    public final ajnj i;
    public final ajnj j;
    public final ajnj k;
    public final CircularImageView l;
    public final ajxz m;
    public final NumberFormat n;
    public boolean o;
    public final yhy p;
    public aopc q;
    private final View r;
    private final View s;
    private final InputMethodManager t;
    private final NumberFormat u;
    private boolean v;

    public yib(Context context, ajmr ajmrVar, ajxz ajxzVar, InputMethodManager inputMethodManager, View view) {
        this.a = context;
        view.getClass();
        this.r = view;
        ajxzVar.getClass();
        this.m = ajxzVar;
        this.t = inputMethodManager;
        View findViewById = view.findViewById(R.id.decrement);
        this.b = findViewById;
        View findViewById2 = view.findViewById(R.id.increment);
        this.c = findViewById2;
        this.d = (TextView) view.findViewById(R.id.header);
        this.s = view.findViewById(R.id.amount_underline);
        TextView textView = (TextView) view.findViewById(R.id.amount);
        this.e = textView;
        this.f = (TextView) view.findViewById(R.id.additional_info);
        EditText editText = (EditText) view.findViewById(R.id.amount_input);
        this.g = editText;
        this.u = NumberFormat.getInstance();
        this.n = NumberFormat.getCurrencyInstance();
        ImageView imageView = (ImageView) view.findViewById(R.id.channel_banner);
        this.h = imageView;
        this.i = new ajnj(ajmrVar, imageView, true);
        this.j = new ajnj(ajmrVar, (ImageView) view.findViewById(R.id.channel_thumbnail), true);
        this.k = new ajnj(ajmrVar, (ImageView) view.findViewById(R.id.viewer_thumbnail), true);
        this.l = (CircularImageView) view.findViewById(R.id.tip_icon);
        yhz yhzVar = new yhz(this);
        findViewById2.setOnClickListener(yhzVar);
        findViewById.setOnClickListener(yhzVar);
        yia yiaVar = new yia(this);
        textView.setOnFocusChangeListener(yiaVar);
        textView.setOnTouchListener(yiaVar);
        editText.setOnEditorActionListener(yiaVar);
        view.setOnTouchListener(yiaVar);
        this.p = new yhy(view);
    }

    public final awix a() {
        b();
        yhy yhyVar = this.p;
        String obj = yhyVar.c.getText().toString();
        if (yhyVar.d == null || TextUtils.isEmpty(obj)) {
            yhyVar.d.d(awiy.d);
        } else {
            yhyVar.d.e(awiy.d, obj.toString());
        }
        return (awix) this.q.mo39build();
    }

    public final void b() {
        double b;
        if (this.q == null || !this.v) {
            return;
        }
        this.v = false;
        try {
            b = this.u.parse(this.g.getText().toString()).doubleValue();
        } catch (ParseException unused) {
            zep.b("Failed to parse viewer's tip currency input.");
            b = yic.b((awix) this.q.mo39build());
        }
        d(b);
        this.g.setVisibility(8);
        this.e.setVisibility(0);
        this.s.setVisibility(0);
        InputMethodManager inputMethodManager = this.t;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.g.getWindowToken(), 0);
        }
        c();
    }

    public final void c() {
        aopc aopcVar = this.q;
        if (aopcVar == null) {
            return;
        }
        double b = yic.b((awix) aopcVar.mo39build());
        this.e.setText(this.n.format(b));
        this.g.setText(this.u.format(b));
    }

    public final void d(double d) {
        aopc aopcVar = this.q;
        if (aopcVar == null || this.o) {
            return;
        }
        yic.g(aopcVar, Double.valueOf(d * 1000000.0d).longValue());
    }

    public final void e() {
        if (this.v) {
            return;
        }
        this.v = true;
        this.e.setVisibility(4);
        this.s.setVisibility(4);
        this.g.setVisibility(0);
        EditText editText = this.g;
        editText.setSelection(editText.getText().length());
        this.g.requestFocusFromTouch();
        InputMethodManager inputMethodManager = this.t;
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(this.g, 0);
    }
}

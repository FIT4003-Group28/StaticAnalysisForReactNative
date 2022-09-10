package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cpnv  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpnv {
    public dhaf a;

    public static final String n(dhaf dhafVar) {
        dhad dhadVar = dhafVar.b;
        if (dhadVar == null) {
            dhadVar = dhad.c;
        }
        dhaj dhajVar = dhadVar.a;
        if (dhajVar == null) {
            dhajVar = dhaj.c;
        }
        return dhajVar.a.get(0);
    }

    public abstract Context a();

    public abstract String b();

    public abstract cpnm c();

    public abstract TextView d();

    public abstract RadioGroup e();

    public abstract dhab f();

    public abstract String g();

    public abstract dcdc<cpnn> h();

    public final void i(String str) {
        new Handler(Looper.getMainLooper()).post(new cpnp(this, str));
    }

    public final void j(dgzr dgzrVar) {
        new Handler(Looper.getMainLooper()).post(new cpnq(this, dgzrVar));
    }

    public final void k() {
        new Handler(Looper.getMainLooper()).post(new cpnt(this));
    }

    public final void l() {
        for (int i = 0; i < e().getChildCount(); i++) {
            e().getChildAt(i).setVisibility(8);
        }
    }

    public final void m() {
        d().setTextColor(akm.c(a(), R.color.feedback_valid_text_color));
    }

    public final void o(RadioButton radioButton, String str, View.OnClickListener onClickListener) {
        radioButton.setTextSize(0, a().getResources().getDimension(R.dimen.feedback_suggestions_textsize));
        radioButton.setText(Html.fromHtml(str));
        radioButton.setOnClickListener(onClickListener);
        radioButton.setVisibility(0);
    }
}

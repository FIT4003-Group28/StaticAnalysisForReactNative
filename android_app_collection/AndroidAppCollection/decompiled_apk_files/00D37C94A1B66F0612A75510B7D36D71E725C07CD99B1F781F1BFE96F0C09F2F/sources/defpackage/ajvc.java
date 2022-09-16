package defpackage;

import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajvc  reason: default package */
/* loaded from: classes.dex */
final class ajvc implements View.OnClickListener {
    public final TextView a;
    public final Spinner b;
    public final RadioButton c;
    public final View d;
    final /* synthetic */ ajvd e;

    public ajvc(ajvd ajvdVar, View view) {
        this.e = ajvdVar;
        this.c = (RadioButton) view.findViewById(R.id.report_form_top_level_radio);
        this.a = (TextView) view.findViewById(R.id.report_form_top_level_text);
        this.b = (Spinner) view.findViewById(R.id.report_form_top_level_spinner);
        this.d = view.findViewById(R.id.report_form_top_level_separator);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton radioButton = this.c;
        radioButton.setChecked(!radioButton.isChecked());
        if (this.c.isChecked()) {
            this.e.b((atui) this.c.getTag());
        } else {
            this.e.b(null);
        }
    }
}

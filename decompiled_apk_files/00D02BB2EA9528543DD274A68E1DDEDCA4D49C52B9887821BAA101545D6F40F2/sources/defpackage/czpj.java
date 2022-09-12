package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czpj  reason: default package */
/* loaded from: classes5.dex */
public final class czpj extends LinearLayout {
    private final Button a;
    private final Button b;

    public czpj(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_invitation, (ViewGroup) this, true);
        Button button = (Button) findViewById(R.id.survey_prompt_take_survey_button);
        this.a = button;
        Button button2 = (Button) findViewById(R.id.survey_prompt_no_thanks_button);
        this.b = button2;
        a(button);
        a(button2);
    }

    private final void a(Button button) {
        czox.b(findViewById(R.id.survey_prompt_buttons), button, 0, R.dimen.survey_button_accessibility_padding);
    }

    public void setOnAcceptSurveyClickListener(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            return;
        }
        this.a.setOnClickListener(onClickListener);
    }

    public void setOnDeclineSurveyClickListener(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            return;
        }
        this.b.setOnClickListener(onClickListener);
    }
}

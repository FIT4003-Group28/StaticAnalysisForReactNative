package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czqc  reason: default package */
/* loaded from: classes5.dex */
public final class czqc extends LinearLayout {
    public czqb a;

    public czqc(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_open_text_item, (ViewGroup) this, true);
    }

    public void setOnOpenTextResponseListener(czqb czqbVar) {
        this.a = czqbVar;
    }

    public void setUpOpenTextView(dubd dubdVar) {
        EditText editText = (EditText) findViewById(R.id.survey_open_text);
        editText.setSingleLine(false);
        if (!dubdVar.a.isEmpty()) {
            editText.setHint(dubdVar.a);
        }
        if (!czph.n(getContext())) {
            editText.requestFocus();
        }
        editText.addTextChangedListener(new czqa(this));
    }
}

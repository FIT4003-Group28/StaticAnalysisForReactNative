package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hin  reason: default package */
/* loaded from: classes3.dex */
public final class hin {
    public final EditText a;
    public final Context b;
    public hic c;

    public hin(Context context, ViewGroup viewGroup) {
        this.b = context;
        EditText editText = (EditText) viewGroup.findViewById(R.id.search_input_text);
        this.a = editText;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hil
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                hin hinVar = hin.this;
                if (i == 3) {
                    String obj = hinVar.a.getText().toString();
                    if (hinVar.c == null || amps.e(obj)) {
                        return true;
                    }
                    zag.i(hinVar.a);
                    hinVar.a.clearFocus();
                    hid hidVar = hinVar.c.a;
                    akho akhoVar = hidVar.af;
                    akhoVar.o = 4;
                    akhoVar.e = obj;
                    hidVar.q(obj);
                    return true;
                }
                return false;
            }
        });
        View findViewById = viewGroup.findViewById(R.id.cancel_icon);
        editText.addTextChangedListener(new him(this, findViewById));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hik
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                hic hicVar;
                hin hinVar = hin.this;
                if (!z || (hicVar = hinVar.c) == null) {
                    return;
                }
                hicVar.a(hinVar.a.getText().toString());
            }
        });
        viewGroup.findViewById(R.id.search_cancel).setOnClickListener(new hij(this, 1));
        findViewById.setOnClickListener(new hij(this));
    }
}

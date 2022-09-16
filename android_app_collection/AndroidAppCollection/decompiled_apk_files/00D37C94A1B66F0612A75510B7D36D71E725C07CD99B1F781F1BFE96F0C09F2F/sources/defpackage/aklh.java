package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aklh  reason: default package */
/* loaded from: classes.dex */
public final class aklh {
    final EditText a;
    final ImageView b;
    final /* synthetic */ akli c;

    public aklh(akli akliVar, View view) {
        this.c = akliVar;
        new akpg(akliVar.a, (ImageView) view.findViewById(R.id.sharer_thumbnail));
        EditText editText = (EditText) view.findViewById(R.id.message_input);
        this.a = editText;
        ImageView imageView = (ImageView) view.findViewById(R.id.inline_send_button);
        this.b = imageView;
        view.findViewById(R.id.message_input_shadow);
        editText.addTextChangedListener(new aklg(this));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: aklf
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                aklh aklhVar = aklh.this;
                for (akoj akojVar : aklhVar.c.b) {
                    akojVar.l();
                }
                if (!aklhVar.a.isInputMethodTarget() || z) {
                    return;
                }
                zag.i(aklhVar.a);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: akle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                for (akoj akojVar : aklh.this.c.b) {
                    akojVar.f();
                }
            }
        });
    }
}

package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: cdwi  reason: default package */
/* loaded from: classes4.dex */
public final class cdwi extends cdwl {
    public final Resources a;
    public final m b;
    public final View c;

    public cdwi(m mVar, cebd cebdVar, Resources resources, View view) {
        super(view, cebdVar);
        this.b = mVar;
        this.a = resources;
        this.c = view;
    }

    public final void a(Runnable runnable) {
        super.j(runnable);
    }

    public final <T extends CharSequence> void b(v<T> vVar) {
        View view = this.c;
        if (view instanceof TextView) {
            final TextView textView = (TextView) view;
            vVar.b(this.b, new aa(textView) { // from class: cdwg
                private final TextView a;

                {
                    this.a = textView;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    TextView textView2 = this.a;
                    CharSequence charSequence = (CharSequence) obj;
                    String charSequence2 = textView2.getText().toString();
                    String charSequence3 = charSequence == null ? null : charSequence.toString();
                    if (charSequence3 == null || !charSequence3.contentEquals(charSequence2)) {
                        textView2.setText(charSequence);
                    }
                }
            });
        }
    }

    public final void c(cjtd cjtdVar) {
        super.g(cjtdVar);
    }

    public final void d(ddho ddhoVar) {
        super.i(ddhoVar);
    }

    public final void e(v<Boolean> vVar) {
        am.a(vVar, cdwc.a).b(this.b, new aa(this) { // from class: cdwb
            private final cdwi a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.c.setVisibility(true != ((Boolean) obj).booleanValue() ? 0 : 8);
            }
        });
    }

    public final void f(z<CharSequence> zVar) {
        View view = this.c;
        if (view instanceof EditText) {
            ((EditText) view).addTextChangedListener(new cdwh(zVar));
        }
        b(zVar);
    }

    @Override // defpackage.cdwl
    public final /* bridge */ /* synthetic */ void g(cjtd cjtdVar) {
        super.g(cjtdVar);
    }
}

package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akbp  reason: default package */
/* loaded from: classes.dex */
final class akbp implements View.OnClickListener {
    public String a;
    private final akbv b;

    public akbp(akbv akbvVar) {
        this.b = akbvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int length;
        akbv akbvVar = this.b;
        if (akbvVar != null) {
            String str = this.a;
            if (akbvVar.g.getSelectionEnd() >= 0) {
                length = akbvVar.g.getSelectionEnd();
            } else {
                length = akbvVar.g.getText().length();
            }
            akbvVar.g.getEditableText().insert(length, akbvVar.c.e(str));
            aqup aqupVar = (aqup) akbvVar.c.a.get(str);
            if (aqupVar == null || !aqupVar.g) {
                akbvVar.e.clear();
                akbvVar.d.e();
                akbvVar.d.a(akbvVar.c.e(str), akbvVar.c.b(str), akbvVar.a.getResources().getDimension(R.dimen.emoji_height), str, akbvVar.g.getId(), akbvVar.e, null);
                return;
            }
            akbvVar.j = true;
            akbvVar.e(akbvVar.g.getEditableText());
            akbvVar.j = false;
        }
    }
}

package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.apps.gmm.base.components.edittext.IncognitoAwareEditText;
import com.google.android.apps.gmm.settings.preference.CustomEditTextPreference;
/* compiled from: PG */
/* renamed from: btla  reason: default package */
/* loaded from: classes4.dex */
public final class btla extends atp {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atp, defpackage.aug
    public final void aJ(View view) {
        super.aJ(view);
        EditText editText = (EditText) view.findViewById(16908291);
        dbsk.s(editText);
        editText.setImeOptions(new IncognitoAwareEditText(editText.getContext()).getImeOptions() | editText.getImeOptions());
        int i = ((CustomEditTextPreference) aN()).h;
    }
}

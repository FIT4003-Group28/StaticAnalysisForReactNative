package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.youtube.app.extensions.social.controller.MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ihv  reason: default package */
/* loaded from: classes3.dex */
public final class ihv implements TextWatcher {
    final /* synthetic */ ihz a;

    public ihv(ihz ihzVar) {
        this.a = ihzVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int selectionStart;
        ihz ihzVar = this.a;
        if (ihzVar.l != null || !ihzVar.f() || (selectionStart = ihzVar.b.getSelectionStart()) <= 0 || "@﹫＠+﹢＋".indexOf(ihzVar.b.getText().charAt(selectionStart - 1)) == -1 || ihzVar.o >= 10) {
            if (ihzVar.l == null) {
                return;
            }
            if (ihzVar.f()) {
                Editable text = ihzVar.b.getText();
                int selectionStart2 = ihzVar.b.getSelectionStart();
                boolean z = false;
                boolean z2 = selectionStart2 > 0 && text.charAt(selectionStart2 + (-1)) == ' ';
                if (selectionStart2 >= 2 && text.charAt(selectionStart2 - 2) == ' ') {
                    z = true;
                }
                if (((!ihzVar.n && !z) || !z2) && text.getSpanStart(ihzVar.l) < text.getSpanEnd(ihzVar.l)) {
                    Editable text2 = ihzVar.b.getText();
                    ihzVar.h.d(text2.subSequence(text2.getSpanStart(ihzVar.l) + 1, text2.getSpanEnd(ihzVar.l)).toString());
                    return;
                }
            }
            ihzVar.b();
            return;
        }
        int selectionStart3 = ihzVar.b.getSelectionStart();
        ihzVar.l = new MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan();
        ihzVar.b.getText().setSpan(ihzVar.l, selectionStart3 - 1, selectionStart3, 34);
        ihzVar.h.e();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() <= 0 || i >= charSequence.length() || i < 0 || charSequence.charAt(i) != '\n') {
            return;
        }
        this.a.b();
    }
}

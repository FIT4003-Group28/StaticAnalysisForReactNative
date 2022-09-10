package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: bhuk  reason: default package */
/* loaded from: classes3.dex */
final class bhuk implements Runnable {
    final /* synthetic */ EditText a;
    final /* synthetic */ View b;
    final /* synthetic */ bhul c;

    public bhuk(bhul bhulVar, EditText editText, View view) {
        this.c = bhulVar;
        this.a = editText;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bhul bhulVar = this.c;
        if (!bhulVar.aD) {
            return;
        }
        if (bhulVar.af.C()) {
            this.a.requestFocus();
            bwrs<ilo> bwrsVar = this.c.ae;
            if (bwrsVar != null && bwrsVar.c() != null) {
                bwrs<ilo> bwrsVar2 = this.c.ae;
                dbsk.s(bwrsVar2);
                ilo c = bwrsVar2.c();
                dbsk.s(c);
                if (c.bi()) {
                    bhul bhulVar2 = this.c;
                    if (!bhulVar2.ag && !bhulVar2.ah) {
                        EditText editText = this.a;
                        bwrs<ilo> bwrsVar3 = bhulVar2.ae;
                        dbsk.s(bwrsVar3);
                        ilo c2 = bwrsVar3.c();
                        dbsk.s(c2);
                        editText.setSelection(c2.bh().length());
                        ((InputMethodManager) this.c.J().getSystemService("input_method")).toggleSoftInput(1, 1);
                    }
                }
            }
            if (!TextUtils.isEmpty(this.a.getText())) {
                EditText editText2 = this.a;
                editText2.setSelection(editText2.getText().length());
            }
            ((InputMethodManager) this.c.J().getSystemService("input_method")).toggleSoftInput(1, 1);
        }
        View d = cqkx.d(this.b, bhwd.c);
        if (d != null) {
            bhul.q(d);
        }
        View d2 = cqkx.d(this.b, bhwd.d);
        if (d2 == null) {
            return;
        }
        bhul.q(d2);
    }
}

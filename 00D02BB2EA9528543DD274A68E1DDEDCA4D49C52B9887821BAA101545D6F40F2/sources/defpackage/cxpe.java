package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxpe  reason: default package */
/* loaded from: classes5.dex */
public final class cxpe implements TextView.OnEditorActionListener {
    final /* synthetic */ cxpn a;

    public cxpe(cxpn cxpnVar) {
        this.a = cxpnVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            if (!TextUtils.isEmpty(this.a.e.mo48getText())) {
                if (this.a.g.b()) {
                    if (this.a.g()) {
                        return true;
                    }
                    this.a.g.a();
                    return true;
                }
                this.a.g.a();
                return true;
            }
            cxpn cxpnVar = this.a;
            ((InputMethodManager) cxpnVar.b.getSystemService("input_method")).hideSoftInputFromWindow(cxpnVar.a.getWindowToken(), 0);
        }
        return false;
    }
}

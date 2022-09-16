package defpackage;

import android.widget.AutoCompleteTextView;
/* renamed from: bkcp  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkcp implements dbsl {
    static final dbsl a = new bkcp();

    private bkcp() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) obj;
        cqjg cqjgVar = bkdb.a;
        return autoCompleteTextView != null && autoCompleteTextView.getVisibility() == 0;
    }
}

package defpackage;

import android.widget.EditText;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hqu  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class hqu implements dbsl {
    static final dbsl a = new hqu();

    private hqu() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        EditText editText = (EditText) obj;
        cqjg cqjgVar = hqv.a;
        return editText != null && editText.getVisibility() == 0;
    }
}

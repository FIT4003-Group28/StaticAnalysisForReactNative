package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.gmm.base.components.edittext.IncognitoAwareEditText;
/* compiled from: PG */
/* renamed from: hmu  reason: default package */
/* loaded from: classes.dex */
public final class hmu extends IncognitoAwareEditText {
    public final bxnq a;
    private boolean b;

    public hmu(Context context) {
        super(context);
        this.b = false;
        this.a = new bxnq(context);
    }

    @Override // defpackage.xj, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        return this.b ? new hmt(this, onCreateInputConnection) : onCreateInputConnection;
    }

    public void setCompletionsEnabled(boolean z) {
        this.b = z;
    }
}

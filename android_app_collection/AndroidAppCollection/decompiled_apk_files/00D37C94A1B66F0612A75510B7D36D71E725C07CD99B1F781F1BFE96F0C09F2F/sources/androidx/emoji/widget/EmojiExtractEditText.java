package androidx.emoji.widget;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiExtractEditText extends ExtractEditText {
    private aoe a;
    private boolean b;

    public EmojiExtractEditText(Context context) {
        super(context);
        b(null, 0, 0);
    }

    private final aoe a() {
        if (this.a == null) {
            this.a = new aoe(this);
        }
        return this.a;
    }

    private final void b(AttributeSet attributeSet, int i, int i2) {
        if (!this.b) {
            this.b = true;
            int i3 = new bqf(this, attributeSet, i, i2).a;
            aoe a = a();
            hz.f(i3, "maxEmojiCount should be greater than 0");
            a.a.b.a = i3;
            setKeyListener(super.getKeyListener());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        aoe a = a();
        if (onCreateInputConnection == null) {
            return null;
        }
        return onCreateInputConnection instanceof aog ? onCreateInputConnection : new aog(a.a.a, onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kz.o(this, callback));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            a();
            if (!(keyListener instanceof aoj)) {
                keyListener = new aoj(keyListener);
            }
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, 16842862, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(attributeSet, i, i2);
    }
}

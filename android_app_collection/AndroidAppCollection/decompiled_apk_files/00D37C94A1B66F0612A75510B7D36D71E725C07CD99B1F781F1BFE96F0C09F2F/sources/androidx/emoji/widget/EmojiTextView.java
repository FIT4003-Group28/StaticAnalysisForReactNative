package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiTextView extends TextView {
    private aol a;
    private boolean b;

    public EmojiTextView(Context context) {
        super(context);
        b();
    }

    private final aol a() {
        if (this.a == null) {
            this.a = new aol(this);
        }
        return this.a;
    }

    private final void b() {
        if (!this.b) {
            this.b = true;
            a().a.h();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ib ibVar = a().a;
        if (z) {
            ibVar.h();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kz.o(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        ib ibVar = a().a;
        int length = inputFilterArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (inputFilterArr[i] instanceof aoi) {
                    break;
                }
                i++;
            } else {
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = ((aok) ibVar).a;
                inputFilterArr = inputFilterArr2;
                break;
            }
        }
        super.setFilters(inputFilterArr);
    }

    public EmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}

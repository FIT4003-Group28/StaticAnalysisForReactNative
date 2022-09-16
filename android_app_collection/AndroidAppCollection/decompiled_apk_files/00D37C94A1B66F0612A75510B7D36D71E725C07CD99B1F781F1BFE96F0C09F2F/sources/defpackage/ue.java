package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ue  reason: default package */
/* loaded from: classes4.dex */
public class ue extends EditText implements kk {
    private final ty a;
    private final uz b;
    private final uw c;

    public ue(Context context) {
        this(context, null);
    }

    @Override // defpackage.kk
    public final jw a(jw jwVar) {
        return lb.d(this, jwVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.a();
        }
        uz uzVar = this.b;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    /* renamed from: getText */
    public final Editable mo589getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] stringArray;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        uz.s(this, onCreateInputConnection, editorInfo);
        le.c(onCreateInputConnection, editorInfo, this);
        String[] ar = lj.ar(this);
        if (onCreateInputConnection == null || ar == null) {
            return onCreateInputConnection;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = ar;
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", ar);
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", ar);
        }
        ul ulVar = new ul(this);
        hy.q(editorInfo, "editorInfo must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new alt(onCreateInputConnection, ulVar);
        }
        if (Build.VERSION.SDK_INT >= 25) {
            stringArray = editorInfo.contentMimeTypes;
            if (stringArray == null) {
                stringArray = als.a;
            }
        } else if (editorInfo.extras == null) {
            stringArray = als.a;
        } else {
            String[] stringArray2 = editorInfo.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            stringArray = stringArray2 == null ? editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES") : stringArray2;
            if (stringArray == null) {
                stringArray = als.a;
            }
        }
        return stringArray.length == 0 ? onCreateInputConnection : new alu(onCreateInputConnection, ulVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        jr jsVar;
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && lj.ar(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (!(context instanceof Activity)) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            }
            if (activity == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't handle drop: no activity: view=");
                sb.append(this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    if (Build.VERSION.SDK_INT >= 31) {
                        jsVar = new jq(clipData, 3);
                    } else {
                        jsVar = new js(clipData, 3);
                    }
                    lj.o(this, ib.g(jsVar));
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        jr jsVar;
        int i2 = 16908337;
        if (i != 16908322) {
            if (i == 16908337) {
                i = 16908337;
            }
            return super.onTextContextMenuItem(i);
        }
        i2 = i;
        if (lj.ar(this) != null) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    jsVar = new jq(primaryClip, 1);
                } else {
                    jsVar = new js(primaryClip, 1);
                }
                jsVar.c(i2 == 16908322 ? 0 : 1);
                lj.o(this, ib.g(jsVar));
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kz.o(this, callback));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        uz uzVar = this.b;
        if (uzVar != null) {
            uzVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        uw uwVar;
        if (Build.VERSION.SDK_INT >= 28 || (uwVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            uwVar.a = textClassifier;
        }
    }

    public ue(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        uw uwVar;
        if (Build.VERSION.SDK_INT >= 28 || (uwVar = this.c) == null) {
            return super.getTextClassifier();
        }
        return uwVar.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aaa.a(context);
        zy.d(this, getContext());
        ty tyVar = new ty(this);
        this.a = tyVar;
        tyVar.b(attributeSet, i);
        uz uzVar = new uz(this);
        this.b = uzVar;
        uzVar.g(attributeSet, i);
        uzVar.e();
        this.c = new uw(this);
    }
}

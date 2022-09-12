package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: yf  reason: default package */
/* loaded from: classes.dex */
public final class yf {
    public TextClassifier a;
    private final TextView b;

    public yf(TextView textView) {
        this.b = textView;
    }

    public final TextClassifier a() {
        TextClassifier textClassifier = this.a;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.b.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}

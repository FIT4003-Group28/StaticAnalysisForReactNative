package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* loaded from: classes.dex */
final class x {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1415a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f1416b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(TextView textView) {
        androidx.core.util.g.a(textView);
        this.f1415a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1416b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1415a.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    public void a(TextClassifier textClassifier) {
        this.f1416b = textClassifier;
    }
}

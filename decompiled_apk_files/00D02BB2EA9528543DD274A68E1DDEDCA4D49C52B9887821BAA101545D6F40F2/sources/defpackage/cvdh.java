package defpackage;

import android.net.Uri;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: cvdh  reason: default package */
/* loaded from: classes5.dex */
public final class cvdh extends cvdg {
    private final cvde a;

    public cvdh(cvde cvdeVar) {
        this.a = cvdeVar;
    }

    @Override // defpackage.eacn, android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        URLSpan uRLSpan;
        if (motionEvent.getAction() == 1) {
            int offsetForPosition = textView.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(offsetForPosition, offsetForPosition, URLSpan.class);
            if (uRLSpanArr.length == 1 && (uRLSpan = uRLSpanArr[0]) != null) {
                cvde cvdeVar = this.a;
                Uri parse = Uri.parse(uRLSpan.getURL());
                cvdf cvdfVar = cvdeVar.a;
                if (cvdfVar.c) {
                    cvdfVar.a.c(cvdfVar.b);
                } else {
                    cvdfVar.a.a(cvdfVar.b, parse);
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}

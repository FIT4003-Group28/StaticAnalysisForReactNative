package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: akbu  reason: default package */
/* loaded from: classes.dex */
final class akbu implements TextWatcher {
    final /* synthetic */ akbv a;
    final /* synthetic */ akbv b;
    private final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public akbu(akbv akbvVar, akbv akbvVar2) {
        this.b = akbvVar;
        this.a = akbvVar2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        akbv akbvVar = this.b;
        if (akbvVar.j) {
            return;
        }
        akbvVar.j = true;
        Editable editableText = this.a.g.getEditableText();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ImageSpan imageSpan = (ImageSpan) it.next();
            int spanStart = editableText.getSpanStart(imageSpan);
            int spanEnd = editableText.getSpanEnd(imageSpan);
            editableText.removeSpan(imageSpan);
            if (spanStart != spanEnd) {
                editableText.delete(spanStart, spanEnd);
            }
        }
        this.c.clear();
        this.b.e(editableText);
        this.b.j = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ImageSpan[] imageSpanArr;
        if (!this.b.j && i2 > 0) {
            int i4 = i2 + i;
            Editable editableText = this.a.g.getEditableText();
            for (ImageSpan imageSpan : (ImageSpan[]) editableText.getSpans(i, i4, ImageSpan.class)) {
                int spanStart = editableText.getSpanStart(imageSpan);
                int spanEnd = editableText.getSpanEnd(imageSpan);
                if (spanStart < i4 && spanEnd > i) {
                    this.c.add(imageSpan);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

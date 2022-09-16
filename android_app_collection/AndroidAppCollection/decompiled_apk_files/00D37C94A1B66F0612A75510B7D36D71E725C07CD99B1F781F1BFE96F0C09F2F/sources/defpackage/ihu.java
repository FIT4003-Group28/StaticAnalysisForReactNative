package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ihu  reason: default package */
/* loaded from: classes3.dex */
public final class ihu implements TextWatcher {
    final /* synthetic */ ihz a;
    private final Map b = new HashMap();

    public ihu(ihz ihzVar) {
        this.a = ihzVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (ihy ihyVar : this.a.j) {
            UnderlineSpan underlineSpan = ihyVar.c;
            int spanStart = this.a.b.getText().getSpanStart(underlineSpan);
            int spanEnd = this.a.b.getText().getSpanEnd(underlineSpan);
            if (i + i2 >= spanStart && i < spanEnd && !this.b.containsKey(underlineSpan)) {
                this.b.put(underlineSpan, new iht(this.a.b.getText().toString().substring(spanStart, spanEnd), ihyVar));
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        while (this.b.entrySet().iterator().hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.entrySet().iterator().next();
            UnderlineSpan underlineSpan = (UnderlineSpan) entry.getKey();
            iht ihtVar = (iht) entry.getValue();
            this.b.remove(underlineSpan);
            int spanStart = this.a.b.getText().getSpanStart(underlineSpan);
            int spanEnd = this.a.b.getText().getSpanEnd(underlineSpan);
            if (this.a.b.getText().toString().isEmpty()) {
                this.a.j.clear();
                this.a.o = 0;
            } else if (spanStart >= 0 && spanEnd >= 0 && !this.a.b.getText().toString().substring(spanStart, spanEnd).equals(ihtVar.a)) {
                this.a.j.remove(ihtVar.b);
                this.a.b.getText().removeSpan(underlineSpan);
                ihz ihzVar = this.a;
                ihzVar.o--;
                if (i != spanStart) {
                    ihzVar.b.getText().replace(spanStart, spanStart + 1, "");
                }
            }
        }
    }
}

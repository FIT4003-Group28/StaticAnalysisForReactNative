package defpackage;

import android.text.Editable;
/* compiled from: PG */
/* renamed from: afpa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afpa implements Runnable {
    public final /* synthetic */ Editable a;
    public final /* synthetic */ ajwp b;
    private final /* synthetic */ int c;

    public /* synthetic */ afpa(Editable editable, ajwp ajwpVar) {
        this.a = editable;
        this.b = ajwpVar;
    }

    public /* synthetic */ afpa(Editable editable, ajwp ajwpVar, int i) {
        this.c = i;
        this.a = editable;
        this.b = ajwpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            Editable editable = this.a;
            ajwp ajwpVar = this.b;
            int spanStart = editable.getSpanStart(ajwpVar);
            int spanEnd = editable.getSpanEnd(ajwpVar);
            if (spanStart == -1 || spanEnd == -1 || spanStart >= spanEnd) {
                return;
            }
            editable.removeSpan(ajwpVar);
            editable.delete(spanStart, spanEnd);
            return;
        }
        Editable editable2 = this.a;
        ajwp ajwpVar2 = this.b;
        int spanStart2 = editable2.getSpanStart(ajwpVar2);
        int spanEnd2 = editable2.getSpanEnd(ajwpVar2);
        if (spanStart2 == -1 || spanEnd2 == -1 || spanStart2 >= spanEnd2) {
            return;
        }
        editable2.removeSpan(ajwpVar2);
        editable2.delete(spanStart2, spanEnd2);
    }
}

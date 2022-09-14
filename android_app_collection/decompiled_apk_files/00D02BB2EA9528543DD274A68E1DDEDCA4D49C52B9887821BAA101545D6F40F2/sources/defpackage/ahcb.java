package defpackage;

import android.text.Editable;
import android.text.Html;
import android.text.style.ClickableSpan;
import org.xml.sax.XMLReader;
/* compiled from: PG */
/* renamed from: ahcb  reason: default package */
/* loaded from: classes2.dex */
final class ahcb implements Html.TagHandler {
    private int a = -1;
    private final ClickableSpan b;

    public ahcb(ClickableSpan clickableSpan) {
        this.b = clickableSpan;
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (str.equals("turnOffLink")) {
            if (!z) {
                editable.setSpan(this.b, this.a, editable.length(), 33);
            } else if (this.a != -1) {
                throw new IllegalArgumentException("Turn off link should be defined only once.");
            } else {
                this.a = editable.length();
            }
        }
    }
}

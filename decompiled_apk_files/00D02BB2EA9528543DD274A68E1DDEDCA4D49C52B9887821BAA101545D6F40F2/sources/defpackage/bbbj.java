package defpackage;

import android.text.Editable;
import android.text.Html;
import android.text.style.ClickableSpan;
import org.xml.sax.XMLReader;
/* compiled from: PG */
/* renamed from: bbbj  reason: default package */
/* loaded from: classes3.dex */
final class bbbj implements Html.TagHandler {
    final /* synthetic */ ClickableSpan a;
    private int b = -1;

    public bbbj(ClickableSpan clickableSpan) {
        this.a = clickableSpan;
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (str.equals("in_app_link")) {
            if (z) {
                this.b = editable.length();
            } else {
                editable.setSpan(this.a, this.b, editable.length(), 33);
            }
        } else if (!str.equals("new_line") || !z) {
        } else {
            editable.append("\n");
        }
    }
}

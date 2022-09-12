package defpackage;

import android.text.Editable;
import android.text.Html;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import org.xml.sax.XMLReader;
/* compiled from: PG */
/* renamed from: bxyf  reason: default package */
/* loaded from: classes4.dex */
public final class bxyf implements Html.TagHandler {
    private int a = -1;
    private int b = -1;
    private final ClickableSpan c;
    private final int d;

    public bxyf(ClickableSpan clickableSpan, int i) {
        this.c = clickableSpan;
        this.d = i;
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        int i;
        if (str.equals("end_of_title")) {
            if (!z) {
                return;
            }
            if (this.a != -1) {
                throw new IllegalArgumentException("end_of_title should be set exactly once.");
            }
            this.a = editable.length();
            editable.append('\n');
        } else if (!str.equals("link_tag")) {
            if (!str.equals("body") || z || (i = this.a) == -1) {
                return;
            }
            editable.setSpan(this.c, i + 1, editable.length(), 33);
        } else if (!z) {
            editable.setSpan(new ForegroundColorSpan(this.d), this.b, editable.length(), 33);
            this.b = -1;
        } else if (this.b != -1) {
            throw new IllegalArgumentException("Links can not be nested.");
        } else {
            this.b = editable.length();
        }
    }
}

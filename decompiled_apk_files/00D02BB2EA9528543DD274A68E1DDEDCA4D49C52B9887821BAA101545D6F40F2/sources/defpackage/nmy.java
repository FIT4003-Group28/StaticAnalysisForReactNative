package defpackage;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: nmy  reason: default package */
/* loaded from: classes7.dex */
public final class nmy extends LinkMovementMethod {
    public static final nmy a = new nmy();

    @Override // android.text.method.LinkMovementMethod, android.text.method.BaseMovementMethod
    public final boolean handleMovementKey(TextView textView, Spannable spannable, int i, int i2, KeyEvent keyEvent) {
        return false;
    }
}

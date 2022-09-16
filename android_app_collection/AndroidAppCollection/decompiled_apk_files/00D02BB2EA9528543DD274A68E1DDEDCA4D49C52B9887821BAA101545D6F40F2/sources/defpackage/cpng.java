package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.addressinput.widget.components.DelayAutocompleteTextView;
/* compiled from: PG */
/* renamed from: cpng  reason: default package */
/* loaded from: classes5.dex */
public final class cpng extends Handler {
    final /* synthetic */ DelayAutocompleteTextView a;

    public cpng(DelayAutocompleteTextView delayAutocompleteTextView) {
        this.a = delayAutocompleteTextView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super/*android.widget.AutoCompleteTextView*/.performFiltering((CharSequence) message.obj, 0);
    }
}

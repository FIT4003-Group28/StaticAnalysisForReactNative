package defpackage;

import android.content.Context;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dmb  reason: default package */
/* loaded from: classes3.dex */
public final class dmb extends EditText implements TextView.OnEditorActionListener {
    public daq a;
    public daq b;
    public cyv c;
    public AtomicReference d;
    public TextWatcher e;
    private int f;

    public dmb(Context context) {
        super(context);
        this.f = -1;
        setOnEditorActionListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        daq daqVar = this.b;
        if (daqVar != null) {
            djd djdVar = new djd();
            djdVar.a = textView;
            djdVar.b = i;
            djdVar.c = keyEvent;
            return ((Boolean) daqVar.a.l().K(daqVar, djdVar)).booleanValue();
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f = getLineCount();
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        cyv cyvVar;
        super.onTextChanged(charSequence, i, i2, i3);
        daq daqVar = this.a;
        if (daqVar != null) {
            String charSequence2 = charSequence.toString();
            dlt dltVar = new dlt();
            dltVar.a = this;
            dltVar.b = charSequence2;
            daqVar.a.l().K(daqVar, dltVar);
        }
        AtomicReference atomicReference = this.d;
        if (atomicReference != null) {
            atomicReference.set(charSequence);
        }
        int lineCount = getLineCount();
        int i4 = this.f;
        if (i4 == -1 || i4 == lineCount || (cyvVar = this.c) == null) {
            return;
        }
        int i5 = dlz.Q;
        if (cyvVar.f == null) {
            return;
        }
        cyvVar.h(new ddk(0, new Object[0]), "updateState:TextInput.remeasureForUpdatedText");
    }

    public dmb(Context context, byte[] bArr) {
        this(context);
    }
}

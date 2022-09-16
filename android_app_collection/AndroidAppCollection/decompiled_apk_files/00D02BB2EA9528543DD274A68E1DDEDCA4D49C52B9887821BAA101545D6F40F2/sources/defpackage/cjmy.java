package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
/* compiled from: PG */
/* renamed from: cjmy  reason: default package */
/* loaded from: classes4.dex */
public final class cjmy extends TextInputEditText {
    public dxio<akfa> a;

    public cjmy(Context context) {
        this(context, null);
    }

    private final void a() {
        ((cjmz) bttc.a(cjmz.class, this)).xL(this);
        setImeOptions(getImeOptions());
    }

    @Override // android.widget.TextView
    public void setImeOptions(int i) {
        super.setImeOptions(isv.a(this.a.a(), i));
    }

    public cjmy(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public cjmy(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}

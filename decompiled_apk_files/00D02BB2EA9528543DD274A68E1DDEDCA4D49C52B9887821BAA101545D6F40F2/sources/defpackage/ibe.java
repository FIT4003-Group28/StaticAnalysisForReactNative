package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
/* compiled from: PG */
@Deprecated
/* renamed from: ibe  reason: default package */
/* loaded from: classes6.dex */
public final class ibe extends TextInputEditText {
    public dxio<akfa> a;

    public ibe(Context context) {
        this(context, null);
    }

    private final void a() {
        ((ibf) bttc.a(ibf.class, this)).wu(this);
        setImeOptions(getImeOptions());
    }

    @Override // android.widget.TextView
    public void setImeOptions(int i) {
        super.setImeOptions(isv.a(this.a.a(), i));
    }

    public ibe(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ibe(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}

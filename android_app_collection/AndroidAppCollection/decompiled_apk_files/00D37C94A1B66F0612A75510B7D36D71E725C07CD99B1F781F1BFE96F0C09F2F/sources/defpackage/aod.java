package defpackage;

import android.widget.EditText;
/* compiled from: PG */
/* renamed from: aod  reason: default package */
/* loaded from: classes.dex */
public final class aod {
    public final EditText a;
    public final aon b;

    public aod() {
    }

    public aod(EditText editText) {
        this();
        this.a = editText;
        aon aonVar = new aon(editText);
        this.b = aonVar;
        editText.addTextChangedListener(aonVar);
        editText.setEditableFactory(aof.a());
    }
}

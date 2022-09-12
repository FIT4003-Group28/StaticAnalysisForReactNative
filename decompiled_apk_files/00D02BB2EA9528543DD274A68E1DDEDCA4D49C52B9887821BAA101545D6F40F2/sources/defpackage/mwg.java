package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: mwg  reason: default package */
/* loaded from: classes7.dex */
public final class mwg extends EditText implements cnfn {
    @dzsi
    private cnfo a;
    private int b;
    private int c;

    public mwg(Context context) {
        super(context);
        this.a = null;
    }

    @Override // android.widget.TextView
    protected final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        cnfo cnfoVar = this.a;
        if (cnfoVar != null) {
            cnfoVar.a(this.b, this.c, i, i2);
        }
        setSelection(getText().length());
        this.b = i;
        this.c = i2;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.cnfn
    public void setCarEditableListener(cnfo cnfoVar) {
        this.a = cnfoVar;
    }

    public void setInputEnabled(boolean z) {
    }
}

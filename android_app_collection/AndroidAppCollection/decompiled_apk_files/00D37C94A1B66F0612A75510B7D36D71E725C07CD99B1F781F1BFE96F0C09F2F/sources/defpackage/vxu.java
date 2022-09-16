package defpackage;

import android.content.Context;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
/* compiled from: PG */
/* renamed from: vxu  reason: default package */
/* loaded from: classes4.dex */
public final class vxu {
    public final vxt a;
    public final EditText b;
    public final Spinner c;
    public String d;

    public vxu(Context context, EditText editText, Spinner spinner) {
        editText.getClass();
        this.b = editText;
        spinner.getClass();
        this.c = spinner;
        editText.setOnFocusChangeListener(new vxq(spinner));
        editText.setOnClickListener(new vxr(spinner));
        spinner.setOnItemSelectedListener(new vxs(this, editText));
        vxt vxtVar = new vxt(context);
        this.a = vxtVar;
        spinner.setAdapter((SpinnerAdapter) vxtVar);
    }
}

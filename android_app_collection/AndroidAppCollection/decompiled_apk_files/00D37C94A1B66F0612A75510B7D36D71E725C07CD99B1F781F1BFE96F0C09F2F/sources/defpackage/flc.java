package defpackage;

import android.content.Context;
import android.widget.CheckedTextView;
import android.widget.RadioGroup;
/* compiled from: PG */
/* renamed from: flc  reason: default package */
/* loaded from: classes3.dex */
public final class flc {
    public final Context a;
    public final RadioGroup b;
    public final CheckedTextView c;
    public nln d;
    public nlo e;

    public flc(Context context, RadioGroup radioGroup, CheckedTextView checkedTextView) {
        this.a = context;
        this.b = radioGroup;
        this.c = checkedTextView;
    }

    public final void a(boolean z) {
        this.c.setChecked(z);
        this.e.a.k = true != z ? 2 : 3;
    }
}

package defpackage;

import android.view.View;
import android.widget.Spinner;
/* compiled from: PG */
/* renamed from: vxr  reason: default package */
/* loaded from: classes4.dex */
final class vxr implements View.OnClickListener {
    final /* synthetic */ Spinner a;

    public vxr(Spinner spinner) {
        this.a = spinner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.performClick();
    }
}

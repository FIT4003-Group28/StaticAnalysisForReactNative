package defpackage;

import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: wcs  reason: default package */
/* loaded from: classes4.dex */
final class wcs implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ wbc a;
    private final /* synthetic */ int b;

    public wcs(wbc wbcVar) {
        this.a = wbcVar;
    }

    public wcs(wbc wbcVar, int i) {
        this.b = i;
        this.a = wbcVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.b == 0) {
            if (!compoundButton.isChecked()) {
                return;
            }
            this.a.m();
        } else if (!compoundButton.isChecked()) {
        } else {
            this.a.m();
        }
    }
}

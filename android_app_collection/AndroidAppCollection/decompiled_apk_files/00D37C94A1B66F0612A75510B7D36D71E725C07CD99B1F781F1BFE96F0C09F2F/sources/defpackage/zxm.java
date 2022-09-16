package defpackage;

import android.widget.Button;
import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: zxm  reason: default package */
/* loaded from: classes4.dex */
final class zxm implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ nx a;

    public zxm(nx nxVar) {
        this.a = nxVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Button b = this.a.b(-1);
        if (b != null) {
            b.setEnabled(!z);
        }
    }
}

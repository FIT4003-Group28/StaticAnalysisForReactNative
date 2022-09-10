package defpackage;

import android.widget.CompoundButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqfi  reason: default package */
/* loaded from: classes.dex */
public final class cqfi implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ cqko a;

    public cqfi(cqko cqkoVar) {
        this.a = cqkoVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (cqjz.o(compoundButton) != null) {
            this.a.a();
        }
    }
}

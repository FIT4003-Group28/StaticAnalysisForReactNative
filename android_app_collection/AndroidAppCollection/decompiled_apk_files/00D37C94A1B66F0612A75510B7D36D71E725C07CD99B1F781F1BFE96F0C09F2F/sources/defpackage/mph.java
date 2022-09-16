package defpackage;

import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: mph  reason: default package */
/* loaded from: classes3.dex */
final class mph implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ jxn a;
    final /* synthetic */ mpk b;

    public mph(mpk mpkVar, jxn jxnVar) {
        this.b = mpkVar;
        this.a = jxnVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.e(z);
        mpj mpjVar = this.b.b;
        if (mpjVar != null) {
            mpjVar.a(z);
        }
    }
}

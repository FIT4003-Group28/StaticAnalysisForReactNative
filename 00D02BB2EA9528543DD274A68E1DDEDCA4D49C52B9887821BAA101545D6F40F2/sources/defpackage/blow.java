package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: blow  reason: default package */
/* loaded from: classes3.dex */
final class blow implements DialogInterface.OnShowListener {
    final /* synthetic */ blox a;

    public blow(blox bloxVar) {
        this.a = bloxVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        ((ckhe) this.a.af.a(ckjw.I)).c();
        ((ckhe) this.a.af.a(ckjw.N)).c();
        ((ckhe) this.a.af.a(ckjw.K)).c();
        this.a.ai.e(cwsv.a("RiddlerShowNativePageEvent"));
    }
}

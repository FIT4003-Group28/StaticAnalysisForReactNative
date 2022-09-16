package defpackage;
/* compiled from: PG */
/* renamed from: dahl  reason: default package */
/* loaded from: classes5.dex */
final class dahl extends daay {
    final /* synthetic */ dahp a;

    public dahl(dahp dahpVar) {
        this.a = dahpVar;
    }

    @Override // defpackage.daay, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        dahp dahpVar = this.a;
        dahpVar.m.setChecked(!dahpVar.e());
    }
}

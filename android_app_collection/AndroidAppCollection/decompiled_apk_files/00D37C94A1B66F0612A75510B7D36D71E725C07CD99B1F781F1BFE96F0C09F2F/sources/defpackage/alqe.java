package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alqe  reason: default package */
/* loaded from: classes.dex */
public final class alqe extends allh {
    final /* synthetic */ alqj a;

    public alqe(alqj alqjVar) {
        this.a = alqjVar;
    }

    @Override // defpackage.allh, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        alqj alqjVar = this.a;
        alqjVar.m.setChecked(!alqjVar.a());
    }
}

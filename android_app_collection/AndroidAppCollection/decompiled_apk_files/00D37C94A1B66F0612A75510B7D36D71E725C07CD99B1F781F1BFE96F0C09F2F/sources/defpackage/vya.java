package defpackage;

import android.text.Editable;
/* compiled from: PG */
/* renamed from: vya  reason: default package */
/* loaded from: classes4.dex */
final class vya extends vyb {
    final /* synthetic */ vyc a;

    public vya(vyc vycVar) {
        this.a = vycVar;
    }

    @Override // defpackage.vyb, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.d.setVisibility(8);
        this.a.e.setError(null);
        this.a.f.setError(null);
        this.a.g.setError(null);
    }
}

package defpackage;

import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: izx  reason: default package */
/* loaded from: classes3.dex */
final class izx implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ izz a;

    public izx(izz izzVar) {
        this.a = izzVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        adnt adntVar = this.a.e;
        adntVar.getClass();
        adntVar.ak(true != z ? 3 : 2);
    }
}

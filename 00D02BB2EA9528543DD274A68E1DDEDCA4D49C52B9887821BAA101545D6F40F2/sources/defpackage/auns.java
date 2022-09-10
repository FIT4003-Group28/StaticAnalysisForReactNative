package defpackage;

import android.widget.RadioGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auns  reason: default package */
/* loaded from: classes2.dex */
public final class auns implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ aunt a;

    public auns(aunt auntVar) {
        this.a = auntVar;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.a.a = radioGroup.indexOfChild(radioGroup.findViewById(i));
        cqkx.p(this.a);
    }
}

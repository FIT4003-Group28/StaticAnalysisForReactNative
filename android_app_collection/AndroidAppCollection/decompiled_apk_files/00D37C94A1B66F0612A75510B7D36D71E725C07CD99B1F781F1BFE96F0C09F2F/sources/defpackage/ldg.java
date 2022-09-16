package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioGroup;
/* compiled from: PG */
/* renamed from: ldg  reason: default package */
/* loaded from: classes3.dex */
final class ldg implements View.OnClickListener {
    final RadioGroup a;
    final LayoutInflater b;
    final aurw c;
    final /* synthetic */ ldi d;

    public ldg(ldi ldiVar, LayoutInflater layoutInflater, RadioGroup radioGroup, aurw aurwVar) {
        this.d = ldiVar;
        this.b = layoutInflater;
        this.a = radioGroup;
        this.c = aurwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.removeAllViews();
        this.d.aJ(this.b, this.a, this.c);
    }
}

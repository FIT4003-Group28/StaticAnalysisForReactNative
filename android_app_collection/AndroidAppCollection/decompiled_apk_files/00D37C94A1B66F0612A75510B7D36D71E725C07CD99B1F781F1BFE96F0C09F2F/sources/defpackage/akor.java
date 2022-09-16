package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akor  reason: default package */
/* loaded from: classes.dex */
final class akor implements View.OnClickListener {
    final /* synthetic */ akot a;

    public akor(akot akotVar) {
        this.a = akotVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a.toggle();
    }
}

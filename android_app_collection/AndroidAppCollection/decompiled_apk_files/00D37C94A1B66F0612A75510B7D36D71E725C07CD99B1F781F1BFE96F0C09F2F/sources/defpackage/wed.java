package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: wed  reason: default package */
/* loaded from: classes4.dex */
final class wed implements View.OnClickListener {
    final /* synthetic */ wff a;
    final /* synthetic */ wef b;

    public wed(wef wefVar, wff wffVar) {
        this.b = wefVar;
        this.a = wffVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aarx aarxVar = this.b.a;
        if (aarxVar != null) {
            this.a.i(aarxVar);
        }
    }
}

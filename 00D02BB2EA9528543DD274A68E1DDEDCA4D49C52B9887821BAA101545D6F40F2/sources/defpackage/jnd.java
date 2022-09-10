package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jnd  reason: default package */
/* loaded from: classes7.dex */
public final class jnd implements View.OnClickListener {
    final /* synthetic */ jnk a;

    public jnd(jnk jnkVar) {
        this.a = jnkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jnk jnkVar = this.a;
        if (view == jnkVar.e) {
            jnkVar.j();
        }
        jnk jnkVar2 = this.a;
        if (view == jnkVar2.f) {
            jnkVar2.k();
        }
    }
}

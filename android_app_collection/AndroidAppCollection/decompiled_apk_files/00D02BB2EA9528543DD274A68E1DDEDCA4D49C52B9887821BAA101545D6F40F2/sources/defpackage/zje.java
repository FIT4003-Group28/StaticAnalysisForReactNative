package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zje  reason: default package */
/* loaded from: classes7.dex */
final class zje implements View.OnClickListener {
    final /* synthetic */ zjm a;

    public zje(zjm zjmVar) {
        this.a = zjmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zjm zjmVar = this.a;
        vnk vnkVar = zjmVar.b;
        synchronized (vnkVar) {
            zjmVar.m.a(vnkVar.g(), vnkVar.c(), vnkVar.e(), vnkVar.h(), null, false);
        }
    }
}

package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kff  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kff implements View.OnClickListener {
    public final /* synthetic */ kfi a;
    private final /* synthetic */ int b;

    public /* synthetic */ kff(kfi kfiVar) {
        this.a = kfiVar;
    }

    public /* synthetic */ kff(kfi kfiVar, int i) {
        this.b = i;
        this.a = kfiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            kfb kfbVar = this.a.a;
            kfbVar.d.nf();
            kfbVar.e.b();
        } else if (i == 1) {
            kfb kfbVar2 = this.a.a;
            kfbVar2.d.nf();
            kfbVar2.e.a();
        } else if (i == 2) {
            this.a.a(true);
        } else {
            this.a.a(false);
        }
    }
}

package defpackage;

import android.widget.RelativeLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxvw  reason: default package */
/* loaded from: classes5.dex */
public final class cxvw implements cxpm {
    final /* synthetic */ RelativeLayout a;
    final /* synthetic */ cxwe b;

    public cxvw(cxwe cxweVar, RelativeLayout relativeLayout) {
        this.b = cxweVar;
        this.a = relativeLayout;
    }

    @Override // defpackage.cxpm
    public final void a(boolean z) {
        if (!this.b.o || !z) {
            return;
        }
        this.a.setVisibility(0);
        this.b.o = false;
    }
}

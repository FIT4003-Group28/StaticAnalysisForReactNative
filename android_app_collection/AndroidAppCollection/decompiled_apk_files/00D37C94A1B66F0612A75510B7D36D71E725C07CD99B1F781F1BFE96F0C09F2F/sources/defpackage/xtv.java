package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: xtv  reason: default package */
/* loaded from: classes4.dex */
final class xtv implements akev {
    final /* synthetic */ View a;
    final /* synthetic */ xtw b;

    public xtv(xtw xtwVar, View view) {
        this.b = xtwVar;
        this.a = view;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfq akfqVar = (akfq) obj;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfq akfqVar = (akfq) obj;
        this.a.getViewTreeObserver().removeOnScrollChangedListener(this.b.g);
        this.b.f = true;
    }
}

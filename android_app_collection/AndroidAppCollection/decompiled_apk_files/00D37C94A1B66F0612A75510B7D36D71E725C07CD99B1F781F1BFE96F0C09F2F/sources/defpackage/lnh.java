package defpackage;

import android.view.accessibility.CaptioningManager;
/* compiled from: PG */
/* renamed from: lnh  reason: default package */
/* loaded from: classes3.dex */
final class lnh extends CaptioningManager.CaptioningChangeListener {
    final /* synthetic */ lni a;

    public lnh(lni lniVar) {
        this.a = lniVar;
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        super.onEnabledChanged(z);
        this.a.d();
    }
}

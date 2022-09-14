package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxuc  reason: default package */
/* loaded from: classes5.dex */
public final class cxuc extends aag {
    public cxuc(Context context) {
    }

    @Override // defpackage.abs
    public final void Sd(aca acaVar, aci aciVar, View view, pc pcVar) {
        pcVar.I(new pa(AccessibilityNodeInfo.CollectionItemInfo.obtain(bm(view), 1, 0, 1, false)));
    }
}

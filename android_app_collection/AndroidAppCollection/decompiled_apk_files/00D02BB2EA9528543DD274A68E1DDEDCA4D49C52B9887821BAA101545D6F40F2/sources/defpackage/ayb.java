package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ayb  reason: default package */
/* loaded from: classes3.dex */
final class ayb extends aye {
    @Override // defpackage.ayd
    public final float a(ViewGroup viewGroup, View view) {
        if (od.s(viewGroup) == 1) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
        return view.getTranslationX() - viewGroup.getWidth();
    }
}

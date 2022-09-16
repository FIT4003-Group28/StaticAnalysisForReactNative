package defpackage;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
/* compiled from: PG */
/* renamed from: zgb  reason: default package */
/* loaded from: classes4.dex */
public final class zgb implements zfx {
    @Override // defpackage.zfx
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (layoutParams2.alignWithParent) {
            return false;
        }
        layoutParams2.alignWithParent = true;
        return true;
    }
}

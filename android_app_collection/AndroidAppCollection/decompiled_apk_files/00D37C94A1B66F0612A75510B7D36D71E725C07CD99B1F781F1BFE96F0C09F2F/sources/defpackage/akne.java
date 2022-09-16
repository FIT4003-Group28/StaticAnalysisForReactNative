package defpackage;

import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
/* compiled from: PG */
/* renamed from: akne  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akne {
    public final /* synthetic */ aknr a;

    public /* synthetic */ akne(aknr aknrVar) {
        this.a = aknrVar;
    }

    public final void a() {
        aknr aknrVar = this.a;
        int height = aknrVar.ak.getHeight();
        for (int i = 0; i < aknrVar.al.getChildCount(); i++) {
            height += aknrVar.al.getChildAt(i).getHeight();
        }
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = aknrVar.ai;
        if (!anchorableTopPeekingScrollView.n) {
            return;
        }
        anchorableTopPeekingScrollView.p = height;
        int i2 = anchorableTopPeekingScrollView.k;
        int min = Math.min((height + (i2 + i2)) - anchorableTopPeekingScrollView.o, i2);
        anchorableTopPeekingScrollView.b(min, min);
        anchorableTopPeekingScrollView.c(min);
    }
}

package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
/* compiled from: PG */
/* renamed from: akng  reason: default package */
/* loaded from: classes.dex */
final class akng extends LinearLayoutManager {
    final /* synthetic */ aknr a;

    public akng(aknr aknrVar) {
        this.a = aknrVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final boolean ae() {
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = this.a.ai;
        return anchorableTopPeekingScrollView.n || anchorableTopPeekingScrollView.getScrollY() == anchorableTopPeekingScrollView.k;
    }
}

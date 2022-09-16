package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
/* compiled from: PG */
/* renamed from: nzl  reason: default package */
/* loaded from: classes3.dex */
public final class nzl extends zer {
    final /* synthetic */ NextGenWatchLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzl(NextGenWatchLayout nextGenWatchLayout) {
        super("engagementPanelWrapperView");
        this.a = nextGenWatchLayout;
    }

    @Override // defpackage.zer
    protected final /* bridge */ /* synthetic */ Object a() {
        NextGenWatchLayout nextGenWatchLayout = this.a;
        return (ViewGroup) nextGenWatchLayout.findViewById(nextGenWatchLayout.r);
    }
}

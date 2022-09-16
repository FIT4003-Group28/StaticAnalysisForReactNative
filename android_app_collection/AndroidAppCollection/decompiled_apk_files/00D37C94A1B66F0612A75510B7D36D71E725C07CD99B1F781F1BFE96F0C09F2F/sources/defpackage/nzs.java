package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
/* compiled from: PG */
/* renamed from: nzs  reason: default package */
/* loaded from: classes3.dex */
public final class nzs extends nzt {
    final /* synthetic */ NextGenWatchLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzs(NextGenWatchLayout nextGenWatchLayout, nzy nzyVar, RelativeLayout relativeLayout) {
        super(nzyVar, relativeLayout);
        this.a = nextGenWatchLayout;
    }

    @Override // defpackage.nzu, defpackage.nzn
    public final View d() {
        return this.a.x;
    }

    @Override // defpackage.nzu, defpackage.nzn
    public final boolean g() {
        return this.a.x != null && super.g();
    }

    @Override // defpackage.nzt
    public final Rect h(nxe nxeVar) {
        return nxeVar.r();
    }
}

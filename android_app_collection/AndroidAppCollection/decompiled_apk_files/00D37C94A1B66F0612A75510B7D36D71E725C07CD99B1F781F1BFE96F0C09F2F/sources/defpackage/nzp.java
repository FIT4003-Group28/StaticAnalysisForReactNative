package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
/* compiled from: PG */
/* renamed from: nzp  reason: default package */
/* loaded from: classes3.dex */
public final class nzp extends nzt {
    public int a;
    public boolean b;
    public final /* synthetic */ NextGenWatchLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzp(NextGenWatchLayout nextGenWatchLayout, nzy nzyVar, View view) {
        super(nzyVar, view);
        this.c = nextGenWatchLayout;
    }

    @Override // defpackage.nzu, defpackage.nzn
    public final View d() {
        return this.c.w;
    }

    @Override // defpackage.nzu, defpackage.nzn
    public final boolean g() {
        return this.c.w != null && super.g();
    }

    @Override // defpackage.nzt
    public final Rect h(nxe nxeVar) {
        int height;
        Rect h = this.c.z.h(nxeVar);
        Rect t = nxeVar.t();
        if (!this.b || this.a <= 0) {
            if (this.a > t.height()) {
                height = (h.height() + this.a) - t.height();
            } else {
                height = h.height();
            }
        } else {
            height = h.height() + this.a;
        }
        return new Rect(0, this.a, h.width(), height);
    }
}

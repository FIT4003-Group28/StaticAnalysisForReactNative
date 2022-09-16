package defpackage;

import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
/* compiled from: PG */
/* renamed from: mcm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mcm implements Runnable {
    public final /* synthetic */ ScrollSelectionController a;
    private final /* synthetic */ int b;

    public /* synthetic */ mcm(ScrollSelectionController scrollSelectionController, int i) {
        this.b = i;
        this.a = scrollSelectionController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.j();
        } else {
            this.a.j();
        }
    }
}

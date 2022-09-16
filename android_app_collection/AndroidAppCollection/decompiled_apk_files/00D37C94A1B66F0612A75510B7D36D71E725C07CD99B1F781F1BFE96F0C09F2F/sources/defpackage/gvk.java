package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
/* compiled from: PG */
/* renamed from: gvk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gvk implements Runnable {
    public final /* synthetic */ gvt a;
    private final /* synthetic */ int b;

    public /* synthetic */ gvk(gvt gvtVar, int i) {
        this.b = i;
        this.a = gvtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            gvt gvtVar = this.a;
            gvtVar.q = false;
            for (int i = 1; i < gvtVar.g.size(); i++) {
                EditorButtonView editorButtonView = (EditorButtonView) gvtVar.g.get(i);
                if (editorButtonView.getVisibility() == 0) {
                    gvt.l(editorButtonView);
                }
            }
            return;
        }
        this.a.i();
    }
}

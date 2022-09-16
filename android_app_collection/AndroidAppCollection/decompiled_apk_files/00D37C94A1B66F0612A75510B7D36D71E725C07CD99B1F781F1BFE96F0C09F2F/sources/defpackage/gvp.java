package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: gvp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gvp implements zdt {
    public final /* synthetic */ gvt a;
    private final /* synthetic */ int b;

    public /* synthetic */ gvp(gvt gvtVar) {
        this.a = gvtVar;
    }

    public /* synthetic */ gvp(gvt gvtVar, int i) {
        this.b = i;
        this.a = gvtVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            final gvt gvtVar = this.a;
            final Boolean bool = (Boolean) obj;
            gvtVar.d.post(new Runnable() { // from class: gvm
                @Override // java.lang.Runnable
                public final void run() {
                    gvt gvtVar2 = gvt.this;
                    Boolean bool2 = bool;
                    boolean z = bool2 == null || !bool2.booleanValue();
                    if (!z && "COLLAPSED_MODE_PERSIST_LABELS_3X".equals(gvtVar2.n)) {
                        gvtVar2.p = false;
                        gvtVar2.r.b(gvq.c, anjk.a);
                    }
                    gvtVar2.q = true;
                    for (int i = 1; i < gvtVar2.g.size(); i++) {
                        EditorButtonView editorButtonView = (EditorButtonView) gvtVar2.g.get(i);
                        if (editorButtonView.getVisibility() == 0) {
                            gvt.m(editorButtonView);
                        }
                    }
                    if (z) {
                        gvtVar2.l.postDelayed(new gvk(gvtVar2), 7000L);
                    }
                }
            });
            return;
        }
        gvt gvtVar2 = this.a;
        hwp hwpVar = (hwp) obj;
        if (hwpVar != null) {
            gvtVar2.i.putAll(Collections.unmodifiableMap(hwpVar.p));
        }
        gvtVar2.d.post(new gvk(gvtVar2, 1));
    }
}

package defpackage;

import android.view.Menu;
import android.view.View;
import android.view.Window;
/* compiled from: PG */
/* renamed from: pc  reason: default package */
/* loaded from: classes4.dex */
final class pc extends ro {
    final /* synthetic */ pd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(pd pdVar, Window.Callback callback) {
        super(callback);
        this.a = pdVar;
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        if (i == 0) {
            return new View(this.a.a.b());
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.ro, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel) {
            pd pdVar = this.a;
            if (!pdVar.b) {
                pdVar.a.n();
                this.a.b = true;
                return true;
            }
        }
        return onPreparePanel;
    }
}

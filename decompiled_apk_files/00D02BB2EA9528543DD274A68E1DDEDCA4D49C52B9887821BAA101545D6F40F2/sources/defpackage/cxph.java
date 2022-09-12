package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxph  reason: default package */
/* loaded from: classes5.dex */
public final class cxph implements View.OnKeyListener {
    final /* synthetic */ PeopleKitSelectionModel a;
    final /* synthetic */ cxpn b;

    public cxph(cxpn cxpnVar, PeopleKitSelectionModel peopleKitSelectionModel) {
        this.b = cxpnVar;
        this.a = peopleKitSelectionModel;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i == 67 && !this.b.t.isEmpty()) {
            this.a.e(((cxqh) dcft.s(this.b.t)).b.a());
            return false;
        }
        return false;
    }
}

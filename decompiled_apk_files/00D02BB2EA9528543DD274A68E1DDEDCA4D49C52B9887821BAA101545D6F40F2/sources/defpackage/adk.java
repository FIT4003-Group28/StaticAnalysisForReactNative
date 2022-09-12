package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adk  reason: default package */
/* loaded from: classes2.dex */
public final class adk implements View.OnKeyListener {
    final /* synthetic */ adv a;

    public adk(adv advVar) {
        this.a = advVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        adv advVar = this.a;
        if (advVar.u == null) {
            return false;
        }
        if (!advVar.a.isPopupShowing() || this.a.a.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(this.a.a.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            adv advVar2 = this.a;
            advVar2.w(advVar2.a.getText().toString());
            return true;
        }
        adv advVar3 = this.a;
        if (advVar3.u == null || advVar3.r == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            return advVar3.x(advVar3.a.getListSelection());
        }
        if (i == 21) {
            i2 = 0;
        } else if (i != 22) {
            return (i == 19 && advVar3.a.getListSelection() == 0) ? false : false;
        } else {
            i2 = advVar3.a.length();
        }
        advVar3.a.setSelection(i2);
        advVar3.a.setListSelection(0);
        advVar3.a.clearListSelection();
        advVar3.a.b();
        return true;
    }
}

package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
/* compiled from: PG */
/* renamed from: knr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class knr implements ayqb {
    public final /* synthetic */ SuggestedActionsMainController a;
    private final /* synthetic */ int b;

    public /* synthetic */ knr(SuggestedActionsMainController suggestedActionsMainController) {
        this.a = suggestedActionsMainController;
    }

    public /* synthetic */ knr(SuggestedActionsMainController suggestedActionsMainController, int i) {
        this.b = i;
        this.a = suggestedActionsMainController;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b != 0) {
            SuggestedActionsMainController suggestedActionsMainController = this.a;
            kmn kmnVar = (kmn) obj;
            if (kmnVar.e()) {
                if (suggestedActionsMainController.d.contains(kmnVar.d())) {
                    return;
                }
                if (suggestedActionsMainController.l == null) {
                    azqb azqbVar = suggestedActionsMainController.p;
                    if (azqbVar == null) {
                        return;
                    }
                    suggestedActionsMainController.s = (yye) azqbVar.get();
                    suggestedActionsMainController.l = (ViewGroup) suggestedActionsMainController.s.b;
                    suggestedActionsMainController.m();
                }
                ViewGroup viewGroup = suggestedActionsMainController.l;
                if (viewGroup == null || viewGroup.getChildCount() != 0) {
                    if (suggestedActionsMainController.j.a().getTag() != kmnVar.d()) {
                        suggestedActionsMainController.c.add(kmnVar.d());
                    }
                } else {
                    suggestedActionsMainController.l(kmnVar.d());
                }
            } else if (suggestedActionsMainController.j.a().getTag() == kmnVar.d()) {
                suggestedActionsMainController.k(null);
                suggestedActionsMainController.j();
            } else {
                suggestedActionsMainController.c.remove(kmnVar.d());
            }
            if (suggestedActionsMainController.j == null || kmnVar.a() == 0) {
                return;
            }
            kno knoVar = suggestedActionsMainController.j;
            knoVar.d.a(kmnVar.a());
            return;
        }
        SuggestedActionsMainController suggestedActionsMainController2 = this.a;
        ahic ahicVar = (ahic) obj;
        if (ahicVar == null || ahicVar.a() == null) {
            return;
        }
        String Z = ahicVar.a().Z();
        if (TextUtils.equals(suggestedActionsMainController2.q, Z)) {
            return;
        }
        suggestedActionsMainController2.q = Z;
        suggestedActionsMainController2.n();
    }
}

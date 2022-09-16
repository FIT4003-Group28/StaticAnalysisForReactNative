package defpackage;

import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
/* compiled from: PG */
/* renamed from: fhk  reason: default package */
/* loaded from: classes3.dex */
public final class fhk {
    public final ActiveStateScrollSelectionController a;

    public fhk() {
    }

    public fhk(ActiveStateScrollSelectionController activeStateScrollSelectionController) {
        this.a = activeStateScrollSelectionController;
    }

    public static fhj a() {
        return new fhj();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fhk)) {
            return false;
        }
        ActiveStateScrollSelectionController activeStateScrollSelectionController = this.a;
        ActiveStateScrollSelectionController activeStateScrollSelectionController2 = ((fhk) obj).a;
        if (activeStateScrollSelectionController != null) {
            return activeStateScrollSelectionController.equals(activeStateScrollSelectionController2);
        }
        return activeStateScrollSelectionController2 == null;
    }

    public final int hashCode() {
        ActiveStateScrollSelectionController activeStateScrollSelectionController = this.a;
        return (activeStateScrollSelectionController == null ? 0 : activeStateScrollSelectionController.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("MainAppElementsUserData{activeStateScrollSelectionController=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

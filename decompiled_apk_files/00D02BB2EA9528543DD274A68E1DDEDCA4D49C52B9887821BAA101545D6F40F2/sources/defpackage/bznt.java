package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bznt  reason: default package */
/* loaded from: classes4.dex */
public final class bznt extends bznu {
    private final View a;

    public bznt(View view) {
        this.a = view;
    }

    @Override // defpackage.bznu
    public final View a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bznu)) {
            return false;
        }
        return this.a.equals(((bznu) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("TutorialHiddenEvent{tutorialView=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

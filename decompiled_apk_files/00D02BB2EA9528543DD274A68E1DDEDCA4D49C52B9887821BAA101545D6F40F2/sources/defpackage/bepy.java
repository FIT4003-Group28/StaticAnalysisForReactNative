package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bepy  reason: default package */
/* loaded from: classes3.dex */
public final class bepy implements cqfd {
    final /* synthetic */ bepz a;

    public bepy(bepz bepzVar) {
        this.a = bepzVar;
    }

    @Override // defpackage.cqfd
    public final boolean a(View view) {
        if (this.a.c == null) {
            return true;
        }
        View a = cqhu.a(view, beku.a);
        this.a.m(view, a);
        if (this.a.c.g().booleanValue() && this.a.c.i()) {
            View s = this.a.s();
            if (a != null && s != null && a.getY() != s.getY()) {
                s.setY(a.getY());
            }
        }
        return true;
    }
}

package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: upt  reason: default package */
/* loaded from: classes4.dex */
public final class upt implements View.OnAttachStateChangeListener {
    final /* synthetic */ upu a;
    private final View b;
    private final uuo c;

    public upt(upu upuVar, View view) {
        this.a = upuVar;
        this.b = view;
        this.c = new ups(this, view);
    }

    public final void a(Object obj) {
        String str;
        upj b;
        if (obj == null) {
            b = upj.b();
        } else {
            ulx ulxVar = (ulx) obj;
            str = ((ulx) obj).c;
            b = (str == null || !str.contains("@")) ? upj.b() : new upj(1, str);
        }
        upj c = upv.c(this.b);
        if (c == null) {
            tmm b2 = this.a.b.b();
            View view = this.b;
            this.a.b.c();
            tlx a = tmn.a(90569);
            a.a(b.a());
            a.a(upk.a);
            b2.a(view, a);
            upv.d(this.b, b);
        } else if (c.equals(b) || !lj.aj(this.b)) {
        } else {
            upv upvVar = this.a.c;
            View view2 = this.b;
            if (b.equals(upv.c(view2))) {
                return;
            }
            upv.b(upvVar.a, view2);
            tmm b3 = upvVar.b.b();
            tmm.b(view2);
            upvVar.b.c();
            tlx a2 = tmn.a(90569);
            a2.a(b.a());
            a2.a(upk.a);
            b3.a(view2, a2);
            upv.a(upvVar.a, view2);
            upv.d(view2, b);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a.b(this.c);
        uky ukyVar = this.a.a;
        if (((uld) ukyVar).d) {
            this.c.b(ukyVar.a());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a.c(this.c);
    }
}

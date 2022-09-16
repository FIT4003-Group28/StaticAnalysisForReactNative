package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xsm  reason: default package */
/* loaded from: classes4.dex */
public final class xsm implements ajru {
    private final View a;
    private xln b;

    public xsm(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.comment_ghost_card, (ViewGroup) null);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        xwe xweVar = (xwe) obj;
        xln xlnVar = (xln) ajrsVar.c("commentGhostCardAnimController");
        this.b = xlnVar;
        if (xlnVar == null) {
            return;
        }
        View view = this.a;
        int i = xweVar.a;
        xlnVar.c(view);
        long d = xlnVar.a.d();
        long j = xlnVar.c;
        if (j == -1) {
            xlnVar.c = d;
            j = d;
        }
        Animator a = xln.a(view, ((((d - j) - (i * 225)) % 2200) + 2200) % 2200);
        if (a == null) {
            return;
        }
        a.addListener(new xlm(xlnVar, view));
        a.start();
        xlnVar.b.put(view, a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        xln xlnVar = this.b;
        if (xlnVar != null) {
            xlnVar.c(this.a);
        }
    }
}

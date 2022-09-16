package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aitn  reason: default package */
/* loaded from: classes2.dex */
public final class aitn implements cqfd {
    final /* synthetic */ aiua a;

    public aitn(aiua aiuaVar) {
        this.a = aiuaVar;
    }

    @Override // defpackage.cqfd
    public final boolean a(View view) {
        aiua aiuaVar = this.a;
        if (!aiuaVar.c.d(aiuaVar.b) || !aiuaVar.d.a() || aiuaVar.d.b().z()) {
            return true;
        }
        View a = cqhu.a(view, aiqw.b);
        View a2 = cqhu.a(view, aiqw.a);
        if (a == null || a2 == null) {
            return true;
        }
        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
        layoutParams.height = (view.getHeight() - a.getHeight()) + ((int) (aiuaVar.b.getResources().getDisplayMetrics().density * 40.0f));
        a2.setLayoutParams(layoutParams);
        return true;
    }
}

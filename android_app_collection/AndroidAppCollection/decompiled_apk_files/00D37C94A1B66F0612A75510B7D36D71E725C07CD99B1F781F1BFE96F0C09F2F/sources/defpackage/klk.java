package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: klk  reason: default package */
/* loaded from: classes3.dex */
public final class klk implements ajru {
    private final ViewGroup a;
    private final axnm b;
    private final ajhl c;
    private final acti d;

    public klk(Context context, axnm axnmVar, ajhl ajhlVar, acti actiVar, ViewGroup viewGroup) {
        axnmVar.getClass();
        this.b = axnmVar;
        this.c = ajhlVar;
        actiVar.getClass();
        this.d = actiVar;
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.fullscreen_engagement_element_layout, viewGroup, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aqtb aqtbVar = (aqtb) obj;
        this.c.qZ(null);
        this.a.removeAllViews();
        View a = this.c.a();
        ViewGroup viewGroup = (ViewGroup) a.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(a);
        }
        if (aqtbVar != null) {
            ajrs ajrsVar2 = new ajrs();
            ajrsVar2.g(new HashMap());
            ajrsVar2.a(this.d);
            ajin ajinVar = (ajin) this.b.get();
            this.c.oK(ajrsVar2, ajhh.a(aqtbVar));
            this.a.addView(this.c.a());
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.qZ(ajsaVar);
    }
}

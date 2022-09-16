package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yfa  reason: default package */
/* loaded from: classes4.dex */
public final class yfa extends ajsl {
    public final ajmy a;
    public final aafo b;
    public final FrameLayout c;
    public final Context d;
    public final akbn e;
    yez f;
    yez g;
    yez h;
    final int i;
    private final ajwo j;

    public yfa(Context context, ajmy ajmyVar, aafo aafoVar, akbn akbnVar, ajwm ajwmVar) {
        ajmyVar.getClass();
        this.a = ajmyVar;
        aafoVar.getClass();
        this.b = aafoVar;
        this.d = context;
        this.e = akbnVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        int d = zhn.d(context, R.attr.ytCallToAction);
        this.i = d;
        ajwn ajwnVar = ajwmVar.a;
        ajwnVar.e(-1);
        ajwnVar.d(d);
        ajwnVar.c();
        this.j = ajwnVar.a();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0233  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfa.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avoe) obj).k.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}

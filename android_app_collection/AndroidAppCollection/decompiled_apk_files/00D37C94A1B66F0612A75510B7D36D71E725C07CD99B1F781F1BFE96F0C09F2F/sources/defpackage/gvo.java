package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import j$.util.Map;
/* compiled from: PG */
/* renamed from: gvo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gvo implements View.OnClickListener {
    public final /* synthetic */ gvt a;
    public final /* synthetic */ gyq b;
    private final /* synthetic */ int c;

    public /* synthetic */ gvo(gvt gvtVar, gyq gyqVar) {
        this.a = gvtVar;
        this.b = gyqVar;
    }

    public /* synthetic */ gvo(gvt gvtVar, gyq gyqVar, int i) {
        this.c = i;
        this.a = gvtVar;
        this.b = gyqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        if (i == 0) {
            gvt gvtVar = this.a;
            this.b.a(gvtVar.f.d).b();
            gvtVar.e();
        } else if (i == 1) {
            gvt gvtVar2 = this.a;
            this.b.a(gvtVar2.e.d).b();
            gvtVar2.c.a(gvt.a).e();
            gvtVar2.o = 1;
            int[] iArr = new int[2];
            gvtVar2.e.getLocationOnScreen(iArr);
            gvtVar2.g();
            gvtVar2.f(iArr[1]);
            gvtVar2.l.removeCallbacksAndMessages(null);
            gvtVar2.b(true, gvtVar2.p);
            gvtVar2.c();
            for (int i2 = 0; i2 < 9; i2++) {
                if (gvtVar2.j[i2].getVisibility() == 0) {
                    gvtVar2.k[i2] = gvtVar2.j[i2];
                } else {
                    gvtVar2.k[i2] = null;
                }
            }
            gyy.d(gvtVar2.k);
            boolean z = false;
            for (EditorButtonView editorButtonView : gvtVar2.h) {
                String str = editorButtonView.e;
                if (str != null && ((Integer) Map.EL.getOrDefault(gvtVar2.i, str, 0)).intValue() == 0 && gvt.k(editorButtonView)) {
                    gvtVar2.i.put(editorButtonView.e, 1);
                    z = true;
                }
            }
            gvtVar2.i();
            if (!z) {
                return;
            }
            gvt.j(gvtVar2.r, gvtVar2.i);
        } else {
            gvt gvtVar3 = this.a;
            this.b.a(gvt.a).b();
            gvtVar3.e();
        }
    }
}

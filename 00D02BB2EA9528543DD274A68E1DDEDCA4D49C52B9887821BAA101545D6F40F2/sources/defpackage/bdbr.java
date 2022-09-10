package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdbr  reason: default package */
/* loaded from: classes3.dex */
public final class bdbr implements bdal {
    public final dxio<anhg> a;
    public final gfw b;
    private final Activity c;

    public bdbr(Activity activity, dxio<anhg> dxioVar, gfw gfwVar) {
        this.c = activity;
        this.a = dxioVar;
        this.b = gfwVar;
    }

    @Override // defpackage.bdal
    @dzsi
    public final jho a(final bczw bczwVar) {
        jhm jhmVar = new jhm();
        jhmVar.h = 0;
        jhmVar.a = this.c.getResources().getString(R.string.HIDE_FROM_TIMELINE_MENU);
        jhmVar.d = ibl.b();
        jhmVar.b = this.c.getResources().getString(R.string.HIDE_FROM_TIMELINE_MENU);
        jhmVar.d(new View.OnClickListener(this, bczwVar) { // from class: bdbq
            private final bdbr a;
            private final bczw b;

            {
                this.a = this;
                this.b = bczwVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bdbr bdbrVar = this.a;
                bdbrVar.a.a().r(this.b.a(), bdbrVar.b);
            }
        });
        return jhmVar.c();
    }
}

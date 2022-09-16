package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: mgo  reason: default package */
/* loaded from: classes3.dex */
class mgo extends mdl {
    private final Interpolator a;

    public mgo(Context context, LinearLayoutManager linearLayoutManager) {
        super(context, linearLayoutManager);
        this.a = kt.o(0.25f, 0.46f, 0.45f, 0.94f);
    }

    @Override // defpackage.yk
    protected final void c(View view, yi yiVar) {
        int h = h(view, -1);
        int i = i(view, -1);
        int j = j((int) Math.sqrt((h * h) + (i * i)));
        if (j > 0) {
            yiVar.b(-h, -i, j, this.a);
        }
    }
}

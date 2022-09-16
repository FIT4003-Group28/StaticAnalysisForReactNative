package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hku  reason: default package */
/* loaded from: classes3.dex */
public final class hku {
    public final hkr a;
    public final Context b;
    public final float c;
    public final float d;
    public RecyclerView e;
    public ampq f;
    ampq g;
    ampq h;

    public hku(Context context, hkr hkrVar) {
        this.b = context;
        this.a = hkrVar;
        this.c = context.getResources().getDimension(R.dimen.reel_edit_carousel_thumbnail_cell_enlarge_width) / context.getResources().getDimension(R.dimen.reel_edit_carousel_thumbnail_cell_width);
        this.d = context.getResources().getDimension(R.dimen.reel_edit_carousel_thumbnail_cell_enlarge_height) / context.getResources().getDimension(R.dimen.reel_edit_carousel_thumbnail_cell_height);
    }

    public final void a(int i) {
        ((hkt) ((ampv) this.f).a).a(i);
    }

    public final void b(int i) {
        ((hkt) ((ampv) this.f).a).b(i);
    }

    public final void c() {
        this.a.mr();
    }

    public final void d(Object obj, hkx hkxVar) {
        hkr hkrVar = this.a;
        hkv a = hkw.a();
        a.a = hkxVar.c(obj);
        amuf f = amuk.f();
        int a2 = hkxVar.a(obj);
        for (int i = 0; i < a2; i++) {
            f.h(hkxVar.b(obj, i));
        }
        a.b(f.g());
        hkrVar.d = a.a();
    }
}

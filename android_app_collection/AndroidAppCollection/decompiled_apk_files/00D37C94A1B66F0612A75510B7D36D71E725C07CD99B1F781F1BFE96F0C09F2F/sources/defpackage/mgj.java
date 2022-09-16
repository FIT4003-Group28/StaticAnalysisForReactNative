package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mgj  reason: default package */
/* loaded from: classes3.dex */
public final class mgj implements mgd {
    public final mge a;
    private final Context b;
    private final ajmy c;
    private final ViewGroup d;

    public mgj(Context context, ajmy ajmyVar, ViewGroup viewGroup, mge mgeVar) {
        this.b = context;
        this.c = ajmyVar;
        this.d = viewGroup;
        this.a = mgeVar;
    }

    @Override // defpackage.mgd
    public final int a() {
        return this.d.getMeasuredWidth();
    }

    @Override // defpackage.mgd
    public final void b(apqk apqkVar) {
        this.d.removeAllViews();
        if (apqkVar.i.size() == 0) {
            return;
        }
        List list = (List) apqkVar.qm(apqi.d);
        int i = 0;
        for (avhn avhnVar : apqkVar.i) {
            if (i >= list.size() || akzj.f(list.get(i), apql.a)) {
                View inflate = LayoutInflater.from(this.b).inflate(R.layout.carousel_pagination_thumbnail, this.d, false);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.thumbnail);
                this.c.h(imageView, avhnVar);
                final int childCount = this.d.getChildCount();
                imageView.setOnClickListener(new View.OnClickListener() { // from class: mgi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        mgj mgjVar = mgj.this;
                        int i2 = childCount;
                        mgf mgfVar = mgjVar.a.a;
                        mgfVar.b.t.ab(i2);
                        mgk mgkVar = mgfVar.b;
                        mgkVar.m = i2;
                        mgkVar.k();
                        mgfVar.b.q();
                    }
                });
                imageView.setContentDescription(hve.k(avhnVar));
                this.d.addView(inflate);
            }
            i++;
        }
    }

    @Override // defpackage.mgd
    public final void c(int i) {
        int i2 = 0;
        while (i2 < this.d.getChildCount()) {
            View childAt = this.d.getChildAt(i2);
            childAt.setAlpha(i2 == i ? 1.0f : 0.5f);
            zag.o(childAt.findViewById(R.id.selected_position_indicator), i2 == i);
            i2++;
        }
    }

    @Override // defpackage.mgd
    public final void d(boolean z) {
        zag.o(this.d, z);
    }
}

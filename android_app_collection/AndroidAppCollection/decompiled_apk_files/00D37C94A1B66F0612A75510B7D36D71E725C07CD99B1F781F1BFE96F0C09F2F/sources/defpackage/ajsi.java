package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajsi  reason: default package */
/* loaded from: classes.dex */
public final class ajsi extends ajqf implements ajsd {
    private final yc b;
    private final ajsh c;

    public ajsi() {
        this(amyc.b, amyc.b, new yc());
    }

    @Override // defpackage.ajqf
    protected final ajru a(int i) {
        yo b = this.b.b(i);
        if (b == null) {
            return null;
        }
        if (b instanceof ajrz) {
            return ((ajrz) b).t;
        }
        Object tag = b.a.getTag(R.id.litho_presenter_tag);
        if (!(tag instanceof ajru)) {
            return null;
        }
        return (ajru) tag;
    }

    @Override // defpackage.ajsa
    public final void b(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            view.getContext();
            afus.b(2, 2, "View must not have a parent when recycled.");
            if (parent instanceof ViewGroup) {
                if (parent instanceof RecyclerView) {
                    afus.b(2, 2, "Cannot call removeView on a RecyclerView parent.");
                } else {
                    ((ViewGroup) parent).removeView(view);
                }
            }
        }
        int d = akel.d(view);
        ajru g = akel.g(view);
        akel.k(g, this);
        yc ycVar = this.b;
        ajrz ajrzVar = (ajrz) g.a().getTag(R.id.presenter_adapter_viewholder_tag);
        if (ajrzVar == null) {
            ajsh ajshVar = this.c;
            ajshVar.d = g;
            ajrz ajrzVar2 = (ajrz) ajshVar.mq(null, d);
            ajshVar.d = null;
            g.a().setTag(R.id.presenter_adapter_viewholder_tag, ajrzVar2);
            ajrzVar = ajrzVar2;
        }
        ycVar.f(ajrzVar);
    }

    @Override // defpackage.ajsd
    public final yc g() {
        return this.b;
    }

    public ajsi(Map map, Map map2, yc ycVar) {
        super(map, map2);
        this.c = new ajsh();
        this.b = ycVar;
    }
}

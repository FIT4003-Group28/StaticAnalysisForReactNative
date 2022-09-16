package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: kyl  reason: default package */
/* loaded from: classes3.dex */
public final class kyl extends ajsl {
    public final aafo a;
    private final Context b;
    private final ajrx c;
    private final Resources d;
    private final ViewGroup e;
    private final TextView f;
    private final View.OnClickListener g;
    private final ViewGroup h;
    private final ViewGroup i;
    private ViewGroup j;

    public kyl(Context context, gem gemVar, aafo aafoVar) {
        this.b = context;
        this.c = gemVar;
        this.a = aafoVar;
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.query_refinements_item, null);
        this.e = viewGroup;
        this.d = context.getResources();
        this.f = (TextView) viewGroup.findViewById(R.id.title);
        this.h = (ViewGroup) viewGroup.findViewById(R.id.refinements_columns);
        this.i = f(0);
        this.g = new kyk(this);
        gemVar.c(viewGroup);
    }

    private final ViewGroup f(int i) {
        if (i >= this.h.getChildCount()) {
            View.inflate(this.b, R.layout.query_refinements_column, this.h);
        }
        return (ViewGroup) this.h.getChildAt(i);
    }

    private final void g(ViewGroup viewGroup, Iterator it, int i) {
        arag aragVar;
        int childCount = viewGroup.getChildCount();
        while (childCount < i) {
            View.inflate(this.b, R.layout.query_refinements_link, viewGroup);
            childCount++;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            TextView textView = (TextView) viewGroup.getChildAt(i2);
            if (i2 >= i || !it.hasNext()) {
                textView.setVisibility(8);
            } else {
                aujx aujxVar = (aujx) it.next();
                if ((aujxVar.b & 1) != 0) {
                    aragVar = aujxVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                textView.setText(ajgl.b(aragVar));
                apzg apzgVar = aujxVar.d;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                textView.setTag(R.id.tag_endpoint, apzgVar);
                textView.setOnClickListener(this.g);
                textView.setVisibility(0);
            }
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.c).b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        List arrayList;
        arag aragVar;
        aujy aujyVar = (aujy) obj;
        boolean z = this.d.getBoolean(R.bool.query_refinements_two_columns);
        if (aujyVar.d.size() == 0) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (aujz aujzVar : aujyVar.d) {
                aujx aujxVar = aujzVar.b;
                if (aujxVar == null) {
                    aujxVar = aujx.a;
                }
                int i = aujxVar.b;
                if ((i & 1) != 0 && (i & 2) != 0) {
                    arrayList.add(aujxVar);
                }
            }
        }
        Iterator it = arrayList.iterator();
        TextView textView = this.f;
        if ((aujyVar.b & 1) != 0) {
            aragVar = aujyVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        int size = arrayList.size();
        if (z) {
            double d = size;
            Double.isNaN(d);
            size = (int) Math.ceil(d / 2.0d);
        }
        g(this.i, it, size);
        if (z) {
            if (this.j == null) {
                this.j = f(1);
            }
            g(this.j, it, size);
            this.j.setVisibility(0);
        } else {
            ViewGroup viewGroup = this.j;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aujy) obj).e.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}

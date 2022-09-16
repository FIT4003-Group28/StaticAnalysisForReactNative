package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.youtube.R;
import java.util.WeakHashMap;
/* compiled from: PG */
@Deprecated
/* renamed from: fkp  reason: default package */
/* loaded from: classes3.dex */
public final class fkp implements View.OnClickListener, AdapterView.OnItemClickListener {
    public static final WeakHashMap a = new WeakHashMap();
    public final LayoutInflater b;
    public final fkn c;
    private final Activity d;
    private final ww e;
    private View f;

    public fkp(Activity activity) {
        this.d = activity;
        this.b = activity.getLayoutInflater();
        activity.getResources();
        fkn fknVar = new fkn(this);
        this.c = fknVar;
        ww wwVar = new ww(activity);
        this.e = wwVar;
        wwVar.f = (int) activity.getResources().getDimension(R.dimen.innertube_menu_width);
        wwVar.z();
        wwVar.e(fknVar);
        wwVar.m = this;
        a.put(this, null);
    }

    public final void a() {
        if (this.f != null) {
            this.f = null;
            this.e.k();
        }
    }

    public final void b(String str, fko fkoVar) {
        fkn fknVar = this.c;
        int size = fknVar.a.size();
        int i = fknVar.d;
        fknVar.d = i + 1;
        fkl fklVar = new fkl(Integer.valueOf(i), str, fkoVar);
        fknVar.a.add(size, fklVar);
        fknVar.b.put(fklVar.a.intValue(), fklVar);
        fknVar.notifyDataSetChanged();
        fklVar.a.intValue();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.notifyDataSetChanged();
        this.f = view;
        int c = zag.c(this.d, this.c, null);
        float dimension = this.d.getResources().getDimension(R.dimen.innertube_menu_width_increment_dp);
        this.e.f = (int) zag.a(this.d, c, dimension);
        ww wwVar = this.e;
        wwVar.j = 8388661;
        wwVar.l = view;
        wwVar.s();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        View view2;
        fko fkoVar = ((fkl) this.c.c.get(i)).b.b;
        if (fkoVar == null || (view2 = this.f) == null) {
            return;
        }
        fkoVar.a(view2.getTag());
        a();
    }
}

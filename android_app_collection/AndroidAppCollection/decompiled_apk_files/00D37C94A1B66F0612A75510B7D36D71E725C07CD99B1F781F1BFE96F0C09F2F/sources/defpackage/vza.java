package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: vza  reason: default package */
/* loaded from: classes4.dex */
public final class vza extends wgx {
    public View a;
    public LinearLayout b;
    private ListView g;
    private View h;
    private ListView i;
    private final ajxz j;
    private final akbk k;
    private final ajsm l;
    private final vyp m;
    private final vyw n;

    public vza(Context context, yzj yzjVar, acti actiVar, ajmy ajmyVar, ajrh ajrhVar, vyw vywVar, azqb azqbVar, ajxz ajxzVar, akbk akbkVar) {
        super(context, yzjVar, actiVar, ajmyVar, ajrhVar);
        this.l = new ajsm();
        this.m = new vyp();
        this.n = vywVar;
        this.j = ajxzVar;
        this.k = akbkVar;
        n(new vyo(context, yzjVar, actiVar, ajmyVar, this, this, this, this, ajxzVar, akbkVar), ajrhVar, this.g);
        n(new vym(context, this, vywVar, azqbVar), ajrhVar, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ajsa] */
    private final void n(ajyi ajyiVar, ajrh ajrhVar, ListView listView) {
        ajyiVar.a(aarz.class);
        ajrg a = ajrhVar.a(ajyiVar.get());
        a.h(this.e);
        listView.setAdapter((ListAdapter) a);
    }

    @Override // defpackage.wgx
    public final View b(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.fusion_account_selector_layout, (ViewGroup) null);
        this.a = inflate;
        ((ImageView) inflate.findViewById(R.id.add_account)).setOnClickListener(new View.OnClickListener() { // from class: vyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vza.this.k();
            }
        });
        this.g = (ListView) this.a.findViewById(R.id.account_list);
        this.h = this.a.findViewById(R.id.footer_separator);
        this.i = (ListView) this.a.findViewById(R.id.account_list_footer);
        this.b = (LinearLayout) this.a.findViewById(R.id.extra_footers);
        return this.a;
    }

    @Override // defpackage.wgx
    protected final ListView c() {
        return this.g;
    }

    @Override // defpackage.wgx
    protected final ajsm d() {
        return this.l;
    }

    @Override // defpackage.wgx
    protected final void e() {
        if (this.e.isEmpty()) {
            this.e.add(this.m);
        }
    }

    @Override // defpackage.wgx
    protected final void f() {
        this.e.add(this.c);
    }

    @Override // defpackage.wgx, defpackage.wgj
    public final void g(vzi vziVar) {
        super.g(vziVar);
        ArrayList arrayList = new ArrayList();
        this.e.k(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof ajre) {
                h(false);
            } else if (obj instanceof wfi) {
                h(true);
            }
        }
    }

    public final void h(boolean z) {
        this.h.setVisibility(true != z ? 8 : 0);
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: mlw  reason: default package */
/* loaded from: classes3.dex */
public final class mlw implements ajru {
    final xj a;
    public final SparseArray b;
    private final ViewGroup c;
    private final TextView d;
    private final View e;
    private final MenuInflater f;
    private final Collection g;

    public mlw(Activity activity, Context context, oir oirVar, WatchOnTvMenuItem watchOnTvMenuItem) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.nested_header, null);
        this.c = viewGroup;
        this.d = (TextView) viewGroup.findViewById(R.id.title);
        View findViewById = viewGroup.findViewById(R.id.contextual_menu_anchor);
        this.e = findViewById;
        this.f = activity.getMenuInflater();
        xj xjVar = new xj(context, findViewById);
        this.a = xjVar;
        xjVar.d = new xi() { // from class: mlu
            @Override // defpackage.xi
            public final boolean a(MenuItem menuItem) {
                fry fryVar = (fry) mlw.this.b.get(((si) menuItem).a);
                if (fryVar != null) {
                    return fryVar.m();
                }
                return false;
            }
        };
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: mlv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mlw.this.a.a();
            }
        });
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.add(watchOnTvMenuItem);
        arrayList.add(oirVar.a());
        this.b = new SparseArray();
        akel.m(viewGroup, this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        fsl fslVar = (fsl) obj;
        this.d.setText(fslVar.a);
        this.b.clear();
        for (fry fryVar : fslVar.b) {
            this.b.put(fryVar.g(), fryVar);
        }
        for (fry fryVar2 : this.g) {
            this.b.put(fryVar2.g(), fryVar2);
        }
        this.a.b.clear();
        hxb.j(this.a.b, this.f, null, this.b, 0, null);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}

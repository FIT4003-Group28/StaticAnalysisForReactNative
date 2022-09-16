package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: muz  reason: default package */
/* loaded from: classes3.dex */
public final class muz {
    public final List a;
    public final List b;
    public final View c;
    public final RecyclerView d;
    public final muq e;

    public muz(Context context, muq muqVar) {
        this.e = muqVar;
        vdw b = vdw.b();
        Set<String> j = b.j();
        ArrayList arrayList = new ArrayList();
        for (String str : j) {
            arrayList.add(new muw(new Locale("", str).getDisplayCountry(), str, b.a(str)));
        }
        Collections.sort(arrayList);
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        arrayList2.addAll(arrayList);
        View inflate = LayoutInflater.from(context).inflate(R.layout.formfill_region_picker, (ViewGroup) null, false);
        this.c = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.d = recyclerView;
        recyclerView.ad(new mux(this));
        recyclerView.ag(new LinearLayoutManager());
        ((EditText) inflate.findViewById(R.id.edit_text)).addTextChangedListener(new muv(this));
    }
}

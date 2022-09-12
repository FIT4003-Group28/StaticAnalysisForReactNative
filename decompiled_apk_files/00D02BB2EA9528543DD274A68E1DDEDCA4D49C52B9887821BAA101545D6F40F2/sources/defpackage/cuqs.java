package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cuqs  reason: default package */
/* loaded from: classes5.dex */
public final class cuqs extends abg<cuqr> {
    public dcdc<cuqd> a = dcdc.e();
    public int e;
    public int f;
    public boolean g;
    private final cuuc h;
    private final cuwi i;
    private final cuiv j;
    private final cugu k;
    private final ctyy l;

    public cuqs(cuuc cuucVar, cuwi cuwiVar, cuiv cuivVar, ctyy ctyyVar, cugu cuguVar) {
        this.h = cuucVar;
        this.i = cuwiVar;
        this.j = cuivVar;
        this.l = ctyyVar;
        this.k = cuguVar;
    }

    @Override // defpackage.abg
    public final int c() {
        return this.a.size();
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ cuqr d(ViewGroup viewGroup, int i) {
        return new cuqr(new curv(viewGroup.getContext()));
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(cuqr cuqrVar, int i) {
        curv curvVar = (curv) cuqrVar.a;
        cuqd cuqdVar = this.a.get(i);
        int size = this.a.size();
        curvVar.a(cuqdVar, this.h, this.i, this.j, this.l, this.k);
        curvVar.setMaxWidth(this.e);
        curvVar.setMaxHeight(this.f);
        curvVar.setDrawBorder(this.g);
        curvVar.setContentDescription(curvVar.getResources().getString(R.string.position_in_collection_format, Integer.valueOf(i + 1), Integer.valueOf(size)));
    }
}

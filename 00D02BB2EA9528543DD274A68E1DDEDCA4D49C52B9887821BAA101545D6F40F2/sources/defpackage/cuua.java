package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cuua  reason: default package */
/* loaded from: classes5.dex */
public final class cuua implements cvdw, cvdu {
    private static final dcdc<cvec> a = dcdc.f(cvec.TOMBSTONE_BUBBLE);

    @Override // defpackage.cvdw
    public final cvdu a() {
        return this;
    }

    @Override // defpackage.cvdw
    public final dbsg<cvdv> b() {
        return dbpy.a;
    }

    @Override // defpackage.cvdw
    public final dbsg<cuij> c(cugu cuguVar) {
        return dbpy.a;
    }

    @Override // defpackage.cvdu
    public final List<cvec> d() {
        return a;
    }

    @Override // defpackage.cvdu
    public final acl e(ViewGroup viewGroup, cvec cvecVar) {
        cuty cutyVar = new cuty(viewGroup.getContext());
        int dimensionPixelSize = cutyVar.getResources().getDimensionPixelSize(R.dimen.tombstone_padding_top_bottom);
        int dimensionPixelSize2 = cutyVar.getResources().getDimensionPixelSize(R.dimen.tombstone_padding_start_end);
        int dimensionPixelSize3 = cutyVar.getResources().getDimensionPixelSize(R.dimen.tombstone_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = dimensionPixelSize3;
        marginLayoutParams.bottomMargin = dimensionPixelSize3;
        cutyVar.setLayoutParams(marginLayoutParams);
        cutyVar.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        cutyVar.setBackgroundResource(R.color.tombstone_cell_color);
        return new cutz(cutyVar, new cutw(cutyVar));
    }

    @Override // defpackage.cvdu
    public final void f(acl aclVar, cved cvedVar, ctyy ctyyVar) {
        if (aclVar instanceof cutz) {
            cutw cutwVar = ((cutz) aclVar).s;
            cutwVar.a = cvedVar.e();
            cutwVar.z();
        }
    }

    @Override // defpackage.cvdu
    public final boolean g(cugu cuguVar) {
        return true;
    }
}

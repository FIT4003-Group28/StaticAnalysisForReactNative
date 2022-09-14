package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgxg  reason: default package */
/* loaded from: classes4.dex */
public class cgxg implements cgvg {
    public final bbut a;
    public final ckne b;
    private final List<cgvf> c;

    public cgxg(Activity activity, bbut bbutVar, dnmg dnmgVar) {
        String string;
        this.a = bbutVar;
        this.c = new ArrayList(dnmgVar.a.size());
        int size = dnmgVar.a.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (dnmf dnmfVar : dnmgVar.a) {
            if (size > 1) {
                string = activity.getString(R.string.UGC_TASKS_ACCESSIBILITY_VIEW_IMAGE_MULTIPLE_IMAGES, new Object[]{Integer.valueOf(i + 1)});
            } else {
                string = activity.getString(R.string.UGC_TASKS_ACCESSIBILITY_VIEW_IMAGE_SINGLE_IMAGE);
            }
            int i2 = i + 1;
            this.c.add(new cgxf(this, dnmfVar, string, i));
            dwfi bZ = dwfl.w.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwfl dwflVar = (dwfl) bZ.b;
            dwflVar.f = 3;
            int i3 = dwflVar.a | 16;
            dwflVar.a = i3;
            String str = dnmfVar.a;
            str.getClass();
            dwflVar.a = i3 | 128;
            dwflVar.h = str;
            dwfl dwflVar2 = (dwfl) bZ.b;
            dwflVar2.i = 2;
            dwflVar2.a |= 256;
            arrayList.add(bZ.bK());
            i = i2;
        }
        this.b = new ckne(dcdc.r(arrayList));
    }

    @Override // defpackage.cgvb
    public void a(cqiv cqivVar) {
        cqivVar.a(new cggi(), this);
    }

    @Override // defpackage.cgvg
    public List<cgvf> b() {
        return this.c;
    }
}

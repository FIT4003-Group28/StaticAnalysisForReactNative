package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmcx  reason: default package */
/* loaded from: classes3.dex */
public class bmcx implements bmcs {
    private final String a;
    private final List<bmcu> b;
    private boolean c;

    public bmcx(List<dglo> list, String str, bmcn bmcnVar, bmcm bmcmVar, Resources resources, ff ffVar, btvo btvoVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = str;
        this.c = true;
        for (dglo dgloVar : list) {
            dglu dgluVar = dgloVar.d;
            int a = dglw.a((dgluVar == null ? dglu.e : dgluVar).d);
            int i = (a == 0 ? 1 : a) - 1;
            if (i == 1) {
                dbsk.s(dgloVar);
                arrayList.add(new bmcw(dgloVar, bmcmVar, resources));
            } else if (i == 2) {
                bmcnVar.d(dgloVar.b);
            } else if (i == 3) {
                bmcnVar.d(dgloVar.b);
            }
        }
    }

    @Override // defpackage.bmcs
    public String a() {
        return this.a;
    }

    @Override // defpackage.bmcs
    public List<bmcu> b() {
        return this.b;
    }

    @Override // defpackage.bmcs
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    public void d(boolean z) {
        this.c = false;
        cqkx.p(this);
    }
}

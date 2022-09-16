package defpackage;

import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousCoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousDataLayer;
import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cxrt  reason: default package */
/* loaded from: classes5.dex */
public final class cxrt implements degu<cxxk> {
    final /* synthetic */ PopulousDataLayer a;

    public cxrt(PopulousDataLayer populousDataLayer) {
        this.a = populousDataLayer;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.b(new ArrayList(), 0);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cxxk cxxkVar) {
        cxxk cxxkVar2 = cxxkVar;
        PopulousDataLayer populousDataLayer = this.a;
        dcdc<Autocompletion> dcdcVar = cxxkVar2.b;
        int i = cxxkVar2.a;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < dcdcVar.size(); i3++) {
            Person b = dcdcVar.get(i3).b();
            cxrq f = PopulousCoalescedChannels.f();
            ArrayList arrayList2 = new ArrayList();
            dcdc<ContactMethodField> p = b.p();
            int size = p.size();
            for (int i4 = 0; i4 < size; i4++) {
                cxrn a = cxro.a(b, p.get(i4), populousDataLayer.b.f());
                a.a = 4;
                String str = "";
                if (i3 < i) {
                    a.m = str;
                    a.n = true;
                } else {
                    if (b.k().length != 0) {
                        str = b.k()[0].e().toString();
                    }
                    a.m = str;
                    a.n = false;
                }
                arrayList2.add(a.a());
            }
            f.a = arrayList2;
            PopulousCoalescedChannels a2 = f.a();
            if (a2.a.get(0).y()) {
                i2++;
            }
            arrayList.add(a2);
        }
        populousDataLayer.b(arrayList, i2);
    }
}

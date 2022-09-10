package defpackage;

import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousChannel;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousCoalescedChannels;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxsa  reason: default package */
/* loaded from: classes5.dex */
final class cxsa implements cxzs {
    final /* synthetic */ Map a;
    final /* synthetic */ Map b;
    final /* synthetic */ Map c;
    final /* synthetic */ cxsc d;

    public cxsa(cxsc cxscVar, Map map, Map map2, Map map3) {
        this.d = cxscVar;
        this.a = map;
        this.b = map2;
        this.c = map3;
    }

    @Override // defpackage.cxzs
    public final void a(Map<cygg, Person> map, cxzu cxzuVar) {
        Person value;
        PopulousChannel a;
        cxsc cxscVar = this.d;
        Map map2 = this.a;
        HashMap hashMap = new HashMap();
        for (Map.Entry<cygg, Person> entry : map.entrySet()) {
            for (cxsb cxsbVar : (List) map2.get(entry.getKey())) {
                if (!hashMap.containsKey(cxsbVar.a) && (value = entry.getValue()) != null) {
                    Channel channel = cxsbVar.b;
                    if (value.o().length == 0) {
                        a = null;
                    } else {
                        cyfi m = value.o()[0].m();
                        cygd l = PersonFieldMetadata.l();
                        l.k(value.o()[0].b());
                        l.d(true);
                        m.e(l.i());
                        InAppNotificationTarget i = m.i();
                        cxrn C = PopulousChannel.C();
                        C.a = 4;
                        C.b(i.a().toString(), cxro.b(i));
                        PopulousChannel populousChannel = (PopulousChannel) channel;
                        C.c(populousChannel.c, true, false);
                        C.f = populousChannel.d;
                        C.j = populousChannel.e;
                        C.k = populousChannel.f;
                        C.q = cxscVar.i.f();
                        C.n = false;
                        C.m = populousChannel.g;
                        C.r = i;
                        if (i.d().isEmpty()) {
                            C.d(populousChannel.a, populousChannel.b);
                        } else {
                            ContactMethodField contactMethodField = i.d().get(0);
                            C.d(contactMethodField.a().toString(), cxro.b(contactMethodField));
                        }
                        a = C.a();
                    }
                    if (a != null) {
                        hashMap.put(cxsbVar.a, a);
                    }
                }
            }
        }
        cxsc cxscVar2 = this.d;
        Map map3 = this.b;
        Map map4 = this.c;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : map3.entrySet()) {
            ArrayList arrayList2 = new ArrayList();
            if (hashMap.containsKey(entry2.getKey())) {
                Channel channel2 = (Channel) hashMap.get(entry2.getKey());
                cxrn C2 = PopulousChannel.C();
                C2.a = 4;
                C2.b(channel2.c(), channel2.d());
                C2.c(channel2.f(), true, false);
                C2.f = channel2.g();
                C2.j = channel2.m();
                C2.k = channel2.n();
                C2.q = cxscVar2.i.f();
                C2.n = true;
                C2.m = "";
                C2.r = ((PopulousChannel) channel2).B();
                arrayList2.add(C2.a());
            }
            arrayList2.addAll((Collection) entry2.getValue());
            cxrq f = PopulousCoalescedChannels.f();
            f.a = arrayList2;
            arrayList.add(f.a());
        }
        for (Map.Entry entry3 : map4.entrySet()) {
            ArrayList arrayList3 = new ArrayList();
            if (hashMap.containsKey(entry3.getKey())) {
                arrayList3.add((Channel) hashMap.get(entry3.getKey()));
                cxscVar2.k++;
            }
            arrayList3.addAll((Collection) entry3.getValue());
            cxrq f2 = PopulousCoalescedChannels.f();
            f2.a = arrayList3;
            arrayList.add(f2.a());
        }
        for (cxrd cxrdVar : cxscVar2.h) {
            cxrdVar.b(arrayList, cxscVar2.k);
        }
    }
}

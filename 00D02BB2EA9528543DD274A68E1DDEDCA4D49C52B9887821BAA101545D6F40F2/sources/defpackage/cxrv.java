package defpackage;

import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cxrv  reason: default package */
/* loaded from: classes5.dex */
public final class cxrv implements cxzs {
    final /* synthetic */ Map a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ Set d;
    final /* synthetic */ cxpc e;

    public cxrv(Map map, List list, List list2, cxpc cxpcVar, Set set) {
        this.a = map;
        this.b = list;
        this.c = list2;
        this.e = cxpcVar;
        this.d = set;
    }

    @Override // defpackage.cxzs
    public final void a(Map<cygg, Person> map, cxzu cxzuVar) {
        Name name;
        for (cygg cyggVar : map.keySet()) {
            Channel channel = (Channel) this.a.get(cyggVar);
            Person person = map.get(cyggVar);
            boolean contains = this.b.contains(channel);
            boolean contains2 = this.c.contains(channel);
            if (person != null) {
                if (contains && person.n().length != 0) {
                    channel.w(person.n()[0].c());
                }
                if (contains2 && person.k().length > 0 && (name = person.k()[0]) != null) {
                    channel.t(name.a().toString(), !cyeq.c(name.b().d()), cyeq.c(name.b().d()));
                    if (name.c() != null) {
                        channel.u(name.c().toString());
                    }
                    channel.v(cxrc.f(name.a().toString()));
                }
            }
        }
        if (cxzuVar.a()) {
            cxpc cxpcVar = this.e;
            for (Channel channel2 : new ArrayList(this.d)) {
                if (channel2.n() != null) {
                    cxpcVar.a.a.post(new cxpb(cxpcVar, channel2));
                }
            }
        }
    }
}

package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.populous.Person;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxru  reason: default package */
/* loaded from: classes5.dex */
public final class cxru implements cxzs {
    final /* synthetic */ Channel a;
    final /* synthetic */ cygg b;
    final /* synthetic */ cxrh c;

    public cxru(Channel channel, cygg cyggVar, cxrh cxrhVar) {
        this.a = channel;
        this.b = cyggVar;
        this.c = cxrhVar;
    }

    @Override // defpackage.cxzs
    public final void a(Map<cygg, Person> map, cxzu cxzuVar) {
        Channel channel = this.a;
        Person person = map.get(this.b);
        if (person != null) {
            String g = person.g();
            if (!TextUtils.isEmpty(g)) {
                channel.x(g);
            }
        }
        this.c.a();
    }
}

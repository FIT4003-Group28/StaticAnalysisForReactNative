package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: lwb  reason: default package */
/* loaded from: classes3.dex */
public final class lwb {
    public final Set a = new afy();

    public final ampq a() {
        Set set = this.a;
        int i = ((afy) set).b;
        if (i == 1) {
            return set.isEmpty() ? amon.a : ampq.j((lwm) this.a.iterator().next());
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Expected only one FeedFilterBarLogicController, found ");
        sb.append(i);
        afus.b(1, 25, sb.toString());
        return amon.a;
    }
}

package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* renamed from: wso  reason: default package */
/* loaded from: classes7.dex */
public final class wso {
    static final Comparator<wpv> a = wsn.a;

    public static void a(List<? extends wpv> list) {
        Collections.sort(list, a);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).Q(i);
        }
    }
}

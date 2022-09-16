package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bze  reason: default package */
/* loaded from: classes2.dex */
public final class bze {
    public final List a;
    public final List b;
    public final List c;

    public bze(List list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(((car) list.get(i)).a.a());
            this.b.add(((car) list.get(i)).b.a());
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: acwa  reason: default package */
/* loaded from: classes.dex */
final class acwa implements ynj {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    final /* synthetic */ acwi f;

    public acwa(acwi acwiVar) {
        this.f = acwiVar;
    }

    private static final void b(Object obj, List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ynj) it.next()).a(obj);
            }
        }
    }

    @Override // defpackage.ynj
    public final void a(Object obj) {
        b(obj, this.c);
        b(obj, this.a);
        b(obj, this.b);
        b(obj, this.d);
        b(obj, this.e);
        this.f.m();
    }
}

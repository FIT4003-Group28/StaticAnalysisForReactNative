package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dhb  reason: default package */
/* loaded from: classes3.dex */
public final class dhb {
    private static final List i = new ArrayList();
    public int a;
    public int b;
    public int c;
    public int d;
    public dlj e;
    public List f;
    public List g;
    public List h;

    public dhb(int i2, int i3, int i4, int i5, dlj dljVar, List list, List list2, List list3) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = dljVar == null ? dix.q() : dljVar;
        if (list == null) {
            this.f = i;
        } else {
            int size = list.size();
            this.f = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                dlj dljVar2 = (dlj) list.get(i6);
                List list4 = this.f;
                if (dljVar2 == null) {
                    dljVar2 = dix.q();
                }
                list4.add(dljVar2);
            }
        }
        if (list2 != null) {
            this.g = Collections.unmodifiableList(list2);
        }
        if (list3 != null) {
            this.h = Collections.unmodifiableList(list3);
        }
    }

    public static dhb a(int i2, int i3, int i4, int i5, dlj dljVar, List list, List list2, List list3) {
        return new dhb(i2, i3, i4, i5, dljVar, list, list2, list3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dhb b(dhb dhbVar) {
        return a(dhbVar.a, dhbVar.b, dhbVar.c, dhbVar.d, dhbVar.e, dhbVar.f, dhbVar.g, dhbVar.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dhb c(dhb dhbVar, int i2) {
        int i3 = dhbVar.c;
        return a(dhbVar.a, dhbVar.b + i2, i3 >= 0 ? i3 + i2 : -1, dhbVar.d, dhbVar.e, dhbVar.f, dhbVar.g, dhbVar.h);
    }

    public static dhb d(int i2, dlj dljVar, Object obj, Object obj2) {
        List list = null;
        List singletonList = obj != null ? Collections.singletonList(obj) : null;
        if (obj2 != null) {
            list = Collections.singletonList(obj2);
        }
        return a(i2, 0, -1, 1, dljVar, null, singletonList, list);
    }

    public static dhb e(Object obj) {
        return d(3, dix.q(), obj, null);
    }
}

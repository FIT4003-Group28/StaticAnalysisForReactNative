package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class e implements c.d.j.o.e {

    /* renamed from: a  reason: collision with root package name */
    private final List<c.d.j.o.e> f6157a;

    private e(List<c.d.j.o.e> list) {
        this.f6157a = new LinkedList(list);
    }

    public static c.d.j.o.e a(List<c.d.j.o.e> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new e(list) : list.get(0);
        }
        return null;
    }

    @Override // c.d.j.o.e
    public c.d.b.a.d a() {
        LinkedList linkedList = new LinkedList();
        for (c.d.j.o.e eVar : this.f6157a) {
            linkedList.push(eVar.a());
        }
        return new c.d.b.a.f(linkedList);
    }

    @Override // c.d.j.o.e
    public c.d.d.h.a<Bitmap> a(Bitmap bitmap, c.d.j.c.f fVar) {
        c.d.d.h.a<Bitmap> aVar = null;
        try {
            c.d.d.h.a<Bitmap> aVar2 = null;
            for (c.d.j.o.e eVar : this.f6157a) {
                aVar = eVar.a(aVar2 != null ? aVar2.b() : bitmap, fVar);
                c.d.d.h.a.b(aVar2);
                aVar2 = aVar.m124clone();
            }
            return aVar.m124clone();
        } finally {
            c.d.d.h.a.b(aVar);
        }
    }

    @Override // c.d.j.o.e
    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (c.d.j.o.e eVar : this.f6157a) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(eVar.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }
}

package com.baidu.mapapi.map;

import android.graphics.Point;
import com.baidu.mapapi.map.l.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
class l<T extends a> {

    /* renamed from: a  reason: collision with root package name */
    private final f f1733a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1734b;

    /* renamed from: c  reason: collision with root package name */
    private List<T> f1735c;

    /* renamed from: d  reason: collision with root package name */
    private List<l<T>> f1736d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        abstract Point a();
    }

    private l(double d2, double d3, double d4, double d5, int i) {
        this(new f(d2, d3, d4, d5), i);
    }

    public l(f fVar) {
        this(fVar, 0);
    }

    private l(f fVar, int i) {
        this.f1736d = null;
        this.f1733a = fVar;
        this.f1734b = i;
    }

    private void a() {
        this.f1736d = new ArrayList(4);
        this.f1736d.add(new l<>(this.f1733a.f1722a, this.f1733a.e, this.f1733a.f1723b, this.f1733a.f, this.f1734b + 1));
        this.f1736d.add(new l<>(this.f1733a.e, this.f1733a.f1724c, this.f1733a.f1723b, this.f1733a.f, this.f1734b + 1));
        this.f1736d.add(new l<>(this.f1733a.f1722a, this.f1733a.e, this.f1733a.f, this.f1733a.f1725d, this.f1734b + 1));
        this.f1736d.add(new l<>(this.f1733a.e, this.f1733a.f1724c, this.f1733a.f, this.f1733a.f1725d, this.f1734b + 1));
        List<T> list = this.f1735c;
        this.f1735c = null;
        for (T t : list) {
            a(t.a().x, t.a().y, t);
        }
    }

    private void a(double d2, double d3, T t) {
        List<l<T>> list;
        int i;
        if (this.f1736d == null) {
            if (this.f1735c == null) {
                this.f1735c = new ArrayList();
            }
            this.f1735c.add(t);
            if (this.f1735c.size() <= 40 || this.f1734b >= 40) {
                return;
            }
            a();
            return;
        }
        if (d3 < this.f1733a.f) {
            if (d2 < this.f1733a.e) {
                list = this.f1736d;
                i = 0;
            } else {
                list = this.f1736d;
                i = 1;
            }
        } else if (d2 < this.f1733a.e) {
            list = this.f1736d;
            i = 2;
        } else {
            list = this.f1736d;
            i = 3;
        }
        list.get(i).a(d2, d3, t);
    }

    private void a(f fVar, Collection<T> collection) {
        if (!this.f1733a.a(fVar)) {
            return;
        }
        if (this.f1736d != null) {
            for (l<T> lVar : this.f1736d) {
                lVar.a(fVar, collection);
            }
        } else if (this.f1735c != null) {
            if (fVar.b(this.f1733a)) {
                collection.addAll(this.f1735c);
                return;
            }
            for (T t : this.f1735c) {
                if (fVar.a(t.a())) {
                    collection.add(t);
                }
            }
        }
    }

    public Collection<T> a(f fVar) {
        ArrayList arrayList = new ArrayList();
        a(fVar, arrayList);
        return arrayList;
    }

    public void a(T t) {
        Point a2 = t.a();
        if (this.f1733a.a(a2.x, a2.y)) {
            a(a2.x, a2.y, t);
        }
    }
}

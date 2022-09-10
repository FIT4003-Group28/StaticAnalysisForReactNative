package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cau  reason: default package */
/* loaded from: classes.dex */
final class cau<Data> implements buj, bui {
    private final List<buj<Data>> a;
    private final my<List<Throwable>> b;
    private int c;
    private bro d;
    private bui<? super Data> e;
    private List<Throwable> f;
    private boolean g;

    public cau(List<buj<Data>> list, my<List<Throwable>> myVar) {
        this.b = myVar;
        cjn.d(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            a(this.d, this.e);
            return;
        }
        cjn.b(this.f);
        this.e.g(new bwx("Fetch failed", new ArrayList(this.f)));
    }

    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super Data> buiVar) {
        this.d = broVar;
        this.e = buiVar;
        this.f = this.b.a();
        this.a.get(this.c).a(broVar, this);
        if (this.g) {
            c();
        }
    }

    @Override // defpackage.buj
    public final void b() {
        List<Throwable> list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        for (buj<Data> bujVar : this.a) {
            bujVar.b();
        }
    }

    @Override // defpackage.buj
    public final void c() {
        this.g = true;
        for (buj<Data> bujVar : this.a) {
            bujVar.c();
        }
    }

    @Override // defpackage.buj
    public final Class<Data> d() {
        return this.a.get(0).d();
    }

    @Override // defpackage.buj
    public final int e() {
        return this.a.get(0).e();
    }

    @Override // defpackage.bui
    public final void f(Data data) {
        if (data != null) {
            this.e.f(data);
        } else {
            h();
        }
    }

    @Override // defpackage.bui
    public final void g(Exception exc) {
        List<Throwable> list = this.f;
        cjn.b(list);
        list.add(exc);
        h();
    }
}

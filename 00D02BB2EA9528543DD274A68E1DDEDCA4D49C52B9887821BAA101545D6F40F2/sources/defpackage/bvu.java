package defpackage;

import com.google.android.filament.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bvu  reason: default package */
/* loaded from: classes.dex */
public final class bvu<Transcode> {
    public final List<cao<?>> a = new ArrayList();
    public final List<btw> b = new ArrayList();
    public brk c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public bua h;
    public Map<Class<?>, bue<?>> i;
    public Class<Transcode> j;
    public boolean k;
    public boolean l;
    public btw m;
    public bro n;
    public bwe o;
    public boolean p;
    public boolean q;
    public bwj r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bye a() {
        return this.r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bxl b() {
        return this.c.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(Class<?> cls) {
        return d(cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <Data> bxa<Data, ?, Transcode> d(Class<Data> cls) {
        bxa<Data, ?, Transcode> bxaVar;
        bru bruVar = this.c.c;
        Class<?> cls2 = this.g;
        Class<Transcode> cls3 = this.j;
        chj chjVar = bruVar.h;
        cjm andSet = chjVar.c.getAndSet(null);
        if (andSet == null) {
            andSet = new cjm();
        }
        andSet.a(cls, cls2, cls3);
        synchronized (chjVar.b) {
            bxaVar = (bxa<Data, ?, Transcode>) chjVar.b.get(andSet);
        }
        chjVar.c.set(andSet);
        chj chjVar2 = bruVar.h;
        if (chj.a.equals(bxaVar)) {
            return null;
        }
        if (bxaVar != null) {
            return bxaVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : bruVar.c.c(cls, cls2)) {
            for (Class cls5 : bruVar.f.c(cls4, cls3)) {
                arrayList.add(new bwa(cls, cls4, cls5, bruVar.c.b(cls, cls4), bruVar.f.b(cls4, cls5), bruVar.i));
            }
        }
        bxa<Data, ?, Transcode> bxaVar2 = arrayList.isEmpty() ? null : new bxa<>(cls, cls2, cls3, arrayList, bruVar.i);
        chj chjVar3 = bruVar.h;
        synchronized (chjVar3.b) {
            chjVar3.b.put(new cjm(cls, cls2, cls3), bxaVar2 != null ? bxaVar2 : chj.a);
        }
        return bxaVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <Z> bue<Z> e(Class<Z> cls) {
        bue<Z> bueVar = (bue<Z>) this.i.get(cls);
        if (bueVar == null) {
            Iterator<Map.Entry<Class<?>, bue<?>>> it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, bue<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    bueVar = (bue<Z>) next.getValue();
                    break;
                }
            }
        }
        if (bueVar == null) {
            if (!this.i.isEmpty() || !this.p) {
                return (bue<Z>) ccl.b;
            }
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_tooltipFrameBackground);
            sb.append("Missing transformation for ");
            sb.append(valueOf);
            sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
            throw new IllegalArgumentException(sb.toString());
        }
        return bueVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<cap<File, ?>> f(File file) {
        return this.c.c.a(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<cao<?>> g() {
        if (!this.k) {
            this.k = true;
            this.a.clear();
            List a = this.c.c.a(this.d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                cao<?> b = ((cap) a.get(i)).b(this.d, this.e, this.f, this.h);
                if (b != null) {
                    this.a.add(b);
                }
            }
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<btw> h() {
        if (!this.l) {
            this.l = true;
            this.b.clear();
            List<cao<?>> g = g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                cao<?> caoVar = g.get(i);
                if (!this.b.contains(caoVar.a)) {
                    this.b.add(caoVar.a);
                }
                for (int i2 = 0; i2 < caoVar.b.size(); i2++) {
                    if (!this.b.contains(caoVar.b.get(i2))) {
                        this.b.add(caoVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }
}

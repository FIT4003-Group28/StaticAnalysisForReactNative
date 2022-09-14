package com.facebook.f.i;

import com.facebook.common.d.i;
import com.facebook.f.h.b;
import java.util.ArrayList;
/* compiled from: MultiDraweeHolder.java */
/* loaded from: classes.dex */
public class e<DH extends com.facebook.f.h.b> {

    /* renamed from: a  reason: collision with root package name */
    boolean f2487a = false;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<b<DH>> f2488b = new ArrayList<>();

    public void a() {
        if (this.f2487a) {
            return;
        }
        this.f2487a = true;
        for (int i = 0; i < this.f2488b.size(); i++) {
            this.f2488b.get(i).b();
        }
    }

    public void b() {
        if (!this.f2487a) {
            return;
        }
        this.f2487a = false;
        for (int i = 0; i < this.f2488b.size(); i++) {
            this.f2488b.get(i).c();
        }
    }

    public void c() {
        if (this.f2487a) {
            for (int i = 0; i < this.f2488b.size(); i++) {
                this.f2488b.get(i).c();
            }
        }
        this.f2488b.clear();
    }

    public void a(b<DH> bVar) {
        a(this.f2488b.size(), bVar);
    }

    public void a(int i, b<DH> bVar) {
        i.a(bVar);
        i.a(i, this.f2488b.size() + 1);
        this.f2488b.add(i, bVar);
        if (this.f2487a) {
            bVar.b();
        }
    }
}

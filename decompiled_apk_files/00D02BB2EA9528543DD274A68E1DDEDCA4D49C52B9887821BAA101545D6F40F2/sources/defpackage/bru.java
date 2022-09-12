package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bru  reason: default package */
/* loaded from: classes.dex */
public final class bru {
    public final cat a;
    public final chh b;
    public final chm c;
    public final cho d;
    public final buo e;
    public final cfx f;
    public final chk g = new chk();
    public final chj h = new chj();
    public final my<List<Throwable>> i;
    private final chi j;

    public bru() {
        my<List<Throwable>> b = cjx.b(new na(20), new cjr(), new cjs());
        this.i = b;
        this.a = new cat(b);
        this.b = new chh();
        this.c = new chm();
        this.d = new cho();
        this.e = new buo();
        this.f = new cfx();
        this.j = new chi();
        List<String> asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        this.c.a(arrayList);
    }

    public final <Model> List<cap<Model, ?>> a(Model model) {
        List e = this.a.e(model.getClass());
        if (e.isEmpty()) {
            throw new brr(model);
        }
        int size = e.size();
        List<cap<Model, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            cap<Model, ?> capVar = (cap) e.get(i);
            if (capVar.a(model)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                }
                emptyList.add(capVar);
                z = false;
            }
        }
        if (emptyList.isEmpty()) {
            throw new brr(model, e);
        }
        return emptyList;
    }

    public final List<btn> b() {
        List<btn> a = this.j.a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new brq();
    }

    public final <Data> void c(Class<Data> cls, btl<Data> btlVar) {
        this.b.b(cls, btlVar);
    }

    public final <TResource> void d(Class<TResource> cls, bud<TResource> budVar) {
        this.d.a(cls, budVar);
    }

    public final <Data, TResource> void e(Class<Data> cls, Class<TResource> cls2, buc<Data, TResource> bucVar) {
        g("legacy_append", cls, cls2, bucVar);
    }

    public final <Model, Data> void f(Class<Model> cls, Class<Data> cls2, caq<Model, Data> caqVar) {
        this.a.a(cls, cls2, caqVar);
    }

    public final <Data, TResource> void g(String str, Class<Data> cls, Class<TResource> cls2, buc<Data, TResource> bucVar) {
        this.c.d(str, bucVar, cls, cls2);
    }

    public final void h(btn btnVar) {
        this.j.b(btnVar);
    }

    public final void i(buk<?> bukVar) {
        this.e.a(bukVar);
    }

    public final <TResource, Transcode> void j(Class<TResource> cls, Class<Transcode> cls2, cfv<TResource, Transcode> cfvVar) {
        this.f.a(cls, cls2, cfvVar);
    }
}

package com.facebook.react.modules.fresco;

import android.util.Pair;
import com.facebook.m.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: SystraceRequestListener.java */
/* loaded from: classes.dex */
public class c extends com.facebook.imagepipeline.j.a {

    /* renamed from: a  reason: collision with root package name */
    int f3569a = 0;

    /* renamed from: b  reason: collision with root package name */
    Map<String, Pair<Integer, String>> f3570b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    Map<String, Pair<Integer, String>> f3571c = new HashMap();

    @Override // com.facebook.imagepipeline.j.a, com.facebook.imagepipeline.m.am
    public boolean b(String str) {
        return false;
    }

    @Override // com.facebook.imagepipeline.j.a, com.facebook.imagepipeline.m.am
    public void a(String str, String str2) {
        if (!com.facebook.m.a.a(0L)) {
            return;
        }
        Pair<Integer, String> create = Pair.create(Integer.valueOf(this.f3569a), "FRESCO_PRODUCER_" + str2.replace(':', '_'));
        com.facebook.m.a.a(0L, (String) create.second, this.f3569a);
        this.f3570b.put(str, create);
        this.f3569a = this.f3569a + 1;
    }

    @Override // com.facebook.imagepipeline.j.a, com.facebook.imagepipeline.m.am
    public void a(String str, String str2, Map<String, String> map) {
        if (com.facebook.m.a.a(0L) && this.f3570b.containsKey(str)) {
            Pair<Integer, String> pair = this.f3570b.get(str);
            com.facebook.m.a.b(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f3570b.remove(str);
        }
    }

    @Override // com.facebook.imagepipeline.j.a, com.facebook.imagepipeline.m.am
    public void a(String str, String str2, Throwable th, Map<String, String> map) {
        if (com.facebook.m.a.a(0L) && this.f3570b.containsKey(str)) {
            Pair<Integer, String> pair = this.f3570b.get(str);
            com.facebook.m.a.b(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f3570b.remove(str);
        }
    }

    @Override // com.facebook.imagepipeline.j.a, com.facebook.imagepipeline.m.am
    public void b(String str, String str2, Map<String, String> map) {
        if (com.facebook.m.a.a(0L) && this.f3570b.containsKey(str)) {
            Pair<Integer, String> pair = this.f3570b.get(str);
            com.facebook.m.a.b(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f3570b.remove(str);
        }
    }

    @Override // com.facebook.imagepipeline.j.a, com.facebook.imagepipeline.m.am
    public void a(String str, String str2, String str3) {
        if (!com.facebook.m.a.a(0L)) {
            return;
        }
        com.facebook.m.a.a(0L, "FRESCO_PRODUCER_EVENT_" + str.replace(':', '_') + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + str2.replace(':', '_') + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + str3.replace(':', '_'), a.EnumC0066a.THREAD);
    }

    @Override // com.facebook.imagepipeline.j.a, com.facebook.imagepipeline.j.c
    public void a(com.facebook.imagepipeline.n.b bVar, Object obj, String str, boolean z) {
        if (!com.facebook.m.a.a(0L)) {
            return;
        }
        Pair<Integer, String> create = Pair.create(Integer.valueOf(this.f3569a), "FRESCO_REQUEST_" + bVar.b().toString().replace(':', '_'));
        com.facebook.m.a.a(0L, (String) create.second, this.f3569a);
        this.f3571c.put(str, create);
        this.f3569a = this.f3569a + 1;
    }

    @Override // com.facebook.imagepipeline.j.a, com.facebook.imagepipeline.j.c
    public void a(com.facebook.imagepipeline.n.b bVar, String str, boolean z) {
        if (com.facebook.m.a.a(0L) && this.f3571c.containsKey(str)) {
            Pair<Integer, String> pair = this.f3571c.get(str);
            com.facebook.m.a.b(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f3571c.remove(str);
        }
    }

    @Override // com.facebook.imagepipeline.j.a, com.facebook.imagepipeline.j.c
    public void a(com.facebook.imagepipeline.n.b bVar, String str, Throwable th, boolean z) {
        if (com.facebook.m.a.a(0L) && this.f3571c.containsKey(str)) {
            Pair<Integer, String> pair = this.f3571c.get(str);
            com.facebook.m.a.b(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f3571c.remove(str);
        }
    }

    @Override // com.facebook.imagepipeline.j.a, com.facebook.imagepipeline.j.c
    public void a(String str) {
        if (com.facebook.m.a.a(0L) && this.f3571c.containsKey(str)) {
            Pair<Integer, String> pair = this.f3571c.get(str);
            com.facebook.m.a.b(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f3571c.remove(str);
        }
    }
}

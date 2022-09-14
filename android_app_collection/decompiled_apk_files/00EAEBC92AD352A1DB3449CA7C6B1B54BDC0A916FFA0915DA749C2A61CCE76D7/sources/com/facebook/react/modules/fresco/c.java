package com.facebook.react.modules.fresco;

import android.util.Pair;
import com.facebook.systrace.a;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends c.d.j.l.a {

    /* renamed from: a  reason: collision with root package name */
    int f5675a = 0;

    /* renamed from: b  reason: collision with root package name */
    Map<String, Pair<Integer, String>> f5676b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    Map<String, Pair<Integer, String>> f5677c = new HashMap();

    @Override // c.d.j.l.a, c.d.j.l.c
    public void a(c.d.j.o.c cVar, Object obj, String str, boolean z) {
        if (!com.facebook.systrace.a.b(0L)) {
            return;
        }
        Pair<Integer, String> create = Pair.create(Integer.valueOf(this.f5675a), "FRESCO_REQUEST_" + cVar.p().toString().replace(':', '_'));
        com.facebook.systrace.a.a(0L, (String) create.second, this.f5675a);
        this.f5677c.put(str, create);
        this.f5675a = this.f5675a + 1;
    }

    @Override // c.d.j.l.a, c.d.j.l.c
    public void a(c.d.j.o.c cVar, String str, Throwable th, boolean z) {
        if (com.facebook.systrace.a.b(0L) && this.f5677c.containsKey(str)) {
            Pair<Integer, String> pair = this.f5677c.get(str);
            com.facebook.systrace.a.c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f5677c.remove(str);
        }
    }

    @Override // c.d.j.l.a, c.d.j.l.c
    public void a(c.d.j.o.c cVar, String str, boolean z) {
        if (com.facebook.systrace.a.b(0L) && this.f5677c.containsKey(str)) {
            Pair<Integer, String> pair = this.f5677c.get(str);
            com.facebook.systrace.a.c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f5677c.remove(str);
        }
    }

    @Override // c.d.j.l.a, c.d.j.n.m0
    public void a(String str, String str2) {
        if (!com.facebook.systrace.a.b(0L)) {
            return;
        }
        Pair<Integer, String> create = Pair.create(Integer.valueOf(this.f5675a), "FRESCO_PRODUCER_" + str2.replace(':', '_'));
        com.facebook.systrace.a.a(0L, (String) create.second, this.f5675a);
        this.f5676b.put(str, create);
        this.f5675a = this.f5675a + 1;
    }

    @Override // c.d.j.l.a, c.d.j.n.m0
    public void a(String str, String str2, String str3) {
        if (!com.facebook.systrace.a.b(0L)) {
            return;
        }
        com.facebook.systrace.a.a(0L, "FRESCO_PRODUCER_EVENT_" + str.replace(':', '_') + "_" + str2.replace(':', '_') + "_" + str3.replace(':', '_'), a.EnumC0139a.THREAD);
    }

    @Override // c.d.j.l.a, c.d.j.n.m0
    public void a(String str, String str2, Throwable th, Map<String, String> map) {
        if (com.facebook.systrace.a.b(0L) && this.f5676b.containsKey(str)) {
            Pair<Integer, String> pair = this.f5676b.get(str);
            com.facebook.systrace.a.c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f5676b.remove(str);
        }
    }

    @Override // c.d.j.l.a, c.d.j.n.m0
    public void a(String str, String str2, Map<String, String> map) {
        if (com.facebook.systrace.a.b(0L) && this.f5676b.containsKey(str)) {
            Pair<Integer, String> pair = this.f5676b.get(str);
            com.facebook.systrace.a.c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f5676b.remove(str);
        }
    }

    @Override // c.d.j.l.a, c.d.j.n.m0
    public boolean a(String str) {
        return false;
    }

    @Override // c.d.j.l.a, c.d.j.l.c
    public void b(String str) {
        if (com.facebook.systrace.a.b(0L) && this.f5677c.containsKey(str)) {
            Pair<Integer, String> pair = this.f5677c.get(str);
            com.facebook.systrace.a.c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f5677c.remove(str);
        }
    }

    @Override // c.d.j.l.a, c.d.j.n.m0
    public void b(String str, String str2, Map<String, String> map) {
        if (com.facebook.systrace.a.b(0L) && this.f5676b.containsKey(str)) {
            Pair<Integer, String> pair = this.f5676b.get(str);
            com.facebook.systrace.a.c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f5676b.remove(str);
        }
    }
}

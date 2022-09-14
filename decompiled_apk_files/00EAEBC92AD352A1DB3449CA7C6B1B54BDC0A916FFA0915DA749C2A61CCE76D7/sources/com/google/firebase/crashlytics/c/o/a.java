package com.google.firebase.crashlytics.c.o;

import com.google.firebase.crashlytics.c.o.b;
import com.google.firebase.crashlytics.c.o.c.c;
import com.google.firebase.crashlytics.c.o.c.d;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final b.c f9070a;

    public a(b.c cVar) {
        this.f9070a = cVar;
    }

    public void a(c cVar) {
        cVar.remove();
    }

    public void a(List<c> list) {
        for (c cVar : list) {
            a(cVar);
        }
    }

    public boolean a() {
        File[] b2 = this.f9070a.b();
        File[] a2 = this.f9070a.a();
        if (b2 == null || b2.length <= 0) {
            return a2 != null && a2.length > 0;
        }
        return true;
    }

    public List<c> b() {
        com.google.firebase.crashlytics.c.b.a().a("Checking for crash reports...");
        File[] b2 = this.f9070a.b();
        File[] a2 = this.f9070a.a();
        LinkedList linkedList = new LinkedList();
        if (b2 != null) {
            for (File file : b2) {
                com.google.firebase.crashlytics.c.b.a().a("Found crash report " + file.getPath());
                linkedList.add(new d(file));
            }
        }
        if (a2 != null) {
            for (File file2 : a2) {
                linkedList.add(new com.google.firebase.crashlytics.c.o.c.b(file2));
            }
        }
        if (linkedList.isEmpty()) {
            com.google.firebase.crashlytics.c.b.a().a("No reports found.");
        }
        return linkedList;
    }
}

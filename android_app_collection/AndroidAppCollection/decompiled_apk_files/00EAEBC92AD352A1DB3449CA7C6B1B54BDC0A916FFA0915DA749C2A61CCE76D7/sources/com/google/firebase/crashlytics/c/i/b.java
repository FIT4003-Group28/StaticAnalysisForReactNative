package com.google.firebase.crashlytics.c.i;

import android.content.Context;
import com.google.firebase.crashlytics.c.h.h;
import java.io.File;
import java.util.Set;
/* loaded from: classes.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final c f8800d = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Context f8801a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0166b f8802b;

    /* renamed from: c  reason: collision with root package name */
    private com.google.firebase.crashlytics.c.i.a f8803c;

    /* renamed from: com.google.firebase.crashlytics.c.i.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0166b {
        File a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements com.google.firebase.crashlytics.c.i.a {
        private c() {
        }

        @Override // com.google.firebase.crashlytics.c.i.a
        public void a() {
        }

        @Override // com.google.firebase.crashlytics.c.i.a
        public void a(long j, String str) {
        }

        @Override // com.google.firebase.crashlytics.c.i.a
        public String b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.c.i.a
        public byte[] c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.c.i.a
        public void d() {
        }
    }

    public b(Context context, InterfaceC0166b interfaceC0166b) {
        this(context, interfaceC0166b, null);
    }

    public b(Context context, InterfaceC0166b interfaceC0166b, String str) {
        this.f8801a = context;
        this.f8802b = interfaceC0166b;
        this.f8803c = f8800d;
        a(str);
    }

    private String a(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        return lastIndexOf == -1 ? name : name.substring(20, lastIndexOf);
    }

    private File b(String str) {
        return new File(this.f8802b.a(), "crashlytics-userlog-" + str + ".temp");
    }

    public void a() {
        this.f8803c.d();
    }

    public void a(long j, String str) {
        this.f8803c.a(j, str);
    }

    void a(File file, int i) {
        this.f8803c = new d(file, i);
    }

    public final void a(String str) {
        this.f8803c.a();
        this.f8803c = f8800d;
        if (str == null) {
            return;
        }
        if (!h.a(this.f8801a, "com.crashlytics.CollectCustomLogs", true)) {
            com.google.firebase.crashlytics.c.b.a().a("Preferences requested no custom logs. Aborting log file creation.");
        } else {
            a(b(str), 65536);
        }
    }

    public void a(Set<String> set) {
        File[] listFiles = this.f8802b.a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(a(file))) {
                    file.delete();
                }
            }
        }
    }

    public byte[] b() {
        return this.f8803c.c();
    }

    public String c() {
        return this.f8803c.b();
    }
}

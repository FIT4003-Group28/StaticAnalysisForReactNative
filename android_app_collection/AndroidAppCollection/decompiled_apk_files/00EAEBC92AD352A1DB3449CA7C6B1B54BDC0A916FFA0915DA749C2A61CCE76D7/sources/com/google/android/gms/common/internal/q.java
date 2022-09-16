package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    private static final k f7043b = new k("LibraryVersion", "");

    /* renamed from: c  reason: collision with root package name */
    private static q f7044c = new q();

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, String> f7045a = new ConcurrentHashMap<>();

    protected q() {
    }

    public static q a() {
        return f7044c;
    }

    public String a(String str) {
        s.a(str, (Object) "Please provide a valid libraryName");
        if (this.f7045a.containsKey(str)) {
            return this.f7045a.get(str);
        }
        Properties properties = new Properties();
        String str2 = null;
        try {
            InputStream resourceAsStream = q.class.getResourceAsStream(String.format("/%s.properties", str));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str2 = properties.getProperty("version", null);
                k kVar = f7043b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str2);
                kVar.c("LibraryVersion", sb.toString());
            } else {
                k kVar2 = f7043b;
                String valueOf = String.valueOf(str);
                kVar2.b("LibraryVersion", valueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "));
            }
        } catch (IOException e2) {
            k kVar3 = f7043b;
            String valueOf2 = String.valueOf(str);
            kVar3.a("LibraryVersion", valueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf2) : new String("Failed to get app version for libraryName: "), e2);
        }
        if (str2 == null) {
            f7043b.a("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str2 = "UNKNOWN";
        }
        this.f7045a.put(str, str2);
        return str2;
    }
}

package c.d.d.e;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f2817c = new b();

    /* renamed from: a  reason: collision with root package name */
    private String f2818a = "unknown";

    /* renamed from: b  reason: collision with root package name */
    private int f2819b = 5;

    private b() {
    }

    public static b a() {
        return f2817c;
    }

    private String a(String str) {
        if (this.f2818a != null) {
            return this.f2818a + ":" + str;
        }
        return str;
    }

    private static String a(String str, Throwable th) {
        return str + '\n' + a(th);
    }

    private static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private void a(int i, String str, String str2) {
        Log.println(i, a(str), str2);
    }

    private void a(int i, String str, String str2, Throwable th) {
        Log.println(i, a(str), a(str2, th));
    }

    @Override // c.d.d.e.c
    public void a(String str, String str2) {
        a(5, str, str2);
    }

    @Override // c.d.d.e.c
    public void a(String str, String str2, Throwable th) {
        a(3, str, str2, th);
    }

    @Override // c.d.d.e.c
    public boolean a(int i) {
        return this.f2819b <= i;
    }

    @Override // c.d.d.e.c
    public void b(String str, String str2) {
        a(4, str, str2);
    }

    @Override // c.d.d.e.c
    public void b(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    @Override // c.d.d.e.c
    public void c(String str, String str2) {
        a(6, str, str2);
    }

    @Override // c.d.d.e.c
    public void c(String str, String str2, Throwable th) {
        a(5, str, str2, th);
    }

    @Override // c.d.d.e.c
    public void d(String str, String str2) {
        a(2, str, str2);
    }

    @Override // c.d.d.e.c
    public void d(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    @Override // c.d.d.e.c
    public void e(String str, String str2) {
        a(6, str, str2);
    }

    @Override // c.d.d.e.c
    public void f(String str, String str2) {
        a(3, str, str2);
    }
}

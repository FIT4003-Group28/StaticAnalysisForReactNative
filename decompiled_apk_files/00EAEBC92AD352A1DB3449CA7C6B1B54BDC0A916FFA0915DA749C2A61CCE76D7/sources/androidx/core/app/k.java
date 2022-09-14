package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f1551a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f1552b;

    /* renamed from: c  reason: collision with root package name */
    String f1553c;

    /* renamed from: d  reason: collision with root package name */
    String f1554d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1555e;

    /* renamed from: f  reason: collision with root package name */
    boolean f1556f;

    public IconCompat a() {
        return this.f1552b;
    }

    public String b() {
        return this.f1554d;
    }

    public CharSequence c() {
        return this.f1551a;
    }

    public String d() {
        return this.f1553c;
    }

    public boolean e() {
        return this.f1555e;
    }

    public boolean f() {
        return this.f1556f;
    }

    public String g() {
        String str = this.f1553c;
        if (str != null) {
            return str;
        }
        if (this.f1551a == null) {
            return "";
        }
        return "name:" + ((Object) this.f1551a);
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().f() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}

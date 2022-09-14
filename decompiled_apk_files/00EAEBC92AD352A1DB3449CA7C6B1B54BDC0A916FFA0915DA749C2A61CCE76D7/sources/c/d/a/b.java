package c.d.a;

import c.d.d.d.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final File f2719a;

    private b(File file) {
        i.a(file);
        this.f2719a = file;
    }

    public static b a(File file) {
        if (file != null) {
            return new b(file);
        }
        return null;
    }

    @Override // c.d.a.a
    public InputStream a() {
        return new FileInputStream(this.f2719a);
    }

    public File b() {
        return this.f2719a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return this.f2719a.equals(((b) obj).f2719a);
    }

    public int hashCode() {
        return this.f2719a.hashCode();
    }

    @Override // c.d.a.a
    public long size() {
        return this.f2719a.length();
    }
}

package b.a.a.a.a.f;

import android.content.Context;
import b.a.a.a.i;
import java.io.File;
/* compiled from: FileStoreImpl.java */
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1188a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1189b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1190c;

    public b(i iVar) {
        if (iVar.getContext() == null) {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        }
        this.f1188a = iVar.getContext();
        this.f1189b = iVar.getPath();
        this.f1190c = "Android/" + this.f1188a.getPackageName();
    }

    @Override // b.a.a.a.a.f.a
    public File a() {
        return a(this.f1188a.getFilesDir());
    }

    File a(File file) {
        if (file != null) {
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            b.a.a.a.c.h().d("Fabric", "Couldn't create file");
            return null;
        }
        b.a.a.a.c.h().a("Fabric", "Null File");
        return null;
    }
}

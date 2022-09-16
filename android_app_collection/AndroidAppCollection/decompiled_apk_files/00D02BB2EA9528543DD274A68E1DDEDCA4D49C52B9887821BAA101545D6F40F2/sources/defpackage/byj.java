package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: byj  reason: default package */
/* loaded from: classes.dex */
public class byj implements byd {
    private final byl a;

    public byj(byl bylVar) {
        this.a = bylVar;
    }

    @Override // defpackage.byd
    public final bye a() {
        byl bylVar = this.a;
        File cacheDir = bylVar.a.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, bylVar.b);
        if (file == null) {
            return null;
        }
        if (!file.mkdirs() && (!file.exists() || !file.isDirectory())) {
            return null;
        }
        return new byk(file);
    }
}

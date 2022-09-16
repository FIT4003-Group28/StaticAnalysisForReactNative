package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: etc  reason: default package */
/* loaded from: classes3.dex */
final class etc {
    public final File a;

    public etc(File file) {
        this.a = file;
    }

    public final void a() {
        if (this.a.exists()) {
            this.a.delete();
        }
    }
}

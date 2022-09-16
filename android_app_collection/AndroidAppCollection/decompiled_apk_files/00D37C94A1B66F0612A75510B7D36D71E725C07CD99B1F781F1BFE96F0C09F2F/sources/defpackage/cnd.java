package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cnd  reason: default package */
/* loaded from: classes2.dex */
public final class cnd implements cnc {
    private final /* synthetic */ int a;

    public cnd() {
    }

    public cnd(int i) {
        this.a = i;
    }

    @Override // defpackage.cnc
    public final Class a() {
        return this.a != 0 ? ParcelFileDescriptor.class : InputStream.class;
    }

    @Override // defpackage.cnc
    public final /* bridge */ /* synthetic */ Object b(File file) {
        if (this.a == 0) {
            return new FileInputStream(file);
        }
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // defpackage.cnc
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        if (this.a == 0) {
            ((InputStream) obj).close();
        } else {
            ((ParcelFileDescriptor) obj).close();
        }
    }
}

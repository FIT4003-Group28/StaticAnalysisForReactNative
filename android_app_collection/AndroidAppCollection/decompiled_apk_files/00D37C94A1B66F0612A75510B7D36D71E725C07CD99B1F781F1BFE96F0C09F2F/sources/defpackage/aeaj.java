package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.io.File;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aeaj  reason: default package */
/* loaded from: classes.dex */
public final class aeaj extends afli {
    private final Set a;
    private Uri b;
    private String c;
    private long d;
    private int e;

    public aeaj(Set set, int i) {
        super(new pdt("CacheManager"), i);
        this.a = set;
    }

    private final boolean c() {
        String str = this.c;
        if (str == null) {
            return false;
        }
        for (pde pdeVar : this.a) {
            pdj c = pdeVar.c(str, this.d);
            if (c != null) {
                if (!c.d) {
                    pdeVar.k(c);
                } else {
                    File file = c.e;
                    if (file != null) {
                        Uri fromFile = Uri.fromFile(file);
                        long j = this.d;
                        long j2 = j - c.b;
                        long j3 = c.c - j2;
                        if (j3 <= 0) {
                            throw new EOFException();
                        }
                        super.h(new asy(fromFile, j, j2, j3, str, this.e));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.afli, defpackage.aflg, defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        int g = super.g(bArr, i, i2);
        if (g >= 0) {
            this.d += g;
            return g;
        }
        super.j();
        if (!c()) {
            return -1;
        }
        return g(bArr, i, i2);
    }

    @Override // defpackage.afli, defpackage.aflg, defpackage.asv
    public final long h(asy asyVar) {
        this.b = asyVar.a;
        this.c = asyVar.i;
        this.d = asyVar.g;
        this.e = asyVar.j;
        c();
        return asyVar.h;
    }

    @Override // defpackage.aflg, defpackage.asv
    public final Uri i() {
        return this.b;
    }

    @Override // defpackage.aflg, defpackage.asv
    public final void j() {
        this.b = null;
        super.j();
    }
}

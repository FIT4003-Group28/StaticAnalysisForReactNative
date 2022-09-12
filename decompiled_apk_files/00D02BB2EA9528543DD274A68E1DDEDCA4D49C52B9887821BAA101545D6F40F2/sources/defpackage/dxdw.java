package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: dxdw  reason: default package */
/* loaded from: classes6.dex */
public final class dxdw {
    public final dxdx a;
    public final boolean[] b;
    final /* synthetic */ dxdz c;
    private boolean d;

    public dxdw(dxdz dxdzVar, dxdx dxdxVar) {
        this.c = dxdzVar;
        this.a = dxdxVar;
        this.b = dxdxVar.c ? null : new boolean[dxdzVar.c];
    }

    public final void a() {
        if (this.d) {
            this.c.d(this, false);
            this.c.l(this.a.a);
            return;
        }
        this.c.d(this, true);
    }

    public final void b() {
        this.c.d(this, false);
    }

    public final OutputStream d() {
        FileOutputStream fileOutputStream;
        dxdv dxdvVar;
        synchronized (this.c) {
            dxdx dxdxVar = this.a;
            if (dxdxVar.d == this) {
                if (!dxdxVar.c) {
                    this.b[0] = true;
                }
                File d = dxdxVar.d();
                try {
                    fileOutputStream = new FileOutputStream(d);
                } catch (FileNotFoundException unused) {
                    this.c.b.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(d);
                    } catch (FileNotFoundException unused2) {
                        return dxdz.g;
                    }
                }
                dxdvVar = new dxdv(this, fileOutputStream);
            } else {
                throw new IllegalStateException();
            }
        }
        return dxdvVar;
    }
}

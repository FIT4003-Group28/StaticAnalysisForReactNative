package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cxgd  reason: default package */
/* loaded from: classes5.dex */
public final class cxgd implements cxfn {
    private final File a;
    private boolean b;
    private cxgc c;

    public cxgd(File file) {
        this.a = file;
        boolean z = true;
        if (!file.exists()) {
            if (!file.getParentFile().exists() || !file.getParentFile().canWrite()) {
                z = file.getParentFile().mkdirs();
            }
        } else if (!file.canWrite()) {
            z = false;
        }
        this.b = z;
    }

    private final synchronized void b(eacd eacdVar) {
        if (this.c == null) {
            try {
                this.c = new cxgc(new FileOutputStream(this.a, true));
            } catch (IOException unused) {
                this.b = false;
            }
        }
        try {
            cxgc cxgcVar = this.c;
            byte[] bS = eacdVar.bS();
            synchronized (cxgcVar.a) {
                cxgcVar.a.N(bS);
                cxgcVar.a.y();
            }
        } catch (IOException unused2) {
            this.b = false;
        }
    }

    @Override // defpackage.cxfn
    public final void a(eacd eacdVar) {
        if (!this.b) {
            return;
        }
        b(eacdVar);
    }
}

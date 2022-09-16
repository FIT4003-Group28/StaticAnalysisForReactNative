package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cnb  reason: default package */
/* loaded from: classes2.dex */
final class cnb implements cil {
    private final File a;
    private final cnc b;
    private Object c;

    public cnb(File file, cnc cncVar) {
        this.a = file;
        this.b = cncVar;
    }

    @Override // defpackage.cil
    public final Class a() {
        return this.b.a();
    }

    @Override // defpackage.cil
    public final void b() {
    }

    @Override // defpackage.cil
    public final void c() {
        Object obj = this.c;
        if (obj != null) {
            try {
                this.b.c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.cil
    public final void d(cfv cfvVar, cik cikVar) {
        try {
            Object b = this.b.b(this.a);
            this.c = b;
            cikVar.f(b);
        } catch (FileNotFoundException e) {
            cikVar.g(e);
        }
    }

    @Override // defpackage.cil
    public final int e() {
        return 1;
    }
}

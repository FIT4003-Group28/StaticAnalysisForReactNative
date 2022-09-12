package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bzx  reason: default package */
/* loaded from: classes4.dex */
final class bzx<Data> implements buj<Data> {
    private final File a;
    private final bzy<Data> b;
    private Data c;

    public bzx(File file, bzy<Data> bzyVar) {
        this.a = file;
        this.b = bzyVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super Data> buiVar) {
        try {
            Data c = this.b.c(this.a);
            this.c = c;
            buiVar.f(c);
        } catch (FileNotFoundException e) {
            buiVar.g(e);
        }
    }

    @Override // defpackage.buj
    public final void b() {
        Data data = this.c;
        if (data != null) {
            try {
                this.b.b(data);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.buj
    public final void c() {
    }

    @Override // defpackage.buj
    public final Class<Data> d() {
        return this.b.a();
    }

    @Override // defpackage.buj
    public final int e() {
        return 1;
    }
}

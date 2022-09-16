package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cix  reason: default package */
/* loaded from: classes2.dex */
public abstract class cix implements cil {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public cix(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    @Override // defpackage.cil
    public final void b() {
    }

    @Override // defpackage.cil
    public final void c() {
        Object obj = this.c;
        if (obj != null) {
            try {
                g(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.cil
    public final void d(cfv cfvVar, cik cikVar) {
        try {
            Object f = f(this.a, this.b);
            this.c = f;
            cikVar.f(f);
        } catch (FileNotFoundException e) {
            cikVar.g(e);
        }
    }

    @Override // defpackage.cil
    public final int e() {
        return 1;
    }

    protected abstract Object f(Uri uri, ContentResolver contentResolver);

    protected abstract void g(Object obj);
}

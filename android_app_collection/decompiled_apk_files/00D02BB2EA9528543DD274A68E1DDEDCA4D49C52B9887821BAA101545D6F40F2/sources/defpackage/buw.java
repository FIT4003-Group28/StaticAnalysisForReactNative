package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: buw  reason: default package */
/* loaded from: classes4.dex */
public abstract class buw<T> implements buj<T> {
    private final Uri a;
    private final ContentResolver b;
    private T c;

    public buw(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super T> buiVar) {
        try {
            T g = g(this.a, this.b);
            this.c = g;
            buiVar.f(g);
        } catch (FileNotFoundException e) {
            buiVar.g(e);
        }
    }

    @Override // defpackage.buj
    public final void b() {
        T t = this.c;
        if (t != null) {
            try {
                f(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.buj
    public final void c() {
    }

    @Override // defpackage.buj
    public final int e() {
        return 1;
    }

    protected abstract void f(T t);

    protected abstract T g(Uri uri, ContentResolver contentResolver);
}

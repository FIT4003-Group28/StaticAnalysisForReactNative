package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bug  reason: default package */
/* loaded from: classes4.dex */
public abstract class bug<T> implements buj<T> {
    private final String a;
    private final AssetManager b;
    private T c;

    public bug(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super T> buiVar) {
        try {
            T f = f(this.b, this.a);
            this.c = f;
            buiVar.f(f);
        } catch (IOException e) {
            buiVar.g(e);
        }
    }

    @Override // defpackage.buj
    public final void b() {
        T t = this.c;
        if (t != null) {
            try {
                g(t);
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

    protected abstract T f(AssetManager assetManager, String str);

    protected abstract void g(T t);
}

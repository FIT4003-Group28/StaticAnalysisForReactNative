package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cii  reason: default package */
/* loaded from: classes2.dex */
public abstract class cii implements cil {
    private final String a;
    private final AssetManager b;
    private Object c;

    public cii(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
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
            Object f = f(this.b, this.a);
            this.c = f;
            cikVar.f(f);
        } catch (IOException e) {
            cikVar.g(e);
        }
    }

    @Override // defpackage.cil
    public final int e() {
        return 1;
    }

    protected abstract Object f(AssetManager assetManager, String str);

    protected abstract void g(Object obj);
}

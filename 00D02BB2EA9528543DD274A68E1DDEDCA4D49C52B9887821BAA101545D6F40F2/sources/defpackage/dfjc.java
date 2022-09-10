package defpackage;

import com.google.geo.ar.arlo.api.jni.HulaMapJniImpl;
/* compiled from: PG */
/* renamed from: dfjc  reason: default package */
/* loaded from: classes6.dex */
public final class dfjc {
    public final Object a;
    public final dfew b;
    public final dffe c;
    public final dfet d;

    public dfjc(long j, dfkg dfkgVar) {
        HulaMapJniImpl hulaMapJniImpl = new HulaMapJniImpl();
        dfet a = dfkgVar.a();
        Object obj = new Object();
        this.a = obj;
        dfew dfewVar = new dfew(dfjc.class, j);
        this.b = dfewVar;
        this.c = hulaMapJniImpl;
        this.d = a;
        synchronized (obj) {
            if (dfewVar.c()) {
                return;
            }
            HulaMapJniImpl.nativeSetMapTexture(dfewVar.b(), a.d());
        }
    }

    public final void a(dfgg dfggVar) {
        byte[] bS = dfggVar.bS();
        synchronized (this.a) {
            if (!this.b.c()) {
                HulaMapJniImpl.nativeSetFeatureParams(this.b.b(), bS);
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            if (!this.b.c()) {
                HulaMapJniImpl.nativeDestroy(this.b.b());
                this.b.a();
                this.d.e();
            }
        }
    }
}

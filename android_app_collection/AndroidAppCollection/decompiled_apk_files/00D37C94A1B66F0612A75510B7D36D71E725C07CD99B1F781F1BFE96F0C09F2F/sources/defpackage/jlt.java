package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: jlt  reason: default package */
/* loaded from: classes3.dex */
final class jlt implements Serializable, jmg {
    private static final long serialVersionUID = -4019560255984295982L;
    private final Class a;
    private final Class b;

    public jlt(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    @Override // defpackage.jmg
    public final Class a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return jmg.class;
    }

    @Override // defpackage.jmg
    public final Class b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jmg) {
            jmg jmgVar = (jmg) obj;
            if (this.a.equals(jmgVar.a()) && this.b.equals(jmgVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a.hashCode() ^ 1192979616) + (this.b.hashCode() ^ 399516643);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.apps.youtube.app.offline.renderergenerator.OfflineModelToRendererGeneratorKey(offlineModelType=" + this.a + ", rendererType=" + this.b + ')';
    }
}

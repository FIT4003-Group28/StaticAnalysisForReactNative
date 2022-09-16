package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: ajtv  reason: default package */
/* loaded from: classes.dex */
public final class ajtv implements Serializable, ajtw {
    private static final long serialVersionUID = 3447871915224247120L;
    private final Class a;
    private final Class b;

    public ajtv(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    @Override // defpackage.ajtw
    public final Class a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return ajtw.class;
    }

    @Override // defpackage.ajtw
    public final Class b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajtw) {
            ajtw ajtwVar = (ajtw) obj;
            if (this.a.equals(ajtwVar.a()) && this.b.equals(ajtwVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a.hashCode() ^ (-509967024)) + (this.b.hashCode() ^ 866579852);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.youtube.rendering.presenter.animation.dagger.PresenterClassPairKey(first=" + this.a + ", second=" + this.b + ')';
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dzwb  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzwb extends dzvr implements dzws {
    public dzwb() {
        Object obj = dzvr.e;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzwb) {
            dzwb dzwbVar = (dzwb) obj;
            return d().equals(dzwbVar.d()) && this.c.equals(dzwbVar.c) && this.d.equals(dzwbVar.d) && dzvx.d(this.b, dzwbVar.b);
        } else if (!(obj instanceof dzws)) {
            return false;
        } else {
            return obj.equals(c());
        }
    }

    public final int hashCode() {
        return (((d().hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        dzwm c = c();
        if (c != this) {
            return c.toString();
        }
        return "property " + this.c + " (Kotlin reflection is not available)";
    }

    public dzwb(Object obj, Class cls) {
        super(obj, cls, "state", "getState$java_com_google_android_apps_gmm_ugc_post_photo_photo_post_submitter()Lcom/google/android/apps/gmm/ugc/post/photo/PhotoPostSubmitter$DraftState;");
    }
}

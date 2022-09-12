package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cduo  reason: default package */
/* loaded from: classes4.dex */
final class cduo extends cdwx {
    private final cdwq a;

    public cduo(cdwq cdwqVar) {
        if (cdwqVar != null) {
            this.a = cdwqVar;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // defpackage.cdwx
    public final int a() {
        return R.string.photo_posts_add_more_photos;
    }

    @Override // defpackage.cdwx
    public final int b() {
        return 2131232486;
    }

    @Override // defpackage.cdwx
    public final cdwq c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdwx) {
            cdwx cdwxVar = (cdwx) obj;
            if (cdwxVar.a() == R.string.photo_posts_add_more_photos && cdwxVar.b() == 2131232486 && this.a.equals(cdwxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) ^ 924151137;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("Button{descriptionId=");
        sb.append(R.string.photo_posts_add_more_photos);
        sb.append(", iconId=");
        sb.append(2131232486);
        sb.append(", action=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

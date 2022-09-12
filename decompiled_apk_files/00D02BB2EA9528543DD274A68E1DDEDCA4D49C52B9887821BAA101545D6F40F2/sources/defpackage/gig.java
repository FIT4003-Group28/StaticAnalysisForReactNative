package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: gig  reason: default package */
/* loaded from: classes.dex */
public final class gig extends gkd {
    public final Animator a;
    public final boolean b;

    public gig(Animator animator, boolean z) {
        if (animator != null) {
            this.a = animator;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null animator");
    }

    @Override // defpackage.gkd
    public final Animator a() {
        return this.a;
    }

    @Override // defpackage.gkd
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gkd) {
            gkd gkdVar = (gkd) obj;
            if (this.a.equals(gkdVar.a()) && this.b == gkdVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("VisibilityAnimator{animator=");
        sb.append(valueOf);
        sb.append(", animatingToVisible=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

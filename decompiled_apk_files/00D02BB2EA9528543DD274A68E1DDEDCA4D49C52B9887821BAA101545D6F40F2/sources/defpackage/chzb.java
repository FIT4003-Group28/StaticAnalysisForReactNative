package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: chzb  reason: default package */
/* loaded from: classes4.dex */
final class chzb extends chza {
    public final long a;
    public final Animator b;
    private final dbsg<chzh> c;
    private final Runnable d;

    public chzb(long j, Animator animator, dbsg<chzh> dbsgVar, Runnable runnable) {
        this.a = j;
        if (animator != null) {
            this.b = animator;
            this.c = dbsgVar;
            if (runnable != null) {
                this.d = runnable;
                return;
            }
            throw new NullPointerException("Null resetViewsCallback");
        }
        throw new NullPointerException("Null animator");
    }

    @Override // defpackage.chza
    public final long a() {
        return this.a;
    }

    @Override // defpackage.chza
    public final Animator b() {
        return this.b;
    }

    @Override // defpackage.chza
    public final dbsg<chzh> c() {
        return this.c;
    }

    @Override // defpackage.chza
    public final Runnable d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chza) {
            chza chzaVar = (chza) obj;
            if (this.a == chzaVar.a() && this.b.equals(chzaVar.b()) && this.c.equals(chzaVar.c()) && this.d.equals(chzaVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.d.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 95 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("AnimatorHolder{totalDurationMs=");
        sb.append(j);
        sb.append(", animator=");
        sb.append(valueOf);
        sb.append(", moveSpec=");
        sb.append(valueOf2);
        sb.append(", resetViewsCallback=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

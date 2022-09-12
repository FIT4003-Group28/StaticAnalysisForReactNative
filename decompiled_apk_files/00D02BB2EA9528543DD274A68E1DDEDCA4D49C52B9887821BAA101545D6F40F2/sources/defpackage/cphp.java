package defpackage;

import com.google.android.gms.wearable.Channel;
/* compiled from: PG */
/* renamed from: cphp  reason: default package */
/* loaded from: classes5.dex */
public final class cphp implements cpgg {
    private final cpgh a;

    public cphp(cpgh cpghVar) {
        this.a = cpghVar;
    }

    @Override // defpackage.cpgg
    public final void c(Channel channel) {
        cphq.a(channel);
    }

    @Override // defpackage.cpgg
    public final void d(Channel channel) {
        cphq.a(channel);
    }

    @Override // defpackage.cpgg
    public final void e(Channel channel) {
        cphq.a(channel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((cphp) obj).a);
        }
        return false;
    }

    @Override // defpackage.cpgg
    public final void f(Channel channel) {
        cphq.a(channel);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

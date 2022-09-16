package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: oww  reason: default package */
/* loaded from: classes4.dex */
public final class oww implements owx {
    private final owv a;

    public oww(owv owvVar) {
        this.a = owvVar;
    }

    @Override // defpackage.owx
    public final owv a(UUID uuid) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return pcx.p(this.a, ((oww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

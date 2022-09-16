package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: owu  reason: default package */
/* loaded from: classes4.dex */
public final class owu implements owx {
    private final Map a = new HashMap();

    @Override // defpackage.owx
    public final owv a(UUID uuid) {
        return (owv) this.a.get(uuid);
    }

    public final void b(UUID uuid, owv owvVar) {
        this.a.put(uuid, owvVar);
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        owu owuVar = (owu) obj;
        if (this.a.size() != owuVar.a.size()) {
            return false;
        }
        for (UUID uuid : this.a.keySet()) {
            if (!pcx.p(this.a.get(uuid), owuVar.a.get(uuid))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

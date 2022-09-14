package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cacm  reason: default package */
/* loaded from: classes4.dex */
public class cacm implements cafx {
    private final List<cqix<?>> a;

    public cacm(List<cqix<?>> list) {
        this.a = list;
    }

    @Override // defpackage.cafx
    public List<cqix<?>> a() {
        return this.a;
    }

    public boolean equals(@dzsi Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cacm) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

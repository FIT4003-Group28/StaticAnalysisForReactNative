package defpackage;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vof  reason: default package */
/* loaded from: classes7.dex */
public final class vof extends WeakReference<voi> {
    private final int a;

    public vof(voi voiVar) {
        super(voiVar);
        this.a = voiVar.hashCode();
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof vof) {
            return dbsd.a(get(), ((vof) obj).get());
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        return this.a;
    }
}

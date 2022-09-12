package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: depg  reason: default package */
/* loaded from: classes6.dex */
final class depg {
    public final deow<?> a;
    public final Set<depg> b = new HashSet();
    public final Set<depg> c = new HashSet();

    public depg(deow<?> deowVar) {
        this.a = deowVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.c.isEmpty();
    }
}

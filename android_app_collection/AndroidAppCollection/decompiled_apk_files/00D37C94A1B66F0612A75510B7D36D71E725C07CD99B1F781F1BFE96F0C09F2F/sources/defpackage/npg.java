package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: npg  reason: default package */
/* loaded from: classes3.dex */
public final class npg {
    private final Set a = new HashSet();

    public final void a(String str) {
        this.a.add(str);
    }

    public final void b(String str) {
        this.a.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(String str) {
        return this.a.contains(str);
    }
}

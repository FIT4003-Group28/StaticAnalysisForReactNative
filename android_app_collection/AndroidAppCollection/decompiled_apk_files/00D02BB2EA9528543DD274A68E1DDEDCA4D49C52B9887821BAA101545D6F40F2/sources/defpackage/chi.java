package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: chi  reason: default package */
/* loaded from: classes.dex */
public final class chi {
    private final List<btn> a = new ArrayList();

    public final synchronized List<btn> a() {
        return this.a;
    }

    public final synchronized void b(btn btnVar) {
        this.a.add(btnVar);
    }
}

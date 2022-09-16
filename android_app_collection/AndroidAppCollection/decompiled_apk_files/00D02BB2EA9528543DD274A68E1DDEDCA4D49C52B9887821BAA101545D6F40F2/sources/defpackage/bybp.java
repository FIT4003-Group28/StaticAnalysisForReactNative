package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bybp  reason: default package */
/* loaded from: classes4.dex */
public abstract class bybp {
    @dzsi
    public bybm d;

    public abstract boolean a(byay byayVar);

    public abstract List<byay> d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return !d().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        bybm bybmVar = this.d;
        if (bybmVar == null || !bybmVar.b.c.contains(bybmVar.a)) {
            return;
        }
        bybmVar.b.a(bybmVar.a);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pjn  reason: default package */
/* loaded from: classes4.dex */
public final class pjn implements pjj {
    public final ppv a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public pjn(pqb pqbVar, boolean z) {
        this.a = new ppv(pqbVar, z);
    }

    @Override // defpackage.pjj
    public final pkt a() {
        return this.a.d;
    }

    @Override // defpackage.pjj
    public final Object b() {
        return this.b;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}

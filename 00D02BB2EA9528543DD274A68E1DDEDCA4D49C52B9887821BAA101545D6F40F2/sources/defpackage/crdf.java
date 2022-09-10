package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: crdf  reason: default package */
/* loaded from: classes5.dex */
public final class crdf implements crbl {
    private final Resources a;
    private final crco b;
    private final bvjj c;

    public crdf(Resources resources, crco crcoVar, bvjj bvjjVar) {
        this.a = resources;
        this.b = crcoVar;
        this.c = bvjjVar;
    }

    @Override // defpackage.crbl
    @dzsi
    public final crbc a(crfj crfjVar) {
        cres a = cres.a(this.c);
        int i = crfjVar.g;
        if (i != -1) {
            return this.b.a(this.a, i, a);
        }
        return null;
    }

    @Override // defpackage.crbl
    public final void b() {
        throw null;
    }

    @Override // defpackage.crbl
    public final void c() {
    }
}

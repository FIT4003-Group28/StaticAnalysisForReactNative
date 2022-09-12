package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: clny  reason: default package */
/* loaded from: classes5.dex */
public final class clny implements clnu {
    public final cmed a;
    public int d;
    public boolean e;
    public final List<cmeh> c = new ArrayList();
    public final Object b = new Object();

    public clny(cmej cmejVar, boolean z) {
        this.a = new cmed(cmejVar, z);
    }

    @Override // defpackage.clnu
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.clnu
    public final clpb b() {
        return this.a.d;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}

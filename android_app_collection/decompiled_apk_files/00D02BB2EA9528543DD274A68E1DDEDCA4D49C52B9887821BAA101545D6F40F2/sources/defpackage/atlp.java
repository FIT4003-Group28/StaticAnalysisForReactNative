package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: atlp  reason: default package */
/* loaded from: classes2.dex */
public final class atlp implements Serializable {
    public final asld a;
    public final boolean b;
    final int c;
    final int d;
    @dzsi
    public final Float e;
    public final boolean f;
    public final boolean g;
    @dzsi
    public final aste h;
    public final astb i;
    @dzsi
    public final aryr j;
    @dzsi
    public final List<aryr> k;
    public final boolean l;
    @dzsi
    final amte m;
    public final boolean n;
    public final boolean o;
    @dzsi
    public final crmw p;

    public atlp(asld asldVar, boolean z, @dzsi amuo amuoVar, @dzsi Float f, boolean z2, boolean z3, @dzsi aste asteVar, astb astbVar, @dzsi aryr aryrVar, @dzsi List<aryr> list, boolean z4, @dzsi amte amteVar, boolean z5, boolean z6, @dzsi crmw crmwVar) {
        int i;
        this.a = asldVar;
        this.b = z;
        if (amuoVar != null) {
            this.c = amuoVar.i;
            i = amuoVar.hashCode();
        } else {
            i = -1;
            this.c = -1;
        }
        this.d = i;
        this.e = f;
        this.f = z2;
        this.g = z3;
        this.h = asteVar;
        this.i = astbVar;
        this.j = aryrVar;
        this.k = list;
        this.l = z4;
        this.m = amteVar;
        this.n = z5;
        this.o = z6;
        this.p = crmwVar;
    }
}

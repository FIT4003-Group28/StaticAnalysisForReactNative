package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: jho  reason: default package */
/* loaded from: classes7.dex */
public final class jho {
    public final CharSequence a;
    @dzsi
    public final cqtd b;
    public final cjtd c;
    public final boolean d;
    public final Callable<Boolean> e;
    public final int f;
    public final boolean g;
    @dzsi
    public final Integer h;
    public final boolean i;
    private final CharSequence j;
    private final cqss k;
    @dzsi
    private final cqss l;
    private final jhn m;
    private final int n;
    private final boolean o;

    public jho(jhm jhmVar) {
        this.j = bvpb.b(jhmVar.a);
        this.a = bvpb.b(jhmVar.b);
        this.b = jhmVar.c;
        this.k = jhmVar.d;
        this.l = jhmVar.e;
        this.c = jhmVar.f;
        this.m = jhmVar.g;
        this.n = jhmVar.h;
        dbsk.a(jhmVar.i == (jhmVar.k != null));
        this.d = jhmVar.i;
        this.o = jhmVar.j;
        this.e = jhmVar.k;
        this.f = jhmVar.l;
        this.g = jhmVar.n;
        this.h = jhmVar.m;
        this.i = jhmVar.o;
    }

    public final CharSequence a(Context context) {
        return Boolean.valueOf(this.o).booleanValue() ? context.getText(this.f) : this.j;
    }

    public final int b(Context context) {
        return this.k.b(context);
    }

    public final int c(Context context) {
        cqss cqssVar = this.l;
        if (cqssVar == null) {
            cqssVar = this.k;
        }
        return cqssVar.b(context);
    }

    public final boolean d(@dzsi View view, cjqm cjqmVar) {
        jhn jhnVar = this.m;
        if (jhnVar != null) {
            jhnVar.a(view, cjqmVar);
            return true;
        }
        return false;
    }

    public final Integer e() {
        return Integer.valueOf(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jho jhoVar = (jho) obj;
            if (this.n == jhoVar.n && this.d == jhoVar.d && this.f == jhoVar.f && this.g == jhoVar.g && this.i == jhoVar.i && dbsd.a(this.j.toString(), jhoVar.j.toString()) && dbsd.a(this.a.toString(), jhoVar.a.toString()) && dbsd.a(this.b, jhoVar.b) && dbsd.a(this.k, jhoVar.k) && dbsd.a(this.l, jhoVar.l) && dbsd.a(this.c, jhoVar.c) && dbsd.a(this.m, jhoVar.m) && dbsd.a(this.e, jhoVar.e) && dbsd.a(this.h, jhoVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.j, this.a, this.b, this.k, this.l, this.c, this.m, Integer.valueOf(this.n), Boolean.valueOf(this.d), this.e, Integer.valueOf(this.f), Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i)});
    }
}

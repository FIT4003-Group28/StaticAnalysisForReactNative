package defpackage;

import android.view.View;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: akfe  reason: default package */
/* loaded from: classes.dex */
public final class akfe implements akew {
    public Boolean a;
    public Boolean b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public View.OnClickListener f;
    public apoj g;
    public View.OnClickListener h;
    public apoj i;
    public avhn j;
    public Optional k;
    public actj l;
    public akev m;
    private Boolean n;
    private Integer o;
    private CharSequence p;
    private Integer q;

    public akfe(byte[] bArr) {
        this.k = Optional.empty();
    }

    public final akfe a(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.e = charSequence;
        this.f = onClickListener;
        this.g = null;
        return this;
    }

    public final akfe b(CharSequence charSequence, View.OnClickListener onClickListener, apoj apojVar) {
        akfe a = a(charSequence, onClickListener);
        a.g = apojVar;
        return a;
    }

    public final akfe c(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.p = charSequence;
        this.h = onClickListener;
        this.i = null;
        return this;
    }

    public final akfe d(int i) {
        k();
        g(i);
        this.k = Optional.empty();
        return this;
    }

    public final void f(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void g(int i) {
        this.q = Integer.valueOf(i);
    }

    public final void h(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.akew
    public final /* bridge */ /* synthetic */ void i(int i) {
        throw null;
    }

    public final void j() {
        this.o = -2;
    }

    public final /* bridge */ /* synthetic */ void k() {
        this.j = null;
    }

    public akfe() {
    }

    public final akff e() {
        Boolean bool = this.n;
        if (bool == null || this.a == null || this.b == null || this.o == null || this.q == null) {
            StringBuilder sb = new StringBuilder();
            if (this.n == null) {
                sb.append(" rateLimited");
            }
            if (this.a == null) {
                sb.append(" shownOnFullscreen");
            }
            if (this.b == null) {
                sb.append(" counterfactual");
            }
            if (this.o == null) {
                sb.append(" duration");
            }
            if (this.q == null) {
                sb.append(" icon");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new akff(bool.booleanValue(), this.a.booleanValue(), this.b.booleanValue(), this.o.intValue(), this.c, this.d, this.e, this.f, this.g, this.p, this.h, this.i, this.j, this.q.intValue(), this.k, this.l, this.m);
    }
}

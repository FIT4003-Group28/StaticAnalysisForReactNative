package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: nqn  reason: default package */
/* loaded from: classes7.dex */
public final class nqn extends ContextWrapper implements npz, aufe {
    public final jzp a;
    private final crzm<Boolean> b;
    private final aufe c;
    @dzsi
    private LayoutInflater d;

    public nqn(Context context, crzm<Boolean> crzmVar, jzp jzpVar, aufe aufeVar) {
        super(context);
        this.b = crzmVar;
        this.a = jzpVar;
        this.c = aufeVar;
    }

    @Override // defpackage.npz
    public final Boolean a() {
        Boolean l = this.b.l();
        if (l == null) {
            return false;
        }
        return l;
    }

    @Override // defpackage.aufe
    public final boolean b() {
        return this.c.b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.d == null) {
                this.d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.d;
        }
        return getBaseContext().getSystemService(str);
    }
}

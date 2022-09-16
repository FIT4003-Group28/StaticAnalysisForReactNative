package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: tcq  reason: default package */
/* loaded from: classes4.dex */
public final class tcq {
    public View a;
    public View b;
    public tfi c;
    public Object d;
    public awon e;
    public tdq f;
    public String g;
    public tdz h;
    private tda i;

    public tcq() {
    }

    public tcq(tcs tcsVar) {
        this.a = tcsVar.a;
        this.b = tcsVar.b;
        this.c = tcsVar.c;
        this.d = tcsVar.d;
        this.e = tcsVar.e;
        this.f = tcsVar.f;
        this.g = tcsVar.g;
        this.h = tcsVar.h;
        this.i = tcsVar.i;
    }

    public final tcs a() {
        tda tdaVar = this.i;
        if (tdaVar == null) {
            throw new IllegalStateException("Missing required properties: conversionContext");
        }
        return new tcs(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, tdaVar);
    }

    public final void b(tda tdaVar) {
        if (tdaVar != null) {
            this.i = tdaVar;
            return;
        }
        throw new NullPointerException("Null conversionContext");
    }
}

package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: cgk  reason: default package */
/* loaded from: classes2.dex */
public final class cgk {
    public final cgl a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ cgn d;

    public cgk(cgn cgnVar, cgl cglVar) {
        this.d = cgnVar;
        this.a = cglVar;
        this.b = cglVar.e ? null : new boolean[cgnVar.d];
    }

    public final void a() {
        this.d.b(this, false);
    }

    public final void b() {
        if (!this.c) {
            try {
                a();
            } catch (IOException unused) {
            }
        }
    }
}

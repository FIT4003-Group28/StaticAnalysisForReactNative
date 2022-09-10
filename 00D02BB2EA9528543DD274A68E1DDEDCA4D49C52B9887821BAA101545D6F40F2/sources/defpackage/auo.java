package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: auo  reason: default package */
/* loaded from: classes2.dex */
final class auo extends abi {
    private final abg a;
    private final RecyclerView b;
    private final Preference c;

    public auo(abg abgVar, RecyclerView recyclerView, Preference preference) {
        this.a = abgVar;
        this.b = recyclerView;
        this.c = preference;
    }

    private final void g() {
        this.a.p(this);
        int b = ((aur) this.a).b(this.c);
        if (b != -1) {
            this.b.l(b);
        }
    }

    @Override // defpackage.abi
    public final void a() {
        g();
    }

    @Override // defpackage.abi
    public final void b(int i, int i2) {
        g();
    }

    @Override // defpackage.abi
    public final void c(int i, int i2, Object obj) {
        g();
    }

    @Override // defpackage.abi
    public final void d(int i, int i2) {
        g();
    }

    @Override // defpackage.abi
    public final void e(int i, int i2) {
        g();
    }

    @Override // defpackage.abi
    public final void f(int i, int i2) {
        g();
    }
}

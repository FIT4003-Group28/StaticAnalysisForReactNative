package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: wnf  reason: default package */
/* loaded from: classes4.dex */
public final class wnf implements aegn {
    public final azqb a;
    public final AtomicReference b = new AtomicReference(false);

    public wnf(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.aegn
    public final void e() {
        this.b.set(false);
    }

    @Override // defpackage.aegn
    public final void f() {
        this.b.set(false);
    }

    @Override // defpackage.aegj
    public final void g(FormatStreamModel formatStreamModel, long j) {
    }

    @Override // defpackage.aegn
    public final void h() {
        this.b.set(true);
    }

    @Override // defpackage.aegn
    public final void i(int i) {
        this.b.set(false);
    }

    @Override // defpackage.aegn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aegn
    public final void k() {
    }
}

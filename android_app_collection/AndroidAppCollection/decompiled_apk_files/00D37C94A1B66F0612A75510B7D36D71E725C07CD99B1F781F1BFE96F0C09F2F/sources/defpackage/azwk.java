package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: azwk  reason: default package */
/* loaded from: classes2.dex */
public final class azwk extends azwl {
    private volatile azwk _immediate;
    private final Handler b;
    private final String d;
    private final boolean e;
    private final azwk f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public azwk(Handler handler, String str) {
        this(handler, str, false);
        handler.getClass();
    }

    @Override // defpackage.azur
    public final boolean d(azrd azrdVar) {
        azrdVar.getClass();
        return !this.e || !azst.c(Looper.myLooper(), this.b.getLooper());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof azwk) && ((azwk) obj).b == this.b;
    }

    @Override // defpackage.azvy
    public final /* bridge */ /* synthetic */ azvy f() {
        return this.f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // defpackage.azur
    public final void st(azrd azrdVar, Runnable runnable) {
        azrdVar.getClass();
        if (!this.b.post(runnable)) {
            azww.b(azrdVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
            azur azurVar = azvd.a;
            azvd.b.st(azrdVar, runnable);
        }
    }

    @Override // defpackage.azvy, defpackage.azur
    public final String toString() {
        String e = e();
        if (e == null) {
            String str = this.d;
            if (str == null) {
                str = this.b.toString();
            }
            return this.e ? azst.a(str, ".immediate") : str;
        }
        return e;
    }

    private azwk(Handler handler, String str, boolean z) {
        this.b = handler;
        this.d = str;
        this.e = z;
        this._immediate = true != z ? null : this;
        azwk azwkVar = this._immediate;
        if (azwkVar == null) {
            azwkVar = new azwk(handler, str, true);
            this._immediate = azwkVar;
        }
        this.f = azwkVar;
    }
}

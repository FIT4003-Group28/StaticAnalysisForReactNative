package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: azvp  reason: default package */
/* loaded from: classes2.dex */
public final class azvp extends CancellationException implements azuo {
    public final azvo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azvp(String str, Throwable th, azvo azvoVar) {
        super(str);
        str.getClass();
        azvoVar.getClass();
        this.a = azvoVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.azuo
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (azuy.a) {
            String message = getMessage();
            message.getClass();
            return new azvp(message, this, this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof azvp) {
                azvp azvpVar = (azvp) obj;
                return azst.c(azvpVar.getMessage(), getMessage()) && azst.c(azvpVar.a, this.a) && azst.c(azvpVar.getCause(), getCause());
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (azuy.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = ((message.hashCode() * 31) + this.a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}

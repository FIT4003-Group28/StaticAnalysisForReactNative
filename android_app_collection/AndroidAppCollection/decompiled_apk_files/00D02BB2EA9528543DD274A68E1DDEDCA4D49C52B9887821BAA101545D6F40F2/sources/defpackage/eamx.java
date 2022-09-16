package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: eamx  reason: default package */
/* loaded from: classes6.dex */
public class eamx extends IOException {
    static final long serialVersionUID = 123;
    protected eamt a;

    /* JADX INFO: Access modifiers changed from: protected */
    public eamx(String str, eamt eamtVar) {
        this(str, eamtVar, null);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        eamt eamtVar = this.a;
        if (eamtVar != null) {
            return message + "\n at " + eamtVar.toString();
        }
        return message;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eamx(String str, eamt eamtVar, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this.a = eamtVar;
    }
}

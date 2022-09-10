package defpackage;

import com.google.android.libraries.social.populous.core.SessionContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyuq  reason: default package */
/* loaded from: classes5.dex */
public final class cyuq extends cyvz {
    private cygp a;
    private SessionContext b;
    private Boolean c;
    private cyei d;

    @Override // defpackage.cyvz
    protected final dbsg<SessionContext> a() {
        SessionContext sessionContext = this.b;
        return sessionContext == null ? dbpy.a : dbsg.i(sessionContext);
    }

    @Override // defpackage.cyvz
    public final void c(cyei cyeiVar) {
        if (cyeiVar != null) {
            this.d = cyeiVar;
            return;
        }
        throw new NullPointerException("Null minimumTopNCacheCallbackStatus");
    }

    @Override // defpackage.cyvz
    public final void d(cygp cygpVar) {
        if (cygpVar != null) {
            this.a = cygpVar;
            return;
        }
        throw new NullPointerException("Null resultsGroupingOption");
    }

    @Override // defpackage.cyvz
    public final void e(SessionContext sessionContext) {
        if (sessionContext != null) {
            this.b = sessionContext;
            return;
        }
        throw new NullPointerException("Null sessionContext");
    }

    @Override // defpackage.cyvz
    public final void f(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.cyvz
    protected final cywa b() {
        String str = this.a == null ? " resultsGroupingOption" : "";
        if (this.b == null) {
            str = str.concat(" sessionContext");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" useLiveAutocomplete");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" minimumTopNCacheCallbackStatus");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cyur(this.a, this.b, this.c.booleanValue(), this.d);
    }
}

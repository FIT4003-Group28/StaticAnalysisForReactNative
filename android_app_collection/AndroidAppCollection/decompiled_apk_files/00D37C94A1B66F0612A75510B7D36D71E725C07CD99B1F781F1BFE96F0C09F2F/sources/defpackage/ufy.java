package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: ufy  reason: default package */
/* loaded from: classes4.dex */
public final class ufy extends Exception {
    public ufy(aomb aombVar) {
        super(String.format(Locale.US, "Fetch disabled for FetchReason [%d].", Integer.valueOf(aombVar.j)));
    }

    public ufy(aomi aomiVar) {
        super(String.format(Locale.US, "Registration disabled for RegistrationReason [%d].", Integer.valueOf(aomiVar.l)));
    }
}

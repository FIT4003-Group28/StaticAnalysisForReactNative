package defpackage;
/* compiled from: PG */
/* renamed from: axqj  reason: default package */
/* loaded from: classes2.dex */
public final class axqj implements axqi {
    public static final vdg a;
    public static final vdg b;

    static {
        vdl f = new vdl("com.google.android.libraries.notifications").f();
        try {
            a = f.e("RegistrationFeature__disable_registration_by_reason", (uim) aopi.parseFrom(uim.b, new byte[]{8, 3}), vdh.e);
            b = f.d("RegistrationFeature__disable_registration_on_login_accounts_changed", true);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"RegistrationFeature__disable_registration_by_reason\"");
        }
    }

    @Override // defpackage.axqi
    public final uim a() {
        return (uim) a.get();
    }

    @Override // defpackage.axqi
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }
}

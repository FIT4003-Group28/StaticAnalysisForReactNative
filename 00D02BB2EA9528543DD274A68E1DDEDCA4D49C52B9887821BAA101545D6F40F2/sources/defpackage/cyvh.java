package defpackage;

import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.Email;
/* compiled from: PG */
/* renamed from: cyvh  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyvh {
    public abstract cyfj a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    protected abstract cyvi e();

    public abstract void f(dcdc<Email.Certificate> dcdcVar);

    public abstract void g(String str);

    public final cyvi h() {
        if (d() == null) {
            g(ContactMethodField.l(a(), b() == null ? c() : b()));
        }
        return e();
    }
}

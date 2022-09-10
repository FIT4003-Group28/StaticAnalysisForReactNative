package defpackage;

import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cyvx  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyvx {
    public abstract cyfj a();

    public abstract String b();

    protected abstract cyvy c();

    public abstract void d(String str);

    public abstract void e(dcdc<Email.Certificate> dcdcVar);

    public abstract void f(cyfj cyfjVar);

    public abstract void g(String str);

    public abstract void h(PersonFieldMetadata personFieldMetadata);

    public abstract void i(cyxg cyxgVar);

    public abstract void j(String str);

    public final cyvy k() {
        g(ContactMethodField.l(a(), b()));
        return c();
    }
}

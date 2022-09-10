package defpackage;

import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cyey  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyey implements cyeo {
    protected abstract dbsg<PersonFieldMetadata> a();

    protected abstract Email b();

    public abstract void c(dcdc<Email.Certificate> dcdcVar);

    @Override // defpackage.cyeo
    public /* bridge */ /* synthetic */ void d(PersonFieldMetadata personFieldMetadata) {
        throw null;
    }

    public abstract void e(PersonFieldMetadata personFieldMetadata);

    public abstract void f(CharSequence charSequence);

    @Override // defpackage.cyeo
    /* renamed from: g */
    public final Email i() {
        if (!a().a()) {
            e(PersonFieldMetadata.l().i());
        }
        return b();
    }
}

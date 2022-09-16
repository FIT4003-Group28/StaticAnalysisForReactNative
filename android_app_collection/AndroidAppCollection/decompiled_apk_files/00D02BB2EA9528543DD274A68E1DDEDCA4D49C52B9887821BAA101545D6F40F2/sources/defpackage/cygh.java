package defpackage;

import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Phone;
/* compiled from: PG */
/* renamed from: cygh  reason: default package */
/* loaded from: classes5.dex */
public abstract class cygh implements cyeo {
    protected abstract dbsg<PersonFieldMetadata> a();

    protected abstract Phone b();

    public abstract void c(PersonFieldMetadata personFieldMetadata);

    @Override // defpackage.cyeo
    public /* bridge */ /* synthetic */ void d(PersonFieldMetadata personFieldMetadata) {
        throw null;
    }

    public abstract void e(CharSequence charSequence);

    @Override // defpackage.cyeo
    /* renamed from: f */
    public final Phone i() {
        if (!a().a()) {
            cygd l = PersonFieldMetadata.l();
            l.j(cygl.DEVICE);
            c(l.i());
        }
        return b();
    }
}

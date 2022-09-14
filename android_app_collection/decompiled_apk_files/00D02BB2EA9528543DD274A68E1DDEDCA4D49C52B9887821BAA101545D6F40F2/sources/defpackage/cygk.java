package defpackage;

import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.ProfileId;
/* compiled from: PG */
/* renamed from: cygk  reason: default package */
/* loaded from: classes5.dex */
public abstract class cygk implements cyeo {
    protected abstract dbsg<PersonFieldMetadata> a();

    protected abstract ProfileId b();

    public abstract void c(PersonFieldMetadata personFieldMetadata);

    @Override // defpackage.cyeo
    public /* bridge */ /* synthetic */ void d(PersonFieldMetadata personFieldMetadata) {
        throw null;
    }

    public abstract void e(CharSequence charSequence);

    @Override // defpackage.cyeo
    /* renamed from: f */
    public final ProfileId i() {
        if (!a().a()) {
            cygd l = PersonFieldMetadata.l();
            l.j(cygl.PAPI_TOPN);
            c(l.i());
        }
        return b();
    }
}

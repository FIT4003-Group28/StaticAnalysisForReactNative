package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_SessionContext;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.SessionContext;
/* compiled from: PG */
/* renamed from: cybs  reason: default package */
/* loaded from: classes5.dex */
public final class cybs extends cygq {
    public dbsg<czgq> a = dbpy.a;
    private dcdc<ContactMethodField> g;
    private dcdc<ContactMethodField> h;
    private dcdc<ContactMethodField> i;
    private dcdc<ContactMethodField> j;

    @Override // defpackage.cygq
    public final void b(dcdc<ContactMethodField> dcdcVar) {
        if (dcdcVar != null) {
            this.h = dcdcVar;
            return;
        }
        throw new NullPointerException("Null boostedFields");
    }

    @Override // defpackage.cygq
    public final void c(dcdc<ContactMethodField> dcdcVar) {
        if (dcdcVar != null) {
            this.j = dcdcVar;
            return;
        }
        throw new NullPointerException("Null ownerFields");
    }

    @Override // defpackage.cygq
    public final void d(dcdc<ContactMethodField> dcdcVar) {
        if (dcdcVar != null) {
            this.g = dcdcVar;
            return;
        }
        throw new NullPointerException("Null selectedFields");
    }

    @Override // defpackage.cygq
    public final void e(dcdc<ContactMethodField> dcdcVar) {
        if (dcdcVar != null) {
            this.i = dcdcVar;
            return;
        }
        throw new NullPointerException("Null sharedWithFields");
    }

    @Override // defpackage.cygq
    public final SessionContext a() {
        String str = this.g == null ? " selectedFields" : "";
        if (this.h == null) {
            str = str.concat(" boostedFields");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" sharedWithFields");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" ownerFields");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_SessionContext(this.g, this.h, this.i, this.j, this.a);
    }
}

package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: drr  reason: default package */
/* loaded from: classes6.dex */
public final class drr extends drp {
    public dbsg<bwrs<ilo>> a;
    public dbsg<PersonId> b;
    public int c;
    private Boolean d;

    public drr() {
        this.a = dbpy.a;
        this.b = dbpy.a;
    }

    public drr(drq drqVar) {
        this.a = dbpy.a;
        this.b = dbpy.a;
        drs drsVar = (drs) drqVar;
        this.c = drsVar.d;
        this.a = drsVar.a;
        this.b = drsVar.b;
        this.d = Boolean.valueOf(drsVar.c);
    }

    @Override // defpackage.drp
    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.drp
    public final drq a() {
        String str = this.c == 0 ? " targetType" : "";
        if (this.d == null) {
            str = str.concat(" arTrams");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new drs(this.c, this.a, this.b, this.d.booleanValue());
    }
}

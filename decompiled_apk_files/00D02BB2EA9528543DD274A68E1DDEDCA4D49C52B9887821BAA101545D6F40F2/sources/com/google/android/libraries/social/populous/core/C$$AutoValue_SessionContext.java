package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$$AutoValue_SessionContext  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$$AutoValue_SessionContext extends SessionContext {
    public final dcdc<ContactMethodField> a;
    public final dcdc<ContactMethodField> b;
    public final dcdc<ContactMethodField> c;
    public final dcdc<ContactMethodField> d;
    public final dbsg<czgq> e;

    public C$$AutoValue_SessionContext(dcdc<ContactMethodField> dcdcVar, dcdc<ContactMethodField> dcdcVar2, dcdc<ContactMethodField> dcdcVar3, dcdc<ContactMethodField> dcdcVar4, dbsg<czgq> dbsgVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            if (dcdcVar2 != null) {
                this.b = dcdcVar2;
                if (dcdcVar3 != null) {
                    this.c = dcdcVar3;
                    if (dcdcVar4 != null) {
                        this.d = dcdcVar4;
                        if (dbsgVar != null) {
                            this.e = dbsgVar;
                            return;
                        }
                        throw new NullPointerException("Null entryPoint");
                    }
                    throw new NullPointerException("Null ownerFields");
                }
                throw new NullPointerException("Null sharedWithFields");
            }
            throw new NullPointerException("Null boostedFields");
        }
        throw new NullPointerException("Null selectedFields");
    }

    @Override // com.google.android.libraries.social.populous.core.SessionContext
    public final dcdc<ContactMethodField> a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.SessionContext
    public final dcdc<ContactMethodField> b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.SessionContext
    public final dcdc<ContactMethodField> c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.SessionContext
    public final dcdc<ContactMethodField> d() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.populous.core.SessionContext
    public final dbsg<czgq> e() {
        return this.e;
    }
}

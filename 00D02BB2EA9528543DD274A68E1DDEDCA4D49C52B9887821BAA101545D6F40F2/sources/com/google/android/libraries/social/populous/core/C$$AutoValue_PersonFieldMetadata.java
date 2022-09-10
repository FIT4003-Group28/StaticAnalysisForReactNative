package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$$AutoValue_PersonFieldMetadata  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$$AutoValue_PersonFieldMetadata extends PersonFieldMetadata {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final duej d;
    public final String e;
    public final String f;
    public final Long g;

    public C$$AutoValue_PersonFieldMetadata(boolean z, boolean z2, boolean z3, duej duejVar, @dzsi String str, @dzsi String str2, @dzsi Long l) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        if (duejVar != null) {
            this.d = duejVar;
            this.e = str;
            this.f = str2;
            this.g = l;
            return;
        }
        throw new NullPointerException("Null containerType");
    }

    @Override // com.google.android.libraries.social.populous.core.PersonFieldMetadata
    public final boolean a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.PersonFieldMetadata
    public final boolean b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.PersonFieldMetadata
    public final boolean c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.PersonFieldMetadata
    public final duej d() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.populous.core.PersonFieldMetadata
    @dzsi
    public final String e() {
        return this.e;
    }

    @Override // com.google.android.libraries.social.populous.core.PersonFieldMetadata
    @dzsi
    public final String f() {
        return this.f;
    }

    @Override // com.google.android.libraries.social.populous.core.PersonFieldMetadata
    @dzsi
    public final Long g() {
        return this.g;
    }
}

package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.messaging.lighter.model.$AutoValue_ContactId  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ContactId extends ContactId {
    public final String a;
    public final String b;
    public final ContactId.ContactType c;
    public final dbsg<String> d;

    public C$AutoValue_ContactId(String str, String str2, ContactId.ContactType contactType, dbsg<String> dbsgVar) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (contactType != null) {
                    this.c = contactType;
                    if (dbsgVar != null) {
                        this.d = dbsgVar;
                        return;
                    }
                    throw new NullPointerException("Null handlerId");
                }
                throw new NullPointerException("Null type");
            }
            throw new NullPointerException("Null tachyonAppName");
        }
        throw new NullPointerException("Null id");
    }

    @Override // com.google.android.libraries.messaging.lighter.model.ContactId
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.ContactId
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.ContactId
    public final ContactId.ContactType c() {
        return this.c;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.ContactId
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.ContactId
    public final cufk e() {
        return new ctyk(this);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ContactId{id=");
        sb.append(str);
        sb.append(", tachyonAppName=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append(", handlerId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

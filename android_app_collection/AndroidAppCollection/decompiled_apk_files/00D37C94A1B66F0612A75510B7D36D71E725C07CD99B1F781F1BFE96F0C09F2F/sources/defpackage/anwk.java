package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: anwk  reason: default package */
/* loaded from: classes.dex */
public final class anwk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final String g;

    public anwk(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        qnm.k(!qym.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.g = str6;
        this.d = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anwk)) {
            return false;
        }
        anwk anwkVar = (anwk) obj;
        return tnk.j(this.b, anwkVar.b) && tnk.j(this.a, anwkVar.a) && tnk.j(this.e, anwkVar.e) && tnk.j(this.f, anwkVar.f) && tnk.j(this.c, anwkVar.c) && tnk.j(this.g, anwkVar.g) && tnk.j(this.d, anwkVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.e, this.f, this.c, this.g, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("applicationId", this.b, arrayList);
        tjk.g("apiKey", this.a, arrayList);
        tjk.g("databaseUrl", this.e, arrayList);
        tjk.g("gcmSenderId", this.c, arrayList);
        tjk.g("storageBucket", this.g, arrayList);
        tjk.g("projectId", this.d, arrayList);
        return tjk.f(arrayList, this);
    }
}

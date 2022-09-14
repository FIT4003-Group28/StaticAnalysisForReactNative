package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ContactId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuda  reason: default package */
/* loaded from: classes5.dex */
public final class cuda extends cufj {
    public final ContactId a;
    public final dbsg<String> b;
    public final dbsg<String> c;
    public final dbsg<String> d;
    public final dbsg<Bitmap> e;
    public final boolean f;
    public final Long g;
    public final dcdc<cugf> h;
    public final dcdc<cugf> i;
    public final dbsg<cufx> j;
    public final dbsg<cugh> k;
    public final Long l;

    public cuda(ContactId contactId, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<Bitmap> dbsgVar4, boolean z, Long l, dcdc<cugf> dcdcVar, dcdc<cugf> dcdcVar2, dbsg<cufx> dbsgVar5, dbsg<cugh> dbsgVar6, Long l2) {
        this.a = contactId;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = dbsgVar3;
        this.e = dbsgVar4;
        this.f = z;
        this.g = l;
        this.h = dcdcVar;
        this.i = dcdcVar2;
        this.j = dbsgVar5;
        this.k = dbsgVar6;
        this.l = l2;
    }

    @Override // defpackage.cufj
    public final ContactId a() {
        return this.a;
    }

    @Override // defpackage.cufj
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.cufj
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.cufj
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // defpackage.cufj
    public final dbsg<Bitmap> e() {
        return this.e;
    }

    @Override // defpackage.cufj
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.cufj
    public final Long g() {
        return this.g;
    }

    @Override // defpackage.cufj
    public final dcdc<cugf> h() {
        return this.h;
    }

    @Override // defpackage.cufj
    public final dcdc<cugf> i() {
        return this.i;
    }

    @Override // defpackage.cufj
    public final dbsg<cufx> j() {
        return this.j;
    }

    @Override // defpackage.cufj
    public final dbsg<cugh> k() {
        return this.k;
    }

    @Override // defpackage.cufj
    public final Long l() {
        return this.l;
    }

    @Override // defpackage.cufj
    public final cufi m() {
        return new cucz(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        boolean z = this.f;
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        String valueOf10 = String.valueOf(this.k);
        String valueOf11 = String.valueOf(this.l);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        StringBuilder sb = new StringBuilder(length + 199 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf10).length() + String.valueOf(valueOf11).length());
        sb.append("Contact{contactId=");
        sb.append(valueOf);
        sb.append(", name=");
        sb.append(valueOf2);
        sb.append(", a11yName=");
        sb.append(valueOf3);
        sb.append(", imageUrl=");
        sb.append(valueOf4);
        sb.append(", image=");
        sb.append(valueOf5);
        sb.append(", isImageStale=");
        sb.append(z);
        sb.append(", expirationTimeMillis=");
        sb.append(valueOf6);
        sb.append(", menuItems=");
        sb.append(valueOf7);
        sb.append(", toolbarButtons=");
        sb.append(valueOf8);
        sb.append(", customViewContentModel=");
        sb.append(valueOf9);
        sb.append(", lighterUiConfigurations=");
        sb.append(valueOf10);
        sb.append(", serverTimestampUs=");
        sb.append(valueOf11);
        sb.append("}");
        return sb.toString();
    }
}

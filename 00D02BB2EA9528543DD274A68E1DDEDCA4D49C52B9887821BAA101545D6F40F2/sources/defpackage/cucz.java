package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ContactId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cucz  reason: default package */
/* loaded from: classes5.dex */
public final class cucz extends cufi {
    private ContactId a;
    private dbsg<String> b;
    private dbsg<String> c;
    private dbsg<String> d;
    private dbsg<Bitmap> e;
    private Boolean f;
    private Long g;
    private dcdc<cugf> h;
    private dcdc<cugf> i;
    private dbsg<cufx> j;
    private dbsg<cugh> k;
    private Long l;

    public cucz() {
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.j = dbpy.a;
        this.k = dbpy.a;
    }

    public cucz(cufj cufjVar) {
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.j = dbpy.a;
        this.k = dbpy.a;
        cuda cudaVar = (cuda) cufjVar;
        this.a = cudaVar.a;
        this.b = cudaVar.b;
        this.c = cudaVar.c;
        this.d = cudaVar.d;
        this.e = cudaVar.e;
        this.f = Boolean.valueOf(cudaVar.f);
        this.g = cudaVar.g;
        this.h = cudaVar.h;
        this.i = cudaVar.i;
        this.j = cudaVar.j;
        this.k = cudaVar.k;
        this.l = cudaVar.l;
    }

    @Override // defpackage.cufi
    public final void b(String str) {
        this.c = dbsg.i(str);
    }

    @Override // defpackage.cufi
    public final void c(ContactId contactId) {
        if (contactId != null) {
            this.a = contactId;
            return;
        }
        throw new NullPointerException("Null contactId");
    }

    @Override // defpackage.cufi
    public final void d(cufx cufxVar) {
        this.j = dbsg.i(cufxVar);
    }

    @Override // defpackage.cufi
    public final void e(Long l) {
        if (l != null) {
            this.g = l;
            return;
        }
        throw new NullPointerException("Null expirationTimeMillis");
    }

    @Override // defpackage.cufi
    public final void f(Bitmap bitmap) {
        this.e = dbsg.i(bitmap);
    }

    @Override // defpackage.cufi
    public final void g(String str) {
        this.d = dbsg.i(str);
    }

    @Override // defpackage.cufi
    public final void h(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.cufi
    public final void i(cugh cughVar) {
        this.k = dbsg.i(cughVar);
    }

    @Override // defpackage.cufi
    public final void j(dcdc<cugf> dcdcVar) {
        if (dcdcVar != null) {
            this.h = dcdcVar;
            return;
        }
        throw new NullPointerException("Null menuItems");
    }

    @Override // defpackage.cufi
    public final void k(String str) {
        this.b = dbsg.i(str);
    }

    @Override // defpackage.cufi
    public final void l(long j) {
        this.l = Long.valueOf(j);
    }

    @Override // defpackage.cufi
    public final void m(dcdc<cugf> dcdcVar) {
        if (dcdcVar != null) {
            this.i = dcdcVar;
            return;
        }
        throw new NullPointerException("Null toolbarButtons");
    }

    @Override // defpackage.cufi
    public final cufj a() {
        String str = this.a == null ? " contactId" : "";
        if (this.f == null) {
            str = str.concat(" isImageStale");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" expirationTimeMillis");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" menuItems");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" toolbarButtons");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" serverTimestampUs");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuda(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l);
    }
}

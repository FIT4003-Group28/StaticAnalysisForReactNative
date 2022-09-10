package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aick  reason: default package */
/* loaded from: classes2.dex */
public final class aick extends aicy {
    private PersonId a;
    private Boolean b;
    private ahvf c;
    private String d;
    private Integer e;

    @Override // defpackage.aicy
    public final void b(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null avatarUrl");
    }

    @Override // defpackage.aicy
    public final void c(ahvf ahvfVar) {
        if (ahvfVar != null) {
            this.c = ahvfVar;
            return;
        }
        throw new NullPointerException("Null freshness");
    }

    @Override // defpackage.aicy
    public final void d(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.aicy
    public final void e(PersonId personId) {
        if (personId != null) {
            this.a = personId;
            return;
        }
        throw new NullPointerException("Null personId");
    }

    @Override // defpackage.aicy
    public final void f(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.aicy
    public final aicz a() {
        String str = this.a == null ? " personId" : "";
        if (this.b == null) {
            str = str.concat(" selected");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" freshness");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" avatarUrl");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" numUsers");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aicl(this.a, this.b.booleanValue(), this.c, this.d, this.e.intValue());
    }
}

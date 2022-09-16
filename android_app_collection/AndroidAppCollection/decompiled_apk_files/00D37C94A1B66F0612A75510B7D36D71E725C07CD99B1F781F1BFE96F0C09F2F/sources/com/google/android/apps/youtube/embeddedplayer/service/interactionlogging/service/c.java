package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import j$.util.Optional;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c {
    public boolean a = false;
    final /* synthetic */ d b;
    private final acti c;

    public c(d dVar, acti actiVar) {
        this.b = dVar;
        this.c = actiVar;
    }

    public final void a(b bVar, String str) {
        acte acteVar;
        asjj a = this.b.a(str);
        if (!this.b.f.contains(bVar)) {
            this.b.f.add(bVar);
        }
        a aVar = a.ATTACH;
        int ordinal = bVar.a.ordinal();
        if (ordinal == 0) {
            byte[] bArr = bVar.b;
            if (bArr == null) {
                acup acupVar = bVar.c;
                acupVar.getClass();
                acteVar = new acte(acupVar);
            } else {
                acteVar = new acte(bArr);
            }
            ((acsx) this.c).D(acteVar);
            if (str != null) {
                this.c.r(str);
            }
            this.c.w(acteVar, this.b.a(null));
        } else if (ordinal == 1) {
            byte[] bArr2 = bVar.b;
            if (bArr2 == null) {
                acup acupVar2 = bVar.c;
                if (acupVar2 == null) {
                    return;
                }
                this.c.H(3, new acte(acupVar2), a);
                return;
            }
            this.c.H(3, new acte(bArr2), a);
        } else if (ordinal != 2) {
        } else {
            byte[] bArr3 = bVar.b;
            if (bArr3 == null) {
                acup acupVar3 = bVar.c;
                if (acupVar3 == null) {
                    return;
                }
                this.c.u(new acte(acupVar3), a);
                return;
            }
            this.c.u(new acte(bArr3), a);
        }
    }

    public final void b(acup acupVar, Optional optional, asjj asjjVar) {
        this.c.d(acupVar, (apzg) optional.orElse(null), asjjVar);
        this.a = true;
    }

    public final void c() {
        this.c.y();
        this.a = false;
    }

    public final void d(Optional optional) {
        Optional.ofNullable(this.c.f((apzg) optional.orElse(null)));
    }
}

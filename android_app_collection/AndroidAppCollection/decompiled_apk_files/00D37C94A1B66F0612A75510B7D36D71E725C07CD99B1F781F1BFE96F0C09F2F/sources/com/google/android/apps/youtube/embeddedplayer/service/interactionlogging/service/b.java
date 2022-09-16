package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b {
    public final a a;
    public final byte[] b;
    public final acup c;

    public b(a aVar, acup acupVar) {
        this.a = aVar;
        this.c = acupVar;
        this.b = null;
    }

    public b(a aVar, byte[] bArr) {
        this.a = aVar;
        this.b = bArr;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && Arrays.equals(this.b, bVar.b)) {
            acup acupVar = this.c;
            acup acupVar2 = bVar.c;
            if (acupVar == acupVar2) {
                return true;
            }
            if (acupVar != null && acupVar2 != null && acupVar.equals(acupVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        acup acupVar = this.c;
        return Arrays.deepHashCode(new Object[]{this.a, this.b, Integer.valueOf(acupVar == null ? 0 : acupVar.a)});
    }
}

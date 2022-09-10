package com.spotify.protocol.mappers.gson;

import com.spotify.protocol.types.ImageUri;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GsonMapper$ImageUriGson implements dgtb, dgti {
    @Override // defpackage.dgtb
    public final /* bridge */ /* synthetic */ Object a(dgtc dgtcVar) {
        return new ImageUri(dgtcVar.c());
    }

    @Override // defpackage.dgti
    public final /* bridge */ /* synthetic */ dgtc b(Object obj, dgvs dgvsVar) {
        String str = ((ImageUri) obj).raw;
        dgsx dgsxVar = dgvsVar.a.a;
        if (str == null) {
            return dgte.a;
        }
        Class<?> cls = str.getClass();
        dgvk dgvkVar = new dgvk();
        dgsxVar.f(str, cls, dgvkVar);
        if (dgvkVar.a.isEmpty()) {
            return dgvkVar.b;
        }
        throw new IllegalStateException("Expected one JSON element but was " + dgvkVar.a);
    }
}

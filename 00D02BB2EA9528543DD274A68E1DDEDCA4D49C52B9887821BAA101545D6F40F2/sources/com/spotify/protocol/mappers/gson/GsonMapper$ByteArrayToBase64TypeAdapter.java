package com.spotify.protocol.mappers.gson;

import android.util.Base64;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GsonMapper$ByteArrayToBase64TypeAdapter implements dgti, dgtb {
    @Override // defpackage.dgtb
    public final /* bridge */ /* synthetic */ Object a(dgtc dgtcVar) {
        return Base64.decode(dgtcVar.f().c(), 2);
    }

    @Override // defpackage.dgti
    public final /* bridge */ /* synthetic */ dgtc b(Object obj, dgvs dgvsVar) {
        return new dgth(Base64.encodeToString((byte[]) obj, 2));
    }
}

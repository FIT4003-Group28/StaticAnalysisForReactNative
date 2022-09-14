package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: caym  reason: default package */
/* loaded from: classes4.dex */
public final class caym {
    public final gga a;
    public final bwqv b;

    public caym(gga ggaVar, bwqv bwqvVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
    }

    public final void a() {
        this.a.D(new cbei());
    }

    public final void b(dijn dijnVar, dive diveVar) {
        cbei cbeiVar = new cbei();
        Bundle bundle = new Bundle();
        bundle.putByteArray("knowledge_entity_edit_parcel_key", dijnVar.bS());
        bundle.putByteArray("event_photo_set_parcel_key", diveVar.bS());
        cbeiVar.B(bundle);
        this.a.D(cbeiVar);
    }
}

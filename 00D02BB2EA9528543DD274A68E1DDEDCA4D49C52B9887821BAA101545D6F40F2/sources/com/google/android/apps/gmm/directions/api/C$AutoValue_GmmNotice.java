package com.google.android.apps.gmm.directions.api;

import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.directions.api.$AutoValue_GmmNotice  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_GmmNotice extends GmmNotice {
    public final ProtoParsers$ParcelableProto<dozz> a;
    public final ProtoParsers$ParcelableProto<dwag> b;

    public C$AutoValue_GmmNotice(ProtoParsers$ParcelableProto<dozz> protoParsers$ParcelableProto, @dzsi ProtoParsers$ParcelableProto<dwag> protoParsers$ParcelableProto2) {
        if (protoParsers$ParcelableProto != null) {
            this.a = protoParsers$ParcelableProto;
            this.b = protoParsers$ParcelableProto2;
            return;
        }
        throw new NullPointerException("Null noticeProto");
    }

    @Override // com.google.android.apps.gmm.directions.api.GmmNotice
    protected final ProtoParsers$ParcelableProto<dozz> a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.directions.api.GmmNotice
    @dzsi
    protected final ProtoParsers$ParcelableProto<dwag> b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length());
        sb.append("GmmNotice{noticeProto=");
        sb.append(valueOf);
        sb.append(", placeBusynessProto=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

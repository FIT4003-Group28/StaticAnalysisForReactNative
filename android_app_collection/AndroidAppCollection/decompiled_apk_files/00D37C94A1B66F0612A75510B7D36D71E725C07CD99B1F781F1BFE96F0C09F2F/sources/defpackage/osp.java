package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: osp  reason: default package */
/* loaded from: classes4.dex */
final class osp implements osn {
    private final Context a;

    public osp(Context context) {
        this.a = context;
    }

    @Override // defpackage.osn
    public final oso a(String str, osm osmVar) {
        return new oso(this.a, str, osmVar);
    }

    @Override // defpackage.osn
    public final oso b(osj osjVar, osm osmVar) {
        if (!osj.a().equals(osjVar)) {
            String valueOf = String.valueOf(osjVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("Only \"proto\" encoding is supported by firelog1p. Got: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return a("FCM_CLIENT_EVENT_LOGGING", osmVar);
    }
}

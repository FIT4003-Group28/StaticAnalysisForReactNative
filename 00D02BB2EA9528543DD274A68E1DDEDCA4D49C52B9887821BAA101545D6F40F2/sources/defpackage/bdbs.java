package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bdbs  reason: default package */
/* loaded from: classes3.dex */
public final class bdbs implements bdah {
    private final bdpk a;

    public bdbs(bdpk bdpkVar) {
        this.a = bdpkVar;
    }

    @Override // defpackage.bdah
    @dzsi
    public final /* bridge */ /* synthetic */ jbt a(bczw bczwVar) {
        if (cknv.j(bczwVar.a())) {
            return null;
        }
        return new bdbt(this.a, Uri.parse(bczwVar.a().h));
    }
}

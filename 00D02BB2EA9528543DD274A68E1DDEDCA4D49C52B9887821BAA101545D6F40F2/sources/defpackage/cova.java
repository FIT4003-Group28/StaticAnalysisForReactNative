package defpackage;

import android.widget.ImageView;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cova  reason: default package */
/* loaded from: classes5.dex */
public final class cova extends covc {
    public final String a;
    public final int b;
    final /* synthetic */ covb c;

    public cova(covb covbVar, ImageView imageView, String str, String str2, int i) {
        this.c = covbVar;
        this.e = imageView;
        this.f = str;
        this.a = str2;
        this.b = i;
    }

    @Override // defpackage.covc
    public final void a() {
        cnoa<cowh> cnoaVar = couw.a;
        GoogleApiClient googleApiClient = this.c.c;
        googleApiClient.enqueue(new cowo(googleApiClient, this.f, this.a)).i(new couz(this));
    }
}

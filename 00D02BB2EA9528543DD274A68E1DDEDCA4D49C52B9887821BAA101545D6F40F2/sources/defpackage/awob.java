package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: awob  reason: default package */
/* loaded from: classes.dex */
public final class awob implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, awoe, coun {
    @dzsi
    public GoogleApiClient a;
    public final Application b;
    public final Map<String, btlw> c;
    public final List<akci> d;
    public List<cowu> e;
    private final cnon<couj> f;

    public awob(Application application) {
        new btnc(20);
        this.c = dcjz.d();
        this.d = dchl.a();
        this.e = null;
        this.f = new awoa(this);
        this.b = application;
    }

    private final void i() {
        GoogleApiClient googleApiClient = this.a;
        if (googleApiClient == null || !googleApiClient.isConnected()) {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("loadOwners not connected. apiClient = ");
            sb.append(valueOf);
            sb.toString();
            return;
        }
        GoogleApiClient googleApiClient2 = this.a;
        cnoa<cowh> cnoaVar = couw.a;
        cowm.a(googleApiClient2, null).i(this.f);
    }

    @Override // defpackage.cnpv
    public final void Ph(@dzsi Bundle bundle) {
        cowc cowcVar;
        GoogleApiClient googleApiClient = this.a;
        cnoa<cowh> cnoaVar = couw.a;
        cowh cowhVar = (cowh) googleApiClient.getClient(couw.a);
        synchronized (cowhVar.u) {
            if (cowhVar.u.containsKey(this)) {
                cowcVar = cowhVar.u.get(this);
            } else {
                cowc cowcVar2 = new cowc(googleApiClient.registerListener(this));
                cowhVar.u.put(this, cowcVar2);
                cowcVar = cowcVar2;
            }
        }
        googleApiClient.enqueue(new cows(googleApiClient, cowcVar));
        i();
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("GoogleApiClient Connection failed. Result:");
        sb.append(valueOf);
        sb.toString();
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        StringBuilder sb = new StringBuilder(33);
        sb.append("onConnectionSuspended ");
        sb.append(i);
        sb.toString();
    }

    @Override // defpackage.awoe
    public final void c() {
        GoogleApiClient googleApiClient = this.a;
        if (googleApiClient != null) {
            googleApiClient.connect();
        }
    }

    @Override // defpackage.awoe
    public final void d() {
        GoogleApiClient googleApiClient = this.a;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
    }

    @Override // defpackage.awoe
    @dzsi
    public final btlw e(String str) {
        btlw btlwVar;
        synchronized (this.c) {
            btlwVar = this.c.get(str);
        }
        return btlwVar;
    }

    @Override // defpackage.awoe
    @dzsi
    public final String f(String str) {
        String c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("getAvatarUrl(");
        sb.append(str);
        sb.append(")");
        sb.toString();
        GoogleApiClient googleApiClient = this.a;
        if (googleApiClient != null && !googleApiClient.isConnected()) {
            this.a.connect();
        }
        synchronized (this.c) {
            btlw btlwVar = this.c.get(str);
            if (btlwVar == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 47 + "null".length());
                sb2.append("avatarUrl was null for accountName:");
                sb2.append(str);
                sb2.append(", ownerInfo:");
                sb2.append("null");
                sb2.toString();
            }
            c = btlwVar != null ? btlwVar.c() : null;
        }
        return c;
    }

    @Override // defpackage.coun
    public final void g(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(str2).length());
        sb.append("onDataChanged(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.toString();
        i();
    }

    @Override // defpackage.awoe
    public final void h(akci akciVar) {
        synchronized (this.d) {
            this.d.add(akciVar);
        }
    }
}

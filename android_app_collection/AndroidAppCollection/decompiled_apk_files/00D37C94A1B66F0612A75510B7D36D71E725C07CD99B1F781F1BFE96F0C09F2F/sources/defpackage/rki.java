package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: rki  reason: default package */
/* loaded from: classes4.dex */
public final class rki extends dvd implements rkj {
    public final rpn a;
    private Boolean b;
    private String c;

    public rki() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    private final void d(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.c)) {
                            Context b = this.a.b();
                            if (tzc.w(b, Binder.getCallingUid(), "com.google.android.gms")) {
                                try {
                                    if (qsf.b(b).c(b.getPackageManager().getPackageInfo("com.google.android.gms", 64))) {
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                            }
                            if (!qsf.b(this.a.b()).d(Binder.getCallingUid())) {
                                z2 = false;
                                this.b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.a.aG().c.b("Measurement Service called with invalid calling package. appId", rks.a(str));
                    throw e;
                }
            }
            if (this.c == null && qse.h(this.a.b(), Binder.getCallingUid(), str)) {
                this.c = str;
            }
            if (str.equals(this.c)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.a.aG().c.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void e(AppMetadata appMetadata) {
        qnm.b(appMetadata);
        qnm.l(appMetadata.a);
        d(appMetadata.a, false);
        this.a.s().ab(appMetadata.b, appMetadata.q, appMetadata.u);
    }

    @Override // defpackage.rkj
    public final String a(AppMetadata appMetadata) {
        e(appMetadata);
        return this.a.u(appMetadata);
    }

    public final void b(EventParcel eventParcel, AppMetadata appMetadata) {
        this.a.w();
        this.a.A(eventParcel, appMetadata);
    }

    public final void c(Runnable runnable) {
        qnm.b(runnable);
        if (this.a.aH().i()) {
            runnable.run();
        } else {
            this.a.aH().g(runnable);
        }
    }

    @Override // defpackage.rkj
    public final List f(String str, String str2, AppMetadata appMetadata) {
        e(appMetadata);
        String str3 = appMetadata.a;
        qnm.b(str3);
        try {
            return (List) this.a.aH().b(new rmb(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.aG().c.b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.rkj
    public final List g(String str, String str2, String str3) {
        d(str, true);
        try {
            return (List) this.a.aH().b(new rmb(this, str, str2, str3, 3, null)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.aG().c.b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.rkj
    public final List h(String str, String str2, boolean z, AppMetadata appMetadata) {
        e(appMetadata);
        String str3 = appMetadata.a;
        qnm.b(str3);
        try {
            List<rpq> list = (List) this.a.aH().b(new rmb(this, str3, str, str2, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (rpq rpqVar : list) {
                if (z || !rps.an(rpqVar.c)) {
                    arrayList.add(new UserAttributeParcel(rpqVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aG().c.c("Failed to query user properties. appId", rks.a(appMetadata.a), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.rkj
    public final List i(String str, String str2, String str3, boolean z) {
        d(str, true);
        try {
            List<rpq> list = (List) this.a.aH().b(new rmb(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (rpq rpqVar : list) {
                if (z || !rps.an(rpqVar.c)) {
                    arrayList.add(new UserAttributeParcel(rpqVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aG().c.c("Failed to get user properties as. appId", rks.a(str), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.rkj
    public final void j(AppMetadata appMetadata) {
        e(appMetadata);
        c(new rmc(this, appMetadata, 3));
    }

    @Override // defpackage.rkj
    public final void k(EventParcel eventParcel, AppMetadata appMetadata) {
        qnm.b(eventParcel);
        e(appMetadata);
        c(new rmd(this, eventParcel, appMetadata));
    }

    @Override // defpackage.rkj
    public final void l(AppMetadata appMetadata) {
        qnm.l(appMetadata.a);
        d(appMetadata.a, false);
        c(new rmc(this, appMetadata, 1));
    }

    @Override // defpackage.rkj
    public final void m(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        qnm.b(conditionalUserPropertyParcel);
        qnm.b(conditionalUserPropertyParcel.c);
        e(appMetadata);
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel);
        conditionalUserPropertyParcel2.a = appMetadata.a;
        c(new rlz(this, conditionalUserPropertyParcel2, appMetadata));
    }

    @Override // defpackage.rkj
    public final void n(AppMetadata appMetadata) {
        qnm.l(appMetadata.a);
        qnm.b(appMetadata.v);
        rmc rmcVar = new rmc(this, appMetadata, 2);
        if (this.a.aH().i()) {
            rmcVar.run();
        } else {
            this.a.aH().h(rmcVar);
        }
    }

    @Override // defpackage.rkj
    public final void o(long j, String str, String str2, String str3) {
        c(new rmi(this, str2, str3, str, j));
    }

    @Override // defpackage.rkj
    public final void p(final Bundle bundle, AppMetadata appMetadata) {
        e(appMetadata);
        final String str = appMetadata.a;
        qnm.b(str);
        c(new Runnable() { // from class: rly
            @Override // java.lang.Runnable
            public final void run() {
                rki rkiVar = rki.this;
                String str2 = str;
                Bundle bundle2 = bundle;
                rjt j = rkiVar.a.j();
                j.n();
                j.V();
                byte[] byteArray = j.U().f(new rjx(j.w, "", str2, "dep", 0L, 0L, bundle2)).toByteArray();
                j.aG().k.c("Saving default event parameters, appId, data size", j.L().c(str2), Integer.valueOf(byteArray.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", byteArray);
                try {
                    if (j.d().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                        return;
                    }
                    j.aG().c.b("Failed to insert default event parameters (got -1). appId", rks.a(str2));
                } catch (SQLiteException e) {
                    j.aG().c.c("Error storing default event parameters. appId", rks.a(str2), e);
                }
            }
        });
    }

    @Override // defpackage.rkj
    public final void q(AppMetadata appMetadata) {
        e(appMetadata);
        c(new rmc(this, appMetadata));
    }

    @Override // defpackage.rkj
    public final void r(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        qnm.b(userAttributeParcel);
        e(appMetadata);
        c(new rmg(this, userAttributeParcel, appMetadata));
    }

    @Override // defpackage.rkj
    public final byte[] s(EventParcel eventParcel, String str) {
        qnm.l(str);
        qnm.b(eventParcel);
        d(str, true);
        this.a.aG().j.b("Log and bundle. event", this.a.l().c(eventParcel.a));
        this.a.T();
        long nanoTime = System.nanoTime() / 1000000;
        rlu aH = this.a.aH();
        rmf rmfVar = new rmf(this, eventParcel, str);
        aH.j();
        rls rlsVar = new rls(aH, rmfVar, true);
        if (Thread.currentThread() != aH.b) {
            aH.c(rlsVar);
        } else {
            rlsVar.run();
        }
        try {
            byte[] bArr = (byte[]) rlsVar.get();
            if (bArr == null) {
                this.a.aG().c.b("Log and bundle returned null. appId", rks.a(str));
                bArr = new byte[0];
            }
            this.a.T();
            this.a.aG().j.d("Log and bundle processed. event, size, time_ms", this.a.l().c(eventParcel.a), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aG().c.d("Failed to log and bundle. appId, event, error", rks.a(str), this.a.l().c(eventParcel.a), e);
            return null;
        }
    }

    public rki(rpn rpnVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        qnm.b(rpnVar);
        this.a = rpnVar;
        this.c = null;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        ArrayList arrayList;
        switch (i) {
            case 1:
                k((EventParcel) dve.a(parcel, EventParcel.CREATOR), (AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                r((UserAttributeParcel) dve.a(parcel, UserAttributeParcel.CREATOR), (AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                j((AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                EventParcel eventParcel = (EventParcel) dve.a(parcel, EventParcel.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                qnm.b(eventParcel);
                qnm.l(readString);
                d(readString, true);
                c(new rme(this, eventParcel, readString));
                parcel2.writeNoException();
                break;
            case 6:
                q((AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                AppMetadata appMetadata = (AppMetadata) dve.a(parcel, AppMetadata.CREATOR);
                boolean j = dve.j(parcel);
                e(appMetadata);
                String str = appMetadata.a;
                qnm.b(str);
                try {
                    List<rpq> list = (List) this.a.aH().b(new rmh(this, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (rpq rpqVar : list) {
                        if (j || !rps.an(rpqVar.c)) {
                            arrayList.add(new UserAttributeParcel(rpqVar));
                        }
                    }
                } catch (InterruptedException | ExecutionException e) {
                    this.a.aG().c.c("Failed to get user properties. appId", rks.a(appMetadata.a), e);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                break;
            case 9:
                byte[] s = s((EventParcel) dve.a(parcel, EventParcel.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(s);
                break;
            case 10:
                o(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String a = a((AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 12:
                m((ConditionalUserPropertyParcel) dve.a(parcel, ConditionalUserPropertyParcel.CREATOR), (AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                ConditionalUserPropertyParcel conditionalUserPropertyParcel = (ConditionalUserPropertyParcel) dve.a(parcel, ConditionalUserPropertyParcel.CREATOR);
                qnm.b(conditionalUserPropertyParcel);
                qnm.b(conditionalUserPropertyParcel.c);
                qnm.l(conditionalUserPropertyParcel.a);
                d(conditionalUserPropertyParcel.a, true);
                c(new rma(this, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel)));
                parcel2.writeNoException();
                break;
            case 14:
                List h = h(parcel.readString(), parcel.readString(), dve.j(parcel), (AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(h);
                break;
            case 15:
                List i3 = i(parcel.readString(), parcel.readString(), parcel.readString(), dve.j(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(i3);
                break;
            case 16:
                List f = f(parcel.readString(), parcel.readString(), (AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(f);
                break;
            case 17:
                List g = g(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(g);
                break;
            case 18:
                l((AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 19:
                p((Bundle) dve.a(parcel, Bundle.CREATOR), (AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 20:
                n((AppMetadata) dve.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}

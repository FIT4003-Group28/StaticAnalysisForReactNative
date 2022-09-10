package com.google.android.libraries.social.populous.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.AndroidLibAutocompleteSession;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.ProfileId;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.logging.LogEntity;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AndroidLibAutocompleteSession extends cxye implements Parcelable {
    public static final Parcelable.Creator<AndroidLibAutocompleteSession> CREATOR = new cyaf();
    @dzsi
    public cyya A;
    private final dehn<dcdc<ContactMethodField>> B;
    @dzsi
    public Context x;
    @dzsi
    public dehp y;
    public final String z;

    public AndroidLibAutocompleteSession(String str, ClientConfigInternal clientConfigInternal, cyac cyacVar, Executor executor, @dzsi SessionContext sessionContext, dehn<dcdc<ContactMethodField>> dehnVar, cypb cypbVar, boolean z) {
        super(clientConfigInternal, cyacVar, executor, sessionContext, cypbVar, z);
        dbsk.s(str);
        this.z = str;
        this.B = dehnVar;
    }

    public static boolean s(SessionContext sessionContext) {
        if (sessionContext == null) {
            return false;
        }
        dcdc<ContactMethodField> d = sessionContext.d();
        int size = d.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (d.get(i) instanceof ProfileId) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    @Override // defpackage.cxye
    protected final <T> List<T> d() {
        return new CopyOnWriteArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.cxye
    public final void e(String str) {
        boolean c;
        cytq cytqVar;
        if (h()) {
            c = cyzj.i(this.x);
        } else {
            c = ((cytb) this.c).c.c();
        }
        this.s = c;
        if (dybi.b() && (cytqVar = this.l) != null && cytqVar.l) {
            try {
                this.v.b();
            } catch (IllegalStateException unused) {
            }
        }
        boolean z = false;
        if (dybi.b() && this.u.nextDouble() <= dybi.a.a().f()) {
            try {
                this.v.a(dybi.a.a().e(), dybi.a.a().g());
                z = true;
            } catch (IllegalStateException unused2) {
            }
        }
        if (this.B == null || s(this.m.f())) {
            super.f(str, z);
        } else {
            deha.q(this.B, new cyae(this, str, z), dege.a);
        }
    }

    @Override // defpackage.cxye
    public final Long n() {
        return this.n;
    }

    public final synchronized dehn<cxxk> r() {
        cyoq a = cyor.a();
        a.c = Long.valueOf(this.o);
        final cyor a2 = a.a();
        final dbtp f = cypg.f(this.e, 12, 0, 0, a2);
        final cxxl cxxlVar = new cxxl(this.a, this.q, this.i);
        if (this.y != null) {
            if (this.A == null) {
                this.A = new cyya(new cyyb(), this.x, this.a, new cyuj(Locale.getDefault()), this.e);
            }
            return this.y.c(new Callable(this, a2, cxxlVar, f) { // from class: cyad
                private final AndroidLibAutocompleteSession a;
                private final cyor b;
                private final cxxl c;
                private final dbtp d;

                {
                    this.a = this;
                    this.b = a2;
                    this.c = cxxlVar;
                    this.d = f;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dcdc<cyvs> e;
                    AndroidLibAutocompleteSession androidLibAutocompleteSession = this.a;
                    cyor cyorVar = this.b;
                    cxxl cxxlVar2 = this.c;
                    dbtp dbtpVar = this.d;
                    cyya cyyaVar = androidLibAutocompleteSession.A;
                    ClientConfigInternal clientConfigInternal = cyyaVar.b;
                    if (!clientConfigInternal.x) {
                        dcep<cydt> dcepVar = clientConfigInternal.l;
                        if ((dcepVar.contains(cydt.PHONE_NUMBER) || dcepVar.contains(cydt.EMAIL)) && cyzj.i(cyyaVar.a)) {
                            cyyb cyybVar = cyyaVar.e;
                            Context context = cyyaVar.a;
                            ClientConfigInternal clientConfigInternal2 = cyyaVar.b;
                            cyuj cyujVar = cyyaVar.c;
                            cyph cyphVar = cyyaVar.d;
                            dbtp b = cyphVar.b();
                            dcdc<cyzl> b2 = cyzj.b(context, "", clientConfigInternal2, cyujVar, cyphVar, cyorVar, cyzj.a);
                            cyphVar.e(65, b, cyorVar);
                            dccx G = dcdc.G(b2.size());
                            int size = b2.size();
                            for (int i = 0; i < size; i++) {
                                cyzl cyzlVar = b2.get(i);
                                cyvt g = cyzlVar.g();
                                cyxg f2 = cyzlVar.f();
                                if (f2 != null && f2.g() != null) {
                                    g.q = f2.g().booleanValue();
                                }
                                G.g(g.b());
                            }
                            e = G.f();
                            cxxk a3 = cxxlVar2.a(e);
                            cyph cyphVar2 = androidLibAutocompleteSession.e;
                            cype h = cypf.h();
                            ((cyoo) h).a = dbtpVar;
                            h.e(2);
                            cypg.g(cyphVar2, 12, 2, h.a(), 0, cyorVar);
                            return a3;
                        }
                    }
                    e = dcdc.e();
                    cxxk a32 = cxxlVar2.a(e);
                    cyph cyphVar22 = androidLibAutocompleteSession.e;
                    cype h2 = cypf.h();
                    ((cyoo) h2).a = dbtpVar;
                    h2.e(2);
                    cypg.g(cyphVar22, 12, 2, h2.a(), 0, cyorVar);
                    return a32;
                }
            });
        }
        cyph cyphVar = this.e;
        cype h = cypf.h();
        ((cyoo) h).a = f;
        h.e(2);
        cypg.g(cyphVar, 12, 3, h.a(), 0, a2);
        return deha.a(cxxlVar.a(dcdc.e()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.z);
        parcel.writeParcelable(this.m.f(), 0);
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.t);
        parcel.writeValue(this.n);
        cypb cypbVar = this.i;
        Bundle bundle = new Bundle();
        for (Map.Entry<String, LogEntity> entry : cypbVar.entrySet()) {
            bundle.putParcelable(entry.getKey(), entry.getValue());
        }
        parcel.writeBundle(bundle);
        parcel.writeSerializable(this.j);
    }
}

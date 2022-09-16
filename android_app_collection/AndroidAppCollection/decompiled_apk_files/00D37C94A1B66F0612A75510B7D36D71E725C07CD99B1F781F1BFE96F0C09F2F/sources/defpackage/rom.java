package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: rom  reason: default package */
/* loaded from: classes4.dex */
public final class rom extends riw {
    public final rol b;
    public rkj c;
    public volatile Boolean d;
    private final rjv e;
    private final rpb f;
    private final List g;
    private final rjv h;

    public rom(rlx rlxVar) {
        super(rlxVar);
        this.g = new ArrayList();
        this.f = new rpb();
        this.b = new rol(this);
        this.e = new roa(this, rlxVar);
        this.h = new roc(this, rlxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A() {
        n();
        a();
        return !B() || N().p() >= ((Integer) rkg.ao.a()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rom.B():boolean");
    }

    public final void C() {
        P();
    }

    @Override // defpackage.riw
    protected final boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.AppMetadata e(boolean r37) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rom.e(boolean):com.google.android.gms.measurement.internal.AppMetadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        n();
        a();
        if (z()) {
            return;
        }
        if (B()) {
            rol rolVar = this.b;
            rolVar.c.n();
            Context I = rolVar.c.I();
            synchronized (rolVar) {
                if (rolVar.a) {
                    rolVar.c.aG().k.a("Connection attempt already in progress");
                } else if (rolVar.b == null || (!rolVar.b.x() && !rolVar.b.w())) {
                    rolVar.b = new rko(I, Looper.getMainLooper(), rolVar, rolVar);
                    rolVar.c.aG().k.a("Connecting to remote service");
                    rolVar.a = true;
                    qnm.b(rolVar.b);
                    rolVar.b.G();
                } else {
                    rolVar.c.aG().k.a("Already awaiting connection attempt");
                }
            }
        } else if (J().t()) {
        } else {
            P();
            List<ResolveInfo> queryIntentServices = I().getPackageManager().queryIntentServices(new Intent().setClassName(I(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                aG().c.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            Context I2 = I();
            P();
            intent.setComponent(new ComponentName(I2, "com.google.android.gms.measurement.AppMeasurementService"));
            rol rolVar2 = this.b;
            rolVar2.c.n();
            Context I3 = rolVar2.c.I();
            qyf a = qyf.a();
            synchronized (rolVar2) {
                if (rolVar2.a) {
                    rolVar2.c.aG().k.a("Connection attempt already in progress");
                    return;
                }
                rolVar2.c.aG().k.a("Using local app measurement service");
                rolVar2.a = true;
                a.c(I3, intent, rolVar2.c.b, 129);
            }
        }
    }

    public final void o() {
        n();
        a();
        rol rolVar = this.b;
        if (rolVar.b != null && (rolVar.b.w() || rolVar.b.x())) {
            rolVar.b.l();
        }
        rolVar.b = null;
        try {
            qyf.a().b(I(), this.b);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.c = null;
    }

    public final void p() {
        n();
        aG().k.b("Processing queued up service tasks", Integer.valueOf(this.g.size()));
        for (Runnable runnable : this.g) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                aG().c.b("Task exception while flushing queue", e);
            }
        }
        this.g.clear();
        this.h.a();
    }

    public final void q(AtomicReference atomicReference) {
        n();
        a();
        t(new rnv(this, atomicReference, e(false)));
    }

    public final void r(ComponentName componentName) {
        n();
        if (this.c != null) {
            this.c = null;
            aG().k.b("Disconnected from device MeasurementService", componentName);
            n();
            f();
        }
    }

    public final void s() {
        n();
        this.f.a();
        rjv rjvVar = this.e;
        J();
        rjvVar.c(((Long) rkg.f264J.a()).longValue());
    }

    public final void t(Runnable runnable) {
        n();
        if (z()) {
            runnable.run();
            return;
        }
        int size = this.g.size();
        J();
        if (size >= 1000) {
            aG().c.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.g.add(runnable);
        this.h.c(60000L);
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(rkj rkjVar, AbstractSafeParcelable abstractSafeParcelable, AppMetadata appMetadata) {
        int i;
        n();
        a();
        C();
        J();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List r = i().r();
            if (r != null) {
                arrayList.addAll(r);
                i = r.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof EventParcel) {
                    try {
                        rkjVar.k((EventParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e) {
                        aG().c.b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof UserAttributeParcel) {
                    try {
                        rkjVar.r((UserAttributeParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e2) {
                        aG().c.b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof ConditionalUserPropertyParcel) {
                    try {
                        rkjVar.m((ConditionalUserPropertyParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e3) {
                        aG().c.b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    aG().c.a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        n();
        a();
        P();
        rkm i = i();
        byte[] at = i.N().at(conditionalUserPropertyParcel);
        boolean z = false;
        if (at.length <= 131072) {
            if (i.q(2, at)) {
                z = true;
            }
        } else {
            i.aG().d.a("Conditional user property too long for local database. Sending directly to service");
        }
        t(new roe(this, e(true), z, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(rnm rnmVar) {
        n();
        a();
        t(new rny(this, rnmVar));
    }

    public final void x(Bundle bundle) {
        n();
        a();
        t(new rnz(this, e(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(rkj rkjVar) {
        n();
        this.c = rkjVar;
        s();
        p();
    }

    public final boolean z() {
        n();
        a();
        return this.c != null;
    }
}

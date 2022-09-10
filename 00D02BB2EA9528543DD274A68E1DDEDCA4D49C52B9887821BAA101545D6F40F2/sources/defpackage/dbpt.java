package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.google.common.android.concurrent.ParcelableFuture;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbpt  reason: default package */
/* loaded from: classes5.dex */
public final class dbpt extends fd implements dbpw {
    private static volatile Handler ae;
    private String af;
    public dbpe<?> d;
    public final ain<dbpg<?, ?>> a = new ain<>();
    public final Set<ParcelableFuture> b = new aih();
    public gn c = null;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean ad = false;

    public static final void i() {
        dbsk.m(Looper.myLooper() == Looper.getMainLooper(), "Must be called from the main thread.");
    }

    private final void p(Bundle bundle) {
        String string = bundle.getString("appVersion");
        if (string != null) {
            if (this.af.equals(string)) {
                return;
            }
            String str = this.af;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + string.length());
            sb.append("Got data from old app version: expected=");
            sb.append(str);
            sb.append(" got=");
            sb.append(string);
            throw new dbps(sb.toString());
        }
        throw new dbps("Got key but not value from saved state.");
    }

    @Override // defpackage.fd
    public final void Qd() {
        super.Qd();
        dbsk.l(this.c == null);
        int f = this.a.f();
        while (true) {
            f--;
            if (f < 0) {
                this.f = false;
                return;
            }
            ain<dbpg<?, ?>> ainVar = this.a;
            if (ainVar.b) {
                ainVar.d();
            }
            ainVar.d[f] = null;
        }
    }

    @Override // defpackage.fd
    public final void aj(Bundle bundle) {
        super.aj(bundle);
        if (!this.f) {
            if (bundle != null) {
                p(bundle);
                int[] intArray = bundle.getIntArray("callback_ids");
                if (intArray != null) {
                    for (int i : intArray) {
                        dbsk.m(this.a.b(i) != null, "Didn't re-register callback.");
                    }
                }
            }
            this.f = true;
        }
    }

    @Override // defpackage.fd
    public final void am() {
        super.am();
        ff J = J();
        if (!this.b.isEmpty()) {
            if (J != null && !J.isFinishing()) {
                for (fd fdVar = this; fdVar != null; fdVar = fdVar.D) {
                    if (!fdVar.u) {
                    }
                }
                return;
            }
            int i = ((aih) this.b).b;
            StringBuilder sb = new StringBuilder(48);
            sb.append("Dropped results for ");
            sb.append(i);
            sb.append(" pending futures.");
            sb.toString();
            for (final ParcelableFuture parcelableFuture : this.b) {
                this.a.b(parcelableFuture.a);
                h(new Runnable(parcelableFuture) { // from class: dbpr
                    private final ParcelableFuture a;

                    {
                        this.a = parcelableFuture;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ParcelableFuture parcelableFuture2 = this.a;
                        Object obj = parcelableFuture2.b;
                        dehn<?> dehnVar = parcelableFuture2.c;
                    }
                });
            }
            this.b.clear();
        }
    }

    @Override // defpackage.dbpw
    public final void d(final ParcelableFuture parcelableFuture, final Throwable th) {
        f(parcelableFuture, new Runnable(this, parcelableFuture, th) { // from class: dbpm
            private final dbpt a;
            private final ParcelableFuture b;
            private final Throwable c;

            {
                this.a = this;
                this.b = parcelableFuture;
                this.c = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dbpt dbptVar = this.a;
                final ParcelableFuture parcelableFuture2 = this.b;
                final dbpg<?, ?> b = dbptVar.a.b(parcelableFuture2.a);
                dbptVar.h(new Runnable(b, parcelableFuture2) { // from class: dbpq
                    private final dbpg a;
                    private final ParcelableFuture b;

                    {
                        this.a = b;
                        this.b = parcelableFuture2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(this.b.b);
                    }
                });
            }
        });
    }

    public final void e(gn gnVar) {
        boolean z = true;
        dbsk.a(gnVar != null);
        gn gnVar2 = this.c;
        dbsk.l(gnVar2 == null || gnVar == gnVar2);
        if (!this.e && this.c != null) {
            z = false;
        }
        if (this.c == null) {
            this.c = gnVar;
        }
        if (z) {
            this.e = false;
            for (ParcelableFuture parcelableFuture : this.b) {
                if (!parcelableFuture.a()) {
                    g(this.a.b(parcelableFuture.a), parcelableFuture);
                }
                parcelableFuture.b(this);
            }
        }
    }

    public final void f(final ParcelableFuture parcelableFuture, final Runnable runnable) {
        if (this.c != null) {
            if (ae == null) {
                ae = new Handler(Looper.getMainLooper());
            }
            ae.post(new Runnable(this, parcelableFuture, runnable) { // from class: dbpn
                private final dbpt a;
                private final ParcelableFuture b;
                private final Runnable c;

                {
                    this.a = this;
                    this.b = parcelableFuture;
                    this.c = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dbpt dbptVar = this.a;
                    ParcelableFuture parcelableFuture2 = this.b;
                    Runnable runnable2 = this.c;
                    gn gnVar = dbptVar.c;
                    if (gnVar != null) {
                        if (gnVar.J()) {
                            dbptVar.e = true;
                        } else if (dbptVar.c.u || !dbptVar.b.remove(parcelableFuture2)) {
                        } else {
                            runnable2.run();
                        }
                    }
                }
            });
        }
    }

    public final <I> void g(dbpg<I, ?> dbpgVar, final ParcelableFuture parcelableFuture) {
        h(new Runnable(parcelableFuture) { // from class: dbpo
            private final ParcelableFuture a;

            {
                this.a = parcelableFuture;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object obj = this.a.b;
            }
        });
    }

    public final void h(Runnable runnable) {
        this.ad = true;
        try {
            runnable.run();
        } finally {
            this.ad = false;
        }
    }

    @Override // defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        aG();
        String name = dbrn.class.getName();
        String name2 = fd.class.getName();
        String name3 = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + String.valueOf(name3).length());
        sb.append(name);
        sb.append(name2);
        sb.append(name3);
        this.af = sb.toString();
        if (bundle != null) {
            this.g = true;
            p(bundle);
            Parcelable[] parcelableArray = bundle.getParcelableArray("futures");
            if (parcelableArray == null) {
                return;
            }
            for (Parcelable parcelable : parcelableArray) {
                this.b.add((ParcelableFuture) parcelable);
            }
        }
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putString("appVersion", this.af);
        int f = this.a.f();
        int[] iArr = new int[f];
        for (int i = 0; i < f; i++) {
            iArr[i] = this.a.g(i);
        }
        bundle.putIntArray("callback_ids", iArr);
        Set<ParcelableFuture> set = this.b;
        bundle.putParcelableArray("futures", (Parcelable[]) set.toArray(new ParcelableFuture[((aih) set).b]));
    }
}

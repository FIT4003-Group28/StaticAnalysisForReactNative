package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
/* compiled from: PG */
/* renamed from: adia  reason: default package */
/* loaded from: classes.dex */
public final class adia {
    public adhy a;
    public String b;
    public adit c;
    public adit d;
    private ampq e;
    private adim f;
    private String g;
    private ScreenId h;
    private adit i;

    public adia() {
        this.e = amon.a;
    }

    public adia(adib adibVar) {
        this();
        this.f = adibVar.d;
        this.c = adibVar.g;
        this.g = adibVar.e;
        this.h = adibVar.f;
        this.i = adibVar.h;
        this.d = adibVar.i;
    }

    public final void b(ScreenId screenId) {
        if (screenId != null) {
            this.h = screenId;
            return;
        }
        throw new NullPointerException("Null screenId");
    }

    public final void c(adis adisVar) {
        this.e = ampq.j(adisVar);
    }

    public final void d(adit aditVar) {
        if (aditVar != null) {
            this.i = aditVar;
            return;
        }
        throw new NullPointerException("Null loungeDeviceId");
    }

    public final void e(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void f(adim adimVar) {
        if (adimVar != null) {
            this.f = adimVar;
            return;
        }
        throw new NullPointerException("Null pairingType");
    }

    public final adib a() {
        String str;
        ScreenId screenId;
        adit aditVar;
        adim adimVar = this.f;
        if (adimVar == null || (str = this.g) == null || (screenId = this.h) == null || (aditVar = this.i) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" pairingType");
            }
            if (this.g == null) {
                sb.append(" name");
            }
            if (this.h == null) {
                sb.append(" screenId");
            }
            if (this.i == null) {
                sb.append(" loungeDeviceId");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        adib adibVar = new adib(adimVar, this.c, str, screenId, aditVar, this.d);
        adibVar.a = this.a;
        adibVar.b = this.e;
        adibVar.c = this.b;
        return adibVar;
    }
}

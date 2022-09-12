package defpackage;

import android.widget.RemoteViews;
/* compiled from: PG */
/* renamed from: bzka  reason: default package */
/* loaded from: classes4.dex */
final class bzka extends bzkx {
    public RemoteViews a;
    public dbsg<String> b = dbpy.a;
    public dbsg<String> c = dbpy.a;
    private Boolean d;
    private Boolean e;

    @Override // defpackage.bzkx
    public final void b(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.bzkx
    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bzkx
    public final bzky a() {
        String str = this.a == null ? " remoteViews" : "";
        if (this.d == null) {
            str = str.concat(" hasRealTimeData");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" hasAlert");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bzkb(this.a, this.d.booleanValue(), this.e.booleanValue(), this.b, this.c);
    }
}

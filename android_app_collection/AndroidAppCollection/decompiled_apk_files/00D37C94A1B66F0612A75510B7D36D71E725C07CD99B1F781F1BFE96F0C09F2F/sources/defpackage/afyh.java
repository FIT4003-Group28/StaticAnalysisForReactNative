package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: afyh  reason: default package */
/* loaded from: classes.dex */
final class afyh implements yiw {
    final /* synthetic */ afyi a;
    private final yiw b;
    private boolean c;

    public afyh(afyi afyiVar, yiw yiwVar, boolean z) {
        this.a = afyiVar;
        yiwVar.getClass();
        this.b = yiwVar;
        this.c = z;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.b.a((Uri) obj, exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Long l = (Long) obj2;
        if (this.c) {
            if (l.longValue() > 0) {
                this.b.b(uri, l);
                return;
            }
            this.c = false;
            this.a.b = true;
            this.a.a.a(uri, this);
            return;
        }
        this.b.b(uri, l);
    }
}

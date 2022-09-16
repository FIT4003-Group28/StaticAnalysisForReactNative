package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ajos  reason: default package */
/* loaded from: classes.dex */
public final class ajos implements ajmm {
    private final ajoo a;
    private final ajoq b;

    public ajos(int i) {
        ajok ajokVar = new ajok();
        ajol ajolVar = new ajol();
        cmc cmcVar = new cmc(i);
        this.a = new ajoo(cmcVar, ajolVar, ajokVar);
        this.b = new ajoq(cmcVar, ajokVar);
    }

    @Override // defpackage.ajmm
    public final ykg a() {
        return this.b;
    }

    @Override // defpackage.ajmm
    public final ykg b() {
        return this.a;
    }

    @Override // defpackage.ajmm
    public final void c() {
        this.a.a.i();
    }

    @Override // defpackage.ajmm
    public final void d(Uri uri) {
        ajoo ajooVar = this.a;
        if (uri == null) {
            return;
        }
        ajooVar.g((cku) ajooVar.a.h((chy) ajooVar.b.c(uri)));
    }
}

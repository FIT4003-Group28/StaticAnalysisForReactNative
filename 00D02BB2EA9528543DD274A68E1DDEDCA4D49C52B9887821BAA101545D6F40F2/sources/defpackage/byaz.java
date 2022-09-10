package defpackage;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: byaz  reason: default package */
/* loaded from: classes4.dex */
public final class byaz extends dbus<amfu, akuh> {
    final /* synthetic */ bybf a;

    public byaz(bybf bybfVar) {
        this.a = bybfVar;
    }

    @Override // defpackage.dbus
    public final /* bridge */ /* synthetic */ akuh b(amfu amfuVar) {
        Bitmap h = amfuVar.h();
        return h == null ? this.a.a() : this.a.b.a().d(h);
    }
}

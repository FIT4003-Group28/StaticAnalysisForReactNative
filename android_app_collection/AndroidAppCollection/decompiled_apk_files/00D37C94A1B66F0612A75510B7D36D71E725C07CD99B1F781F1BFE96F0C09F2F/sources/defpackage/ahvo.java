package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ahvo  reason: default package */
/* loaded from: classes.dex */
final class ahvo extends ahvp {
    final /* synthetic */ ahvu a;
    private final avhm b;

    public ahvo(ahvu ahvuVar, avhm avhmVar) {
        this.a = ahvuVar;
        this.b = avhmVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String.valueOf(String.valueOf((Uri) obj)).length();
        kaa kaaVar = this.a.s;
        avhm avhmVar = this.b;
        int i = avhmVar.d;
        int i2 = avhmVar.e;
        kaaVar.b = (Bitmap) obj2;
        kaaVar.c = i;
        kaaVar.d = i2;
        kaaVar.Y(1);
    }
}

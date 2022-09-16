package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: enp  reason: default package */
/* loaded from: classes3.dex */
public final class enp implements yiw {
    final /* synthetic */ String a;
    final /* synthetic */ enq b;

    public enp(enq enqVar, String str) {
        this.b = enqVar;
        this.a = str;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        enq enqVar = this.b;
        String str = this.a;
        Bitmap a = ezv.a(enqVar.b, (Bitmap) obj2);
        if (!str.equals(enqVar.g) || !enqVar.k) {
            return;
        }
        enqVar.h = str;
        fi fiVar = enqVar.i;
        if (fiVar == null) {
            return;
        }
        fiVar.n(a);
        enqVar.d.notify(1005, enqVar.i.b());
    }
}

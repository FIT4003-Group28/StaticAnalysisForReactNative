package defpackage;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: bout  reason: default package */
/* loaded from: classes3.dex */
final class bout implements Runnable {
    final /* synthetic */ bbuf a;
    final /* synthetic */ deig b;
    final /* synthetic */ bouu c;

    public bout(bouu bouuVar, bbuf bbufVar, deig deigVar) {
        this.c = bouuVar;
        this.a = bbufVar;
        this.b = deigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<bbtm> a = this.a.a();
        this.c.b.a(a);
        ArrayList arrayList = new ArrayList();
        for (bbtm bbtmVar : a) {
            try {
                Bitmap a2 = this.c.d.a(bbtmVar.z());
                dbsk.s(a2);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                a2.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
                String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                arrayList.add(valueOf.length() != 0 ? "data:image/jpeg;base64,".concat(valueOf) : new String("data:image/jpeg;base64,"));
            } catch (IOException unused) {
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("photos", arrayList);
        hashMap.put("label", this.a.b());
        this.b.j(hashMap);
    }
}

package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: bnhs  reason: default package */
/* loaded from: classes3.dex */
public final class bnhs {
    private final czsy a;

    public bnhs(czsy czsyVar) {
        this.a = czsyVar;
    }

    public final cqtd a(String str, Integer num) {
        dbsk.b(num.intValue() > 0, "monogramSize must be greater than 0");
        Bitmap createBitmap = Bitmap.createBitmap(num.intValue(), num.intValue(), Bitmap.Config.ARGB_8888);
        czsy czsyVar = this.a;
        czsyVar.b(str);
        cztn bZ = czto.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        czto cztoVar = (czto) bZ.b;
        str.getClass();
        cztoVar.a |= 8;
        cztoVar.e = str;
        czsyVar.c(czta.a(bZ.bK()));
        czsyVar.a(createBitmap);
        return cqtt.a(createBitmap);
    }
}

package defpackage;

import android.graphics.Bitmap;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akxn  reason: default package */
/* loaded from: classes2.dex */
public final class akxn {
    public final akvz a;
    public final Map<Bitmap, akxm> b = new HashMap();
    public final Map<dmlo, akxm> c = new EnumMap(dmlo.class);

    public akxn(akvz akvzVar) {
        this.a = akvzVar;
    }

    public final synchronized akxi a(Bitmap bitmap) {
        if (bitmap.isMutable()) {
            return new akxl(this, bitmap);
        }
        akxm akxmVar = this.b.get(bitmap);
        if (akxmVar != null) {
            akxmVar.d();
            return akxmVar;
        }
        akxl akxlVar = new akxl(this, bitmap);
        this.b.put(bitmap, akxlVar);
        return akxlVar;
    }

    public final synchronized akxi b(dmlo dmloVar) {
        akxm akxmVar = this.c.get(dmloVar);
        if (akxmVar != null) {
            akxmVar.d();
            return akxmVar;
        }
        akxk akxkVar = new akxk(this, dmloVar);
        this.c.put(dmloVar, akxkVar);
        return akxkVar;
    }

    public final akxi c(dmqc dmqcVar) {
        return new akxj(this.a.a(dmqcVar));
    }

    public final akxi d(long j) {
        return new akxj(this.a.b(j));
    }
}

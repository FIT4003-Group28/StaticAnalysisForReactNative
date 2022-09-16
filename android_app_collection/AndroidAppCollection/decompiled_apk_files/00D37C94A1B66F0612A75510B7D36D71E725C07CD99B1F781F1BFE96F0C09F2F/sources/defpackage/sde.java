package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: sde  reason: default package */
/* loaded from: classes4.dex */
public final class sde extends scz {
    public sde(Context context) {
        super(context, ser.b());
        l(new seu());
        this.b = new sdh(1);
        this.c = new sdf();
    }

    @Override // defpackage.scz
    protected final sek a() {
        seq seqVar = ((seu) this.a).a;
        Object obj = null;
        if (seqVar.a() > 0) {
            Object obj2 = seqVar.b.isEmpty() ? null : seqVar.b.get(0);
            if (!seqVar.b.isEmpty()) {
                List list = seqVar.b;
                obj = list.get(list.size() - 1);
            }
            return new sek(obj2, obj);
        }
        return null;
    }
}
